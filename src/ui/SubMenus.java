package ui;

import bll.Application;
import misc.ScannerUtil;

public class SubMenus {
	ScannerUtil scanner = new ScannerUtil();
	SubMenusFunctionalities submenuFunct = new SubMenusFunctionalities();
	
	protected void displayGroupMenu() {
		GroupMenu groupMenu = new GroupMenu();
		groupMenu.show();
	}
	
	private class GroupMenu implements IMenu {

		@Override
		public void displayOptions() {
			System.out.println("==Menu de grupos==");
			System.out.println("1. Abrir");
			System.out.println("2. Agregar");
			System.out.println("3. Guardar");
			System.out.println("4. Volver al menu principal");
		}

		@Override
		public void show() {
	        
			
			short op = 0;
			System.out.println();
			displayOptions();
			System.out.println();
			
			op = scanner.sc.nextShort();
			
			do {
				switch(op) {
				case 1:
					submenuFunct.openGroups();
					break;
				case 2:
					Application.addGroup(submenuFunct.formGroup());
					break;
				case 3:
					submenuFunct.saveGroups();
					break;
				case 4:
					MainMenu priorMenu = new MainMenu();
					priorMenu.show();
	                break;
	        	default:
					System.out.println("Opcion invalida.");
					break;
				}
				
				
			}while(op != 5);
			
		}

	}
	
	protected void displaySubjectMenu() {
		SubjectMenu subjectMenu = new SubjectMenu();
		subjectMenu.show();
	}
	
	private class SubjectMenu implements IMenu {

		@Override
		public void displayOptions() {
			System.out.println("==Menu de asignaturas==");
			System.out.println("1. Abrir");
			System.out.println("2. Agregar");
			System.out.println("3. Asignar docente");
			System.out.println("4. Guardar");
			System.out.println("5. Volver al menu principal");
			
		}

		@Override
		public void show() {
	      
			
			short op = 0;
			System.out.println();
			displayOptions();
			System.out.println();
			
			op = scanner.sc.nextShort();
			
			do {
				switch(op) {
				case 1:
					submenuFunct.openSubjects();
					break;
				case 2:
					Application.addSubject(submenuFunct.formSubject());
					break;
				case 3:
				
					int index = Application.selectSubject();
					System.out.print("Ingrese el ID del maestro: ");
					Application.setTeacher(scanner.sc.next(), index);
					break;
				case 4:
					submenuFunct.saveSubjects();
					
					break;
				case 5:
					MainMenu priorMenu = new MainMenu();
					priorMenu.show();
	                break;
	        	default:
					System.out.println("Opcion invalida.");
					break;
				}
				
				
			}while(op != 5);
			
		}
		

	}
	
	
	protected void displayTeacherMenu() {
		TeacherMenu teacherMenu = new TeacherMenu();
		teacherMenu.show();
	}
	
	private class TeacherMenu implements IMenu {

		@Override
		public void displayOptions() {
			System.out.println("==Menu de profesores==");
			System.out.println("1. Abrir");
			System.out.println("2. Agregar");
			System.out.println("3. Asignar grupo");
			System.out.println("4. Asignar asignatura");
			System.out.println("5. Guardar");
			System.out.println("6. Volver al menu principal");
			
		}

		@Override
		public void show() {

				
				short op = 0;
				System.out.println();
				displayOptions();
				System.out.println();
				
				op = scanner.sc.nextShort();
				
				do {
					switch(op) {
					case 1:
						submenuFunct.openTeachers();
						break;
					case 2:
						Application.addTeacher(submenuFunct.formTeacher());
						break;
					case 3:
						int index = Application.selectTeacher();
						
						System.out.print("ID del grupo: ");
						String id = scanner.sc.next();
						
						Application.assingGroupToTeacher(id, index);
						break;
					case 4:
	                   	int index2 = Application.selectTeacher();
						
						System.out.print("ID de la asignatura: ");
						String id2 = scanner.sc.next();
						
						Application.assingSubjectToTeacher(id2, index2);
						break;
						
					case 5:
						submenuFunct.saveTeachers();
						break;
					case 6:
						MainMenu priorMenu = new MainMenu();
						priorMenu.show();
		                break;
		        	default:
						System.out.println("Opcion invalida.");
						break;
					}
					
					
				}while(op != 5);
			
		}

	}
	
	
	protected void displayStudentMenu() {
		StudentMenu studentMenu = new StudentMenu();
		studentMenu.show();
	}
	
	private class StudentMenu implements IMenu {

		@Override
		public void displayOptions() {
			System.out.println("==Menu de alumnos==");
			System.out.println("1. Abrir");
			System.out.println("2. Agregar");
			System.out.println("3. Matricular");
			System.out.println("4. Guardar");
			System.out.println("5. Volver al menu principal");
			
		}

		@Override
		public void show() {
	
			
			short op = 0;
			System.out.println();
			displayOptions();
			System.out.println();
			
			op = scanner.sc.nextShort();
			
			do {
				switch(op) {
				case 1:
					submenuFunct.openStudents();
					break;
				case 2:
					Application.addStudent(submenuFunct.formStudent());
					break;
				case 3:
					int index = Application.selectStudent();
					System.out.print("Ingrese la Id de la materia: ");
					String id = scanner.sc.next();
					Application.addEnrolledSubject(id, index);
					
					break;
				case 4:
					submenuFunct.saveStudents();
					break;
				case 5:
					MainMenu priorMenu = new MainMenu();
					priorMenu.show();
	                break;
	        	default:
					System.out.println("Opcion invalida.");
					break;
				}
				
				
			}while(op != 5);
			
		}

	}
	
	

}
