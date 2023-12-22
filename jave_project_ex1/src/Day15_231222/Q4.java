package Day15_231222;

import java.util.Arrays;
import java.util.Scanner;

public class Q4 {

		// TODO Auto-generated method stub
//		  4. 배열을 아래와 같이 선언하고, 조건에 맞게 5개의 숫자를 입력받아서 배열에 순차적으로 넣으시오.
//		  int arr[] = new int[5];
//		  조건 1) 입력받은 숫자는 1부터 20사이의 값이어야 하며, 이외의 숫자를 입력할 경우 재입력하도록 한다.
//		  조건 2) 기존에 입력된 숫자와 중복은 2개까지만 허용 된다. 2개 초과 될 경우 재입력하도록 한다.
//		  ex) [1,3,2,1,2] => 가능, [1,3,2,1,1] => 불가능
//		  조건 3) 배열을 새롭게 선언하고 중복된 값이 없는 형태로 배열 값을 입력한 후 내림차순 한다.
//		  ex) [1,3,4,1,2] => [4,3,2,1] (1은 중복되므로 하나의 값만 입력)
	
	
		public static int check(int[] arr, int number) {
			int count = 0;
			for(int i=0; i<arr.length; i++) {
				if(arr[i] == number) {
					count++;
				}
			}
			return count;
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner scanner = new Scanner(System.in);
			int[] arr = new int[5];

			for (int i = 0; i < arr.length;) {
				System.out.print(i+1+"번째 숫자 입력(1부터 20사이) : ");
				int number = scanner.nextInt();
				// 조건 1
				if (number < 1 || number > 20) {
					System.out.println("1부터 20 사이값 입력하셈");
					continue;
				}
				// 조건 2
				if (check(arr, number) < 2) {
					arr[i] = number;
					i++;
				} else {
					System.out.println("중복 값은 2개까지만 가능");
				}
			}
			System.out.println(Arrays.toString(arr));
		
	
		for(int a=arr.length-1; a>=1; a--) {
			for(int i=0; i<a; i++) {
				if(arr[i] < arr[i+1]) {
					int temp = arr[i+1];
					arr[i+1] = arr[i];
					arr[i] = temp;
				}
			}
		}
		
		System.out.println(Arrays.toString(arr));
}
	}//

//
