
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.Test;

public class OrderTest {

	@Test
	public void test() {
		ArrayList<Item> item=new ArrayList<>();
		Item m=new Item("muffins",1.5,8,15,06,2020,3);
		item.add(m);
		item.add(new Item("cheesecake",2.12,8,15,06,2020,3));
		item.add(new Item("pancake",3.96,8,15,06,2020,3));
		Order o=new Order(25, 15,item, "angry","with ratios",3);
		assertEquals(25,o.getMinutes(), "type attendu");
		assertEquals(15,o.getHeures(), "type attendu");
		assertEquals(item.get(1).getName(),o.getItem(1).getName(),"type attendu");
		assertEquals(m,o.getItem("muffins"),"type attendu");
	}
	@Test
	public void test2() {
		ArrayList<Item> item=new ArrayList<>();
		Item m=new Item("muffins",1.5,8,15,06,2020,3);
		item.add(m);
		item.add(new Item("cheesecake",2.12,8,15,06,2020,3));
		item.add(new Item("pancake",3.96,8,15,06,2020,3));
		Order o=new Order(25, 15,item, "hungry","solo",3);
		
		assertEquals("happy",o.getTon(), "type attendu");
		assertEquals("per group",o.getSplit(), "type attendu");
	}
}
