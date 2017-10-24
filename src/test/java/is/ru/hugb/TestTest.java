package is.ru.hugb;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestTest {

	@Test
	public void test1() {
		Test test = new Test();
		assertEquals(1, test.tst());
	}
}