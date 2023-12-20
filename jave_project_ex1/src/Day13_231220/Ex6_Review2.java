package Day13_231220;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Ex6_Review2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 주제 : 과일 가게 프로그램
		// 1. 추가 2. 판매 3. 개수확인 그외. 종료
		// 
		
		Scanner s = new Scanner(System.in);
		ArrayList<HashMap<String, Object>> list = new ArrayList<>();
		
		
		
		while(true) {
			System.out.println("== 1번 추가, 2번 판매, 3번 개수확인, 4번 변경, 그외 종료 ==");
			System.out.print("숫자를 입력하세요 : ");
			int num = s.nextInt();
			if(num == 1) {
				HashMap<String, Object> map = new HashMap<>();
				
				System.out.print("과일 이름 : ");
				String name = s.next();
				map.put("name", "이름");
				
				Boolean isFruit = false; // 있는 과일인지 확인
				for(int i=0; i<list.size(); i++) {
					String fruit = (String) list.get(i).get("name");
					if(name.equals(fruit)) {
						isFruit = !isFruit; // !isFruit = true 같은 뜻 !기법이 많이쓰임
						System.out.print("추가할 갯수 입력 : ");
						int count = s.nextInt();
						int fruitCnt = (int) list.get(i).get("cnt");
						list.get(i).put("cnt", count + fruitCnt);
						System.out.println(count + "개 추가되었습니다!");
						break;
					}
				}
					if(!isFruit) {
						System.out.print("가격 입력 : ");
						int price = s.nextInt();
						map.put("price", price);
						
						System.out.print("갯수 입력 : ");
						int count = s.nextInt();
						map.put("cnt", count);
						list.add(map);
					}
			}else if(num == 2){
				// 과일명, 개수 입력받기 / 입력한 개수만큼 줄이기 / 0개 이하로 내려가지 않도록
				System.out.print("과일 이름 : ");
				String name = s.next();
				System.out.print("판매 : ");
				int count = s.nextInt();
				
				for(int i=0; i<list.size(); i++) {
					String fruitName = (String) list.get(i).get("name");
					if(fruitName.equals(name)) {
						int fruitCnt = (int) list.get(i).get("count");
						if(fruitCnt - count >= 0) {
							list.get(i).put("count", fruitCnt - count);
							System.out.println("판매 완료!");
							System.out.println(name + "의 현재 남은 개수는 " + (fruitCnt - count) + "개 입니다." );
						} else {
							System.out.println("판매불가!");
							System.out.println(name + "의 현재 남은 개수는 " + fruitCnt + "개 입니다." );
						}
					}
				}
			}else if(num == 3){
				// 과일명 입력받기 / 입력받은 과일의 개수 확인
				System.out.print("과일 이름 : ");
				String name = s.next();
				
				for(int i=0; i<list.size(); i++) {
					String fruitName = (String) list.get(i).get("name");
					if(fruitName.equals(name)) {
						int fruitCnt = (int) list.get(i).get("count");
						System.out.println(name + "의 남은 개수는 : " + fruitCnt + "개");
					}
				}
			}else if(num == 4) {
				
				HashMap<String, Object> map2 = new HashMap<>();
				
				System.out.print("과일 이름 : ");
				String name = s.next();
				map2.put("name", "이름");
				
				Boolean isFruit = false; // 있는 과일인지 확인
				for(int i=0; i<list.size(); i++) {
					String fruit = (String) list.get(i).get("name");
					if(name.equals(fruit)) {
						isFruit = !isFruit; // !isFruit = true 같은 뜻 !기법이 많이쓰임
						System.out.print("추가할 갯수 입력 : ");
						int count = s.nextInt();
						int fruitCnt = (int) list.get(i).get("cnt");
						list.get(i).put("cnt", count + fruitCnt);
						System.out.println(count + "개 추가되었습니다!");
						break;
					}
				}
					if(!isFruit) {
						System.out.print("가격 입력 : ");
						int price = s.nextInt();
						map2.put("price", price);
						
						System.out.print("갯수 입력 : ");
						int count = s.nextInt();
						map2.put("cnt", count);
						list.add(map2);
					}
				
				
			}else {
				System.out.println("종료합니다");
				break;
			}
		}
		
//		4번메뉴 추가해서 과일의 가격 변경 
//		과일 이름 입력 받은 후 해당 과일이 있는지 먼저 확인 
//		있을경우 새로운 가격을 입력 받아서 갱신 
//		3번 메뉴에서 개수 확인할때 가격까지 같이 출력
	
	
	
	
	}//

}//
