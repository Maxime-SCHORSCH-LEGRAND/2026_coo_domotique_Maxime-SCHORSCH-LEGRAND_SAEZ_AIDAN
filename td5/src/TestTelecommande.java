

import static org.junit.Assert.*;
import org.junit.Test;


public class TestTelecommande {



	public void testAjouter() {
		Telecommande telecommande=new Telecommande();
		Lampe nouvelleLampe = new Lampe("test");
		telecommande.ajouterAppareil(nouvelleLampe);
		assertEquals("il devrait y avoir une lampe",telecommande.getAppareil(0),nouvelleLampe);
	}
	

	public void testVide() {
		Telecommande telecommande=new Telecommande();
		assertEquals("il ne devrait y avoir rien",telecommande.getAppareil(0),null);
	}
	


	public void testAllumer() {
		Telecommande telecommande=new Telecommande();
		telecommande.ajouterAppareil(new Lampe("test"));
		telecommande.activerAppareil(0);
		Lampe lampe=(Lampe)telecommande.getAppareil(0);
		boolean lampeAllumee = lampe.isAllume();
		assertTrue("la lampe devrait etre allumee",lampeAllumee);
	}
	


	public void testAllumerHorsTableau() {
		Telecommande telecommande=new Telecommande();
		telecommande.ajouterAppareil(new Lampe("test"));
		telecommande.activerAppareil(1);
		Lampe lampe=(Lampe)telecommande.getAppareil(0);
		boolean lampeAllumee = lampe.isAllume();
		assertTrue("la lampe devrait rester eteinte",!lampeAllumee);
	}


}
