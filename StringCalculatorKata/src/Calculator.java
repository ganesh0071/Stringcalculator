
public class Calculator {

	private final String delimiter =",|\n";
	
	public int Add(String input) {
		String[] numbers = input.split(delimiter);
		int sum=0;
		
		if(isEmpty(input)) {
			return 0;	
		}
		else if (numbers.length==1) {
			return stringToInt(input);
		}
		else  {
			for(int i=0;i<numbers.length;i++) {
				sum+=stringToInt(numbers[i]);
			}
			return sum;
		}
	}
	
	private boolean isEmpty(String input) {
		return input.isEmpty();
	}
	
	
	private int stringToInt(String input) {
		return Integer.parseInt(input);
	}
}
