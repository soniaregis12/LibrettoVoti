package it.polito.tdp.libretto.model;

import java.time.LocalDate;

public class Voto {
	
	private String nomeCorso;
	private int votoOttenuto;
	private LocalDate data;
	
	public String getNomeCorso() {
		return nomeCorso;
	}
	public void setNomeCorso(String nomeCorso) {
		this.nomeCorso = nomeCorso;
	}
	public int getVotoOttenuto() {
		return votoOttenuto;
	}
	public void setVotoOttenuto(int votoOttenuto) {
		this.votoOttenuto = votoOttenuto;
	}
	public LocalDate getData() {
		return data;
	}
	public void setData(LocalDate data) {
		this.data = data;
	}
	/**
	 * 													// Slash, doppio asterisco, invio per generale la documentazione 
	 * @param nomeCorso
	 * @param votoOttenuto
	 * @param data
	 */
	public Voto(String nomeCorso, int votoOttenuto, LocalDate data) {
		this.nomeCorso = nomeCorso;
		this.votoOttenuto = votoOttenuto;
		this.data = data;
	}
	@Override
	public String toString() {
		return nomeCorso + ", voto: " + votoOttenuto + ", data: " + data;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nomeCorso == null) ? 0 : nomeCorso.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Voto other = (Voto) obj;
		if (nomeCorso == null) {
			if (other.nomeCorso != null)
				return false;
		} else if (!nomeCorso.equals(other.nomeCorso))
			return false;
		return true;
	}
	

}
