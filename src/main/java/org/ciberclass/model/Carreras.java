package org.ciberclass.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Carreras")
public class Carreras {
	
	@Id
	private int idcarrera;
	@Column(name = "descripcion")
	private String descripcionCarrera;
	
	
	
	//
	
	public int getIdcarrera() {
		return idcarrera;
	}
	public void setIdcarrera(int idcarrera) {
		this.idcarrera = idcarrera;
	}
	public String getDescripcionCarrera() {
		return descripcionCarrera;
	}
	public void setDescripcionCarrera(String descripcionCarrera) {
		this.descripcionCarrera = descripcionCarrera;
	}
	@Override
	public String toString() {
		return "Carreras [idcarrera=" + idcarrera + ", descripcionCarrera=" + descripcionCarrera + "]";
	}
	public Carreras(int idcarrera, String descripcionCarrera) {
		super();
		this.idcarrera = idcarrera;
		this.descripcionCarrera = descripcionCarrera;
	}
	public Carreras() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	
	
}
