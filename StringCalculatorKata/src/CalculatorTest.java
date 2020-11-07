
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;




public class CalculatorTest {

	private Calculator calculator;
	
	@BeforeTest
	public void init() {
		calculator = new Calculator();
	}
	
	@Test
	public void shouldReturnZeroOnEmptyString() throws Exception { 				//Method 1
		assertEquals(0,calculator.Add(""));
	}
	
	@Test
	public void shouldReturnNumberOnNumber() throws Exception {					//Method 2
		assertEquals(calculator.Add("1"),1);
	}
	
	@Test
	public void twoNumbersCommaDelimitedReturnSum() throws Exception {			//Method 3
		assertEquals(calculator.Add("1,2"),3);
	}
	
	@Test
	public void handleUnknownAmountOfNumbers() throws Exception {				//Method 4
		assertEquals(calculator.Add("1,2,3,4,5,6"),21);
	}
	
	@Test
	public void delimitersWithNewlineOrCommas() throws Exception {				//Method 5
		assertEquals(calculator.Add("1\n2,3"),6);
	}
	
	@Test
	public void delimiterWithaPattern() throws Exception {						//Method 6
		assertEquals(calculator.Add("//;\n1;2"),3);
	}
	
	@Test(expectedExceptions=Exception.class)
	public void returnsExceptionForNegativeNumbers() throws Exception {			//Method 7
		calculator.Add("-1");
	}
	
	@Test
	public void ignoringNumbersGreaterThan1000() throws Exception {				//Method 8
		assertEquals(calculator.Add("1001,2"),2);
	}
	
	
}
