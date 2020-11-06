
public class Calculator {

	private final String delimiter =",|\n";
	private String[] numbers;
	
	public int Add(String input) {
		numbers = input.split(delimiter);
		
		if(isEmpty(input)) {
			return 0;	
		}
		else if (numbers.length==1) {
			return stringToInt(input);
		}
		else  {
			return addTheNumbers();
		}
	}
	
	private boolean isEmpty(String input) {
		return input.isEmpty();
	}
	
	
	private int stringToInt(String input) {
		return Integer.parseInt(input);
	}
	
	private int addTheNumbers() {
		int sum=0;
		for(int i=0;i<numbers.length;i++) {
			sum+=stringToInt(numbers[i]);
		}
		return sum;
	}
}
