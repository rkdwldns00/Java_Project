package engine;

class PhysicsEngine {
	void rigidRun(Scene scene) {
		for (int i = 0; i < scene.objects.length; i++) {
			for (int j = 0; j < scene.objects.length; j++) {
				boolean isHit = false;
				GameObject g1 = scene.objects[i];
				GameObject g2 = scene.objects[j];
				float[] innerList = new float[4];
				Vector2[] norVList = new Vector2[4];
				boolean checkPointHit = true;

				if (g2 != null && g1 != null && g1 != g2
						&& (g1.getComponent(new RigidBody()) != null && g1.getComponent(new Collider()) != null
								&& g2.getComponent(new Collider()) != null)
						&& g1.getComponent(new Collider()).active && g2.getComponent(new Collider()).active && g1.active
						&& g2.active) {
					for (Vector2 g1pd : g1.getComponent(new Collider()).points) {
						Vector2 g1p = g1.transform.position
								.add(new Vector2(g1pd.x * g1.transform.scale.x, g1pd.y * g1.transform.scale.y));
						for (int k = 0; k < g2.getComponent(new Collider()).points.length; k++) {
							Vector2 g2pd = g2.getComponent(new Collider()).points[k];
							Vector2 g2norV = g2.getComponent(new Collider()).nor_Vecror2[k];

							Vector2 g2p = g2.transform.position
									.add(new Vector2(g2pd.x * g2.transform.scale.x, g2pd.y * g2.transform.scale.y));
							Vector2 resultV = g1p.sub(g2p);
							float resultInner = resultV.inner(g2norV);
							if (resultInner > 0) {
								checkPointHit = false;
								break;
							} else {
								innerList[k] = resultInner;
								norVList[k] = g2norV;
							}
						}

						if (checkPointHit) {
							isHit = true;
							break;
						} else {
							checkPointHit = true;
						}
					}
					if (isHit) {
						if (!(g1.getComponent(new Collider()).isTrigger || g1.getComponent(new Collider()).isTrigger)) {
							float power = -Ut.maxForList(innerList);
							Vector2 direction = g2.getComponent(new Collider()).nor_Vecror2[Ut
									.maxIndexForList(innerList)];
							RigidBody g1r = g1.getComponent(new RigidBody());
							RigidBody g2r = g2.getComponent(new RigidBody());

							// Vector2 n1 = (g1.transform.position.sub(g2.transform.position)).normalize();
							Vector2 vOld = direction;
							float e = 0.1f;

							Vector2 vNew = vOld.mul(e);
							if (g1r != null) {
								g1r.addForce(vNew.mul(power * 30));
								// g1r.velocity = vNew.mul(power * 30);
								if (power > 0) {
									g1.transform.translate(vNew.mul(power * 1.2f));
								}
							}
							if (g2r != null) {
								g2r.addForce(vNew.mul(power * 30));
								// g2r.velocity = vNew.mul(-power * 30);
								if (power > 0) {
									g2.transform.translate(vNew.mul(-power * 1.2f));
								}
							}
						}
						for (Monobehavier m : g1.components) {
							if (m != null) {
								m.onCollision(g2.getComponent(new Collider()));
							} else {
								break;
							}
						}
						for (Monobehavier m : g2.components) {
							if (m != null) {
								m.onCollision(g1.getComponent(new Collider()));
							} else {
								break;
							}
						}
					}
				}
			}
		}
	}
}
