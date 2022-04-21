package Gestion_de_bibliothèque;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class LibraryManager {

	public static void main(String[] args) {
		
			afficherLivre();
		//jouterLivre(5,"Les misérables","Victor Hugo"," Albert Lacroix et Cie",300," ",1);
			 System.out.println("L'id du livre à rechercher");
			 Scanner sc = new Scanner(System.in);	
			 Integer id=sc.nextInt();
			 rechercherIdbook(id);
			 
			
	}
	
	
				
	//Une méthode permettant d'afficher les livres de la bibliothèque passée en paramètre;		
		public static void afficherLivre() {
		try {
			Connexion cnx=new Connexion();
			Statement st;
			ResultSet rs;
			
			st=cnx.connecterDB().createStatement();
			rs=st.executeQuery("SELECT *FROM book");
			
			while(rs.next()) {
				System.out.println(rs.getInt("idbook"));
				System.out.println(rs.getString("title"));
				System.out.println(rs.getString("author"));
				System.out.println(rs.getString("editor"));
				System.out.println(rs.getInt("pageNB"));}
				
			}catch (Exception e) {
		    	e.printStackTrace();
	        	}
		}
	
/*/ Une méthode permettant d'ajouter un livre à la bibliothèque ;
            public static void ajouterLivre(int idbook,String title, String author,String editor, int pageNB, String summary, int refLibrary) {
			try {
				Connexion cnx=new Connexion();
				Statement st;							
				st = cnx.connecterDB().createStatement();		
				String sql=("INSERT INTO `book` (`idbook`, `title`, `author`, `editor`, `pageNB`, `summary`, `refLibrary`)"
						+ " VALUES ("+idbook+", '"+title+"', '"+author+"', '"+editor+"', "+pageNB+", '"+summary+"', "+refLibrary+")");
			
				st.executeUpdate(sql);
				}catch (Exception e) {
			    	e.printStackTrace();
		        	}
			}*/
            
       // Une méthode permettant de rechercher un livre par son ID;
            public static  void rechercherIdbook(Integer id) {
            	
           	try {
				Connexion cnx=new Connexion();
				Statement st;
				ResultSet rs;
				
			 st=cnx.connecterDB().createStatement();					
				 String sql=("SELECT * FROM book WHERE idbook"+id+"");
				 rs.executeQuery(sql); 
											 				
				while(rs.next()) {
					System.out.println(rs.getInt("idbook"));
					System.out.println(rs.getString("title"));
					System.out.println(rs.getString("author"));
					System.out.println(rs.getString("editor"));
					System.out.println(rs.getInt("pageNB"));}
					
				}catch (Exception e) {
			    	e.printStackTrace();
		        	}
}}
	
	
	
	
	
		
		
		
		

	

	
	
	
	


