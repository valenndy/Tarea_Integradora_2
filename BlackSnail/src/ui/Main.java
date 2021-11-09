package ui;

import java.util.Scanner;

import model.BlackSnail;
import model.TypeClient;

public class Main {
	private Scanner sc;
	private BlackSnail controller;

	public Main() {
		sc = new Scanner(System.in);
		controller = new BlackSnail("324234234", "Street #30-40", "www.blacksnail.com");
	}

	public static void main(String[] args) {

		// creando un objeto de la clase principal
		Main obPpal = new Main();

		// variable para leer la entrada
		int option = 0;

		// ciclo para ejecutar el menu mientras que el usuario no
		// elija la opciOn para salir (0)
		do {
			option = obPpal.showMenuAndGetOption();
			obPpal.answerOption(option);
		} while (option != 0);

	}

	/**
	* Descripción:Menu de opciones</br>
	*/
	public int showMenuAndGetOption() {
		System.out.println("\n\nMenu de la Tienda, digite una opciOn\n" + "(1) Crear nuevo suscriptor\n"
				+ "(2) Desactivar un suscriptor\n"
				+ "(3) Desplegar la cantidad de suscriptores activos por cada tipo de cliente\n"
				+ "(4) Desplegar el nombre del suscriptor menor de edad que\n"
				+ "tenga el mayor número de horas dispuesto a consumir.\n" 
				+ "(5) Agregar productos\n"
				+ "(6) Mostrar productor por su nombre\n"
				+ "(7) Crear siguiente temporada de una serie\n"
				+ "(8) Lista todas las peliculas por categoria\n"
				+ "(9) Listar todas las series\n"
				+ "(0) Para salir");
		int input = Integer.parseInt(sc.nextLine());
		return input;




	}

	/**
	* Descripción: de acuerdo a la seleccion del usuario se dirige
	al metodo que realiza la accion seleccionada</br>
	* @param <userOption> <String> debe ser un numero entero
	*/
	public void answerOption(int userOption) {

		switch (userOption) {
		case 0:
			System.out.println("Cerrando la aplicacion, adios.");
			break;
		case 1:
			createSubscriber();
			break;
		case 2:
			desactivateSubscriber();
			break;
		case 3:
			subscriberDiferentTypeList();
			break;
		case 4:
			underAgeSubscriberWithMoreHours();
			break;
		case 5:
			createProduct();
			break;

		case 6:
			showProduct();
			break;

		case 7:
			createNextSeason();
			break;

		case 8:
			showMoviesPerCategory();
			break;

		case 9:
			showSeries();
			break;

		}
	}

	/**
	* Descripción: ¿qué hace mi método? (concisa, un par de líneas)</br>
	* @param <tittle> <String>, debe ser un dato tipo String
	*/
	private void showProduct() {
		System.out.println("Ingrese el titulo del producto");
		String tittle=sc.nextLine();

		String msg=controller.showProduct(tittle);
		System.out.println(msg);
	}


	/**
	* Descripción: agrega una serie</br>
	*/
	private void showSeries() {

		String msg=controller.showSeries();
		System.out.println(msg);
	}

	private void showMoviesPerCategory() {
		System.out.println("Ingrese la categoria");
		String category=sc.nextLine();
		System.out.println(controller.showMovies(category));
		
	}



	/**
	* Descripción: crea la temporada siguiente de una serie </br>
	* @param <num> <int>, debe ser un numero entero
	* @param <cantEP> <int>, debe ser un numero entero
	* @param <cantEPU> <int>, debe ser un numero entero
	* @param <premiere> <String>, debe de ser un dato de tipo String
	* @param <trailer> <String>, debe ser un dato de tipo String
	*/
	private void createNextSeason() {
		System.out.println("Ingrese la informacion de la temporada ");
		System.out.println("Ingrese el titulo de la serie ");
		String tittle=sc.nextLine();

		System.out.println("Ingrese el numero de temporadas: ");
		int num = Integer.parseInt(sc.nextLine());

		System.out.println("Ingrese la cantidad de episodios: ");
		int cantEP = Integer.parseInt(sc.nextLine());

		System.out.println("Ingrese la cantidad de episodios publicados: ");
		int cantEPU = Integer.parseInt(sc.nextLine());


		System.out.println("Ingrese la fecha de la premiere: ");
		String premiere = sc.nextLine();

		System.out.println("Ingrese el link del trailer: ");
		String trailer = sc.nextLine();

		System.out.println(controller.createNextSeason(tittle, num,  cantEP,  cantEPU,premiere,  trailer));
	}

