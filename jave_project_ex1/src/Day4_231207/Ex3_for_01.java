package Day4_231207;



public class Ex3_for_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		for(int i=1; i<=5; i++) {
//			for(int j=1; j<=i; j++) {
//				System.out.println(i);
//			}
//		}
		
		
		// 구구단
		
//		for(int i=2; i<=9; i++) {
//			for(int j=1; j<=9; j++) {
//				System.out.println(i + " * " + j + " = " + i*j);
//			}
//		}
		
		
		// 구구단 - 거꾸로
		
		for(int i=9; i>=2; i--) {
			System.out.println("== "+i+"단 ==");
			for(int j=9; j>=1; j--) {
				System.out.println(i + " * " + j + " = " + i*j); 
			}
		}
		
		
		
		
		
		
		
		
	} //m

} //c
