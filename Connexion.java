package Gestion_de_biblioth�que;

import java.sql.Connection;
import java.sql.DriverManager;


public class Connexion {
	public  Connection connecterDB() {

		// Information d'acc�s � la base de donn�es
		String url = "jdbc:mysql://localhost/db_gestion_biblioth�que";
		String login = "root";
		String passwd = "";
		Connection cn =null;
		try {
			// Etape 1 : Chargement du driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver oki");
			// Etape 2 : r�cup�ration de la connexion
			cn = DriverManager.getConnection(url, login, passwd);
			System.out.println("Connexion bien �tablie");
			return cn;
	    	} catch (Exception e) {
		    	e.printStackTrace();
		        	return null;}

            }



	}
