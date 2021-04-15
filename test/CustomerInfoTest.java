
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.Test;

public class CustomerInfoTest {

	@Test
	public void testConstructeurpardefaut() {
		CustomerInfo c1=new CustomerInfo();
		assertEquals("Out of Town",c1.getType(), "type attendu");
	}
	@Test
	public void testConstructeur2() {
		CustomerInfo c1=new CustomerInfo("In Town");
		assertEquals("In Town",c1.getType(), "type attendu");
		CustomerInfo c2=new CustomerInfo("Out of Town");
		assertEquals("Out of Town",c2.getType(), "type attendu");
		CustomerInfo c3=new CustomerInfo("Rose's family");
		assertEquals("Rose's family",c3.getType(), "type attendu");
		c1.setType("Town");	
		assertEquals("Out of Town",c1.getType(), "type attendu");
	}
	@Test
	public void testConstructeur3() {
		ArrayList<String> drink=new ArrayList<>();
		drink.add("lait");
		drink.add("café");
		drink.add("coktail");
		ArrayList<String> food=new ArrayList<>();
		food.add("muffin");
		food.add("cheesecake");
		food.add("pancake");
		CustomerInfo c1=new CustomerInfo(drink,food);
		assertEquals(drink,c1.getDrinkpref(),"type attendu");
		assertEquals(food,c1.getFoodpref(),"type attendu");
			
		
	}
	@Test
	public void testConstructeur4() {
		ArrayList<String> drink=new ArrayList<>();
		drink.add("lait");
		drink.add("café");
		drink.add("coktail");
		ArrayList<String> food=new ArrayList<>();
		food.add("muffin");
		food.add("cheesecake");
		food.add("pancake");
		
		CustomerInfo c1=new CustomerInfo("In Town",drink,food);
		ArrayList<Item> item=new ArrayList<>();
		Item m=new Item("muffins",1.5,8,15,06,2020,3);
		item.add(m);
		item.add(new Item("cheesecake",2.12,8,15,06,2020,3));
		item.add(new Item("pancake",3.96,8,15,06,2020,3));
		Order o=new Order(25, 15,item, "angry","with ratios",3);
		c1.addorders(o);
		assertEquals("In Town",c1.getType(), "type attendu");
		assertEquals(drink,c1.getDrinkpref(),"type attendu");
		assertEquals(food,c1.getFoodpref(),"type attendu");
		assertEquals(o,c1.getOrders().get(0),"type attendu");
		
	}

}
