package model;

import java.io.Serializable;

public class Mutter implements Serializable{

	private String userName; //ユーザー名
 	private String text; //つぶやきの内容

	public Mutter(String userName, String text) {
		this.userName = userName;
		this.text = text;
	}

	public String getUserName() {
		return userName;
	}

	public String getText() {
		return text;
	}

}

