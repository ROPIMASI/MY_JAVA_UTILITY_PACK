/*** ***************************************************************************
 * CONTENT: MYUTILITYS PROJECT (ITJDP-MU-b0.3)
 * THEME: LIBRARY OF JAVA UTILITYS.
 * AUTHOR: RONALDO PI MA SI.
 * DATE: 2019-JUL-SEP.
 * LANGUAGE: JAVA 8.
 * PLATAFORM: Microsoft Windows7, JDK 8.0.212, Eclipse IDE for Enterprise Java_
 * 		_Developers, version 2019-03.
 *
 * NOTA IMPORTANTE / ISEN��O DE RESPONSABILIDADE:
 * Este � um projeto pessoal, particular, de uso e fruto �nico e exclusivamente
 * de seu autor. Trata-se de um projeto em faze de desenvovimento e experimenta-
 * -��es. O qual n�o tem nenhuma responsabilidade pelas informa��es nele conti-
 * -das, t�o pouco sobre seus resultados e efeitos ao ser utilizado. 
 * 
 * IMPORTANT NOTE / DISCLAIMER:
 * This is a personal project, private, for use and fruit solely and exclusively
 * by its author. It is a project in development and experimentation. Which has
 * no responsibility for the information contained therein, nor for its results
 * and effects when used.
*************************************************************************** ***/



// Project's package
package myutility;



//Java's imports
import java.util.Scanner;






public class MyUtility {
	public static Scanner tmpScan = new Scanner(System.in);

	public static final String name() {
		return "MyUtility";
	}

	public static final String version() {
		return "v 0.4.beta";
	}

	
	// --- --- ---
	
	public static final void print(String s) {
		System.out.print(s);
	}
	
	public static final void println(String s) {
		System.out.println(s);
	}

	// --- --- ---	
	
	public static final void printxy(String msg, short x, short y) {
		positionLC(y,x);
		System.out.printf("%s", msg);
	}
	
	public static final void printlnxy(String msg, short x, short y) {
		positionLC(y,x);
		System.out.printf("%s\n", msg);
	}
	
	// --- --- ---
	
	public static final void printc(String msg, String... argsList) {
		String cmd = "";

		for (String arg : argsList) {
			cmd = cmd + arg + ";";
		}

		cmd = cmd.substring(0, cmd.length() - 1);
		cmd = cmd + "m";
		System.out.printf("%s%s%s", "\033[" + cmd, msg, "\033[0m");
	}

	public static final void printlnc(String msg, String... argsList) {
		String cmd = "";

		for (String arg : argsList) {
			cmd = cmd + arg + ";";
		}

		cmd = cmd.substring(0, cmd.length() - 1);
		cmd = cmd + "m";
		System.out.printf("%s%s%s\n", "\033[" + cmd, msg, "\033[0m");
	}	

	// --- --- ---
	
	public static final void printxyc(String msg, short x, short y, String... argsList) {
		String cmd = "";

		for (String arg : argsList) {
			cmd = cmd + arg + ";";
		}

		cmd = cmd.substring(0, cmd.length() - 1);
		cmd = cmd + "m";
		positionLC(y,x);
		System.out.printf("%s%s%s", "\033[" + cmd, msg, "\033[0m");
	}

	public static final void printlnxyc(String msg, short x, short y, String... argsList) {
		String cmd = "";

		for (String arg : argsList) {
			cmd = cmd + arg + ";";
		}

		cmd = cmd.substring(0, cmd.length() - 1);
		cmd = cmd + "m";
		positionLC(y,x);
		System.out.printf("%s%s%s", "\033[" + cmd, msg, "\033[0m");
	}
	
	// --- --- ---
	
	public static void positionLC(int lin, int col) {
		System.out.printf("\033[%d;%dH", lin, col);
	}

	public static void conClear() {
		System.out.printf("\033[2J");
	}
	
	// --- --- ---

