
public class Calculator {

	public int Add(String input) {
		if(input.isEmpty()) {
			return 0;	
		}
		else {
			return Integer.parseInt(input);
		}
	}
	
}
