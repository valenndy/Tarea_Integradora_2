package model;

public class Movie extends Product{

	private String prod;
	private int pg;
	private Category category;


	public Movie (String tittle, String nameDirect, String synopsis, String premiereDate, String prod, int pg,String category){
		super (tittle, nameDirect, synopsis, premiereDate);
		this.prod = prod;
		this.pg = pg;
		this.category=Category.valueOf(category);
	}


//============================== Getters & Setters ==============================

	public String getProd(){
		return prod;
	}

	public void setProd(String prod){
		this.prod = prod;
	}

	public int getPg(){
		return pg;
	}

	public void setPg(int pg){
		this.pg = pg;
	}

	


	public Category getCategory() {
		return category;
	}


	public void setCategory(Category category) {
		this.category = category;
	}


	public String toString() {
		return super.toString()+
		" the producer: " + getProd() + "\n" +
		"the PG" + getPg() + "\n";
	}










}