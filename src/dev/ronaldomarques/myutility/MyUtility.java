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
	
	
	
	public static final String projectCategory() {
		
		/* FURTHER: Get the value in myutility.properties. */
		return "Class library development";
		
	}
	
	
	
	public static final String productName() {
		
		/* FURTHER: Get the value in myutility.properties. */
		return "MyUtility";
		
	}
	
	
	
	public static final String productVersion() {
		
		/* FURTHER: Get the value in myutility.properties. */
		return "0.5.0-dev+202104080257";
		
	}
	
	
	
	public static final String productDescription() {
		
		/* FURTHER: Get the value in myutility.properties. */
		return "My personal Java library of small tools for general purpose. Which main objective is demonstration of software development skills.";
		
	}
	
	
	
	public static final String authors() {
		
		/* FURTHER: Get the value in myutility.properties. */
		return "Ronaldo Marques";
		
	}
	
	
	
	public static final String contributors() {
		
		/* FURTHER: Get the value in myutility.properties. */
		return "";
		
	}
	
	
	
	public static final String evolvedTechnologies() {
		
		/* FURTHER: Get the value in myutility.properties. */
		return "\n"
				+ " - JAVA-11,\n"
				+ " - REDHAT-OPEN-JDK-11.0.9,\n"
				+ " - REDHAT-OPEN-JRE-11.0.9,\n"
				+ " - Eclipse-IDE-Enterprise-Java-Developers-v2020-03,\n"
				+ " - Eclipse-IDE-Spring-Tool-Suite-4-v4.10.0.R,\n"
				+ " - Microsoft-Windows-10.";
		
	}
	
	
	
	public static final void selfPresentation() {
		
		System.out.printf("\n");
		System.out.printf("Project name: %s ;\n", projectName());
		System.out.printf("Project category: %s ;\n", projectCategory());
		System.out.printf("Product name: %s ;\n", productName());
		System.out.printf("Product version: %s ;\n", productVersion());
		System.out.printf("Product description: %s \n", productDescription());
		System.out.printf("Authors: %s .\n", productDescription());
		System.out.printf("Contributors: %s .\n", productDescription());
		System.out.printf("Evolved technologies: %s \n", evolvedTechnologies());
		System.out.printf("\n");
		
	}
	
}
