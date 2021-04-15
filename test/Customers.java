import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Random;
import org.junit.Test;

public class Customers {
	@Test
	public void test() {
		ArrayList<CustomerInfo> customerListe = new ArrayList<CustomerInfo>();
		
		for (int i=0;i<10;i++) {
			Random rand = new Random();
			int j=rand.nextInt(3);
			CustomerInfo c=new CustomerInfo();
			if (j==0) {
				c=new CustomerInfo();
			}
			else if (j==1) {
				c=new CustomerInfo("In Town");
			}
			else{
				c=new CustomerInfo("Rose's family");
			}
			customerListe.add(c);
			for (int j1=0;j1<customerListe.size();j1++) {
				Random rand1 = new Random();
				int ordery1=rand1.nextInt(13)+2;
				int ordery2=rand1.nextInt(13)+2;
				int numc=rand1.nextInt(10);
				for (int o=0;o<ordery1+1;o++) {
					ArrayList<Item> item=new ArrayList<>();
					item.add(new Item ("muffins",1.5,rand1.nextInt(10)+1,rand1.nextInt(31),rand1.nextInt(12),ordery1,rand1.nextInt(4)));
					item.add(new Item("cheesecake",2.12,rand1.nextInt(10)+1,rand1.nextInt(31),rand1.nextInt(12),ordery2,rand1.nextInt(4)));
					item.add(new Item("pancake",3.96,rand1.nextInt(10)+1,rand1.nextInt(31),rand1.nextInt(12),ordery2,rand1.nextInt(4)));
					
					int min =rand1.nextInt(60);
					int heu =rand1.nextInt(24);
					Order n=new Order(min, heu, item, Order.tonpossible.get((int)rand1.nextInt(Order.tonpossible.size())), Order.splitpossible.get((int)rand1.nextInt(Order.splitpossible.size())), numc);
					c.addorders(n);
				}
				for (int o=0;o<ordery2+1;o++) {
					ArrayList<Item> item=new ArrayList<>();
					Item m=new Item("muffins", Math.random()*10,rand1.nextInt(10)+1,rand1.nextInt(31),rand1.nextInt(12),ordery2,rand1.nextInt(4));
					item.add(m);
					item.add(new Item("cheesecake",Math.random()*10,rand1.nextInt(10)+1,rand1.nextInt(31),rand1.nextInt(12),ordery2,rand1.nextInt(4)));
					item.add(new Item("pancake",Math.random()*10,rand1.nextInt(10)+1,rand1.nextInt(31),rand1.nextInt(12),ordery2,rand1.nextInt(4)));
					int min =rand1.nextInt(60);
					int heu =rand1.nextInt(24);
					Order n=new Order(min, heu, item, Order.tonpossible.get((int)rand1.nextInt(Order.tonpossible.size())), Order.splitpossible.get((int)rand1.nextInt(Order.splitpossible.size())), numc);
					c.addorders(n);
				}
			}
		}
		
	}
}
