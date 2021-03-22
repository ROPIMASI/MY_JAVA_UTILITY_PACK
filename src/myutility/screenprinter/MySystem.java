/*** ***************************************************************************
 * CONTENT: MYUTILITYS PROJECT (ITJDP-MU-b0.2)
 * THEME: LIBRARY OF JAVA UTILITYS.
 * AUTHOR: RONALDO PI MA SI.
 * DATE: 2019-JULY.
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

// ### REVISAR PARA PROXIMA VERSAO: CONSTRUIR EM  HASHMAP()...


// Project's package
package myutility.screenprinter;

//Java's imports
//import java.util.List;
//import java.util.ArrayList;
//import java.io.FileWriter;
//import java.io.PrintWriter;
//import java.io.IOException;

//Project's imports



public class MySystem {
	
	public static class ExceptObj {
		Exception e;
	}
	
	
	
	public static void sleep(long miliseconds, short times, char sepChar, ExceptObj refExcept) {
		try {
			for (int i=0; i<times; i++) {
				Thread.sleep(miliseconds);
				System.out.print(sepChar);
			}
			System.out.println();
		} catch (Exception except) {
			refExcept = new ExceptObj();
			refExcept.e = except;
		}
	}
	
	
	
	public static void sleep(long miliseconds, short times, char sepChar) {
		try {
			for (int i=0; i<times; i++) {
				Thread.sleep(miliseconds);
				System.out.print(sepChar);
			}
			System.out.println();
		} catch (Exception except) {
			System.out.println("Erro! [" + except + "]");
		}
	}
	
	
	
	public static void sleep(long miliseconds, short times) {
		try {
			for (int i=0; i<times; i++) {
				Thread.sleep(miliseconds);
			}
		} catch (Exception except) {
			System.out.println("Erro! [" + except + "]");
		}
	}	
	
	
	
	public static void sleep(long miliseconds) {
		try {
			for (int i=0; i<3; i++) {
				Thread.sleep(miliseconds);
			}
		} catch (Exception except) {
			System.out.println("Erro! [" + except + "]");
		}
	}
	
	
	
	public static void sleep() {
		try {
			for (int i=0; i<3; i++) {
				Thread.sleep(1000);
			}
		} catch (Exception except) {
			System.out.println("Erro! [" + except + "]");
		}
	}	
} // MySystem ends here.
