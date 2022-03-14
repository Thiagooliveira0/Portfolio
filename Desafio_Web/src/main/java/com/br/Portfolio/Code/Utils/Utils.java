package com.br.Portfolio.Code.Utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.jupiter.api.TestInfo;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import com.br.Portfolio.Code.Chrome.ChromeLogic;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;

public class Utils {

	public static String userName;
	public static String password;
	public static TestInfo testInformation;

	public static void takeScreenShot(String nomeArquivo) throws Exception {

		TakesScreenshot scrShot = ((TakesScreenshot) ChromeLogic.navegador);
		File srcFile = scrShot.getScreenshotAs(OutputType.FILE);
		String imageFileDir = System.getProperty("user.dir") + "/prints/";
		FileUtils.copyFile(srcFile, new File(imageFileDir, nomeArquivo));

	}

	@AfterStep
	public void aguardarCarregamento() throws InterruptedException {
		Thread.sleep(5000);
	}

	public static void tirarPrint(String step) throws Exception {

		Date dataAtual = new Date();
		DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy-HH-mm-ss");
		String dataFormatada = dateFormat.format(dataAtual);
		String screamshootname = dataFormatada + ".png";
		Utils.takeScreenShot(screamshootname);

		PDFCreator.AdicionaImagemaoPDF(screamshootname, step);

	}

	public static void scrollToElement(WebElement element) {

		Actions actions = new Actions(ChromeLogic.navegador);
		actions.moveToElement(element);
		actions.perform();

	}

	@SuppressWarnings("resource")
	public static void lerArquivoXlsx(Scenario scenario) throws IOException {

		String fileName = System.getProperty("user.dir") + "/data/dados.xlsx";
		FileInputStream file = new FileInputStream(new File(fileName));

		XSSFWorkbook workbook = new XSSFWorkbook(file);

		XSSFSheet sheet = workbook.getSheetAt(0); // Interajo com a primeira tabela do arquivo

		Iterator<Row> rowIterator = sheet.iterator();

		while (rowIterator.hasNext()) { // Loop para interagir com as linhas da Tabela

			Row row = rowIterator.next(); // seto a Linha para interagir

			Iterator<Cell> cellIterator = row.cellIterator();
			Cell cell = cellIterator.next(); // interajo com a primeira celula da linha

			if (cell.getStringCellValue().equalsIgnoreCase(scenario.getName())) {

				userName = cellIterator.next().getStringCellValue();
				password = cellIterator.next().getStringCellValue();

			}
		}

		file.close();
	}

}