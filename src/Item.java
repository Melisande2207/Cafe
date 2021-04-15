
public class Item {
	
	private double price;
	private int levelacceptable;
	private int jour;
	private int mois;
	private int annee;
	private int timeitem;
	private String name;
	
	public Item(String name,double p, int l,int j, int m, int a, int timeitem) {
		this.setName(name);
		this.setPrice(p);
		this.setLevelacceptable(l);
		this.setJour(j);
		this.setMois(m);
		this.setAnnee(a);
		this.setTimeitem(timeitem);
	}
	
	public int getJour() {
		return jour;
	}
	public void setJour(int jour) {
		this.jour = jour;
	}
	public int getTimeitem() {
		return timeitem;
	}
	public void setTimeitem(int timeitem) {
		this.timeitem = timeitem;
	}
	public int getAnnee() {
		return annee;
	}
	public void setAnnee(int annee) {
		this.annee = annee;
	}
	public int getLevelacceptable() {
		return levelacceptable;
	}
	public void setLevelacceptable(int levelacceptable) {
		this.levelacceptable = levelacceptable;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getMois() {
		return mois;
	}
	public void setMois(int mois) {
		this.mois = mois;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
