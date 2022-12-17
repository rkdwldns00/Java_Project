package engine;

import javax.swing.*;

import java.awt.AlphaComposite;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class imgPaintData {
	Image img;
	int posX;
	int posY;
	int scaleX;
	int scaleY;
	float alpha;

	imgPaintData(Image img, int a, int b, int c, int d, float alpha) {
		this.img = img;
		this.posX = a;
		this.posY = b;
		this.scaleX = c;
		this.scaleY = d;
		this.alpha = alpha;
	}
}

@SuppressWarnings("serial")
class RenderingEngine extends JFrame {
	private JPanel mainPanel;
	private Image buffImage;
	Graphics buffg;

	Vector2 screenSize = new Vector2(9.5f, 5.18f);
	int size;
	private Scene renderScene;
	GameObject[] l = new GameObject[] {};
	Image background;

	RenderingEngine(String title, int b) {
		setTitle(title);
		size = b;
		mainPanel = new JPanel();
		mainPanel.setLayout(null);
		// add(p);

		add(mainPanel);

		setExtendedState(JFrame.MAXIMIZED_BOTH);

		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		screenSize = screenSize.mul(b);
		setSize((int) screenSize.x, (int) screenSize.y);
		setVisible(false);

		mgps();
	}

	void rendering(Scene scene) {
		setVisible(true);
		renderScene = scene;
		repaint();
	}

	public void paint(Graphics gr) {// 그리는 함수
		imgPaintData[] data = new imgPaintData[1000];
		for (int i = 0; i < 100; i++) {
			data[i] = null;
		}
		int imgDataCount = 0;
		for (GameObject g : renderScene.objects) {
			if (g == null) {
				break;
			}
			if (g.getComponent(new SpriteRenderer()) != null && g.getComponent(new SpriteRenderer()).active && g.active
					&& Math.abs(g.transform.position.x) <= 10 && Math.abs(g.transform.position.y) <= 10) {
				Transform t = g.transform;
				if (g.parent == null) {
					data[imgDataCount++] = new imgPaintData(g.getComponent(new SpriteRenderer()).img,
							(int) ((((t.position.x - t.scale.x / 2)) * size) + screenSize.x / 2 - 40),
							(int) ((-(t.position.y + t.scale.y / 2) * size) + screenSize.y / 2 + 15),
							(int) (t.scale.x * size), (int) (t.scale.y * size),
							g.getComponent(new SpriteRenderer()).alpha);
				} else {
					Transform pt = g.parent.transform;
					data[imgDataCount++] = new imgPaintData(g.getComponent(new SpriteRenderer()).img,
							(int) (((((pt.position.x + t.position.x * pt.scale.x) - t.scale.x * pt.scale.x / 2)) * size) + screenSize.x / 2 - 40),
							(int) ((-((pt.position.y + t.position.y * pt.scale.y) + t.scale.y * pt.scale.y / 2) * size) + screenSize.y / 2 + 15),
							(int) (t.scale.x * pt.scale.x * size), (int) (t.scale.y * pt.scale.x * size),
							g.getComponent(new SpriteRenderer()).alpha);
				}
			}
		}

		buffImage = createImage((int) screenSize.x, (int) screenSize.y);
		if (buffImage == null) {
			System.out.println("버퍼 스크린 생성 실패");
		} else {
			buffg = buffImage.getGraphics();
		}

		for (imgPaintData imgData : data) {
			if (imgData == null) {
				break;
			}
			AlphaComposite alphaComposite = AlphaComposite.getInstance(AlphaComposite.SRC_OVER, (float) imgData.alpha);
			Graphics2D gr2 = (Graphics2D) buffg;
			gr2.setComposite(alphaComposite);
			gr2.drawImage(imgData.img, imgData.posX, imgData.posY, imgData.scaleX, imgData.scaleY, null);
		}

		gr.drawImage(buffImage, 0, 0, this);
	}

	void mgps() {
		mainPanel.addMouseMotionListener(new MouseAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				Input.mousePos = new Vector2(((e.getX() + 40f - screenSize.x / 2f) / size),
						-((e.getY() - 15f - screenSize.y / 2f) / size));
			}
		});
		mainPanel.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				Input.mouseClicked = true;
				Input.mouseClickedThisFrame = true;
			}

			public void mouseReleased(MouseEvent e) {
				Input.mouseClicked = false;
			}
		});
	}
}
