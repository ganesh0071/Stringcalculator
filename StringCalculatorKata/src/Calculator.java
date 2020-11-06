
public class Calculator {

	public int Add(String input) {
		String[] numbers = input.split(",");
		if(isEmpty(input)) {
			return 0;	
		}
		else if (numbers.length==1) {
			return stringToInt(input);
		}
		else {
			return Integer.parseInt(numbers[0]) + Integer.parseInt(numbers[1]);
		}
	
	}
	
	private boolean isEmpty(String input) {
		return input.isEmpty();
	}
	
	
	private int stringToInt(String input) {
		return Integer.parseInt(input);
	}
}
