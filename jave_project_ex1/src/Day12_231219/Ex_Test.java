package Day12_231219;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Ex_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner s = new Scanner(System.in);
		ArrayList<HashMap<String, Object>> list = new ArrayList<>();
	
		while(true) {
			System.out.println("== (1)입력 (2)검색 (3)종료 ==");
			System.out.print("메뉴를 선택하세요 : ");
			int choice = s.nextInt();
			if(choice == 1) {
				HashMap<String, Object> map = new HashMap<String, Object>();
				System.out.print("이름을 입력하세요 : ");
				map.put("name", s.next());
				System.out.print("나이를 입력하세요 : ");
				map.put("age", s.nextInt());
				System.out.print("주소를 입력하세요 : ");
				map.put("addr", s.next());
				System.out.print("핸드폰번호를 입력하세요 : ");
				map.put("phone", s.next());
				list.add(map);
				System.out.println("저장되었습니다!");
				
			} else if(choice == 2) {
				System.out.print("검색할 이름을 입력하세요 : ");
				String keyword = s.next();
				boolean flg = false;
				for(int i=0; i<list.size(); i++) {
					String name = (String) list.get(i).get("name");
					if(name.equals(keyword)) {
						System.out.println("이름 : " + name);
						System.out.println("나이 : " + list.get(i).get("age"));
						System.out.println("주소 : " + list.get(i).get("addr"));
						System.out.println("핸드폰번호 : " + list.get(i).get("phone"));
						flg = true;
						break;
					}
				}
				if(!flg) {
					System.out.println("찾는 사람이 없습니다.");
				}
			} else if(choice == 3) {
				System.out.println("종료되었습니다!");
				break;
			} else {
				System.out.println("1, 2, 3중에 하나를 입력해주세요");
			}
		}
		
		
		
	}//
	
}//
