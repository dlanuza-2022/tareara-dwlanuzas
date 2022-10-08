package ui;

import java.util.List;
import java.util.Scanner;

import bll.Application;
import dal.GroupsDal;
import dal.StudentsDal;
import dal.SubjectsDal;
import dal.TeachersDal;
import dol.Gender;
import dol.Group;
import dol.Student;
import dol.Subject;
import dol.Teacher;
import misc.DateOperator;

public class SubMenusFunctionalities {
	Scanner sc = new Scanner(System.in);
	SubjectMenuFunctionalities subject = new SubjectMenuFunctionalities();
	GroupMenuFunctionalities group = new GroupMenuFunctionalities();
	TeacherMenuFunctionalities teacher = new TeacherMenuFunctionalities();
	StudentMenuFunctionalities student = new StudentMenuFunctionalities();
	public static String filePath;
	
	

	
	public Group formGroup() {
		GroupMenuFunctionalities.FormGroup c = group.new FormGroup();
		
		return c.catchGroup();
		
	}
	
	public void saveGroups() {
		GroupMenuFunctionalities.SaveGroup c = group.new SaveGroup();
		c.save();
	}
	
	public void openGroups() {
		GroupMenuFunctionalities.OpenGroupFile c = group.new OpenGroupFile();
		c.open();
	}
	
	public class GroupMenuFunctionalities {
		
		public class FormGroup {
			public Group catchGroup() {
				Group o = new Group();
				System.out.print("Nombre: ");
				o.setName(sc.nextLine());
				
				return o;
			}
			
		}
		
		
		public class OpenGroupFile {
			public void open() {
				GroupsDal o = new GroupsDal();
				
				System.out.print("Nombre del archivo a abrir: ");
				o.setFileName(sc.next());
				o.setFilePath(filePath + "\\" +o.getFileName());
				
			
				Application.setGroups(o.open());
				
			}
			
			
		}
		
		
		public class SaveGroup {
			public void save() {
				GroupsDal o = new GroupsDal();
				o.setFilePath(filePath);
				
				System.out.print("Nombre del archivo: ");
				o.setFileName(sc.next());
				
				o.setGroups(Application.getGroups());
				o.save();
				
			}
			
			
			
		}
		
		

	}
	

	public Subject formSubject() {
		SubjectMenuFunctionalities.FormSubject c = subject.new FormSubject();
		
		return c.catchSubject();
		
	}
	
	public void saveSubjects() {
		SubjectMenuFunctionalities.SaveSubject c = subject.new SaveSubject();
		c.save();
	}
	
	public void openSubjects() {
		SubjectMenuFunctionalities.OpenSubjectFile c = subject.new OpenSubjectFile();
		c.open();
	}
	
	
	

    public class SubjectMenuFunctionalities {
	
	
	    public class FormSubject {
	    	
	    	public Subject catchSubject() {
	    		Subject o = new Subject();
	    		
	    		System.out.print("Ingrese el nombre: ");
	    		o.setName(sc.nextLine());
	    		
	    		return o;
	    	}
	    	
		
	    }
	    
	    
	    public class assignTeacher {
	    	
	    	
	    }
	    
	    
        public class OpenSubjectFile {
        	public void open() {
				SubjectsDal o = new SubjectsDal();
				
				System.out.print("Nombre del archivo a abrir: ");
				o.setFileName(sc.next());
				o.setFilePath(filePath + "\\" +o.getFileName());
				
			
				Application.setSubjects(o.open());
				
			}
			
		}
        
    	
		public class SaveSubject {
			public void save() {
				SubjectsDal o = new SubjectsDal();
				o.setFilePath(filePath);
				
				System.out.print("Nombre del archivo: ");
				o.setFileName(sc.next());
				
				o.setSubjects(Application.getSubjects());
				o.save();
			}
		
			
		}
	
	

    }
    
    
    
    public Teacher formTeacher() {
		TeacherMenuFunctionalities.FormTeacher c = teacher.new FormTeacher();
		
		return c.catchTeacher();
		
	}
    
    public void saveTeachers() {
		TeacherMenuFunctionalities.SaveTeacher c = teacher.new SaveTeacher();
		c.save();
	}
	
	public void openTeachers() {
		TeacherMenuFunctionalities.OpenTeacherFile c = teacher.new OpenTeacherFile();
		c.open();
	}
	
	
    
    
    public class TeacherMenuFunctionalities {
    	
