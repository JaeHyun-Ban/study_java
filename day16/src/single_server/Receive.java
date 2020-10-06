package single_server;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;
 

public class Receive extends Thread {
	
	/*
	 * 클라이언트에서 넘어온 메세지를 수신받는 클래스(Receive)
	 * - 생성자에서 연결된 소켓타입을 하나 받고
	 * 
	 * 
	 */
	
	private Socket socket; //소캣 객체 생성
	
	//생성자 - 소켓을 Receive로 넘겨서 받자
	public Receive(Socket socket) {
		this.socket = socket;
	}
	
	@Override
	public void run() {
		
		try {
			
			//1. 전송받은 데이터는 socket클래스 안에 inputStream에 저장되고,
			//그 데이터를 받아오는 꺼내오는 코드
			InputStream is = socket.getInputStream();//소켓으로 데이터 받음
			BufferedReader bf = new BufferedReader(
								new InputStreamReader(is, "UTF-8"));//받은 데이터 UTF-8로 인코딩해서 읽기
			
//			BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream(), "UTF-8"));
			
			//2. client에서 메세지가 넘어올 때마다 서버측에서 출력
			//메세지를 끊이지 않고 수신받기
			while(true) {
				
				String message = bf.readLine();
				if(message == null) {
					System.out.println("연결을 종료합니다.");
					break;
				}else {
					System.out.println("클라이언트:" + message);
				}
			}//while
			
			//사용 다 한거 꺼주기
			is.close();
			bf.close();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	
	
}





























