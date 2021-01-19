package model;

import dao.MutterDAO;

/*
 * つぶやき投稿に関する処理をおこなうモデル/DAO利用
 */

public class PostMutterLogic {

	public void execute(Mutter mutter) {
		MutterDAO dao = new MutterDAO();
		dao.create(mutter);
	}

}