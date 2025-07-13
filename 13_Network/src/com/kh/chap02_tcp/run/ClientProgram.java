package com.kh.chap02_tcp.run;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class ClientProgram {

	// 클라이언트용 프로그램
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		BufferedReader br= null;
		PrintWriter pw = null;
		Socket socket = null;
		
		// 요청하고자 하는 서버 : 192.168.20.46
		// 포트번호 : 3000
		int port = 3000; // 포트번호 저장
		String serverIp; // 선언만 일단
		
		try {
			serverIp = "192.168.20.46";
			
			// 1) 서버에 연결요청 보내는 구문
			// 보내려면 소켓 필요. 앞서 선언했던 소켓에 저장
			socket = new Socket(serverIp, port);
			// 서버가 꺼져있다거나 못 찾으면 통신 실패 !! null
			
			if(socket!= null) { // 서버와 연결 잘 됐을 경우
				System.out.println("서버와 연결 성공!");
				// 2) 서버와 입출력 기반 스트림 생성
				// 3) 보조스트림 통해서 성능 개선
				
				// 입력용 스트림
				br = new BufferedReader(new InputStreamReader(socket.getInputStream())); // 괄호 안에 문자기반.. 겠~ 바이트스트림 기반을 문자스트림리더로 .
				// 출력용 스트림
				pw = new PrintWriter(socket.getOutputStream());
				
				while(true) {
					// 4) 스트림을 통해 읽고 쓰기
					System.out.println("서버에게 보낼 내용 : ");
					String sendMessage = sc.nextLine();
					pw.println(sendMessage);
					pw.flush();
					
					String message = br.readLine();
					System.out.println("서버로부터 전달받은 메세지 : " + message);
					
				}
				
				
				
				
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				
				// 5) 통신 종료
				pw.close();
				br.close();
				
				socket.close();
			}catch (IOException e) {
				e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}
}
	}

