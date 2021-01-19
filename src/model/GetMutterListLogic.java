package model;

import java.util.List;

import dao.MutterDAO;

/*
 *つぶやきの取得に関する処理をおこなうモデル/DAO利用
 */

public class GetMutterListLogic {
	public List<Mutter> execute(){
		MutterDAO dao = new MutterDAO();
		List<Mutter> mutterList = dao.findAll();
		return mutterList;
	}

}
