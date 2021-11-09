package model;

public class Season{

	private int num;
	private int cantEP;
	private int cantEPU;
	private String premiereDate;
	private String trailer;

	public Season(int num, int cantEP, int cantEPU, String premiereDate, String trailer){
		this.num = num;
		this.cantEP = cantEP;
		this.cantEPU = cantEPU;
		this.premiereDate = premiereDate;
		this.trailer = trailer;
	}


//============================== Getters & Setters ==============================


	public String getTrailer() {
		return trailer;
	}


	public void setTrailer(String trailer) {
		this.trailer = trailer;
	}


	public String getPremiereDate() {
		return premiereDate;
	}


	public void setPremiereDate(String premiereDate) {
		this.premiereDate = premiereDate;
	}


	public int getNum(){
		return num;
	}

	public void setNum(int num){
		this.num = num;
	}

	public int getCantEP(){
		return cantEP;
	}

	public void setCantEP(int cantEp){
		this.cantEP = cantEp;
	}

	public int getCantEPU(){
		return cantEPU;
	}

	public void setCantEPU(int cantEPU){
		this.cantEPU = cantEPU;
	}


	public String toString() {
		return
		"the number: " + getNum() + "\n" +
		"the amounth of episodes: " + getCantEP() + "\n" +
		"the amounth of episodes published: " + getCantEPU() + "\n" +
		"the premiere day: " + getPremiereDate() + "\n" +
		"the trailer: " + getTrailer() + "\n";
	}






}