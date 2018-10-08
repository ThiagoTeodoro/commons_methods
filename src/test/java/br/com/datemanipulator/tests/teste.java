package br.com.datemanipulator.tests;

import br.com.clientresthttpjson.ClientRestHttpJSONImpl;

public abstract class teste {

	public static void main(String[] args) {
		ClientRestHttpJSONImpl clientHttp = new ClientRestHttpJSONImpl("http://www.google.com.br", false, "", "", true);
		System.out.println(clientHttp.httpGET(""));
	}

}
