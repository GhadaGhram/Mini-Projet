package Gestion_de_bibliothèque;

import java.util.ArrayList;

public class Library {
	private int idlibrary;
	private String name;
	private String adresse;
	private int numTel;
	ArrayList<Book> refBook=new ArrayList<>();
	ArrayList<Rent> refRent=new ArrayList<>();
	
	public int getIdlibrary() {
		return idlibrary;
	}
	public void setIdlibrary(int idlibrary) {
		this.idlibrary = idlibrary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public int getNumTel() {
		return numTel;
	}
	public void setNumTel(int numTel) {
		this.numTel = numTel;
	}
	public ArrayList<Book> getRefBook() {
		return refBook;
	}
	public void setRefBook(ArrayList<Book> refBook) {
		this.refBook = refBook;
	}
	public ArrayList<Rent> getRefRent() {
		return refRent;
	}
	public void setRefRent(ArrayList<Rent> refRent) {
		this.refRent = refRent;
	}
	
	
	
	
	
	
	

}
