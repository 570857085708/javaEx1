package Day7_231212;

public class Human_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Human lee = new Human("이동재");
		Human park = new Human("박승영");
		Human kim = new Human("김동휘");
		Human hwang = new Human("황선영");
		Human won = new Human("원희수");
		
		
		lee.setMoney(300000);
		System.out.println(park.getMoney());
		kim.setMoney(250000);
		System.out.println(hwang.getMoney());
		Human.money = 100000;
		
		Human.staticTest();
		
		
		
		
		
		
	} //

}
