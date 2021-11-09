package model;

public class Serie extends Product {
	private String namePro;
	private String censored;
	private Season[] seasons;

	public Serie(String premiereDate, String tittle, String nameDirect, String namePro, String censored,
			String synopsis) {
		super(premiereDate, tittle, nameDirect, synopsis);
		this.namePro = namePro;
		this.censored = censored;
		this.seasons = new Season[20];
	}

	// ============================== Getters & Setters ==============================

	public Season[] getSeasons() {
		return seasons;
	}

	public void setSeasons(Season[] seasons) {
		this.seasons = seasons;
	}

	public String getNamePro() {
		return namePro;
	}

	public void setNamePro(String namePro) {
		this.namePro = namePro;
	}

	public String getCensored() {
		return censored;
	}

	public void setCensored(String censored) {
		this.censored = censored;
	}

	public String exampleClase(int par) {
		String out = "esto es una pelicula" + (par + 10);
		return out;
	}

	public String toString() {
		return super.toString() + "Name protagonist: " + getNamePro() + "\n" + "The censured: " + getCensored() + "\n"
				+ "The season: " + getLastSeason() + "\n";
	}

	private String getLastSeason() {
		Season season = seasons[0];
		for (int i = 1; i < seasons.length; i++) {
			if (seasons[i] != null) {
				season = seasons[i];
			}
		}
		return season.toString();
	}

	public String addSeason(int num, int cantEP, int cantEPU, String premiereDate, String trailer) {
		String msg = "Error";

		for (int i = 0; i < seasons.length; i++) {
			if (seasons[i] == null) {
				seasons[i] = new Season(num, cantEP, cantEPU, premiereDate, trailer);
				msg = "Se agrego una nueva temporada";
			}
		}

		return msg;

	}

}