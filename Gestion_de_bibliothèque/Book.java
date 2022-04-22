package Gestion_de_bibliothèque;

import java.sql.ResultSet;
import java.sql.Statement;

public class Book {
	private int idbook;
	private String title;
	private String author;
	private String editor;
	private int pageNB;
	private String summary;
	Library library;
	
	//Getters&setters
	
	public int getIdbook() {
		return idbook;
	}



	public void setIdbook(int idbook) {
		this.idbook = idbook;
	}



	public String getTitle() {
		return title;
	}



	public void setTitle(String title) {
		this.title = title;
	}



	public String getAuthor() {
		return author;
	}



	public void setAuthor(String author) {
		this.author = author;
	}



	public String getEditor() {
		return editor;
	}



	public void setEditor(String editor) {
		this.editor = editor;
	}



	public int getPageNB() {
		return pageNB;
	}



	public void setPageNB(int pageNB) {
		this.pageNB = pageNB;
	}



	public String getSummary() {
		return summary;
	}



	public void setSummary(String summary) {
		this.summary = summary;
	}



	public Library getLibrary() {
		return library;
	}



	public void setLibrary(Library library) {
		this.library = library;
	}



	//Constructeur
	public Book(int idbook, String title, String author, String editor, int pageNB, String summary, Library library) {
		super();
		this.idbook = idbook;
		this.title = title;
		this.author = author;
		this.editor = editor;
		this.pageNB = pageNB;
		this.summary = summary;
		this.library = library;
	}



	@Override
	public String toString() {
		return "Book [idbook=" + idbook + ", title=" + title + ", author=" + author + ", editor=" + editor + ", pageNB="
				+ pageNB + ", summary=" + summary + ", library=" + library + "]";
	}
	
	public void afficherBook() {
			System.out.println(toString());}
	
	
	
	public void vérifBook(Book book1, Book book2) {
		if(book1.getIdbook()==book2.getIdbook())
			{System.out.println("C'est le même livre");}
	else {System.out.println("Ce sont des livres diférents");}

}	
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
		}}
	



