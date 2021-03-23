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


import dev.ronaldomarques.myutility.screenprinter.SP;



/**
 * @author         Ronaldo Marques.
 * @since          20190501.
 * @version        20210323.
 * @category       TesterClass: class used to perform implementation tests.
 * @analysis       ...
 * @language       JAVA-11.
 * @dev_environmet Microsoft-Windows-10, REDHAT-OPEN-JDK-11.0.9, Eclipse-IDE-Enterprise-Java-Developers-v2020-03.
 */
public class Tester {
	
	public static void main(String[] args) {
		
		
		SP.dpln("teste itdp 1");
		
		SP.dpOff();
		
		SP.dpln("teste itdp 2");
		
		SP.dpOn();
		
		SP.dpln("teste itdp 3");
		
		SP.dpOff();
		
		SP.dpln("teste itdp 4");
		
		SP.dpOn();
		
		SP.dpln("teste itdp 5");
		
	}
	
}
