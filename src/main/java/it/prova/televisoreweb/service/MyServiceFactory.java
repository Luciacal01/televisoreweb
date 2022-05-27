package it.prova.televisoreweb.service;

import it.prova.televisoreweb.dao.MyDaoFactory;
import it.prova.televisoreweb.service.televisore.TelevisoreService;
import it.prova.televisoreweb.service.televisore.televisoreServiceImpl;

public class MyServiceFactory {
	private static TelevisoreService TELEVISORE_SERVICE_INSTANCE;
	
	private static TelevisoreService getTelevisoreServiceInstance() {
		if(TELEVISORE_SERVICE_INSTANCE==null)
			TELEVISORE_SERVICE_INSTANCE= new televisoreServiceImpl();
		
		TELEVISORE_SERVICE_INSTANCE.setTelevisoreDAO(MyDaoFactory.getTelevisoreDAOInstance());
		
		return TELEVISORE_SERVICE_INSTANCE;
	}
}
