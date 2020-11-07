import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Calculator {

	private static final String delimiter =",|\n";
	private static String[] numbers;
	
	public int Add(String input) throws Exception {
		 
		numbers = returningOnlyTheNumbers(input);
		
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
	
	private int stringToInt(String input) throws Exception {
		if(Integer.parseInt(input)<0) {
			throw new Exception("Negative Input!");
		}
		return Integer.parseInt(input);
	}
	
	private int addTheNumbers() throws Exception { 

		int sum=0;
		for(int i=0;i<numbers.length;i++) {
			sum+=stringToInt(numbers[i]);
		}
		return sum;
	}
	
	private String[] returningOnlyTheNumbers(String string)  {
		if(string.startsWith("//")) {
			Pattern pattern = Pattern.compile("//(.)\n(.*)");
			Matcher matcher = pattern.matcher(string);
			boolean ifFound= matcher.find();
			if(ifFound) {
				String customDelimiter=matcher.group(1);
				String subSeq = matcher.group(2);
				return subSeq.split(customDelimiter);
			}
		}
		
		numbers = string.split(delimiter);
		return numbers;
	}

	
	
	
}
