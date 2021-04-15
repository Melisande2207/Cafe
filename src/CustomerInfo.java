import java.util.ArrayList;

public class CustomerInfo {
	
	private String type;
	ArrayList<String> typepossible= new ArrayList<String>();
	ArrayList<String> drinkpref= new ArrayList<String>();
	ArrayList<String> foodpref= new ArrayList<String>();
	ArrayList<Order> orders= new ArrayList<Order>();
	public static int numberofcustomers=0;
	private int identifiant;
	
	public CustomerInfo() {
		listetype();
		this.setType("Out of Town");
		setIdentifiant();
	}
	
	public CustomerInfo(String ty) {
		listetype();
		this.setType(ty);
		setIdentifiant();
	}
		
	public CustomerInfo(ArrayList<String> drink,ArrayList<String> food) {
		listetype();
		for (int i=0;i<drink.size();i++) {
			this.drinkpref.add(drink.get(i));
		}
		for (int i=0;i<food.size();i++) {
			this.foodpref.add(food.get(i));
		}
		setIdentifiant();
	}
	
	public CustomerInfo(String ty, ArrayList<String> drink, ArrayList<String> food) {
		listetype();
		this.setType(ty);
		for (int i=0;i<drink.size();i++) {
			this.drinkpref.add(drink.get(i));
		}
		for (int i=0;i<food.size();i++) {
			this.foodpref.add(food.get(i));
		}
		setIdentifiant();
	}

	public String getType() {
		return this.type;
	}

	public ArrayList<String> getDrinkpref() {
		return this.drinkpref;
	}

	public ArrayList<String> getFoodpref() {
		return this.foodpref;
	}

	public ArrayList<Order> getOrders() {
		return this.orders;
	}
	public void setType(String type) {
		if (typepossible.contains(type)) {
			this.type = type;
		}
		else {
			this.type="Out of Town";
		}
	}
	
	public void addorders(Order o) {
		this.orders.add(o);
	}
	
	public void listetype(){
		this.typepossible.add("Out of Town");
		this.typepossible.add("In Town");
		this.typepossible.add("Rose's family");
	}

	public int getIdentifiant() {
		return identifiant;
	}

	public void setIdentifiant() {
		this.identifiant=CustomerInfo.numberofcustomers;
		CustomerInfo.numberofcustomers++;
	}
}
