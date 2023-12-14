package Sample2_Day7_231212;

import Sample1_Day7_231212.Human;

public class Worker extends Human{

	// 메소드 하나 생성후 protected 변수 출력

	void print() {
		System.out.println(name);	// public
//		System.out.println(age);	// default
		System.out.println(addr);	// protected
//		System.out.println(phone);	// private
	}
	
}//
