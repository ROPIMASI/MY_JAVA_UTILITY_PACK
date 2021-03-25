/**
 * DIREITOS, LICENSA E ISENÇÃO DE RESPONSABILIDADE:
 * Este arquivo é parte integrante, indivisível, inseparável de um projeto particular, o qual tem seu uso e fruto
 * expressamente exclusivo à seu autor, Ronaldo Marques (ronaldomarques@email.com / http://ronaldomarques.dev);
 * É vetado qualquer utilização, venda, aluguél, distribuição, em partes ou integral deste projeto;
 * Este projeto tem finalidade exclusiva de demonstração de conhecimento e habilidades no desenvolvimento de software;
 * Sendo assim, o autor deste projeto não reconhece nem assume qualquer responsabilidade pela utilização do mesmo,
 * tão pouco por qualquer possível reflexos ou consequência de tal utilização.
 * ---
 * RIGHTS, LICENSE AND DISCLAIMER:
 * This file is an integral, indivisible, inseparable part of a particular project, which has its use expressly
 * exclusive to its author, Ronaldo Marques (ronaldomarques@email.com / http://ronaldomarques.dev);
 * Any use, sale, rental, distribution, in parts or integral of this project is prohibited;
 * This project has the sole purpose of demonstrating knowledge and skills in software development;
 * Therefore, the author of this project does not recognize or assume any responsibility for the use of it,
 * neither for any possible reflexes or consequence of such use.
 */
package dev.ronaldomarques.tester;


import dev.ronaldomarques.myutility.MyUtility;
import dev.ronaldomarques.myutility.debugger.DP;



/**
 * @author         Ronaldo Marques;
 * @since          20190501;
 * @last_change    20210325;
 * @version        0.4.0;
 * @category       TesterClass: class used to perform implementation tests;
 * @language       JAVA-11;
 * @dev_environmet Microsoft-Windows-10, REDHAT-OPEN-JDK-11.0.9, Eclipse-IDE-Enterprise-Java-Developers-v2020-03;
 * @analysis       ...
 */
public class Tester {
	
	public static void main(String[] args) {
		
		DP.pdln("teste itpd 1");
		
		DP.pdOff();
		
		DP.pdln("teste itpd 2");
		
		DP.pdOn();
		
		DP.pdln("teste itpd 3");
		
		DP.pdOff();
		
		DP.pdln("teste itpd 4");
		
		DP.pdOn();
		
		DP.pdln("teste itpd 5");
		
		MyUtility.selfPresentation();
		
	}
	
}
