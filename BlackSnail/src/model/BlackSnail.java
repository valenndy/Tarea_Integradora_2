package model;

public class BlackSnail {
	private String nit;
	private String adress;
	private String webSite;
	private static Subscriber[]subs= new Subscriber[50];
	private Product[] products;



	public BlackSnail(String nit, String adress, String webSite){
		this.nit = nit;
		this.adress = adress;
		this.webSite = webSite;
		this.products = new Product[5];
	}
	

	//============================== Getters & Setters ==============================

	public String getNit(){
		return nit;
	}

	public void setNit(String nit){
    	this.nit = nit;
  	}

  	public String getAdress(){
		return adress;
	}

	public void setAdress(String adress){
    	this.adress = adress;
  	}

  	public String getWebSite(){
		return webSite;
	}

	public void setWebSite(String webSite){
    	this.webSite = webSite;
  	}


  	public String addSubscriber(String fullName, int age, String id, int cantHrs){
		String message="";

		boolean allreadyExist=false; 
		boolean continues=false; 

		for(int i=0; i<Subscriber.length;i++){
			if(subs[i]!=null){
				if(subs[i].getId().equalsIgnoreCase(id)){
					message="Esta cedula ya esta registrada";
					allreadyExist=true; 
				}
			}
		}

		if (allreadyExist==false){
			for(int i=0; i<subs.length && !continues;i++){


					subs[i]=new Subscriber(fullName, age, id,cantHrs);
					message="El suscriptor fue añadido con exito"; 
					continues=true; 
				}
			}
		
		if(allreadyExist==false && continues==false){
			message="Lleno, ya no se pueden añadir mas suscriptores";
		}
		return message;
	 }

	public  String desactivateSubscriber(String id ){
		 String message=""; 
		 boolean flag= false; 

		for(int i=0; i<subs.length && !flag;i++){
			if(subs[i]!=null){
				if(subs[i].getId().equalsIgnoreCase(id)){
					subs[i].setStatus(false);
					subs[i].setTc(TypeClient.NORMAL);
					message="El suscriptor fue desactivado correctamente";
					flag=true; 
				}else {
					message="No se encontro la cedula del suscriptor";
				}
			}
		}
		return message; 
    }

    public  int subscriberDiferentTypeList(TypeClient tc){
		int total= 0;

		for(int i= 0; i<subs.length;i++){
			if(subs[i]!=null){
				if(subs[i].getTc()==tc){
					total++;
				}
			}
		}
		
		return total;
	}

	public  Subscriber underAgeSubscriberWithMoreHours(){
		Subscriber sb=null;
		boolean hasMostHours= false;

		for(int i =0; i<subs.length && hasMostHours==false;i++){
			if(subs[i]!=null){
				if(subs[i].getAge()<18){
					sb=subs[i];
					boolean moreHours= true;
					for(int j= i+1; j<subs.length-i && moreHours==true;j++){
						if(subs[j]!=null){
							
							if(subs[i].getCantHrs()<subs[j].getCantHrs()){
								moreHours= false;
							}
						}
					}	
					if(moreHours==true){
						hasMostHours=true;
					}
				}
			}
		}
		return sb;		
	}

	



	public String addSerie(String named, String sinop, String namep, String censu,String premiere,String tittle,int num, int cantEP, int cantEPU, String trailer){
		boolean add = false;
		String message ="";

		for(int i = 0; i < products.length && add == false; i++){
			if(products[i] == null){
				add = true;
				Serie serie = new Serie(premiere,tittle,namep, censu, named, sinop);
				products[i]=serie;

				serie.addSeason( num,  cantEP,  cantEPU,  premiere,  trailer);

				message= ("El producto se agrego");
			}else{
				message = ("esta llena la lista");
			}


		}
		return message;
	}

	public String addMovie(String named, String sinop, String title, String produc, String premiereDate, int age){
		boolean add = false;
		String message ="";

		for(int i = 0; i < products.length && add == false; i++){
			if(products[i] == null){
				add = true;
				
				products[i] = new Movie(named, sinop, title, produc, premiereDate, age);

				message=( "El producto se agrego");
			}else{
				message =( "esta llena la lista");
			}

		}
		return message;
	}
	
	/*
	public String showExample(int par){
		String out ="";
		for(int i = 0; i<products.length ;i++){
			if(products[i] != null){
				out += products[i].exampleClase(par);
			}
		}
		return out;
	}
	*/

	public Product searchProduct(String title){
		boolean found=false;
		Product foundProduct=null;
		for(int i=0;i<products.length && !found;i++){
			if(products[i]!=null){
				if(products[i].getTittle().equals(title)){
					foundProduct = products[i];
					found = true;
				}
			}
		}
		return foundProduct;
	}

	public String showProduct(String title){
		String out="";
		Product find=searchProduct(title);
		if(find==null){
			out="no existe";
		}else{
			 out=find.toString();
		}
		return out;
		
	}

	public String createNextSeason(String tittle,int num, int cantEP, int cantEPU, String premiereDate, String trailer){
		String message="";

		Product seriee=searchProduct(tittle);
		
			if (seriee!=null &&  seriee instanceof Movie){
			message="Error";
			}else{
				Serie serie=(Serie) seriee;
			message= serie.addSeason(num, cantEP, cantEPU, premiereDate, trailer);
			
			}
			
		
		return message;

	}


	public String showSeries() {
		String message="";
		for (int i = 0; i < products.length; i++) {
			Product product=products[i];
			if (product !=null && product instanceof Serie){
				message=message+product.toString();
			}
			
		}
		return message;
	}


	/*
	public String showMovies(String category) {
		String message="";
		for (int i = 0; i < products.length; i++) {
			Product product=products[i];
			if (product !=null && product instanceof Movie){
				Movie movie=(Movie) product;
				if (movie.getCat)
				message=message+product.toString();
			}
			
		}
		return message;
	}
	*/



}

