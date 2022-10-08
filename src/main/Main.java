package main;

import java.util.Scanner;

import ui.MainMenu;
import ui.SubMenusFunctionalities;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.print("Dirección de guardado de los archivos: ");
		SubMenusFunctionalities.filePath = sc.next();
		


		MainMenu menu = new MainMenu();

	}

}
