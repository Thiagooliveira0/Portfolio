package com.br.Portfolio.Code.Utils;

import java.io.FileOutputStream;
import java.io.IOException;
import com.lowagie.text.Document;
import com.lowagie.text.DocumentException;
import com.lowagie.text.Image;
import com.lowagie.text.Paragraph;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;

import io.cucumber.java.Scenario;

public class PDFCreator {

	static Document document;
	private final static String projectName = "Advantage Shopping";

	public static void GeradorPDF(Scenario scenario) throws DocumentException, IOException {
		document = new Document();
		PdfWriter.getInstance(document,
				new FileOutputStream(System.getProperty("user.dir") + "/evidences/" + scenario.getName() + ".pdf"));
		document.open();
	}

	public static void createHeader(Scenario scenario) {		
		document.newPage();
		

		PdfPTable headerTable = new PdfPTable(2);

		headerTable.addCell("Project ");
		headerTable.addCell(projectName);

		headerTable.addCell("Test performed ");
		headerTable.addCell(scenario.getName());
		
		headerTable.addCell("Test Result");
		headerTable.addCell(scenario.getStatus().toString());

		document.add(headerTable);

	}

	public static void AdicionaImagemaoPDF(String imagePath, String step) throws DocumentException, IOException {

		Image imagem = Image.getInstance(System.getProperty("user.dir") + "/prints/" + imagePath);
		imagem.scaleToFit(500, 600);

		document.newPage();
		document.add(imagem);
		document.add(new Paragraph(step));

	}

	public static void closeDocument(Scenario scenario) {
		createHeader(scenario);
		document.close();
	}
}
