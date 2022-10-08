package ui;

import misc.ScannerUtil;

public class MainMenu implements IMenu {

	
	@Override
	public void displayOptions() {
		System.out.println("Registro Academico");
		System.out.println("1. Asignaturas");
		System.out.println("1. Grupos");
		System.out.println("1. Profesores");
		System.out.println("1. Estudiantes");
		System.out.println("5. Salir");
		
	}

	@Override
	public void show() {
		ScannerUtil scanner = new ScannerUtil();
		SubMenus submenu = new SubMenus();
		
		short op = 0;
		System.out.println();
		displayOptions();
		System.out.println();
		
		op = scanner.sc.nextShort();
		
		do {
			switch(op) {
			case 1:
				submenu.displaySubjectMenu();
				break;
			case 2:
				submenu.displayGroupMenu();
				break;
			case 3:
				submenu.displayTeacherMenu();
				break;
			case 4:
				submenu.displayStudentMenu();
				break;
			case 5:
				System.out.println("Gracias por utilizar este programa.");
				System.exit(0);
				break;
			default:
				System.out.println("Opcion invalida.");
				break;
			}
			
			
		}while(op != 5);
		
		
		
	}

}
