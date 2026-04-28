

import java.util.*;

public class Telecommande {


	private ArrayList<Appareil> appareils;


	public Telecommande() {
		this.appareils = new ArrayList<Appareil>();
	}

	public void ajouterAppareil(Appareil nouvelleAppareil) {
		this.appareils.add(nouvelleAppareil);
	}

	public void activerAppareil(int indiceAppareil) {

		if (indiceAppareil < this.appareils.size())
			this.appareils.get(indiceAppareil).allumer();
	}


	public void desactiverAppareil(int indiceAppareil) {
		if (indiceAppareil < this.appareils.size())
			this.appareils.get(indiceAppareil).eteindre();
	}

	/**
	 * permet d'activer l'ensemble des lampes
	 */
	public void activerTout() {
		for (int i = 0; i < this.appareils.size(); i++)
			// reutiliser du code existant
			this.activerAppareil(i);
	}


	public String toString() {
		String descriptif = "";
		for (int i = 0; i < this.Appareils.size(); i++) {
			descriptif += i + "-" + this.Appareils.get(i) + "\n";
		}
		return (descriptif);
	}


	public Appareil getAppareil(int indiceAppareil) {
		if (indiceAppareil < this.Appareils.size())
			return (this.Appareils.get(indiceAppareil));
		else
			return(null);
	}

}
