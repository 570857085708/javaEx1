package Day8_231213;

public class Ex1_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {1, 3, 5, 7, 9};
		Ex1_ObjMethod obj = new Ex1_ObjMethod();
		int sum = obj.sumArray(arr);
		System.out.println("배열의 총합 : " + sum);
		
		
		Ex1_ObjMethod.sumArray2(arr);
		obj.sumArray2(arr);
		
		
		Ex1_ObjMethod hong1 = new Ex1_ObjMethod("홍길동");
		Ex1_ObjMethod hong2 = new Ex1_ObjMethod("홍길동");
		
		
		
		// Ex1_ObjMethod 클래스에서 객체를 비교하는 메소드 생성
		// 두 객체가 가지고 있는 name의 값이 
		// 같을경우 '같은 사람 입니다.' , 다를경우 '다른 사람 입니다.' 라는 메시지 출력
		// 조건1. 매개변수로 객체를 넘겨서 비교하기
		
		
		hong1.nameEquals(hong2);
		
		
		
		
		
		
	}//

}
