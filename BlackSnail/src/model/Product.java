package model;

public class Product {
	private String tittle;
	private String nameDirect;
	private String synopsis;
	private String premierDate;


	public Product(String tittle, String nameDirect, String synopsis, String premiereDate){
		this.tittle = tittle;
		this.nameDirect = nameDirect;
		this.synopsis = synopsis;
	}

//============================== Getters & Setters ==============================


    public String getTittle() {
		return tittle;
	}

	public void setTittle(String tittle) {
		this.tittle = tittle;
	}

	public String getPremierDate() {
		return premierDate;
	}

	public void setPremierDate(String premierDate) {
		this.premierDate = premierDate;
	}

	public String getNameDirect(){
		return nameDirect;
	}

	public void setNameDirect(String nameDirect){
		this.nameDirect = nameDirect;
	}

	public String getSynopsis(){
		return synopsis;
	}

	public void setSynopsis(String synopsis){
		this.synopsis = synopsis;
	}


	public String toString() {
		return 
		"the tittle: " + getTittle() + "\n" +
		"the name director: " + getNameDirect() + "\n" +
		"the synopsis" + getSynopsis() + "\n" + 
		"the premiere date is" + getPremierDate();
	}







}

