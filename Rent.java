package Gestion_de_bibliothèque;

import java.sql.Date;

public class Rent {
	private int idrent;
	User user;
	Book book;
	private Date datePret;
	private Date dateFin;
	
		
	public int getIdrent() {
		return idrent;
	}
	public void setIdrent(int idrent) {
		this.idrent = idrent;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Book getBook() {
		return book;
	}
	public void setBook(Book book) {
		this.book = book;
	}
	public Date getDatePret() {
		return datePret;
	}
	public void setDatePret(Date datePret) {
		this.datePret = datePret;
	}
	public Date getDateFin() {
		return dateFin;
	}
	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}
	@Override
	public String toString() {
		return "Rent [idrent=" + idrent + ", user=" + user + ", book=" + book + ", datePret=" + datePret + ", dateFin="
				+ dateFin + "]";
	}
	
	public void afficherRent() {
		System.out.println(toString());
	}

	public void vérifRent(Rent rent1, Rent rent2) {
		if(rent1.getIdrent()==rent2.getIdrent())
			{System.out.println("C'est le rent");}
	else {System.out.println("Ce sont 2 rents diférents");}
	}

}