	@SuppressWarnings("finally")
	public static int intScanInput() {
		/***
		 * DOCSTRING
		 * 
		 ***/
		/*
		 * Princcipais tipos de 'Exceptions' para esta fun��o: - ArithmeticException It
		 * is thrown when an exceptional condition has occurred in an arithmetic
		 * operation. - ArrayIndexOutOfBoundsException It is thrown to indicate that an
		 * array has been accessed with an illegal index. The index is either negative
		 * or greater than or equal to the size of the array. - ClassNotFoundException
		 * This Exception is raised when we try to access a class whose definition is
		 * not found - FileNotFoundException This Exception is raised when a file is not
		 * accessible or does not open. - IOException It is thrown when an input-output
		 * operation failed or interrupted - InterruptedException It is thrown when a
		 * thread is waiting , sleeping , or doing some processing , and it is
		 * interrupted. - NoSuchFieldException It is thrown when a class does not
		 * contain the field (or variable) specified - NoSuchMethodException It is
		 * thrown when accessing a method which is not found. - NullPointerException
		 * This exception is raised when referring to the members of a null object. Null
		 * represents nothing - NumberFormatException This exception is raised when a
		 * method could not convert a string into a numeric format. - RuntimeException
		 * This represents any exception which occurs during runtime. -
		 * StringIndexOutOfBoundsException It is thrown by String class methods to
		 * indicate that an index is either negative than the size of the string
		 */
		int anInt = 0;
		String tmpStr = "";

		try {
			tmpStr = tmpScan.nextLine();
			anInt = Integer.parseInt(tmpStr);

		} catch (NumberFormatException e) {
			System.out.println("Erro: convers�o 'String' para 'int' falhou.");
			System.out.println("\tEsta entrada de dado '" + tmpStr + "' deve ser valor num�rico inteiro entre '"
					+ Integer.MIN_VALUE + "' e '" + Integer.MAX_VALUE + "'.");
			System.out.println(
					"\tEntrada de caracteres alfanum�ricos ou caract�res especiais, tais como ' ', '/', '=', '[', '@', etc. s�o vetadas, exceto '-' e '+' cujos s�o permitidos.\n");
			System.out.println("Detalhes:");
			System.out.print("\tStack Trace: ");
			// System.out.print("\t");
			e.printStackTrace();
			System.out.println("\tClass: " + e.getClass().getName() + ".");
			System.out.println();
			anInt = -1; // solu��o paleativa para sinalizar erro no return.

		} catch (Exception e) {
			System.out.println("Erro: convers�o 'String' para 'int' falhou.");
			System.out.println(
					"\tErro INESPERADO com a entrada de dado '" + tmpStr + "'. Contate desenvolvedor da aplica��o.");
			System.out.println("Detalhes:");
			System.out.println("\tStack Trace: ");
			System.out.print("\t");
			e.printStackTrace();
			System.out.println("\tClass: " + e.getClass().getName() + ".");
			System.out.println();
			anInt = -2; // solu��o paleativa para sinalizar erro no return.

		} finally {
			return anInt;
		}
	}

	@SuppressWarnings("finally")
	public static int intScanInput(boolean readLine) {
		/***
		 * DOCSTRING
		 * 
		 ***/
		/*
		 * Princcipais tipos de 'Exceptions' para esta fun��o: - ArithmeticException It
		 * is thrown when an exceptional condition has occurred in an arithmetic
		 * operation. - ArrayIndexOutOfBoundsException It is thrown to indicate that an
		 * array has been accessed with an illegal index. The index is either negative
		 * or greater than or equal to the size of the array. - ClassNotFoundException
		 * This Exception is raised when we try to access a class whose definition is
		 * not found - FileNotFoundException This Exception is raised when a file is not
		 * accessible or does not open. - IOException It is thrown when an input-output
		 * operation failed or interrupted - InterruptedException It is thrown when a
		 * thread is waiting , sleeping , or doing some processing , and it is
		 * interrupted. - NoSuchFieldException It is thrown when a class does not
		 * contain the field (or variable) specified - NoSuchMethodException It is
		 * thrown when accessing a method which is not found. - NullPointerException
		 * This exception is raised when referring to the members of a null object. Null
		 * represents nothing - NumberFormatException This exception is raised when a
		 * method could not convert a string into a numeric format. - RuntimeException
		 * This represents any exception which occurs during runtime. -
		 * StringIndexOutOfBoundsException It is thrown by String class methods to
		 * indicate that an index is either negative than the size of the string
		 */
		int anInt = 0;
		String tmpStr = "";

		try {

			if (readLine)
				tmpStr = tmpScan.nextLine();
			else
				tmpStr = tmpScan.next();

			anInt = Integer.parseInt(tmpStr);

		} catch (NumberFormatException e) {
			System.out.println("Erro: convers�o 'String' para 'int' falhou.\n");
			System.out.println("'" + tmpScan + "' precisa ser valor num�rico entre '" + Integer.MIN_VALUE + "' e '"
					+ Integer.MAX_VALUE + "'");
			System.out.println("Entrada de caracteres alfanum�ricos ou caract�res especiais, tais como"
					+ "' ', '/', '=', '[', '@', etc. s�o vetadas, exceto '-'  '+' cujos s�o permitidos.\n");
			System.out.println("Detalhes:");
			System.out.print("Stack Trace:");
			e.printStackTrace();
			System.out.println("Class: " + e.getClass().getName() + ".");

			System.out.println("\n\n sem RETURN\n");
		} catch (Exception e) {
			System.out.println("outra exception inesperada , sem RETURN");

		} finally {
			System.out.println("OK, finallly COM RETURN");
			return anInt;
		}
	}

