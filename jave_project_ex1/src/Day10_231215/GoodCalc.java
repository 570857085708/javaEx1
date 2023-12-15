package Day10_231215;

public class GoodCalc extends Calculator{

	@Override
	int add(int x, int y) {
		// TODO Auto-generated method stub
		return x+y;
	}

	@Override
	int subtract(int x, int y) {
		// TODO Auto-generated method stub
		return x-y;
	}

	@Override
	double average(int[] arr) {
		// TODO Auto-generated method stub
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			sum += arr[i];
		}
//		for(int v:arr) {
//			sum += v;
//		}
		return (double)sum/arr.length;
	}

	
	
	
} //
