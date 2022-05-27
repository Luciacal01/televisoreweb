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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Televisore get(Long id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int update(Televisore input) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insert(Televisore input) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(Televisore input) throws Exception {
		// TODO Auto-generated method stub
		return 0;
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
