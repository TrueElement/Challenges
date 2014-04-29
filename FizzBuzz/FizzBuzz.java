package FizzBuzz;

public class FizzBuzz {
	
	public FizzBuzz() {
		
	}
	
	public void go(int count) {
		boolean printed = false;
		for(int i = 0; i < count; i++) {
			if(i % 3 == 0) {
				System.out.print("Fizz");
				printed = true;
			}
			
			if(i % 5 == 0) {
				System.out.print("Buzz");
				printed = true;
			}
			
			if(!printed) {
				System.out.println("i");
			} else {
				System.out.println();
				printed = false;
			}
		}
	}
}