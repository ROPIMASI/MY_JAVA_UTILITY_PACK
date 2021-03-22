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


// Project's package
package myutility;

import myutility.MyUtility;



public class Tester {

	public static void main(String[] args) {
		
		MyUtility.printc("mensagem", "44", "31");
		
		//parei = executar no console n�o est� surgindo efeito de cores.  :-( 
		
		/*
		MyScreen ms = new MyScreen();
		
		int tmpIndex;
		MyMenu tmpMenu;

		ms.cCS();
		System.out.println("--- --- --- begin test --- --- ---");

		tmpIndex = ms.menusCreateOne();
		tmpIndex = ms.menusCreateOne("teste on ind 1");
		tmpIndex = ms.menusCreateOne();

		tmpMenu = ms.menusGetObject(0);
		tmpMenu.addIten(0 + "_um item");
		tmpMenu.addIten(0 + "_outro item");
		tmpMenu.addIten(0 + "_mais um item");
		tmpMenu.draw();
		ms.menusPutObject(0, tmpMenu);

		tmpMenu = ms.menusGetObject(1);
		tmpMenu.addIten(1 + "_um item");
		tmpMenu.addIten(1 + "_outro item");
		tmpMenu.addIten(1 + "_mais um item");
		tmpMenu.draw();
		ms.menusPutObject(1, tmpMenu);

		tmpMenu = ms.menusGetObject(2);
		tmpMenu.addIten("_um item_" + 2);
		tmpMenu.addIten("_outro item_" + 2);
		tmpMenu.addIten("_mais um item_" + 2);
		tmpMenu.draw();
		ms.menusPutObject(2, tmpMenu);

		ms.menusList();
		ms.menusRetitleIn(tmpIndex, "Ronaldinho");
		ms.menusList();
		ms.menusRemoveOne(1);
		ms.menusList();

		System.out.print("To TXT...");
		MySystem.ExceptObj myE = new ExceptObj();
		MySystem.sleep(5000L, (short)2, '(', myE);

		try {
			System.out.println(ms.menusSaveToTXT());
			// c�digo que inclui comandos/invoca��es de m�todos
			// que podem gerar uma situa��o de exce��o.
		} catch (IOException IOexc) {
			// bloco de tratamento associado � condi��o de
			// exce��o XException ou a qualquer uma de suas
			// subclasses, identificada aqui pelo objeto
			// com refer�ncia ex
		} finally {
			// bloco de c�digo que sempre ser� executado ap�s
			// o bloco try, independentemente de sua conclus�o
			// ter ocorrido normalmente ou ter sido interrompida
		}

		System.out.println("--- --- --- end test --- --- ---");
		*/
	}

}
