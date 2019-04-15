import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

class InventoryTest {
	
	private Inventory inv;
	
	
	
	@Mock
	
	private Inventory sInventory;
	
	
	@Mock
	private InventoryItem mockInvItem;
	
	
	
	
	
	@BeforeEach
	void setUp() throws Exception {
		
		inv = new Inventory();
		sInventory = spy(new Inventory());
		mockInvItem = mock(InventoryItem.class);
		
	}

	

	@Test
	void testAddItemToInventory() {
		
		when(mockInvItem.getWeight()).thenReturn(122);
		
		InventoryItem item1 = new InventoryItem("Home Made", 72, "Laser", 7);
		InventoryItem item2 = new InventoryItem("Home Made", 50, "Bow", 2);
		
		sInventory.addItemToInventory(item1);
		sInventory.addItemToInventory(item2);
		
		assertEquals(mockInvItem.getWeight(),sInventory.getWeight(),"Expected weight is not equal to actual weight");
		
		
	}

	@Test
	void testdropInventory() {
		
		when(mockInvItem.getWeight()).thenReturn(122);
		when(mockInvItem.getCount()).thenReturn(0);
		
		InventoryItem item1 = new InventoryItem("Home Made", 72, "Laser", 7);
		InventoryItem item2 = new InventoryItem("Home Made", 50, "Bow", 2);
		
		
		sInventory.addItemToInventory(item1);
		sInventory.addItemToInventory(item2);
		sInventory.dropInventoryItem(item1);
		sInventory.dropInventoryItem(item2);
		
		assertEquals(mockInvItem.getCount(),sInventory.getCount());
		
		
	}


}
