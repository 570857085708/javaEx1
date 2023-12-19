package Day12_231219;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Ex1_HashMap {

	public static void main(String[] args) {
		
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		// 시험 점수 관리
		map.put("홍길동", 80);
		map.put("이동재", 100);
		map.put("박승영", 90);
		map.put("유재석", 95);
		map.put("강호동", 85);
		
		
//		Scanner s = new Scanner(System.in);
//		
//		while(true) {
//			System.out.println("이름 입력 : ");
//			String name = s.next();
//			if(name.equals("exit")) {
//				System.out.println("종료되었습니다.");
//				break;
//			} 
//			if(map.containsKey(name)) {
//				int score = map.get(name);
//				System.out.println(name+ "님의 점수는 " + score + "점 입니다.");
//			} else {
//				System.out.println("없는 이름");
//			}
//		}
		
		
		Set<String> keys = map.keySet();
		Iterator<String> it = keys.iterator();
		
		while(it.hasNext()) {
			String name = it.next();
			int score = map.get(name);
			System.out.println(name+ "님의 점수는 " + score + "점 입니다.");
		}
		
		
		
	}//
	
	
}//
