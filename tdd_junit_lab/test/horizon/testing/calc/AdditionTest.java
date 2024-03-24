package horizon.testing.calc;

import static org.junit.jupiter.api.Assertions.*;

import java.lang.reflect.Method;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.horizon.Addition;
import com.horizon.NegativeIntegerException;

class AdditionTest {
	
	static Addition op; 
	
	@BeforeAll 
	static void setUp() {
		op = new Addition();
	}
	
	//Case 1
	//When adding 2 integers where one of them is negative
	//Then display an error message
	@Test
	void testNegativeInt() {
		Assert.assertThrows(NegativeIntegerException.class,() -> op.add(1, -1));
	}
	
	//Case 2
	//When adding 2 positive integers
	//Then display the accurate result of the addition of the 2 inputs
	@Test
	void testAddTwoIntegers() {
		Assert.assertEquals(2, op.add(1, 1));
	}
	
	
	//Case 3
	//When adding 2 inputs where one of them (or both) are not integers
	//Then display an error message
	@Test
	void testIllegalArgsType() throws NoSuchMethodException, SecurityException {
		Method addMethod = op.getClass().getMethod("add", int.class, int.class);
        Assert.assertThrows(IllegalArgumentException.class, () -> addMethod.invoke(op, 1, "a"));
	}

}