    	public class FormTeacher {
    		public Teacher catchTeacher() {
    			Teacher o = new Teacher();
    			
    			System.out.print("Primer nombre: ");
    			o.setFirstName(sc.next());
    			System.out.print("Segundo nombre: ");
    			o.setMiddleName(sc.next());
    			System.out.print("Primer apellido: ");
    			o.setSurName(sc.next());
    			System.out.print("Segundo apellido: ");
    			o.setSecondSurName(sc.next());
    			
    			short op = 0;
    			do {
    				System.out.println("Género: ");
        			System.out.println("1. Hombre");
        			System.out.println("2. Mujer");
    				op = sc.nextShort();
    				
    				switch(op){
    				case 1:
    					o.setGender(Gender.MALE);
    					break;
    				case 2:
    					o.setGender(Gender.FEMALE);
    					break;
    				default:
    					System.out.println("Opción inválida.");
    					break;
    				}
    				
    			}while(op != 1 && op != 2);
    			
    			System.out.print("Fecha de nacimiento: ");
    			o.setBirthDate(DateOperator.catchValidDate(sc, "dd/mm/yyyy"));
    			
    			o.setAge(DateOperator.getAge(o.getBirthDate()));
    			
    			System.out.print("Profesión: ");
    			o.setProfession(sc.nextLine());
    			
    			System.out.println("Años de experiencia: ");
    			o.setExperienceYears(sc.nextInt());
    			
    			
    			
    			return o;
    		}
    		
    	} 
    	
    	
    	public class assingGroup {
    		
    		
    	}
    	
    	
    	public class assingSubject {
    		
    		
    	}
    	
    	
        public class OpenTeacherFile {
        	public void open() {
				TeachersDal o = new TeachersDal();
				
				System.out.print("Nombre del archivo a abrir: ");
				o.setFileName(sc.next());
				o.setFilePath(filePath + "\\" +o.getFileName());
				
			
				Application.setTeachers(o.open());
				
			}
			
		}
        
    	
		public class SaveTeacher {
			public void save() {
				TeachersDal o = new TeachersDal();
				o.setFilePath(filePath);
				
				System.out.print("Nombre del archivo: ");
				o.setFileName(sc.next());
				
				o.setTeachers(Application.getTeachers());
				o.save();
			}
		
			
		}
    	

    }

	
    public Student formStudent() {
		StudentMenuFunctionalities.FormStudent c = student.new FormStudent();
		
		return c.catchStudent();
		
	}
    
    public void saveStudents() {
		StudentMenuFunctionalities.SaveStudent c = student.new SaveStudent();
		c.save();
	}
	
	public void openStudents() {
		StudentMenuFunctionalities.OpenStudentFile c = student.new OpenStudentFile();
		c.open();
	}
    
    public class StudentMenuFunctionalities {
    	
    	public class FormStudent {
    		
    		public Student catchStudent() {
    			Student o = new Student();
    			
    			System.out.print("Primer nombre: ");
    			o.setFirstName(sc.next());
    			System.out.print("Segundo nombre: ");
    			o.setMiddleName(sc.next());
    			System.out.print("Primer apellido: ");
    			o.setSurName(sc.next());
    			System.out.print("Segundo apellido: ");
    			o.setSecondSurName(sc.next());
    			
    			short op = 0;
    			do {
    				System.out.println("Género: ");
        			System.out.println("1. Hombre");
        			System.out.println("2. Mujer");
    				op = sc.nextShort();
    				
    				switch(op){
    				case 1:
    					o.setGender(Gender.MALE);
    					break;
    				case 2:
    					o.setGender(Gender.FEMALE);
    					break;
    				default:
    					System.out.println("Opción inválida.");
    					break;
    				}
    				
    			}while(op != 1 && op != 2);
    			
    			System.out.print("Fecha de nacimiento: ");
    			o.setBirthDate(DateOperator.catchValidDate(sc, "dd/mm/yyyy"));
    			
    			o.setAge(DateOperator.getAge(o.getBirthDate()));
    			
    			System.out.print("Fecha de ingreso: ");
    			o.setEntryDate(DateOperator.catchValidDate(sc, "dd/mm/yyyy"));
    			
    			
    			
    			return o;
    			
    		}
    		
    	}
    	
    	  	
    	public class RegisterSubject {
    		
    		
    	}
    	
    	
        public class OpenStudentFile {
        	public void open() {
				StudentsDal o = new StudentsDal();
				
				System.out.print("Nombre del archivo a abrir: ");
				o.setFileName(sc.next());
				o.setFilePath(filePath + "\\" +o.getFileName());
				
			
				Application.setStudents(o.open());
				
			}
			
		}
        
        
    	
		public class SaveStudent {
			public void save() {
				StudentsDal o = new StudentsDal();
				o.setFilePath(filePath);
				
				System.out.print("Nombre del archivo: ");
				o.setFileName(sc.next());
				
				o.setStudents(Application.getStudents());
				o.save();
			}
			
			
		}
    	
    	

    }
    
	
}
