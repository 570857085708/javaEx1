package Day2_231205;

public class Ex6_switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char grade = 'B';
		switch(grade) {
			case 'A' : 
				System.out.println("정말 잘했다!");
				break;
			case 'B' : 
				System.out.println("꽤 잘했다!");
				break;
			case 'C' : 
				System.out.println("노력하자!");
				break;
			case 'D' :
				System.out.println("많이 노력하자!");
				break;
			default  : 
				System.out.println("화이팅!");
				break;
		}
	}

}
