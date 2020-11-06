
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;


public class CalculatorTest {

	@Test
	public void shouldReturnZeroOnEmptyString() { 				// Method 1
		Calculator calculator = new Calculator();
		assertEquals(0,calculator.Add(""));
	}
	
	@Test
	public void shouldReturnNumberOnNumber() {					//Method 2
		Calculator calculator = new Calculator();
		assertEquals(calculator.Add("1"),1);
	}
}
