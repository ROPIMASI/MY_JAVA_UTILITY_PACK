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
package dev.ronaldomarques.myutility.screenprinter;


/**
 * @author         Ronaldo Marques.
 * @since          20190501.
 * @version        20210323.
 * @category       LibClass: class which implements several resources, such as constants, properties, methods, data
 *                 structure to be used as a library in others projects.
 * @analysis       ...
 * @language       JAVA-11.
 * @dev_environmet Microsoft-Windows-10, REDHAT-OPEN-JDK-11.0.9, Eclipse-IDE-Enterprise-Java-Developers-v2020-03.
 */
public class SP {
	
	/* If True Debug Print ( i t d p ) */
	private static boolean itdp = true;
	
	static {
		SP.itdp = true;
	}
	
	
	
	public SP() {
		
		super();
		SP.itdp = true;
		
	}
	
	
	
	/* FURTHER: Constructor com parâmetro que diz qual será o caminho do arquivo/property com o valor true/false para
	 * o método .itdp(); */
	public SP(String propertiesFilePath) {
		
		super();
		
		/* FURTHER: constructor com 1 arg, path para o arquivo .properties da aplicação-usuária desta LIB.
		 * Este path deve ser os pacotes ou pastas ???
		 * tem com esta lib pegar a root da aplicação ??? pasta ou pacote root, para então acessar o arquivo
		 * .properties com o argumento passado e lê-lo
		 * filePropertiesPath example: br.com.zup.itianalyser.meta-inf ???
		 * MY_UTILITY_PACK/src/dev/ronaldomarques/myutility/META-INF/myutility.properties ? */
		// SP.itdp = true; // ler do .properties: myutility.screen-printer.itdp
		
	}
	
	
	
	/* TEMPORARILY: Constructor com parâmetro que diz true/false para o método .itdp(); Enquanto outra forma não for
	 * desenvolvida como no constructor acima, com 1 argumento. */
	public SP(boolean itdp) {
		
		super();
		// SP.itdp = itdp;
		
	}
	
	
	
	public static void dpOn() {
		
		SP.itdp = true;
		
	}
	
	
	
	public static void dpOff() {
		
		SP.itdp = false;
		
	}
	
	
	
	/* Print on console whether the static variable itdp in this class is true. */
	public static void dp(String str) {
		
		if (SP.itdp) System.out.printf("[DEBUG => %s]", str);
		
	}
	
	
	
	/* PrintLN on console whether the static variable itdp in this class is true. */
	public static void dpln(String str) {
		
		if (SP.itdp) System.out.printf("[DEBUG => %s]\n", str);
		
	}
	
}
