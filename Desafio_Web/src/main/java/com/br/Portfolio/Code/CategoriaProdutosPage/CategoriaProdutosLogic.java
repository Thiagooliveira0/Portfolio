package com.br.Portfolio.Code.CategoriaProdutosPage;

import com.br.Portfolio.Code.Chrome.ChromeLogic;
import com.br.Portfolio.Code.Utils.Utils;

public class CategoriaProdutosLogic extends CategoriaProdutosPageMap {

	public static String nameProdCard;
	public static String valueProdCard;

	public void seleciono_Primeiro_Produto_da_Lista() throws Exception {
		String step = "Seleciono primeiro produto da lista";
		CategoriaProductPage(ChromeLogic.navegador);
		nameProdCard = txtFirstProdName.getText();
		valueProdCard = txtFirstProdValue.getText();

		Utils.tirarPrint(step);
		lstfirstProduct.click();
	}

	public void valido_Produtos_Exibidos_Contem_Texto_da_Busca(String prod) throws Exception {
		String step = "valido produtos condizentes com a busca";

		CategoriaProductPage(ChromeLogic.navegador);
		validarProdutosListados(prod);
		Utils.tirarPrint(step);
	}

}