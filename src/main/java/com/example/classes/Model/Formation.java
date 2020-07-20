package com.example.classes.Model;

public class Formation {
private long id;
private String titre,description,formateur;
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getTitre() {
	return titre;
}
public void setTitre(String titre) {
	this.titre = titre;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public String getFormateur() {
	return formateur;
}
public void setFormateur(String formateur) {
	this.formateur = formateur;
}
@Override
public String toString() {
	return "Formation [titre=" + titre + ", description=" + description + ", formateur=" + formateur + "]";
}
public Formation(String titre, String description, String formateur) {
	super();
	this.titre = titre;
	this.description = description;
	this.formateur = formateur;
}


}
