package Day8_231213;

public class Ex1_ObjMethod {

	private String name;
		
		Ex1_ObjMethod(){}
		Ex1_ObjMethod(String name){
			this.name = name;
		}
	
		int sumArray(int[] arr) {
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}
	
	static int sumArray2(int[] arr) {
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}
	
	
	void nameEquals(Ex1_ObjMethod obj) {
		if(this.name.equals(obj.getName())) {
			System.out.println("같다");
		} else {
			System.out.println("다르다");
		}
	}
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}//