	@SuppressWarnings("finally")
	public static String strScanInput() {
		/***
		 * DOCSTRING
		 * 
		 ***/
		/*
		 * Princcipais tipos de 'Exceptions' para esta fun��o: - ArithmeticException It
		 * is thrown when an exceptional condition has occurred in an arithmetic
		 * operation. - ArrayIndexOutOfBoundsException It is thrown to indicate that an
		 * array has been accessed with an illegal index. The index is either negative
		 * or greater than or equal to the size of the array. - ClassNotFoundException
		 * This Exception is raised when we try to access a class whose definition is
		 * not found - FileNotFoundException This Exception is raised when a file is not
		 * accessible or does not open. - IOException It is thrown when an input-output
		 * operation failed or interrupted - InterruptedException It is thrown when a
		 * thread is waiting , sleeping , or doing some processing , and it is
		 * interrupted. - NoSuchFieldException It is thrown when a class does not
		 * contain the field (or variable) specified - NoSuchMethodException It is
		 * thrown when accessing a method which is not found. - NullPointerException
		 * This exception is raised when referring to the members of a null object. Null
		 * represents nothing - NumberFormatException This exception is raised when a
		 * method could not convert a string into a numeric format. - RuntimeException
		 * This represents any exception which occurs during runtime. -
		 * StringIndexOutOfBoundsException It is thrown by String class methods to
		 * indicate that an index is either negative than the size of the string
		 */
		String tmpStr = "";

		try {
			tmpStr = tmpScan.nextLine();

		} catch (NumberFormatException e) {
			System.out.println("Erro: convers�o 'String' para 'int' falhou.\n");
			System.out.println("'" + tmpScan + "' precisa ser valor num�rico entre '" + Integer.MIN_VALUE + "' e '"
					+ Integer.MAX_VALUE + "'");
			System.out.println("Entrada de caracteres alfanum�ricos ou caract�res especiais, tais como"
					+ "' ', '/', '=', '[', '@', etc. s�o vetadas, exceto '-'  '+' cujos s�o permitidos.\n");
			System.out.println("Detalhes:");
			System.out.print("Stack Trace:");
			e.printStackTrace();
			System.out.println("Class: " + e.getClass().getName() + ".");

			System.out.println("\n\n sem RETURN\n");
		} catch (Exception e) {
			System.out.println("outra exception inesperada , sem RETURN");

		} finally {
			System.out.println("OK, finallly COM RETURN");
			return tmpStr;
		}
	}

	@SuppressWarnings("finally")
	public static String strScanInput(boolean readLine) {
		/***
		 * DOCSTRING
		 * 
		 ***/
		/*
		 * Princcipais tipos de 'Exceptions' para esta fun��o: - ArithmeticException It
		 * is thrown when an exceptional condition has occurred in an arithmetic
		 * operation. - ArrayIndexOutOfBoundsException It is thrown to indicate that an
		 * array has been accessed with an illegal index. The index is either negative
		 * or greater than or equal to the size of the array. - ClassNotFoundException
		 * This Exception is raised when we try to access a class whose definition is
		 * not found - FileNotFoundException This Exception is raised when a file is not
		 * accessible or does not open. - IOException It is thrown when an input-output
		 * operation failed or interrupted - InterruptedException It is thrown when a
		 * thread is waiting , sleeping , or doing some processing , and it is
		 * interrupted. - NoSuchFieldException It is thrown when a class does not
		 * contain the field (or variable) specified - NoSuchMethodException It is
		 * thrown when accessing a method which is not found. - NullPointerException
		 * This exception is raised when referring to the members of a null object. Null
		 * represents nothing - NumberFormatException This exception is raised when a
		 * method could not convert a string into a numeric format. - RuntimeException
		 * This represents any exception which occurs during runtime. -
		 * StringIndexOutOfBoundsException It is thrown by String class methods to
		 * indicate that an index is either negative than the size of the string
		 */
		String tmpStr = "";

		try {

			if (readLine)
				tmpStr = tmpScan.nextLine();
			else
				tmpStr = tmpScan.next();

		} catch (NumberFormatException e) {
			System.out.println("Erro: convers�o 'String' para 'int' falhou.\n");
			System.out.println("'" + tmpScan + "' precisa ser valor num�rico entre '" + Integer.MIN_VALUE + "' e '"
					+ Integer.MAX_VALUE + "'");
			System.out.println("Entrada de caracteres alfanum�ricos ou caract�res especiais, tais como"
					+ "' ', '/', '=', '[', '@', etc. s�o vetadas, exceto '-'  '+' cujos s�o permitidos.\n");
			System.out.println("Detalhes:");
			System.out.print("Stack Trace:");
			e.printStackTrace();
			System.out.println("Class: " + e.getClass().getName() + ".");

			System.out.println("\n\n sem RETURN\n");
		} catch (Exception e) {
			System.out.println("outra exception inesperada , sem RETURN");

		} finally {
			System.out.println("OK, finallly COM RETURN");
			return tmpStr;
		}
	}
}
