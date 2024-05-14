
public class EvenSumFinder {

	public static void main(String[] args) {
		if(args.length < 2) {
			System.out.println("Usage: java EvenSumFinder <startNum> <endNum>");
			return;
		}
		
		int start = Integer.parseInt(args[0]);
		int end = Integer.parseInt(args[1]);

		long sum = 0;
		
		// ---- while version
		int aNum = start;
		while(aNum <= end) {
			if(OddEvenFinder.isEven(aNum)) {
				//sum = sum + aNum;
				sum += aNum;
			}
			aNum++;
		}
		
		//---------- for instead of while ---------
		
		for(int num = start;num <= end;num++) {
			if(OddEvenFinder.isEven(num)) {
				sum += num;
			}
		}
		
		System.out.println("Sum of evens b/w "+start+" and "+end+" is "+sum);
	}

}
