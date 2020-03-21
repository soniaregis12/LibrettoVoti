package it.polito.tdp.libretto.model;

import java.time.LocalDate;

public class TestLibretto {
	
	Libretto l;
	
	private void run() {
		this.l = new Libretto();
		
		// 1 Inserire alcuni voti
		Voto v1 = new Voto("TdP", 30, LocalDate.of(2020, 05, 12));
		l.add(v1);
		l.add(new Voto("Analisi 2", 18, LocalDate.of(2020, 06, 27)));
		l.add(new Voto("Economia", 24, LocalDate.of(2020, 02, 14)));
		
		System.out.println(this.l);
		
		// 2 Stampa tutti i voti uguali a 28
		System.out.println(this.l.estraiVotiUguali(18));
		
		// 3 Cerca esame superato conoscendo nome corso
		String nomeCorso = "Analisi 2";
		Voto voto = l.cercaNomeCorso(nomeCorso);
		System.out.println("Il voto ricercato e': ");  //+ voto.getNomeCorso()
		
		Voto votoMancante = l.cercaNomeCorso("Fisica 1");
		System.out.println("Il voto mancante e': " + votoMancante);
		
		// 4-5 Verifica duplicati/conflitti
		Voto economia2 = new Voto("Economia", 24, LocalDate.now());
		Voto economia3 = new Voto("Economia", 21, LocalDate.now());
		System.out.println("Economia con 24 è duplicato: " + l.isDuplicato(economia2) + "/ conflitto: " + l.isConflitto(economia2));
		System.out.println("Economia con 21 è duplicato: " + l.isDuplicato(economia3) + "/ conflitto: " + l.isConflitto(economia3));
		
		// 6 Modifica della funzione Libretto.add
		
		// 7 
		
		Libretto migliorato = l.creaLibrettoMigliorato();
		System.out.println(l);
		System.out.println("Miglioramento del libretto: ");
		System.out.println(migliorato);

	}
	
	public static void main(String[] args) {
		TestLibretto test = new TestLibretto();
		test.run();
	}

}
