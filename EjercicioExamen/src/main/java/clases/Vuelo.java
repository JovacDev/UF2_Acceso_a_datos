package clases;
// Generated 10-ene-2020 17:37:58 by Hibernate Tools 4.3.1.Final

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Vuelo generated by hbm2java
 */
public class Vuelo implements java.io.Serializable {

	private String identificador;
	private String aeropuertoOrigen;
	private String aeropuertoDestino;
	private String tipoVuelo;
	private Date fechaVuelo;
	private Set pasajes = new HashSet(0);
	private Set tripulacions = new HashSet(0);

	public Vuelo() {
	}

	public Vuelo(String identificador) {
		this.identificador = identificador;
	}

	public Vuelo(String identificador, String aeropuertoOrigen, String aeropuertoDestino, String tipoVuelo,
			Date fechaVuelo, Set pasajes, Set tripulacions) {
		this.identificador = identificador;
		this.aeropuertoOrigen = aeropuertoOrigen;
		this.aeropuertoDestino = aeropuertoDestino;
		this.tipoVuelo = tipoVuelo;
		this.fechaVuelo = fechaVuelo;
		this.pasajes = pasajes;
		this.tripulacions = tripulacions;
	}

	public String getIdentificador() {
		return this.identificador;
	}

	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}

	public String getAeropuertoOrigen() {
		return this.aeropuertoOrigen;
	}

	public void setAeropuertoOrigen(String aeropuertoOrigen) {
		this.aeropuertoOrigen = aeropuertoOrigen;
	}

	public String getAeropuertoDestino() {
		return this.aeropuertoDestino;
	}

	public void setAeropuertoDestino(String aeropuertoDestino) {
		this.aeropuertoDestino = aeropuertoDestino;
	}

	public String getTipoVuelo() {
		return this.tipoVuelo;
	}

	public void setTipoVuelo(String tipoVuelo) {
		this.tipoVuelo = tipoVuelo;
	}

	public Date getFechaVuelo() {
		return this.fechaVuelo;
	}

	public void setFechaVuelo(Date fechaVuelo) {
		this.fechaVuelo = fechaVuelo;
	}

	public Set getPasajes() {
		return this.pasajes;
	}

	public void setPasajes(Set pasajes) {
		this.pasajes = pasajes;
	}

	public Set getTripulacions() {
		return this.tripulacions;
	}

	public void setTripulacions(Set tripulacions) {
		this.tripulacions = tripulacions;
	}

}
