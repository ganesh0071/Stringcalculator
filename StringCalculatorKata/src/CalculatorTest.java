
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
	public void shouldReturnZeroOnEmptyString() { 				//Method 1
		assertEquals(0,calculator.Add(""));
	}
	
	@Test
	public void shouldReturnNumberOnNumber() {					//Method 2
		assertEquals(calculator.Add("1"),1);
	}
	
	@Test
	public void twoNumbersCommaDelimitedReturnSum() {			//Method 3
		assertEquals(calculator.Add("1,2"),3);
	}
	
	@Test
	public void handleUnknownAmountOfNumbers() {				//Method 4
		assertEquals(calculator.Add("1,2,3,4,5,6"),21);
	}
	
	@Test
	public void delimitersWithNewlineOrCommas() {				//Method 5
		assertEquals(calculator.Add("1,2\n3"),6);
	}
	
}
