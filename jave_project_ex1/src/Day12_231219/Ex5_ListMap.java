package Day12_231219;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Ex5_ListMap {

	public static int score(String sub, int max) {
		Scanner s = new Scanner(System.in);
		int input;
		while(true) {
			System.out.print(sub + "과목의 점수를 입력해 주세요 : ");
			input = s.nextInt();
			if(input < 0 || input > max) {
				System.out.println(sub +"과목은 " + max + " 이하의 점수를 입력 하세요");
			} else {
				break;
			}
		}
		return input;
	}
	
	public static void main(String[] args) {
	
		Scanner s = new Scanner(System.in);
		ArrayList<HashMap<String, Object>> list = new ArrayList<>();
		
		// 성적을 입력받기
		// 이름, 자바점수, 오라클점수, html점수
		
		HashMap<String, Object> map = new HashMap<>();
		
		System.out.print("이름을 입력하세요 : ");
		map.put("name", s.next());
		map.put("java", score("java", 50));
		map.put("oracle", score("oracle", 30));
		map.put("html", score("html", 20));
		
		list.add(map);
		
//		System.out.print("자바점수를 입력하세요 : ");
//		int java = s.nextInt();
//		if(java < 0 || java > 100) {
//			System.out.println("자바점수는 0~100 사이 점수를 입력 하세요");
//		} else {
//		map.put("java", java);
//		}
//		
//		System.out.print("오라클점수를 입력하세요 : ");
//		int oracle = s.nextInt();
//		if(oracle < 0 || oracle > 100) {
//			System.out.println("오라클점수는 0~100 사이 점수를 입력 하세요");
//		} else {
//		map.put("java", oracle);
//		}
//		System.out.print("html점수를 입력하세요 : ");
//		int html = s.nextInt();
//		if(html < 0 || html > 100) {
//			System.out.println("html점수는 0~100 사이 점수를 입력 하세요");
//		} else {
//		map.put("java", html);
//		}
//		list.add(map);
		// ---------------------->>>> score라는 새 method생성으로 중복코드 해결
		
		
	} //

} //
