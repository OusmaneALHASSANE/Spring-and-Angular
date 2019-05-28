package ousmane.alhassane.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
public class Produit implements Serializable {
@Id
@GeneratedValue
private Long id;
private String designation;
private double prix;
private int quantite;
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getDesignation() {
	return designation;
}
public void setDesignation(String designation) {
	this.designation = designation;
}
public double getPrix() {
	return prix;
}
public void setPrix(double prix) {
	this.prix = prix;
}
public int getQuantite() {
	return quantite;
}
public void setQuantite(int quantite) {
	this.quantite = quantite;
}
public Produit() {
	super();
	// TODO Auto-generated constructor stub
}
public Produit(String designation, double prix, int quantite) {
	super();
	this.designation = designation;
	this.prix = prix;
	this.quantite = quantite;
}

}
