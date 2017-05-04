package fr.lyon.formation.exo2;

import java.util.Date;

import fr.lyon.formation.exo2.objets.Producer;
import fr.lyon.formation.exo2.objets.ProducerWithRisk;
import fr.lyon.formation.exo2.objets.Representant;
import fr.lyon.formation.exo2.objets.Salesman;
import fr.lyon.formation.exo2.objets.Staff;
import fr.lyon.formation.exo2.objets.Warehouseman;
import fr.lyon.formation.exo2.objets.WarehousemanWithRisk;

/**
 * Classe principale.
 *
 * @author hb-asus
 *
 */
public class Main {

	/**
	 * Point d'entr�e de l'application.
	 *
	 * @param args
	 *            les arguments syst�me.
	 */
	public static void main(String[] args) {
		// Cr�ation d'un objet Date. Le constructeur par d�faut (sans argument)
		// utilise la date du jour.
		Date hireDate = new Date();
		// Cr�ation d'un objet Staff qui g�re une liste d'employ�s.
		Staff staff = new Staff();
		// Ajout des employ�s.
		staff.addEmployee(new Salesman("Pierre", "Business", 45, hireDate, 30000));
		staff.addEmployee(new Representant("L�on", "Vendtout", 25, hireDate, 20000));
		staff.addEmployee(new Producer("Yves", "Bosseur", 28, hireDate, 1000));
		staff.addEmployee(new Warehouseman("Jeanne", "Stocketout", 32, hireDate, 45));
		staff.addEmployee(new ProducerWithRisk("Jean", "Flippe", 28, hireDate, 1000));
		staff.addEmployee(new WarehousemanWithRisk("Al", "Abordage", 30, hireDate, 45));
		System.out.println(staff.displaySalaries());
		System.out.println("Le salaire moyen dans l'entreprise est de " + staff.getAverageSalary()
				+ " euros.");
	}

}
