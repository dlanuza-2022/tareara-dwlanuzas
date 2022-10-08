package dol;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import misc.ScannerUtil;

public class Catalog {
	private String schoolName;
	ScannerUtil scanner = new ScannerUtil();

	
	
	private List<Subject> subjects;
	private List<Group> groups;
	private List<Teacher> teachers;
	private List<Student> students;
	
	
	public Catalog() {
		subjects = new ArrayList<Subject>();
		groups = new ArrayList<Group>();
		teachers = new ArrayList<Teacher>();
		students = new ArrayList<Student>();
	}
	

	public Catalog(String schoolName) {
		this.schoolName = schoolName;
		subjects = new ArrayList<Subject>();
		groups = new ArrayList<Group>();
		teachers = new ArrayList<Teacher>();
		students = new ArrayList<Student>();
	}
	
	
	//Subjects methods
	public List<Subject> getSubjects() {
		return subjects;
	}

	public void setSubjects(List<Subject> subjects) {
		this.subjects = subjects;
	}
	
	public void addSubject(Subject o) {
		this.subjects.add(o);
	}
	
	
	public void setSubjectByIndex(Subject o, int index) {
		subjects.set(index, o);
	}
	
	public void setSubjectByID(Subject o, UUID id) {
		
		subjects.set(getSubjectIndexById(id), o);
	}
	
	public int getSubjectsSize() {
		
		return subjects.size();
	}
	
	public int getSubjectIndexById(UUID id) {
	    int index = 0;
     	for(int i = 0; i < subjects.size(); i++) {
 			if(subjects.get(i).getId() == id) {
 				index = i;	
 			}	
 		}	
     	return index;
    }
	
	
	public Subject getSubjectById(UUID id) {
        int index = 0;
    	for(int i = 0; i < subjects.size(); i++) {
			if(subjects.get(i).getId() == id) {
				index = i;
			}
		}
    	return subjects.get(index);
	}
	
	public Subject getSubjectByIndex(int index) {
       	return subjects.get(index);
	}
	
	public boolean subjectExists(UUID id) {
	   	boolean subjectExists = false;
	        for(int i = 0; i < subjects.size(); i++) {
				if(subjects.get(i).getId() == id) {
					subjectExists = true;	
				}
			}
	   	return subjectExists;
	 }
	
	public int selectSubjectFromCatalog() {
    	int index = 0;
    	
    	System.out.println();
    	showSubjectsAsAList();
    	System.out.println();
    	
    	do {
    		System.out.print("Ingrese el índice de la materia: ");
        	index = scanner.sc.nextInt();
        	index = index - 1;
        	if(index < 0 || index >subjects.size()) {
        		System.out.println("Indice inválido.");
        	}
    	}while(index < 0 || index >subjects.size());
    	
    	return index;
    }
	
	public void setTeacher(UUID id, int index) {
		subjects.get(index).setAssingedTeacher(id);
		
	}
	
	public void showSubjectsAsATable() {
		
		System.out.println("________________________________________________________________________________________");
		System.out.println("                                     Materias                                           ");
		System.out.println("________________________________________________________________________________________");
		for(int i=0; i<subjects.size();i++) {
			System.out.print((i+1) + ". ");
			subjects.get(i).showDataAsForm();
			System.out.println("________________________________________________________________________\n");
		}
		
	}
	
	public void showSubjectsAsAList() {
		
		System.out.println("________________________________________________________________________________________");
		System.out.println("                                      Materias                                          ");
		System.out.println("________________________________________________________________________________________");
		for(int i=0; i<subjects.size();i++) {
			System.out.print((i+1) + ". ");
			subjects.get(i).showDataAsRow();
		}
		
	}
	
	
	
	
	
	
	
	
	
	//Groups Methods
	public List<Group> getGroups() {
		return groups;
	}

	public void setGroups(List<Group> groups) {
		this.groups = groups;
	}
	
	public void addGroup(Group o) {
		this.groups.add(o);
	}
	
	
	public void setGroupByIndex(Group o, int index) {
		groups.set(index, o);
	}
	
