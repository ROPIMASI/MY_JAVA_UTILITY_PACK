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
package myutility;

//Java's imports
import java.util.List;
import java.util.ArrayList;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;

//Project's imports



public class MyScreen {

	// One of sub-class' objects.
	public class MyMenu {
		private String title = new String("");
		private List<String> items = new ArrayList<String>();
		private String image = new String("");

		public void retitle(String s) {
			this.title = s;
		}

		public void addIten(String item) {
			this.items.add(item);
		}

		public void remIten(int index) {
			this.items.remove(index);
		}

		public String draw(String separator) {
			StringBuilder result = new StringBuilder();
			result.append(this.title + "\n");

			int counter = 0;
			while (counter < this.items.size()) {
				result.append(Integer.toString(counter + 1) + separator + this.items.get(counter) + "\n");
				counter++;
			}
			this.image = result.toString();
			return result.toString();
		}

		public String draw() {
			return draw(" ");
		}

		// Constructors.
		public MyMenu(String title) {
			this.retitle(title);
		}

		public MyMenu() {
			this.retitle("");
		}
	}// END Class MyMenu.

	// Class' elements.
	private List<MyMenu> menus;
	private MyMenu tmpMenu;
	//private short width;
	//private short height;
	//private String bgColor;

	// Class' methods.
	public MyMenu menusGetObject(int index) {
		return this.menus.get(index);
	}

	public void menusPutObject(int index, MyMenu obj) {
		this.menus.remove(index);
		this.menus.add(index, obj);
	}

	public void menusClear() {
		// Clears the "menus" attribute. Deletes all "menu" added.
		this.menus.clear();
	}

	public int menusCreateOne(String alias) {
		// Creates one "menu" in "menus" attribute. Returns its index.
		this.tmpMenu = new MyMenu(alias);
		this.menus.add(tmpMenu);
		return this.menus.indexOf(tmpMenu);
	}

	public int menusCreateOne() {
		// Creates one "menu" in "menus" attribute. Returns its index.
		return menusCreateOne("Default Menu");
	}

	public MyMenu menusRemoveOne(int index) {
		// Remove one "menu" in "menus" attribute. Returns the object.
		MyMenu tmpMenuRem = new MyMenu();
		tmpMenuRem = this.menusGetObject(index);
		this.menus.remove(index);
		return tmpMenuRem;
	}

	public MyMenu menusRemoveOne() {
		// Remove the first (index 0) "menu" in "menus" attribute. Returns the object.
		MyMenu tmpMenuRem = new MyMenu();
		tmpMenuRem = this.menusGetObject(0);
		this.menus.remove(0);
		return tmpMenuRem;
	}

	public void menusRetitleIn(int index, String s) {
		// Rename the Title of the menu in the "index" position of the "menus".
		this.menus.get(index).title = s;
	}
	
	public void menusRetitleIn(String s) {
		// Rename the Title of the menu in the "index" position of the "menus".
		this.menusRetitleIn(0, s);
	}	

	public void menusList() {
		// To list all of menu inside "menus".
		System.out.println("#Listing...");
		for (int i = 0; i < menus.size(); i++) {
			System.out.println("Index\t[" + i + "]");
			System.out.println("Title\t[" + this.menus.get(i).title + "]");

			for (int j = 0; j < this.menus.get(i).items.size(); j++) {
				System.out.println("Item[" + j + "]\t[" + this.menus.get(i).items.get(j) + "]");
			}
			System.out.println("---Image---\n" + this.menus.get(i).image + "-----------");
		}
	}

	public int menusSaveToTXT() throws IOException {
			FileWriter arq = new FileWriter("MSMMSaveToTXT.txt");
			PrintWriter arqPrint = new PrintWriter(arq);
			
			for (int i=0; i<this.menus.size(); i++) {
				arqPrint.printf("Menu["+ i +"]%n");
				arqPrint.printf((this.menus.get(i).image).replaceAll("\n", "%n") +"---%n");				
			}
			
			arq.close();
			return this.menus.size();
	}
	
	public int menusReadFromTXT() throws IOException {
		//  A desenvolver...
		/*
		FileWriter arq = new FileWriter("MSMMSaveToCSV.CSV");
		PrintWriter arqPrint = new PrintWriter(arq);
		
		for (int i=0; i<this.menus.size(); i++) {
			arqPrint.printf("Menu["+ i +"]%n");
			arqPrint.printf((this.menus.get(i).image).replaceAll("\n", "%n") +"---%n");				
		}
		
		arq.close();
		*/
		return this.menus.size();
	}

	public void clearConsoleScreen(int nLinhas) {
		for (int i = 0; i <= nLinhas; i++) {
			System.out.println();
		}
	}

	public void clearConsoleScreen() {
		clearConsoleScreen(50);
	}

	public void cCS(int nLinhas) {
		clearConsoleScreen(nLinhas);
	}

	public void cCS() {
		cCS(50);
	}

	public void printMenu(int index) {
		clearConsoleScreen(50);
		System.out.println(this.menus.get(index).image);
		System.out.print(":");
	}

	public void pM(int index) {
		printMenu(index);
	}

	public void printMenu(int nClearLinhas, int index) {
		clearConsoleScreen(nClearLinhas);
		System.out.println(this.menus.get(index).image);
		System.out.print(":");
	}

	public void pM(int nClearLinhas, int index) {
		printMenu(nClearLinhas, index);
	}

	// Constructors.
	public MyScreen() {
		this.menus = new ArrayList<MyMenu>();
	}
}
