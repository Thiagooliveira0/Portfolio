package com.br.Portfolio.Code.Chrome;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.br.Portfolio.Code.Utils.PDFCreator;
import com.br.Portfolio.Code.Utils.Utils;
import com.lowagie.text.DocumentException;
import io.cucumber.java.*;
import io.cucumber.java.en.Given;

public class ChromeLogic {

	public final static String basePage = "http://advantageonlineshopping.com/#/";
	public static WebDriver navegador;

	@Before
	public static void init(Scenario scenario) throws DocumentException, IOException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/driver/chromedriver.exe");
		navegador = new ChromeDriver();
		Utils.lerArquivoXlsx(scenario);
		PDFCreator.GeradorPDF(scenario);
		
	}	

	@Given("navego ate a pagina da advantage online shopping")
	public void navegarAtePagina() throws Exception {		
		
		String step = "Navego ate a pagina da Web";
		navegador.navigate().to(ChromeLogic.basePage);
		Thread.sleep(500);
		Utils.tirarPrint(step);
	}

	@After
	public void fecharNavegador(Scenario scenario) {

		PDFCreator.closeDocument(scenario);
		navegador.close();
	}
}