	public void setGroupByID(Group o, UUID id) {
		
		groups.set(getGroupIndexById(id), o);
	}
	
	public int getGroupsSize() {
		
		return groups.size();
	}
	
	public int getGroupIndexById(UUID id) {
	    int index = 0;
     	for(int i = 0; i < groups.size(); i++) {
 			if(groups.get(i).getId() == id) {
 				index = i;	
 			}	
 		}	
     	return index;
    }
	
	
	public Group getGroupById(UUID id) {
        int index = 0;
    	for(int i = 0; i < groups.size(); i++) {
			if(groups.get(i).getId() == id) {
				index = i;
			}
		}
    	return groups.get(index);
	}
	
	public Group getGroupByIndex(int index) {
       	return groups.get(index);
	}
	
	public boolean groupExists(UUID id) {
	   	boolean groupExists = false;
	        for(int i = 0; i < groups.size(); i++) {
				if(groups.get(i).getId() == id) {
					groupExists = true;	
				}
			}
	   	return groupExists;
	 }
	
	public int selectGroupFromCatalog() {
    	int index = 0;
    	
    	System.out.println();
    	showGroupsAsAList();
    	System.out.println();
    	
    	do {
    		System.out.print("Ingrese el índice del grupo: ");
        	index = scanner.sc.nextInt();
        	index = index - 1;
        	if(index < 0 || index >groups.size()) {
        		System.out.println("Indice inválido.");
        	}
    	}while(index < 0 || index >groups.size());
    	
    	
    	return index;
    }
	
	public void showGroupsAsATable() {
		
		System.out.println("________________________________________________________________________________________");
		System.out.println("                                      Grupos                                           ");
		System.out.println("________________________________________________________________________________________");
		for(int i=0; i<groups.size();i++) {
			System.out.print((i+1) + ". ");
			groups.get(i).showDataAsForm();
			System.out.println("________________________________________________________________________\n");
		}
		
	}
	
	public void showGroupsAsAList() {
		
		System.out.println("________________________________________________________________________________________");
		System.out.println("                                      Grupos                                          ");
		System.out.println("________________________________________________________________________________________");
		for(int i=0; i<groups.size();i++) {
			System.out.print((i+1) + ". ");
			groups.get(i).showDataAsRow();
		}
		
	}
	
	
	
	
	//Teacher Methods
	public List<Teacher> getTeachers() {
		return teachers;
	}

	public void setTeachers(List<Teacher> teachers) {
		this.teachers = teachers;
	}
	
	public void addTeacher(Teacher o) {
		this.teachers.add(o);
	}
	
	
	public void setTeacherByIndex(Teacher o, int index) {
		teachers.set(index, o);
	}
	
	public void setTeacherByID(Teacher o, UUID id) {
		
		teachers.set(getTeacherIndexById(id), o);
	}
	
	public int getTeacherSize() {
		
		return teachers.size();
	}
	
	public int getTeacherIndexById(UUID id) {
	    int index = 0;
     	for(int i = 0; i < teachers.size(); i++) {
 			if(teachers.get(i).getId() == id) {
 				index = i;	
 			}	
 		}	
     	return index;
    }
	
	
	public Teacher getTeacherById(UUID id) {
        int index = 0;
    	for(int i = 0; i < teachers.size(); i++) {
			if(teachers.get(i).getId() == id) {
				index = i;
			}
		}
    	return teachers.get(index);
	}
	
	public Teacher getTeacherByIndex(int index) {
       	return teachers.get(index);
	}
	
	public boolean teacherExists(UUID id) {
	   	boolean teacherExists = false;
	        for(int i = 0; i < teachers.size(); i++) {
				if(teachers.get(i).getId() == id) {
					teacherExists = true;	
				}
			}
	   	return teacherExists;
	 }
	
