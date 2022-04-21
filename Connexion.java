package Gestion_de_bibliothèque;

import java.sql.Connection;
import java.sql.DriverManager;


public class Connexion {
	public  Connection connecterDB() {

		// Information d'accès à la base de données
		String url = "jdbc:mysql://localhost/db_gestion_bibliothéque";
		String login = "root";
		String passwd = "";
		Connection cn =null;
		try {
			// Etape 1 : Chargement du driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver oki");
			// Etape 2 : récupération de la connexion
			cn = DriverManager.getConnection(url, login, passwd);
			System.out.println("Connexion bien établie");
			return cn;
	    	} catch (Exception e) {
		    	e.printStackTrace();
		        	return null;}

            }



	}
