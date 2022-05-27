package it.prova.televisoreweb.dao;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import it.prova.televisoreweb.model.Televisore;

public class DB_Mock {
	
	public static final List<Televisore> LISTA_TELEVISORI=new ArrayList<Televisore>();
	
	static {
		LISTA_TELEVISORI.add(new Televisore(1l, "sony", "A90J", 1120, 45, "SNY629"));
		LISTA_TELEVISORI.add(new Televisore(2l, "LG", "C2 OLEG ", 145, 35, "LGF700"));
		LISTA_TELEVISORI.add(new Televisore(3l, "Samsung", "Bravia", 650, 62, "X95J"));
		LISTA_TELEVISORI.add(new Televisore(4l, "Panasonic", "OLED", 1560, 60, "JZ2000"));
		LISTA_TELEVISORI.add(new Televisore(5l, "HISENSE", "Quantum", 345, 58, "H8G"));
		LISTA_TELEVISORI.add(new Televisore(1l, "Samsung", "NEO QLED", 777, 44, "QN900B"));
		
	}
	
	public static Long getNexIdAvailable() {
		Long resultId = null;
		if(LISTA_TELEVISORI== null || LISTA_TELEVISORI.isEmpty()) {
			resultId=1L;
		}
		resultId=LISTA_TELEVISORI.stream().max(Comparator.comparing(Televisore::getIdTelevisore)).get().getIdTelevisore();
		return ++resultId;
	}

}
