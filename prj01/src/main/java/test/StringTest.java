package test;

import java.util.Scanner;

public class StringTest {

	public static void main(String[] args) {

		String q = "apple";
		char[] cs = new char[q.length()];
		
		for (int i = 0; i < q.length(); i++) {
			cs[i] = '*';
			System.out.print(cs[i]);
		}
		System.out.println("\n----------");
		int flag = 0;
		int cnt = 0;
		Scanner sc = new Scanner(System.in);
		while (true) {
			cnt++;
			System.out.print("\n>> Input char : ");
			String s = sc.nextLine();
			if (s.length() > 1) {
				System.out.println("첫 번째 문자만 유효합니다.");
			}
			for (int i = 0; i < q.length(); i++) {
				if (s.charAt(0) == q.charAt(i)) {
					cs[i] = s.charAt(0);
					
				} 
			}
			for(int i = 0; i < cs.length; i++) {
				if(cs[i] == '*') {
					flag = 1;
				}
			}
			for(int i = 0; i < cs.length; i++) {
				System.out.print(cs[i]);
			}
			System.out.println("\n---------------------");
			
			if (flag == 0) {
				break;
			} else {
				flag = 0;
			}
		}
		
		System.out.println(cnt + "회만에 성공!!");
	}

}