	public int selectTeacherFromCatalog() {
    	int index = 0;
    	
    	System.out.println();
    	showTeachersAsAList();
    	System.out.println();
    	
      	do {
    		System.out.print("Ingrese el índice del maestro: ");
        	index = scanner.sc.nextInt();
        	index = index - 1;
        	if(index < 0 || index >teachers.size()) {
        		System.out.println("Indice inválido.");
        	}
    	}while(index < 0 || index >teachers.size());
    	
    	return index;
    }
	
	public void assingSubjectToTeacher(UUID id, int index) {
		teachers.get(index).addSubjectId(id);
	}
	
	public void assingGroupToTeacher(UUID id, int index) {
		teachers.get(index).addGroupId(id);
		
	}
	
	public void showTeachersAsATable() {
		
		System.out.println("________________________________________________________________________________________");
		System.out.println("                                     Maestros                                           ");
		System.out.println("________________________________________________________________________________________");
		for(int i=0; i<teachers.size();i++) {
			System.out.print((i+1) + ". ");
			teachers.get(i).showDataAsForm();
			System.out.println("________________________________________________________________________\n");
		}
		
	}
	
	public void showTeachersAsAList() {
		
		System.out.println("________________________________________________________________________________________");
		System.out.println("                                      Maestros                                          ");
		System.out.println("________________________________________________________________________________________");
		for(int i=0; i<teachers.size();i++) {
			System.out.print((i+1) + ". ");
			teachers.get(i).showDataAsRow();
		}
		
	}
	
	
	
	
	//Student Methods
	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}
	
	public void addStudent(Student o) {
		this.students.add(o);
	}
	
	
	public void setStudentByIndex(Student o, int index) {
		students.set(index, o);
	}
	
	public void setStudentByID(Student o, UUID id) {
		
		students.set(getStudentIndexById(id), o);
	}
	
	public int getStudentsSize() {
		
		return students.size();
	}
	
	public int getStudentIndexById(UUID id) {
	    int index = 0;
     	for(int i = 0; i < students.size(); i++) {
 			if(students.get(i).getId() == id) {
 				index = i;	
 			}	
 		}	
     	return index;
    }
	
	
	public Student getStudentById(UUID id) {
        int index = 0;
    	for(int i = 0; i < students.size(); i++) {
			if(students.get(i).getId() == id) {
				index = i;
			}
		}
    	return students.get(index);
	}
	
	public Student getStudentByIndex(int index) {
       	return students.get(index);
	}
	
	public boolean studentExists(UUID id) {
	   	boolean studentExists = false;
	        for(int i = 0; i < students.size(); i++) {
				if(students.get(i).getId() == id) {
					studentExists = true;	
				}
			}
	   	return studentExists;
	 }
	
	public int selectStudentFromCatalog() {
    	int index = 0;
    	
    	System.out.println();
    	showStudentsAsAList();
    	System.out.println();
    	
    	do {
    		System.out.print("Ingrese el índice del alumno: ");
        	index = scanner.sc.nextInt();
        	index = index - 1;
        	if(index < 0 || index >students.size()) {
        		System.out.println("Indice inválido.");
        	}
    	}while(index < 0 || index >students.size());
    	
    	return index;
    }
	
	public void addEnrolledSubject(UUID id, int index) {
		students.get(index).addSubject(id);
	}
	
	public void showStudentssAsATable() {
		
		System.out.println("________________________________________________________________________________________");
		System.out.println("                                     Materias                                           ");
		System.out.println("________________________________________________________________________________________");
		for(int i=0; i<students.size();i++) {
			System.out.print((i+1) + ". ");
			students.get(i).showDataAsForm();
			System.out.println("________________________________________________________________________\n");
		}
		
	}
	
	public void showStudentsAsAList() {
		
		System.out.println("________________________________________________________________________________________");
		System.out.println("                                      Materias                                          ");
		System.out.println("________________________________________________________________________________________");
		for(int i=0; i<students.size();i++) {
			System.out.print((i+1) + ". ");
			students.get(i).showDataAsRow();
		}
		
	}
	
	
	
	
	
    
    
    
    
}
