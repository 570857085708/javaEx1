package Day13_231220;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Ex5_Review {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 회원정보 관리
		// 1.입력 : 이름, 나이, 주소 입력 받아서 저장
		
		
		Scanner s = new Scanner(System.in);
		ArrayList<HashMap<String, Object>> list = new ArrayList<HashMap<String,Object>>();
		
		while(true) {
			System.out.println("1)입력 2)삭제 3)출력 그 외)종료");
			System.out.print("숫자 입력 : ");
			int select = s.nextInt();
			if(select == 1) {
				HashMap<String, Object> map = new HashMap<>();
				
				System.out.print("이름 입력 : ");
				String name = s.next();
				map.put("name", name);
				
				System.out.print("나이 입력 : ");
				int age = s.nextInt();
				map.put("age", age);
				
				System.out.print("주소 입력 : ");
				String addr = s.next();
				map.put("addr", addr);
				
				list.add(map);
				
			} else if(select == 2) {
				System.out.println("삭제할 이름 :");
				String input = s.next();
				for(int i=0; i<list.size(); i++) {
					String name = (String) list.get(i).get("name");
					if(input.equals(name)) {
					list.remove(i);
					System.out.println("=삭제 완료=");
					}
				}
			} else if(select == 3) {
				System.out.print("출력할 이름 : ");
				String input = s.next();
				for(int i=0; i<list.size(); i++) {
					String name = (String) list.get(i).get("name");
					if(input.equals(name)) {
						System.out.println("이름 : " + name);
						System.out.println("나이 : " + list.get(i).get("age"));
						System.out.println("주소 : " + list.get(i).get("addr"));
					}
				}
			} else {
				System.out.println("== The END ==");
				break;
			}
		}
		
		
		
		
		
		
		
		
	}//

}//
