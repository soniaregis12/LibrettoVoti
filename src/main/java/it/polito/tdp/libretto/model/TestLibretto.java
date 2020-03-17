package it.polito.tdp.libretto.model;

import java.time.LocalDate;

public class TestLibretto {
	
	Libretto l;
	
	private void run() {
		this.l = new Libretto();
		
		Voto v1 = new Voto("TdP", 30, LocalDate.of(2020, 05, 12));
		l.add(v1);
		l.add(new Voto("Analisi 2", 18, LocalDate.of(2020, 06, 27)));
		
		System.out.println(this.l);
		
		System.out.println(this.l.estraiVotiUguali(18));
		
	}
	
	public static void main(String[] args) {
		TestLibretto test = new TestLibretto();
		test.run();
	}

}
