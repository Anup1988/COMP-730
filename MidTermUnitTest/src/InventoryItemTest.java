import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class InventoryItemTest {
	private InventoryItem invItem;
	@BeforeEach
	void setUp() throws Exception {
		
		invItem = new InventoryItem("Home Made", 72, "Laser", 7);
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testGetName() {
		String expected="Laser";
		String actual = invItem.getName();
		assertEquals(expected,actual,"Expected name and actual names are different");
	}

	@Test
	void testGetType() {
		String expected ="Home Made";
		String actual = invItem.getType();
		assertEquals(expected,actual,"Expected type and actual type are different");
	}

	@Test
	void testGetWeight() {
		
		int expected = 72;
		int actual = invItem.getWeight();
		assertNotNull(actual);
		assertEquals(expected,actual,"Expected Weight and Actual Weight are differnet");
	}

	@Test
	void testGetCount() {
		
		int  expected  = 7;
		int actual = invItem.getCount();
		assertNotNull(actual);
		assertEquals(expected,actual,"Actual and expected count doens not match");
		
	}

	
}
