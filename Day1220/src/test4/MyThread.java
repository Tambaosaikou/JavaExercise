package test4;

public class MyThread {
	int rabbit = 0, turtle = 0;

	class turtleThread implements Runnable {

		@Override
		public void run() {
			// TODO Auto-generated method stub
			for (int i = 1000; i > 0; i--) {
				if (rabbit == 1000) {
					System.out.println("����Ӯ��");
					System.exit(0);
				}
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				turtle = turtle + 1;
				System.out.println("�ڹ�����:" + turtle);
				if (i % 100 == 0) {
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}

	}

	class rabbitThread implements Runnable {

		@Override
		public void run() {
			// TODO Auto-generated method stub
			for (int i = 1000; i > 0; i = i - 5) {
				if (turtle == 1000) {
					System.out.println("�ڹ�Ӯ��");
					System.exit(0);
				}
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				rabbit = rabbit + 5;
				System.out.println("��������:" + rabbit);
				if (i % 20 == 0) {
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}

	}

}
