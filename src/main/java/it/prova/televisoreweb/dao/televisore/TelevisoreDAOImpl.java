package it.prova.televisoreweb.dao.televisore;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

import it.prova.televisoreweb.dao.DB_Mock;
import it.prova.televisoreweb.model.Televisore;

public class TelevisoreDAOImpl implements TelevisoreDAO {
	
	private Connection connection;
	
	public void setConnection() {
		this.connection=connection;
	}

	@Override
	public List<Televisore> list() throws Exception {
		List<Televisore> results= new ArrayList<Televisore>();
		
		for (Televisore televisoreItem : DB_Mock.LISTA_TELEVISORI) {
			results.add(televisoreItem);
		}
		return results;
	}

	@Override
	public Televisore get(Long id) throws Exception {
		Televisore result=null;
		
		for (Televisore televisoreItem : DB_Mock.LISTA_TELEVISORI) {
			if(televisoreItem.getIdTelevisore()== id)
				result=televisoreItem;
		}
		return result;
	}

	@Override
	public int update(Televisore input) throws Exception {
		for(Televisore televisoreItem: DB_Mock.LISTA_TELEVISORI) {
			if(televisoreItem.getIdTelevisore()==input.getIdTelevisore()) {
				televisoreItem.setMarca(input.getMarca());
				televisoreItem.setModello(input.getModello());
				televisoreItem.setPrezzo(input.getPrezzo());
				televisoreItem.setNumeroPollici(input.getNumeroPollici());
				televisoreItem.setCodice(input.getCodice());
				return 1;
			}
		}
		return 0;
	}

	@Override
	public int insert(Televisore input) throws Exception {
		input.setIdTelevisore(DB_Mock.getNexIdAvailable());
		return DB_Mock.LISTA_TELEVISORI.add(input)?1:0;
	}

	@Override
	public int delete(Televisore input) throws Exception {
		input.setIdTelevisore(DB_Mock.getNexIdAvailable());
		return DB_Mock.LISTA_TELEVISORI.remove(input)?1:0;
	}

	@Override
	public void setConnection(Connection connection) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Televisore> findByMarcaAndModello(String marca, String Modello) {
		List<Televisore> result= new ArrayList<Televisore>();
		
		for (Televisore televisoreItem : DB_Mock.LISTA_TELEVISORI) {
			if(televisoreItem.getMarca().startsWith(marca) && televisoreItem.getModello().startsWith(Modello))
				result.add(televisoreItem);
		}
		return result;
	}

}
