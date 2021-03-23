/**
 * DIREITOS, LICENSA E ISENÇÃO DE RESPONSABILIDADE:
 * Este arquivo é parte integrante, indivisível, inseparável de um projeto particular, o qual tem seu uso e fruto
 * expressamente exclusivo à seu autor, Ronaldo Marques (ronaldomarques@email.com / http://ronaldomarques.dev);
 * É vetado qualquer utilização, venda, aluguél, distribuição, em partes ou integral deste projeto;
 * Este projeto tem finalidade exclusiva de demonstração de conhecimento e habilidades no desenvolvimento de software
 * para apresentação no processo de recrutamento da empresa Dryve.com.br;
 * Sendo assim, o autor deste projeto não reconhece nem assume qualquer responsabilidade pela utilização do mesmo,
 * tão pouco por qualquer possível reflexos ou consequência de tal utilização.
 * ---
 * RIGHTS, LICENSE AND DISCLAIMER:
 * This file is an integral, indivisible, inseparable part of a particular project, which has its use expressly
 * exclusive to its author, Ronaldo Marques (ronaldomarques@email.com / http://ronaldomarques.dev);
 * Any use, sale, rental, distribution, in parts or integral of this project is prohibited;
 * This project has the sole purpose of demonstrating knowledge and skills in software development
 * for presentation in the recruitment process of Dryve.com.br;
 * Therefore, the author of this project does not recognize or assume any responsibility for the use of it,
 * neither for any possible reflexes or consequence of such use.
 */
package dev.ronaldomarques.myutility.tester;


import dev.ronaldomarques.myutility.screenprinter.MyUtility;



/**
 * @author         Ronaldo Marques.
 * @since          20190501.
 * @version        20210322.
 * @category       TesterClass: class used to perform implementation tests.
 * @analysis       ...
 * @language       JAVA-11.
 * @dev_environmet Microsoft-Windows-10, REDHAT-OPEN-JDK-11.0.9, Eclipse-IDE-Enterprise-Java-Developers-v2020-03.
 */
public class Tester {
	
	public static void main(String[] args) {
		
		MyUtility.printc("mensagem", "44", "31");
		
		// parei = executar no console n�o est� surgindo efeito de cores. :-(
		
		/* MyScreen ms = new MyScreen();
		 * 
		 * int tmpIndex;
		 * MyMenu tmpMenu;
		 * 
		 * ms.cCS();
		 * System.out.println("--- --- --- begin test --- --- ---");
		 * 
		 * tmpIndex = ms.menusCreateOne();
		 * tmpIndex = ms.menusCreateOne("teste on ind 1");
		 * tmpIndex = ms.menusCreateOne();
		 * 
		 * tmpMenu = ms.menusGetObject(0);
		 * tmpMenu.addIten(0 + "_um item");
		 * tmpMenu.addIten(0 + "_outro item");
		 * tmpMenu.addIten(0 + "_mais um item");
		 * tmpMenu.draw();
		 * ms.menusPutObject(0, tmpMenu);
		 * 
		 * tmpMenu = ms.menusGetObject(1);
		 * tmpMenu.addIten(1 + "_um item");
		 * tmpMenu.addIten(1 + "_outro item");
		 * tmpMenu.addIten(1 + "_mais um item");
		 * tmpMenu.draw();
		 * ms.menusPutObject(1, tmpMenu);
		 * 
		 * tmpMenu = ms.menusGetObject(2);
		 * tmpMenu.addIten("_um item_" + 2);
		 * tmpMenu.addIten("_outro item_" + 2);
		 * tmpMenu.addIten("_mais um item_" + 2);
		 * tmpMenu.draw();
		 * ms.menusPutObject(2, tmpMenu);
		 * 
		 * ms.menusList();
		 * ms.menusRetitleIn(tmpIndex, "Ronaldinho");
		 * ms.menusList();
		 * ms.menusRemoveOne(1);
		 * ms.menusList();
		 * 
		 * System.out.print("To TXT...");
		 * MySystem.ExceptObj myE = new ExceptObj();
		 * MySystem.sleep(5000L, (short)2, '(', myE);
		 * 
		 * try {
		 * System.out.println(ms.menusSaveToTXT());
		 * // c�digo que inclui comandos/invoca��es de m�todos
		 * // que podem gerar uma situa��o de exce��o.
		 * } catch (IOException IOexc) {
		 * // bloco de tratamento associado � condi��o de
		 * // exce��o XException ou a qualquer uma de suas
		 * // subclasses, identificada aqui pelo objeto
		 * // com refer�ncia ex
		 * } finally {
		 * // bloco de c�digo que sempre ser� executado ap�s
		 * // o bloco try, independentemente de sua conclus�o
		 * // ter ocorrido normalmente ou ter sido interrompida
		 * }
		 * 
		 * System.out.println("--- --- --- end test --- --- ---"); */
	}
	
}
