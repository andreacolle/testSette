package it.andreagroup.articoli.data.entity;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;

@Entity
public class Articoli {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer idarticolo;
	
	private String nomearticolo;
	
	private Double prezzo;

	public Integer getIdarticolo() {
		return idarticolo;
	}

	public void setIdarticolo(Integer idarticolo) {
		this.idarticolo = idarticolo;
	}

	public String getNomearticolo() {
		return nomearticolo;
	}

	public void setNomearticolo(String nomearticolo) {
		this.nomearticolo = nomearticolo;
	}

	public Double getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(Double prezzo) {
		this.prezzo = prezzo;
	}
	

	
	
	
	
}
