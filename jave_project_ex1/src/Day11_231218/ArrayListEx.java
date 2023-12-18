package Day11_231218;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	ArrayList<String> list = new ArrayList<String>();	
	Scanner s = new Scanner(System.in);	
		
	for(int i=0; i<4; i++) {
		System.out.print("이름 입력 : ");
		String name = s.next();
		list.add(name);
	}
	
	// 리스트 내용 모두 출력하기
	for(int i=0; i<list.size(); i++) {		
		String name = list.get(i);
		System.out.print(name + " ");
	}
	
	// 입력받은 가장 긴 이름 출력하기
	int index = 0;
	for(int i=1; i<list.size(); i++) {
		if(list.get(i).length() > list.get(index).length()) {
			index = i;
		}
	}	// \n 줄바꿈
		System.out.println("\n" + "가장 긴 이름 : " + list.get(index));
		
	}

}
