package br.com.datemanipulator.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import br.com.clientresthttpjson.ClientRestHttpJSONImpl;

public class ClientRestHttpJSONTest {
	
	@Test
	public void httpGETJSONTeste() {
		
		ClientRestHttpJSONImpl clientHttp = new ClientRestHttpJSONImpl("http://pudim.com.br/", false, "", "", true);
		
		String retorno = clientHttp.httpGET("");
		String retornoEsperado = "<html><html xmlns=\"http://www.w3.org/1999/xhtml\"><head>    <title>Pudim</title>    <link rel=\"stylesheet\" href=\"estilo.css\"></head><body><div>    <div class=\"container\">        <div class=\"image\">            <img src=\"pudim.jpg\" alt=\"\">        </div>        <div class=\"email\">            <a href=\"mailto:pudim@pudim.com.br\">pudim@pudim.com.br</a>        </div>    </div></div><script>    (function(i,s,o,g,r,a,m){i['GoogleAnalyticsObject']=r;i[r]=i[r]||function(){                (i[r].q=i[r].q||[]).push(arguments)},i[r].l=1*new Date();a=s.createElement(o),            m=s.getElementsByTagName(o)[0];a.async=1;a.src=g;m.parentNode.insertBefore(a,m)    })(window,document,'script','//www.google-analytics.com/analytics.js','ga');    ga('create', 'UA-28861757-1', 'auto');    ga('send', 'pageview');</script></body></html>";

		assertEquals(retorno, retornoEsperado);
	
	}

	@Test
	public void httpPOSTJSONTeste() {
		
		ClientRestHttpJSONImpl clientHttp = new ClientRestHttpJSONImpl("http://localhost:8080/integration/", true, "Authorization", "eyJhbGciOiJIUzUxMiJ9.eyJpc3MiOiJpbGluayIsImlhdCI6MTUzOTAyOTQ0OCwiZXhwIjoxNTM5MDMzMDQ4fQ.yJrOmglubb7gsj0dlrOyaieR64RLsnHA64e3-x6HWghSTCleihzL3ZMe2Mp9qHgmoql-DZEMy0RAedfgqgl1Kg", true);
		
		String retorno = clientHttp.httpPOST("/single-sms", "{\r\n" + 
				"	\"to\" : 34991957511,\r\n" + 
				"	\"message\": \"Teste\"}");
		
		System.out.println(retorno);
		
		
	}
	
}
