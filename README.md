# Java_Project
자바프로젝트 제출용 프로그램  
주제 : 게임엔진 제작, 미니게임 제작  
제작한 엔진이름 : Ket Engine  
제작한 게임이름 : TT Ballon(통통열기구)  
개발목적 : 유니티 구조 모방  
사용툴 : eclipse-2020-06  
사용언어 Java  
사용기술 : Swing GUI
+ 구현한것
  + Scene -> GameObject -> Component 구조 구현
  + Transform 정보를 Swing GUI에 맞게 변환해 렌더링
  + Start, Update, FixedUpdate, OnCollision 함수 구현
  + Transform, SpriteRenderer 등 기본 컴포넌트
  + 오버라이딩을 이용한 Scene, GameObject, Component 저장
  + 마우스 입력 (마우스 좌표,클릭)
+ 완벽히 구현하지 못한것
  + 충돌시 충격량 공식을 완성하지 못함
  + 충돌여부판단을 Collider의 Vertex를 기준으로 하기때문에 크기가 다른 두 물체가 겹칠경우 처리가 제대로 안됨
+ 구현하지 못한것
  + 회전을 구현하지못함 (당시 Swing이 이미지 회전을 지원하는지 모름)
  + 3D 렌더링을 구현하지못함
  + 해상도 전환 불가 (오브젝트 좌표와 크기를 Swing의 함수 양식으로 변환하는 과정에서 계산이 이상하게 됨)
  + 텍스트 (버퍼이미지에서 swing.JFrame으로 불러오는 과정에서 swing.JLable의 글자가 사라짐)
