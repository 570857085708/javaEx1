package Day15_231222;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		 3. 숫자를 1개 입력받고 해당 숫자의 구구단을 출력하시오.
//		 조건1) 입력받은 숫자는 2부터 9사이의 값이어야 하며 이외의 값이 입력될 경우 재입력하도록 함
//		 조건2) -1을 입력할 경우에는 '종료되었습니다' 문구 출력 후 종료
//		 조건3) -1을 입력하기 전까지는 코드는 계속 진행되어야 함.
	
		Scanner s = new Scanner(System.in);
		
		for(;;){
		    System.out.print("몇단을 원하십니까 : ");
		      int num1 = s.nextInt();
		      
		if(num1 == -1){
			System.out.print("종료 되었습니다 "); 
			break;
		}else if(num1 < 2 || num1 > 9){
			System.out.print("2부터 9사이의 값을 입력해주십시오 ");
			
		}else{
		    for(int j=1; j<=9; j++) {
		          System.out.println(num1+"*"+j+"="+num1*j);   
		      }
		}
		}
	}//
	}//


