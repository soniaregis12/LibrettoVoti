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
	

}
