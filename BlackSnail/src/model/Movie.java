package model;

public class Movie extends Product{

	private String prod;
	private int pg;


	public Movie (String tittle, String nameDirect, String synopsis, String premiereDate, String prod, int pg){
		super (tittle, nameDirect, synopsis, premiereDate);
		this.prod = prod;
		this.pg = pg;
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

	


	public String toString() {
		return super.toString()+
		" the producer: " + getProd() + "\n" +
		"the PG" + getPg() + "\n";
	}










}