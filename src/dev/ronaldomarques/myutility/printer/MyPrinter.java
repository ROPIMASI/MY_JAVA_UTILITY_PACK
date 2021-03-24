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
package dev.ronaldomarques.myutility.printer;


/**
 * @author         Ronaldo Marques;
 * @since          20190501;
 * @last_change    20210324;
 * @version        0.4.0;
 * @category       LibClass: class which implements several resources, such as constants, properties, methods, data
 *                 structure to be used as a library in others projects;
 * @language       JAVA-11;
 * @dev_environmet Microsoft-Windows-10, REDHAT-OPEN-JDK-11.0.9, Eclipse-IDE-Enterprise-Java-Developers-v2020-03;
 * @analysis       ...
 */
public class MyPrinter {
	
	public static final void print(String s) {
		
		System.out.print(s);
		
	}
	
	
	
	public static final void println(String s) {
		
		System.out.println(s);
		
	}
	
	
	
	public static final void printXY(String msg, short x, short y) {
		
		positionLC(y, x);
		System.out.printf("%s", msg);
		
	}
	
	
	
	public static final void printlnXY(String msg, short x, short y) {
		
		positionLC(y, x);
		System.out.printf("%s\n", msg);
		
	}
	
	
	
	public static final void printC(String msg, String... argsList) {
		
		String cmd = "";
		
		for (String arg : argsList) { cmd = cmd + arg + ";"; }
		
		cmd = cmd.substring(0, cmd.length() - 1);
		cmd = cmd + "m";
		System.out.printf("%s%s%s", "\033[" + cmd, msg, "\033[0m");
		
	}
	
	
	
	public static final void printlnC(String msg, String... argsList) {
		
		String cmd = "";
		
		for (String arg : argsList) { cmd = cmd + arg + ";"; }
		
		cmd = cmd.substring(0, cmd.length() - 1);
		cmd = cmd + "m";
		System.out.printf("%s%s%s\n", "\033[" + cmd, msg, "\033[0m");
		
	}
	
	
	
	public static final void printXYC(String msg, short x, short y, String... argsList) {
		
		String cmd = "";
		
		for (String arg : argsList) { cmd = cmd + arg + ";"; }
		
		cmd = cmd.substring(0, cmd.length() - 1);
		cmd = cmd + "m";
		positionLC(y, x);
		System.out.printf("%s%s%s", "\033[" + cmd, msg, "\033[0m");
		
	}
	
	
	
	public static final void printlnXYC(String msg, short x, short y, String... argsList) {
		
		String cmd = "";
		
		for (String arg : argsList) { cmd = cmd + arg + ";"; }
		
		cmd = cmd.substring(0, cmd.length() - 1);
		cmd = cmd + "m";
		positionLC(y, x);
		System.out.printf("%s%s%s", "\033[" + cmd, msg, "\033[0m");
		
	}
	
	
	
	public static void positionLC(int lin, int col) {
		
		System.out.printf("\033[%d;%dH", lin, col);
		
	}
	
	
	
	public static void clearConsole() {
		
		System.out.printf("\033[2J");
		
	}
	
}