	/**
	* Descripción: pide los datos de un suscriptor para agragarlo</br>
	* @param <name> <String>, debe ser un dato de tipo String
	* @param <id> <String>, debe ser un dato de tipo String
	* @param <nit> <String>, debe ser un dato de tipo String
	* @param <address> <String>, debe ser un dato de tipo String
	* @param <webSite> <String>, debe ser un dato de tipo String
	* @param <age> <String>, debe ser un numero entero
	* @param <cantHrs> <String>, debe ser un numero entero
	* @return <nombre_var> <tipo>, informacion sobre variable de retorno --> si retorno
	*/
	private void createSubscriber() {

		String name, id, nit, address, webSite;
		int age, cantHrs;

		System.out.println("============= Ingrese la informacion del canal =============");

		System.out.println("ingrese el nit: ");
		nit = sc.nextLine();

		System.out.println("Ingrese la direccion: ");
		address = sc.nextLine();

		System.out.println("Ingrese la pagina Web: ");
		webSite = sc.nextLine();
		sc.nextLine();

		System.out.println("=============== Ingrese la informacion del suscriptor =============== ");

		System.out.println("Nombre");
		name = sc.nextLine();

		System.out.println("Edad");
		age = Integer.parseInt(sc.nextLine());
		sc.nextLine();

		System.out.println("Numero de cedula");
		id = sc.nextLine();

		

		System.out.println("Cantidad de horas dispuestas a consumir: ");
		cantHrs = Integer.parseInt(sc.nextLine());
		sc.nextLine();

		System.out.println("El nit es: " + nit);
		System.out.println("La direccion es: " + address);
		System.out.println("La pagina web es:" + webSite);

		System.out.println(controller.addSubscriber(name, age, id, cantHrs));

	}

	// metodo que desactiva a un suscriptor
	private void desactivateSubscriber() {
		String id;
		System.out.println("Ingrese la cedula del suscriptor que desea desactivar");
		id = sc.nextLine();
		System.out.println(controller.desactivateSubscriber(id));
	}

	//
	private void subscriberDiferentTypeList() {
		System.out.println("Normal: " + controller.subscriberDiferentTypeList(TypeClient.NORMAL));
		System.out.println("Platinum: " + controller.subscriberDiferentTypeList(TypeClient.PLATINUM));
		System.out.println("Gold: " + controller.subscriberDiferentTypeList(TypeClient.GOLD));
		System.out.println("Diamond: " + controller.subscriberDiferentTypeList(TypeClient.DIAMOND));
	}

	public void underAgeSubscriberWithMoreHours() {
		System.out.println("Name: " + controller.underAgeSubscriberWithMoreHours().toString());
	}

	/**
	* Descripción: crea un nuevo producto</br>
	* @param <userOption> <int>, dede ser un numero entero
	* @param <named> <String>, dede ser un dato tipo String
	* @param <sinop> <String>, dede ser un dato tipo String
	* @param <premiere> <String>, dede ser un dato tipo String
	* @param <namep> <String>, dede ser un dato tipo String
	* @param <censu> <String>, dede ser un dato tipo String
	* @param <num> <String>, debe ser un numero entero
	* @param <cantEP> <String>, dede ser un numero entero
	* @param <cantEPU> <String>, dede ser un numero entero
	* @param <trailer> <String>, dede ser un dato tipo String
	* @param <productora> <String>, dede ser un dato tipo String
	* @param <age> <int>, dede ser un numero entero
	*/
	public void createProduct() {
		System.out.println("Seleccione 1 para comprar serie o 2 para una pelicula");
		int userOption = Integer.parseInt(sc.nextLine());

		System.out.println("ingrese el nombre del titulo: ");
		String tittle = sc.nextLine();



		System.out.println("Ingrese el nombre del director: ");
		String named = sc.nextLine();

		System.out.println("Ingrese la sinopsis: ");
		String sinop = sc.nextLine();
		
		System.out.println("Ingrese el dia de estreno: ");
		String premiere = sc.nextLine();

			

		if (userOption == 1) {

			System.out.println("Ingrese el nombre del protagonista: ");
			String namep = sc.nextLine();

			System.out.println("Diga si la serie fue censurada si es asi indique la razon: ");
			String censu = sc.nextLine();


			//Atributos de season
			//int num, int cantEP, int cantEPU, String trailer
			System.out.println("Ingrese la informacion de la temporada ");

			System.out.println("Ingrese el numero de temporadas: ");
			int num = Integer.parseInt(sc.nextLine());

			System.out.println("Ingrese la cantidad de episodios: ");
			int cantEP = Integer.parseInt(sc.nextLine());

			System.out.println("Ingrese la cantidad de episodios publicados: ");
			int cantEPU = Integer.parseInt(sc.nextLine());

			System.out.println("Ingrese el link del trailer: ");
			String trailer = sc.nextLine();

			System.out.println(controller.addSerie(named, sinop, namep, censu,premiere,tittle, num,  cantEP,  cantEPU,  trailer));
		}

		if (userOption == 2) {

			System.out.println("Ingrese la productora: ");
			String produc = sc.nextLine();

			System.out.println("Ingrese la mínima edad recomendada para verla: ");
			int age = Integer.parseInt(sc.nextLine());

			System.out.println("Ingrese la categoria de la pelicula,ROMANTIC, ACTION, SUSPENSE, TERROR, COMEDY: ");
			String category =sc.nextLine();

			System.out.println(controller.addMovie(named, sinop, tittle, produc, premiere, age,category));
		}
	}

}
