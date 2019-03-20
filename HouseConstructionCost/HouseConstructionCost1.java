package HouseConstructionCost;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class HouseConstructionCost1 {

	@Test
	void test() {
		HouseConstructionCost hc = new HouseConstructionCost();
		assertEquals(1200*1200,hc.Construction(1200, "standard"));
	}

}
