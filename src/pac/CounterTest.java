package pac;

import static org.junit.Assert.*;

import org.junit.Test;

public class CounterTest {

	@Test
	public void testAdd() {
		//fail("まだ実装されていません");
		Counter counter = new Counter();
		assertEquals(3,counter.add(1, 2));
	}

	@Test
	public void testSubtract() {
		//fail("まだ実装されていません");
		Counter counter = new Counter();
		assertEquals(1, counter.subtract(2,1));
	}

}
