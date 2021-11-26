package org.ciberclass.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;

@Entity
public class Reserva {
	@Id
	@Column(name = "codigo")
	 @NotEmpty(message = "Campo codigo obligatorio")
	private int codigoReserva;
	 @NotEmpty(message = "Campo nombre obligatorio")
	private String nombre;
	 @NotEmpty(message = "Campo apellido obligatorio")
	private String apellido;
	
	private int idcarrera ;

	@Column(name = "fchregistro")
	private String  fecha;
	
	//

	
	


	public Reserva() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Reserva(int codigoReserva, String nombre, String apellido, int idcarrera, String fecha) {
		super();
		this.codigoReserva = codigoReserva;
		this.nombre = nombre;
		this.apellido = apellido;
		this.idcarrera = idcarrera;
		this.fecha = fecha;
	}

	@Override
	public String toString() {
		return "Reserva [codigoReserva=" + codigoReserva + ", nombre=" + nombre + ", apellido=" + apellido
				+ ", idcarrera=" + idcarrera + ", fecha=" + fecha + "]";
	}
	
	
	public int getCodigoReserva() {
		return codigoReserva;
	}
	
	public void setCodigoReserva(int codigoReserva) {
		this.codigoReserva = codigoReserva;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getIdcarrera() {
		return idcarrera;
	}

	public void setIdcarrera(int idcarrera) {
		this.idcarrera = idcarrera;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	

	
}
