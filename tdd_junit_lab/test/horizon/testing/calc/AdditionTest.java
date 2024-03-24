package horizon.testing.calc;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import com.horizon.Addition;
import com.horizon.NegativeIntegerException;

class AdditionTest {
	
	//Case 1
	//When adding 2 integers where one of them is negative
	//Then display an error message
	@Test
	void testNegativeInt() {
		Addition op = new Addition();
		Assert.assertThrows(NegativeIntegerException.class,() -> op.add(1, -1));
	}
	
	//Case 2
	//When adding 2 positive integers
	//Then display the accurate result of the addition of the 2 inputs
	@Test
	void testAddTwoIntegers() {
		Addition op =  new Addition();
		Assert.assertEquals(2, op.add(1, 1));
	}
	
	
	//Case 3
	//When adding 2 inputs where one of them (or both) are not integers
	//Then display an error message

}
