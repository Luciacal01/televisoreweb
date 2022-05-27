package it.prova.televisoreweb.service.televisore;

import java.util.List;

import it.prova.televisoreweb.dao.televisore.TelevisoreDAO;
import it.prova.televisoreweb.model.Televisore;

public interface TelevisoreService {
	public void setTelevisoreDAO(TelevisoreDAO televisoreDAO);

	public List<Televisore> cercaPerMarcaeModello(String marca, String modello);

	public List<Televisore> listaDiTuttiITelevisori() throws Exception;

	public Televisore cercaTelevisorePerId(Long id) throws Exception;
	
	public int inserisciNuovo(Televisore televisoreDaInserire) throws Exception;

	public int rimuoviTelevisore(Long idDaRimuovere) throws Exception;
	
	public int aggiornaTelevisore(Long idDaAggiornare) throws Exception;
}
