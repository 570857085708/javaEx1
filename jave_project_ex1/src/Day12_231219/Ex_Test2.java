package Day12_231219;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Ex_Test2 {

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
		
		while(true) {
			System.out.print("(1)입력 (2)삭제 (3)출력 (그 외)종료 : ");
			int choice = s.nextInt();
			HashMap<String, Object> map = new HashMap<>();
			if(choice == 1) {
				System.out.print("이름 : ");
				map.put("name", s.next());
				map.put("java", score("java", 20));
				map.put("oracle", score("oracle", 35));
				map.put("html", score("html", 15));
				list.add(map);
				System.out.println("저장 완료!");
			} else if(choice == 2) {						// 1
				System.out.print("삭제할 이름 : ");
				String keyword = s.next();
				for(int i=0; i<list.size(); i++){
					String name = (String) list.get(i).get("name");
					if(keyword.equals(name)) {
						list.remove(i);
						break;
					}
				}
				System.out.println("삭제되었습니다.");
			} else if(choice == 3) {
				System.out.print("출력할 이름 : ");
				String keyword = s.next();
				boolean flg = false;
				for(int i=0; i<list.size(); i++){
					String name = (String) list.get(i).get("name");
					if(keyword.equals(name)) {
						int sum = (int)list.get(i).get("java")
								+(int)list.get(i).get("oracle")
								+(int)list.get(i).get("html");
						System.out.println("이름 : " + name + ", 총 점 : " + sum + "점");
						flg = true;
						break;
					}
					
					}
					if(!flg) {
						System.out.println("찾는 사람 없음.");
				}
			} else {
				System.out.println("종료!!!!");
				break;
			}
		}
		
	}//
}//
		
		
		
//		5. * 숫자 1을 입력할 경우 '입력 부분', 2를 입력할 경우 '삭제 부분', 3을 입력할 경우 '출력 부분'
//		그 외의 값을 입력할 경우 '종료 부분'을 실행 한다.
//
//		1). 입력 부분
//		-> key를 String, value를 Object로 받는 HashMap 생성
//		-> 다음과 같이 map에 스캐너로 입력된 값 저장
//		-> key : name, value : 이름 (ex, 홍길동)
//		-> key : java, value : 자바 점수 (ex, 20), 단 0~30 사이 값이 아니면 다시 입력
//		-> key : oracle, value : 오라클 점수 (ex, 35), 단 0~50 사이 값이 아니면 다시 입력
//		-> key : html, value : html 점수(ex, 15), 단 0~20 사이 값이 아니면 다시 입력
//
//		=> 해당 map을 ArrayList 객체에 저장
//
//		2). 삭제 부분
//		스캐너로 입력한 값과 map의 name value 값이 동일할 경우 리스트에서 삭제
//
//		-> ex, 스캐너로 "홍길동"을 입력하면 name의 value가 "홍길동"인 map을 리스트에서 제거
//
//		3). 출력 부분
//		-> 콘솔에 '이름 : 홍길동, 총점 : 70' 과 같은 형태로 출력
//		-> 총점은 java + oracle + html value의 총 합
//
//		4). 종료 부분
//		-> 프로그램 종료

