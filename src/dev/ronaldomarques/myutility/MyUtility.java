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
package dev.ronaldomarques.myutility;


/**
 * @author         Ronaldo Marques;
 * @since          20190501;
 * @last_change    20210325;
 * @version        0.4.0;
 * @category       LibClass: class which implements several resources, such as constants, properties, methods, data
 *                 structure to be used as a library in others projects;
 * @language       JAVA-11;
 * @dev_environmet Microsoft-Windows-10, REDHAT-OPEN-JDK-11.0.9, Eclipse-IDE-Enterprise-Java-Developers-v2020-03;
 * @analysis       ...
 */
public abstract class MyUtility {
	
	/* TODO: self-presentation. */
	public static final String projectName() {
		
		/* FURTHER: Get the value in myutility.properties. */
		return "MY JAVA UTILITY PACK";
		
	}
	
	
	
	public static final String libraryName() {
		
		/* FURTHER: Get the value in myutility.properties. */
		return "MyUtility";
		
	}
	
	
	
	public static final String version() {
		
		/* FURTHER: Get the value in myutility.properties. */
		return "0.4.0-beta+202103250350";
		
	}
	
	
	
	public static final void selfPresentation() {
		
		System.out.printf("\n");
		System.out.printf("Project name: %s\n", projectName());
		System.out.printf("Library name: %s\n", libraryName());
		System.out.printf("Version: %s\n", version());
		System.out.printf("\n");
		
	}
	
}
