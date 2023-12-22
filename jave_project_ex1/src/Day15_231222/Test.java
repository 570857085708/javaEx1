package Day15_231222;

import java.util.Arrays;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
	

//	4. 배열을 아래와 같이 선언하고, 조건에 맞게 5개의 숫자를 입력받아서 배열에 순차적으로 넣으시오.
//	int arr[] = new int[5];
//	조건 1) 입력받은 숫자는 1부터 20사이의 값이어야 하며, 이외의 숫자를 입력할 경우 재입력하도록 한다.
//	조건 2) 기존에 입력된 숫자와 중복은 2개까지만 허용 된다. 2개 초과될 경우 재입력하도록 한다.
//	ex) [1,3,2,1,2] => 가능, [1,3,2,1,1] => 불가능​
	
	
	Scanner s = new Scanner(System.in);
	
	int array[] = new int[5];
	for(int i=0; i<array.length; i++) {
		System.out.print(i+1+"번째 숫자 입력 : ");
		array[i] = s.nextInt();
		if(array[i] > 20) {
			System.out.println("1~20 숫자 입력");
		} else {
			System.out.println(Arrays.toString(array));
		}
	}



	
	}
}
