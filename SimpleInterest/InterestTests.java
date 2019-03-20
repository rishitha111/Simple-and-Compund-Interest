package SimpleInterest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class InterestTests {

	@Test
	void test() {
		SimpleInterest si = new SimpleInterest();
		assertEquals(10,si.Simpleinterest(10, 10, 10));
		assertEquals(2,si.Compoundinterest(1, 1, 1, 1));
	}

}