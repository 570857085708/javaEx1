package Day15_231222;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner s = new Scanner(System.in);
		ArrayList<HashMap<String, Object>> list = new ArrayList<>();
		
		
		
		while(true) {
			System.out.println("=== (1) 과일 추가 (2) 과일 판매 (3) 가격수정 (4) 현황 파악 (그외) 종료 ===");
			System.out.print("숫자를 입력하세요 : ");
			int select = s.nextInt();
			
			if(select == 1) {
				HashMap<String, Object> map = new HashMap<>();
				System.out.print("과일 이름 : ");
				String name = s.next();
				map.put("name", name);
				
				Boolean isFruit = false; 
				for(int i=0; i<list.size(); i++) {
					String fruit = (String) list.get(i).get("name");
					if(name.equals(fruit)) {
						isFruit = !isFruit; 
						System.out.print("추가할 갯수 입력 : ");
						int count = s.nextInt();
						int fruitCount = (int) list.get(i).get("count");
						list.get(i).put("count", count + fruitCount);
						System.out.println(count + "개 추가완료");
						break;
					}
				}
					if(!isFruit) {
						System.out.print("가격 입력 : ");
						int price = s.nextInt();
						map.put("price", price);
						
						System.out.print("갯수 입력 : ");
						int count = s.nextInt();
						map.put("count", count);
						list.add(map);
					}
			
			} else if(select == 2){
				System.out.print("과일명 입력 : ");
				String name = s.next();
				
				System.out.print("갯수 입력 : ");
				int count = s.nextInt();
				
				for(int i=0; i<list.size(); i++) {
					String fruitName = (String) list.get(i).get("name");
					if(name.equals(fruitName)) {
						HashMap<String, Object> map = new HashMap<>();
						map = list.get(i);
						int fruitCount = (int) map.get("count");
						if(fruitCount - count >= 0) {
							System.out.println("판매되었습니다.");
							map.put("count", fruitCount - count);
							System.out.println(name + "의 현재 남은 개수는 " + (fruitCount - count) + "개 입니다." );
						} else {
							System.out.println("판매불가!!");
							System.out.println(name + "의 현재 남은 개수는 " + fruitCount + "개 입니다." );
						}
					}
				}
				
			}else if(select == 3){
				System.out.print("과일명 입력 : ");
				String name = s.next();
				for(int i=0; i<list.size(); i++) {
					String fruit = (String) list.get(i).get("name");
					
					if(name.equals(fruit)) {
						System.out.print("수정할 가격 입력 : ");
						int price = s.nextInt();
						int fruitPrice = (int) list.get(i).get("price");
						list.get(i).put("price", price + fruitPrice);
						System.out.println(price + "으로 가격이 수정되었습니다");
						break;
					}
				}
			}else if(select == 4) {
				System.out.print("과일명 입력 : ");
				String name = s.next();
				for(int i=0; i<list.size(); i++) {
					String fruitName = (String) list.get(i).get("name");
					if(name.equals(fruitName)) {
						HashMap<String, Object> map = new HashMap<>();
						map = list.get(i);
						int fruitCount = (int) map.get("count");
						int fruitPrice = (int) map.get("price");
						System.out.println(name + "의 가격은"+ fruitPrice +" 개수는 " + fruitCount + "개 입니다." );
					}
				}
			}else {
				System.out.println("종료합니다");
				break;
			}
		}
		
		
		
		
		
		
		
		
		
		//		5. 주제 : 과일 가게 프로그램
//		* 숫자 1을 입력할 경우 '과일 추가', 2를 입력할 경우 '과일 삭제', 3을 입력할 경우 '가격 수정',
//		4를 입력할 경우 '현황 파악' 그 외의 숫자를 입력할 경우 종료 되도록 한다.
//		ex) "=== (1) 과일 추가 (2) 과일 판매 (3) 가격수정 (4) 현황 파악 (그외) 종료 ==="
//		(복사해서 쓰셔도 됩니다.)
//
//		공통사항 : 모든 데이터는 ArrayList> 형태로 관리한다.
//
//		1. 입력 부분
//		-> key를 String, value를 Object로 받는 HashMap 생성
//		-> 다음과 같이 map에 스캐너로 입력된 값 저장
//		-> key : name, value : 이름(문자) (ex, 오렌지)
//		-> key : price, value : 가격(숫자) (ex, 1000), 단, 100~10000 사이 값이 아니면 다시 입력
//		-> key : count, value : 개수(숫자) (ex, 35), 단, 최대 개수는 100개이며 0개 미만의 값을 가지면 안됨
//
//		만약 기존에 있는 과일을 추가할 경우 개수만 입력 받은 후 해당 개수를 기존 개수에 더해준다.
//		ex) 오렌지의 count값이 기존에 10인 상태에서 다시 한번 name에 오렌지를 입력할 경우
//		기존 10개에 새로 입력한 개수를 더해준다. (가격은 수정하지 않으며, 개수는 합쳐서 100개를 넘으면 안된다.)
//
//		=> 해당 map을 ArrayList 객체에 저장한다.
//
//		2. 삭제 부분
//		스캐너로 입력한 값과 map의 name value 값이 동일할 경우 리스트에서 삭제한다.
//
//		-> ex, 스캐너로 "오렌지"를 입력하면 name의 value가 "오렌지"인 map을 리스트에서 제거한다.
//
//		3. 가격 수정
//		-> 스캐너로 입력받은 값과 map의 key값의 name이 입력받은 값과 동일할 경우
//		가격을 입력받아서 수정할 수 있도록 한다.
//		출력 예시) 과일명 입력 : 오렌지
//		가격을 수정해주세요(기존 가격 1500) : 2000
//		수정되었습니다!
//		(해당 메뉴는 정상적인 입력만 있다고 가정한다.
//		즉, list에 없는 과일을 입력하는 경우에 대한 로직을 구현할 필요는 없다.)
//
//		4. 현황 파악
//		-> list에 있는 모든 정보를 화면에 출력한다
//		ex) 1번메뉴에서 오렌지, 바나나를 추가했을 경우
//		출력 예시) 오렌지의 가격은 1500원, 개수는 10개 남았습니다.
//		바나나의 가격은 2000원, 개수는 20개 남았습니다.
//
//		5. 종료 부분
//		-> 프로그램 종료
	
	
	
	
	
	
	
	
	}//

}//
