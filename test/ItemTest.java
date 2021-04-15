
import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

public class ItemTest {

	@Test
	public void test() {
		Item m=new Item("muffins",1.5,8,15,06,2020,3);
		assertEquals(15,m.getJour(),"type attendu");
		assertEquals(2020,m.getAnnee(),"type attendu");
		assertEquals(8,m.getLevelacceptable(),"type attendu");
		assertEquals(06,m.getMois(),"type attendu");
		assertEquals("muffins",m.getName(),"type attendu");
		assertEquals(1.5,m.getPrice(),"type attendu");
		assertEquals(3,m.getTimeitem(),"type attendu");
		
	}

}
