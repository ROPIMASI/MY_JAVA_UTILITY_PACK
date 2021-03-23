/**
 * DIREITOS, LICENSA E ISENÇÃO DE RESPONSABILIDADE:
 * Este arquivo é parte integrante, indivisível, inseparável de um projeto particular, o qual tem seu uso e fruto
 * expressamente exclusivo à seu autor, Ronaldo Marques (ronaldomarques@email.com / http://ronaldomarques.dev);
 * É vetado qualquer utilização, venda, aluguél, distribuição, em partes ou integral deste projeto;
 * Este projeto tem finalidade exclusiva de demonstração de conhecimento e habilidades no desenvolvimento de software
 * para apresentação no processo de recrutamento da empresa Dryve.com.br;
 * Sendo assim, o autor deste projeto não reconhece nem assume qualquer responsabilidade pela utilização do mesmo,
 * tão pouco por qualquer possível reflexos ou consequência de tal utilização.
 * ---
 * RIGHTS, LICENSE AND DISCLAIMER:
 * This file is an integral, indivisible, inseparable part of a particular project, which has its use expressly
 * exclusive to its author, Ronaldo Marques (ronaldomarques@email.com / http://ronaldomarques.dev);
 * Any use, sale, rental, distribution, in parts or integral of this project is prohibited;
 * This project has the sole purpose of demonstrating knowledge and skills in software development
 * for presentation in the recruitment process of Dryve.com.br;
 * Therefore, the author of this project does not recognize or assume any responsibility for the use of it,
 * neither for any possible reflexes or consequence of such use.
 */
package dev.ronaldomarques.myutility.screenprinter;


import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;



/**
 * @author         Ronaldo Marques.
 * @since          20190501.
 * @version        20210322.
 * @category       LibClass: class which implements several resources, such as constants, properties, methods, data
 *                 structure to be used as a library in others projects.
 * @analysis       ...
 * @language       JAVA-11.
 * @dev_environmet Microsoft-Windows-10, REDHAT-OPEN-JDK-11.0.9, Eclipse-IDE-Enterprise-Java-Developers-v2020-03.
 */
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
	// private short width;
	// private short height;
	// private String bgColor;
	
	
	
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
		
		for (int i = 0; i < this.menus.size(); i++) {
			arqPrint.printf("Menu[" + i + "]%n");
			arqPrint.printf((this.menus.get(i).image).replaceAll("\n", "%n") + "---%n");
		}
		
		arq.close();
		return this.menus.size();
		
	}
	
	
	
	public int menusReadFromTXT() throws IOException {
		
		// A desenvolver...
		/* FileWriter arq = new FileWriter("MSMMSaveToCSV.CSV");
		 * PrintWriter arqPrint = new PrintWriter(arq);
		 * 
		 * for (int i=0; i<this.menus.size(); i++) {
		 * arqPrint.printf("Menu["+ i +"]%n");
		 * arqPrint.printf((this.menus.get(i).image).replaceAll("\n", "%n") +"---%n");
		 * }
		 * 
		 * arq.close(); */
		return this.menus.size();
		
	}
	
	
	
	public void clearConsoleScreen(int nLinhas) {
		
		for (int i = 0; i <= nLinhas; i++) { System.out.println(); }
		
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
