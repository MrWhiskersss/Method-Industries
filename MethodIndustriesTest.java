import static org.junit.Assert.assertEquals;
import org.junit.Test;

//Ethan Hammons

public class MethodIndustriesTest {
	@Test
	public void evaluateMathFuntionEx1() {
		String math = MethodIndustries.mathFunction(1, 2, 3);
		assertEquals("+", math);
	}

	@Test
	public void evaluateMathFuntionEx2() {
		String math = MethodIndustries.mathFunction(2, 2, 4);
		assertEquals("+*", math);
	}

	@Test
	public void evaluateMathFuntionEx3() {
		String math = MethodIndustries.mathFunction(3, -3, -9);
		assertEquals("*", math);
	}
	
	@Test
	public void evaluateMathFuntionEx4() {
		String math = MethodIndustries.mathFunction(1, 2, -1);
		assertEquals("-", math);
	}

	@Test
	public void evaluateMathFuntionEx5() {
		String math = MethodIndustries.mathFunction(3, 3, 1);
		assertEquals("/", math);
	}

	@Test
	public void evaluateMathFuntionEx6() {
		String math = MethodIndustries.mathFunction(7, 1, 11);
		assertEquals("None", math);
	}

	@Test
	public void evaluateMathFuntionDivZero() {
		String math = MethodIndustries.mathFunction(1, 0, 11);
		assertEquals("None", math);
	}
}
