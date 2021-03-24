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
package dev.ronaldomarques.myutility.scanner;

import java.util.Scanner;

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
public class MyScanner {
	
	/* TODO: static reusable 'scanner' object, and its 4 methods. */
	public static Scanner tmpScan = new Scanner(System.in);
	
	
	
	@SuppressWarnings("finally")
	public static int intScanInput() {
		
		/***
		 * DOCSTRING
		 ***/
		/* Princcipais tipos de 'Exceptions' para esta fun��o: - ArithmeticException It
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
		 * indicate that an index is either negative than the size of the string */
		int anInt = 0;
		String tmpStr = "";
		
		try {
			tmpStr = tmpScan.nextLine();
			anInt = Integer.parseInt(tmpStr);
		}
		catch (NumberFormatException e) {
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
		}
		catch (Exception e) {
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
		}
		finally {
			return anInt;
		}
		
	}
	
	
	
	@SuppressWarnings("finally")
	public static int intScanInput(boolean readLine) {
		
		/***
		 * DOCSTRING
		 ***/
		/* Princcipais tipos de 'Exceptions' para esta fun��o: - ArithmeticException It
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
		 * indicate that an index is either negative than the size of the string */
		int anInt = 0;
		String tmpStr = "";
		
		try {
			if (readLine)
				tmpStr = tmpScan.nextLine();
			else
				tmpStr = tmpScan.next();
			
			anInt = Integer.parseInt(tmpStr);
		}
		catch (NumberFormatException e) {
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
		}
		catch (Exception e) {
			System.out.println("outra exception inesperada , sem RETURN");
		}
		finally {
			System.out.println("OK, finallly COM RETURN");
			return anInt;
		}
		
	}
	
	
	
	@SuppressWarnings("finally")
	public static String strScanInput() {
		
		/***
		 * DOCSTRING
		 ***/
		/* Princcipais tipos de 'Exceptions' para esta fun��o: - ArithmeticException It
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
		 * indicate that an index is either negative than the size of the string */
		String tmpStr = "";
		
		try {
			tmpStr = tmpScan.nextLine();
		}
		catch (NumberFormatException e) {
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
		}
		catch (Exception e) {
			System.out.println("outra exception inesperada , sem RETURN");
		}
		finally {
			System.out.println("OK, finallly COM RETURN");
			return tmpStr;
		}
		
	}
	
	
	
	@SuppressWarnings("finally")
	public static String strScanInput(boolean readLine) {
		
		/***
		 * DOCSTRING
		 ***/
		/* Princcipais tipos de 'Exceptions' para esta fun��o: - ArithmeticException It
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
		 * indicate that an index is either negative than the size of the string */
		String tmpStr = "";
		
		try {
			if (readLine)
				tmpStr = tmpScan.nextLine();
			else
				tmpStr = tmpScan.next();
		}
		catch (NumberFormatException e) {
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
		}
		catch (Exception e) {
			System.out.println("outra exception inesperada , sem RETURN");
		}
		finally {
			System.out.println("OK, finallly COM RETURN");
			return tmpStr;
		}
		
	}
	
}
