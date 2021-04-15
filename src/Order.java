import java.util.ArrayList;
import java.util.List;

public class Order {
	
	private int minutes;
	private int heures;
	ArrayList<Item> item= new ArrayList<Item>();
	static ArrayList<String> tonpossible= new ArrayList<String>();
	static ArrayList<String> splitpossible= new ArrayList<String>();
	private String split;
	private String ton;
	List<Integer> numbercustomer= new ArrayList<Integer>();
	
	public Order(int min, int heu,ArrayList<Item> it,String ton,String s, int n) {
		this.setMinutes(min);
		this.setHeures(heu);
		listetype();
		for (int i=0;i<it.size();i++) {
			this.item.add(it.get(i));
		}
		if (tonpossible.contains(ton)) {
			this.setTon(ton);
		}
		else {
			this.setTon("happy");
		}
		if (splitpossible.contains(s)) {
			this.setSplit(s);
		}
		else {
			this.setSplit("per group");
		}
		this.setNumbercustomer(n);
	}
		
	public void listetype(){
		this.tonpossible.add("angry");
		this.tonpossible.add("happy");
		this.tonpossible.add("overwhelmed");
		this.tonpossible.add("pregnant");
		this.tonpossible.add("moody");
		this.tonpossible.add("bored");
		this.tonpossible.add("excited");
		this.splitpossible.add("per person");
		this.splitpossible.add("per group");
		this.splitpossible.add("with ratios");
	}


	public int getMinutes() {
		return minutes;
	}
	
	public Item getItem(int i) {
		return this.item.get(i);
	}
	public Item getItem(String n) {
		Item it =null;
		for (int i=0;i<this.item.size();i++) {
			if (this.item.get(i).getName()==n) {
				it=this.item.get(i);
			}
		}
		return it;
	}

	public void setMinutes(int minutes) {
		this.minutes = minutes;
	}

	public int getHeures() {
		return heures;
	}

	public void setHeures(int heures) {
		this.heures = heures;
	}

	public String getSplit() {
		return split;
	}

	public void setSplit(String split) {
		this.split = split;
	}

	public String getTon() {
		return ton;
	}

	public void setTon(String ton) {
		this.ton = ton;
	}

	public List<Integer> getNumbercustomer() {
		return numbercustomer;
	}

	public void setNumbercustomer(int numbercustomer) {
		this.numbercustomer.add(numbercustomer);
	}
}
