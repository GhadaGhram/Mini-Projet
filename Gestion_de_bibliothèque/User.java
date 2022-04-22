package Gestion_de_bibliothèque;

import java.util.ArrayList;

public class User {
	private int iduser;
	private String prenom;
	private String nom;
	private String adresse;
	private int numTel;
	private String mail;
	ArrayList<Rent>refRent=new ArrayList<>();
	
	//Getters & setters
	public int getIduser() {
		return iduser;
	}
	public void setIduser(int iduser) {
		this.iduser = iduser;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
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
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	
	
	
	public ArrayList<Rent> getRefRent() {
		return refRent;
	}
	public void setRefRent(ArrayList<Rent> refRent) {
		this.refRent = refRent;
	}
	//Constructeur
	
	public User(int iduser, String prenom, String nom, String adresse, int numTel, String mail,
			ArrayList<Rent> refRent) {
		super();
		this.iduser = iduser;
		this.prenom = prenom;
		this.nom = nom;
		this.adresse = adresse;
		this.numTel = numTel;
		this.mail = mail;
		this.refRent = refRent;
	}
	
	
	
	
	@Override
	public String toString() {
		return "User [iduser=" + iduser + ", prenom=" + prenom + ", nom=" + nom + ", adresse=" + adresse + ", numTel="
				+ numTel + ", mail=" + mail + ", refRent=" + refRent + "]";
	}


	public void afficherUser() {
			System.out.println(toString());}
	
	
	
	public void vérifUser(User user1, User user2) {
		if(user1.getIduser()==user2.getIduser())
			{System.out.println("C'est le même utilisateur");}
	else {System.out.println("Ce sont des livres diférents");}

	}
}
