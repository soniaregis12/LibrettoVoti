package it.polito.tdp.libretto.model;

import java.util.*;

public class Libretto {
	
	private List<Voto> voti = new ArrayList<>();

	
	public boolean add(Voto v) {
		if(this.isConflitto(v) || this.isDuplicato(v)) {
			// non fai niente, voto duplicato o in conflitto
			return false;
		}else {
			this.voti.add(v);
			return true;
		}
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

	public Voto cercaNomeCorso(String nomeCorso) {
		/*
		for(Voto v : voti) {
			if(v.getNomeCorso().equals(nomeCorso)) {
				return v;
			}
		}
		return null;
		*/
		int pos = this.voti.indexOf(new Voto(nomeCorso, 0, null));
		if(pos != -1) {
			return this.voti.get(pos);
		}else {
			return null;
		}
	}
	
	public boolean isDuplicato(Voto v) {
		Voto esiste = this.cercaNomeCorso(v.getNomeCorso());
		if(esiste == null) {
			return false;
		}
		/*if(esiste.getVotoOttenuto() == v.getVotoOttenuto()) {
			return true;
		}else {
			return false;
		}
		*/
		return (esiste.getVotoOttenuto() == v.getVotoOttenuto());
	}
	
	public boolean isConflitto(Voto v) {
		Voto esiste = this.cercaNomeCorso(v.getNomeCorso());
		if(esiste == null) {
			return true;
		}
		
		return (esiste.getVotoOttenuto() != v.getVotoOttenuto());
	}
	
	public Libretto creaLibrettoMigliorato() {
	Libretto l = new Libretto();
	
	for(Voto v : this.voti) {
		Voto v2 = v;
		if(v.getVotoOttenuto() >= 24) {
			v2.setVotoOttenuto(v2.getVotoOttenuto()+2);
			if(v2.getVotoOttenuto() > 30) {
				v2.setVotoOttenuto(30);
			}
		}else if(v2.getVotoOttenuto() >= 18) {
			v2.setVotoOttenuto(v.getVotoOttenuto()+1);
		}
		l.add(v2);
	}
	return l;
}

}
