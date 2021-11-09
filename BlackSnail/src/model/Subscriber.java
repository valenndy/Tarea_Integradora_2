package model;

public class Subscriber{
	
	public static int length;
    private String fullName;
	private String id;
	private int age;
	private int cantHrs;
	private TypeClient tc; 
	private boolean status;

	public Subscriber(String fullName, int age, String id, int cantHrs){
		this.fullName = fullName;
		this.id = id;
		this.age = age;
		this.cantHrs = cantHrs;
		this.status=true;
		this.tc = TypeClient.NORMAL;
	}


//============================== Getters & Setters ==============================



	public boolean getStatus() {
		return status;
	}


	public void setStatus(boolean status) {
		this.status = status;
	}


	public String getFullName(){
		return fullName;
	}

	public void setFullName(String fullName){
    	this.fullName = fullName;
  	}

  	public String getId(){
		return id;
	}

	public void setId(String id){
    	this.id = id;
  	}

  	public int getAge(){
		return age;
	}

	public void setAge(int age){
    	this.age = age;
  	}

  	public int getCantHrs(){
		return cantHrs;
	}

	public void setCantHrs(int cantHrs){
    	this.cantHrs = cantHrs;
  	}

  	public TypeClient getTc(){
		return tc;
	}

	public void setTc(TypeClient tc){
    	this.tc = tc;
  	}


  	public String toString(){
		return
		"\n Nombre completo del suscriptor: " + fullName + 
		"\n Edad: "+ age + 
		"\n cedula: " + id +
		"\n Horas dispuesto a consumir: " + cantHrs + 
		"\n Tipo de cliente: " + tc + 
		"\n Estado: " + status +  "\n";
		
		
	}







}