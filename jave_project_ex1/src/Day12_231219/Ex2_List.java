package Day12_231219;

import java.util.ArrayList;
import java.util.HashMap;

public class Ex2_List {
	
	public static void main(String[] args) {
		
		ArrayList<String> list  = new ArrayList<String>();
		
		list.add("홍길동");
		list.add("유재석");
		list.add("강호동");
		list.add("박명수");
		list.add("기안84");
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		
		HashMap<String, Integer> dbscore = new HashMap<String, Integer>();
		
		dbscore.put("홍길동", 90);
		dbscore.put("유재석", 95);
		dbscore.put("강호동", 85);
		dbscore.put("박명수", 80);
		dbscore.put("기안84", 84);
		
		System.out.println(dbscore.get("홍길동"));
		
		
	} //

}
