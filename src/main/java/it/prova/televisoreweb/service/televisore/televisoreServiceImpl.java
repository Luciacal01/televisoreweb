package it.prova.televisoreweb.service.televisore;

import java.util.List;

import it.prova.televisoreweb.dao.televisore.TelevisoreDAO;
import it.prova.televisoreweb.model.Televisore;

public class televisoreServiceImpl implements TelevisoreService {
	
	private TelevisoreDAO televisoreDAO;

	@Override
	public void setTelevisoreDAO(TelevisoreDAO televisoreDAO) {
		this.televisoreDAO=televisoreDAO;
	}

	@Override
	public List<Televisore> cercaPerMarcaeModello(String marca, String modello) {
		return televisoreDAO.findByMarcaAndModello(marca, modello);
	}

	@Override
	public List<Televisore> listaDiTuttiITelevisori() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Televisore cercaTelevisorePerId(Long id) throws Exception {
		return televisoreDAO.get(id);
	}

	@Override
	public int inserisciNuovo(Televisore televisoreDaInserire) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int rimuoviTelevisore(Long idDaRimuovere) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int aggiornaTelevisore(Long idDaAggiornare) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

}
