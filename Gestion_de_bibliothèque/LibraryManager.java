package Gestion_de_bibliothèque;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class LibraryManager {

	public static void main(String[] args) {
		
			//afficherLivre();
	     	//ajouterLivre(6,"Blin Date","Nadia Gates"," Walter Davis",198," ",2);
	    	 /*System.out.println("L'id du livre à chercher");
			 Scanner sc = new Scanner(System.in);	
			 Integer id=sc.nextInt();
			 rechercherIdbook(id);
			 
			 System.out.println("L'auteur du livre à chercher");
			 Scanner sc1 = new Scanner(System.in);	
			 String author=sc1.nextLine();
			 rechercherAuthor(author);*/
			// livrePret();
		
		     System.out.println("L'id de l'utilisateur passé en paramétre");
	     	 Scanner sc2 = new Scanner(System.in);	
		     Integer iduser=sc2.nextInt();
			 livrePretUser(iduser);
			 
			 System.out.println("L'id de l'utilisateur à chercher");
	     	 Scanner sc3 = new Scanner(System.in);	
		     Integer iduser1=sc3.nextInt();
			 rechercherIduser(iduser1);
			 
			 ajouterUtilisateur(5,Ahmed, Ghram,France,99737580, ahmed.ghram@gmail.com, );
			 
			
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
				 String sql=("SELECT * FROM book WHERE idbook="+id+"");
				 rs=st.executeQuery(sql); 
											 				
				while(rs.next()) {
					System.out.println(rs.getInt("idbook"));
					System.out.println(rs.getString("title"));
					System.out.println(rs.getString("author"));
					System.out.println(rs.getString("editor"));
					System.out.println(rs.getInt("pageNB"));}
					
				}catch (Exception e) {
			    	e.printStackTrace();
		        	}}
           	
         // Une méthode permettant de rechercher un livre par son auteur;
            public static  void rechercherAuthor(String author) {
            	
           	try {
				Connexion cnx=new Connexion();
				Statement st;
				ResultSet rs;
				
			     st=cnx.connecterDB().createStatement();					
				 String sql=("SELECT * FROM book WHERE author='"+author+"'");
				 rs=st.executeQuery(sql); 
											 				
				while(rs.next()) {
					System.out.println(rs.getInt("idbook"));
					System.out.println(rs.getString("title"));
					System.out.println(rs.getString("author"));
					System.out.println(rs.getString("editor"));
					System.out.println(rs.getInt("pageNB"));}
					
				}catch (Exception e) {
			    	e.printStackTrace();
		        	}}
           	
         // Une méthode permettant d'afficher les livres en pret;
            public static  void livrePret() {
            	
               	try {
    				Connexion cnx=new Connexion();
    				Statement st;
    				ResultSet rs;
    				
    			     st=cnx.connecterDB().createStatement();					
    				 String sql=("SELECT idbook, title, author, refBook  FROM book, Rent  WHERE idbook=refBook ");
    				 rs=st.executeQuery(sql); 
    											 				
    				while(rs.next()) {
    					System.out.println(rs.getInt("idbook"));
    					System.out.println(rs.getString("title"));
    					System.out.println(rs.getString("author"));
    					System.out.println(" ");
    					}
    					
    				}catch (Exception e) {
    			    	e.printStackTrace();
    		        	}}
            
                // Une méthode permettant d'afficher les livres en cours de prêt d'un utilisateur passé en paramètre;
               	public static  void livrePretUser(Integer iduser) {
                	
                   	try {
        				Connexion cnx=new Connexion();
        				Statement st;
        				ResultSet rs;
        				
        			     st=cnx.connecterDB().createStatement();					
        				 String sql=("SELECT idbook, title, author, refBook, refUser  FROM book,Rent,user  WHERE "+ iduser+"=refUser AND idbook=refBook ");
        				 rs=st.executeQuery(sql); 
        											 				
        				while(rs.next()) {
        				    System.out.println(rs.getInt("idbook"));
        					System.out.println(rs.getString("title"));
        					System.out.println(rs.getString("author"));
        					System.out.println(" ");
        					}
        					
        				}catch (Exception e) {
        			    	e.printStackTrace();
        		        	}}
                   	
                    // Une méthode permettant de rechercher un utilisateur par son ID
                    public static  void rechercherIduser(Integer iduser) {
                    	
                       	try {
            				Connexion cnx=new Connexion();
            				Statement st;
            				ResultSet rs;
            				
            			     st=cnx.connecterDB().createStatement();					
            				 String sql=("SELECT * FROM user WHERE iduser="+iduser+"");
            				 rs=st.executeQuery(sql); 
            											 				
            				while(rs.next()) {
            					System.out.println(rs.getInt("iduser"));
            					System.out.println(rs.getString("prenom"));
            					System.out.println(rs.getString("nom"));
            					System.out.println(rs.getString("adresse"));
            					System.out.println(rs.getInt("numTel"));
            					System.out.println(rs.getString("mail"));}
            					
            				}catch (Exception e) {
            			    	e.printStackTrace();
            		        	}
                    }
                   //	Une méthode permettant de créer un utilisateur;
                      public static void ajouterUtilisateur(int iduser,String prenom, String nom,String adresse, int numTel, String mail, int refRent) {
                			try {
                				Connexion cnx=new Connexion();
                				Statement st;							
                				st = cnx.connecterDB().createStatement();		
                				String sql=("INSERT INTO `user` (`iduser`, `prenom`, `nom`, `adresse`, `numTel`, `mail`, `refRent`)"
                						+ " VALUES ("+iduser+", '"+prenom+"', '"+nom+"', '"+adresse+"', "+numTel+", '"+mail+"', "+refRent+")");
                			
                				st.executeUpdate(sql);
                				}catch (Exception e) {
                			    	e.printStackTrace();
                		        	}
                			}
                      
                       	
                       	
                       //   Une méthode permettant de créer un prêt;
                       	
                      // 	Une méthode permettant de créer un livre;
                       	
                       	
                       	
               	
}
	
	
	
	
	
		
		
		
		

	

	
	
	
	


