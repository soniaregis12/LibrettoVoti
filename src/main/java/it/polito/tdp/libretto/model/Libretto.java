package it.polito.tdp.libretto.model;

import java.util.*;

public class Libretto {
	
	private List<Voto> voti = new ArrayList<>();

	
	public void add(Voto v) {
		this.voti.add(v);
	}
	
	public String toString() {
		String s = "";
		
		for(Voto v : this.voti) {
			s += v.toString() + "\n";
		}
		return s;
	}
	
	public Libretto estraiVotiUguali(int voto) {
		Libretto nuovo = new Libretto();
		
		for(Voto v : this.voti) {
			if(v.getVotoOttenuto() == voto) {
				nuovo.add(v);
			}
		}
		return nuovo;
	}
}
