package model.Dao;

import db.DB;
import model.Dao.impl.SellerDaoJDBC;

public class DaoFactory {

	public static SellerDao creatSellerDao() {
		return new SellerDaoJDBC(DB.getConnection());
	}
	
	
}
