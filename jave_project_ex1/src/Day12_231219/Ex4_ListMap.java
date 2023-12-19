package Day12_231219;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Ex4_ListMap {

	public static void main(String[] args) {
	
		// 1. String을 관리하는 ArrayList 생성 (list)
// 		ArrayList<String> list = new ArrayList<String>();
		
		// 2. Key : String, Value : Object HashMap 생성
		HashMap<String, Object> map = new HashMap<>();
		
		// 3. 2번에서 만든 map을 관리하는 형태로 list 코드를 수정
		// ( HashMap을 관리하는 ArrayList로 변경 )
		ArrayList<HashMap<String, Object>> list = new ArrayList<>();
		
		map.put("name", "홍길동");
		map.put("age", 30);
		map.put("addr", "인천");
		map.put("phone", "010-123-123");
		map.put("gender", "남자");
		
		list.add(map);
		// map == list.get(0)
		// map.get("name") == list.get(0).get("name")
		
		HashMap<String, Object> map2 = new HashMap<>();
		
		map2.put("name", "원희수");
		map2.put("age", 32);
		map2.put("addr", "인천");
		map2.put("phone", "010-5706-5708");
		map2.put("gender", "여자");
		
		list.add(map2);
		
		// list에서 이름이 '홍길동'인 사람의 나이, 주소, 전화번호 출력
		// ---->>> list내에서 홍길동을 먼저 찾고 해당 정보 출력
		
		Scanner s = new Scanner(System.in);
		System.out.print("이름 입력 : ");
		String keyworld = s.next();
		boolean flg = false;
		// 이름을 입력받아서 입력받은 사람의 정보 출력
		
		for(int i=0; i<list.size(); i++) {
			String name = (String) list.get(i).get("name");
			if(name.equals(keyworld)) {
				System.out.println("나이 : " + list.get(i).get("age"));
				System.out.println("주소 : " + list.get(i).get("addr"));
				System.out.println("번호 : " + list.get(i).get("phone"));
				System.out.println("성별 : " + list.get(i).get("gender"));
				flg = true;
				break;
			} 
		}	if(!flg) {
			System.out.println("찾는 사람 없음.");
		}
		
		
		
		
	}//
}//
