package thread.thread;

public class ThreadTest extends Thread {
	
	@Override
	public void run() {
		System.out.println(getName());
		System.out.println("쓰레드 시작1");
		
		for(int i = 1; i <= 10; i++) {
			System.out.println(i);
			try {
				sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		
		
		System.out.println("쓰레드 끝1");
		
	}
}
