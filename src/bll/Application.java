package bll;

import java.util.List;
import java.util.UUID;

import dol.Catalog;
import dol.Group;
import dol.Student;
import dol.Subject;
import dol.Teacher;


public class Application {
	
	static Catalog ctl = new Catalog();
	
	static public void addSubject(Subject o) {
		ctl.addSubject(o);
	}
	
	static public int selectSubject() {
		return ctl.selectSubjectFromCatalog();
	}
	
	static public int selectTeacher() {
		return ctl.selectTeacherFromCatalog();
	}
	
	static public int selectStudent() {
		return ctl.selectStudentFromCatalog();
	}
	
	static public void setTeacher(String id, int index) {
		UUID id2 = UUID.fromString(id);
		ctl.setTeacher(id2, index);
		
	}

	
	static public void addGroup(Group o) {
		ctl.addGroup(o);
	}
	
	
	static public void addTeacher(Teacher o) {
		ctl.addTeacher(o);
	}
	

	static public void assingGroupToTeacher(String id, int index) {
		UUID id2 = UUID.fromString(id);
		ctl.assingGroupToTeacher(id2, index);
	}
	
	static public void assingSubjectToTeacher(String id, int index) {
		UUID id2 = UUID.fromString(id);
		ctl.assingSubjectToTeacher(id2, index);
	}
	
	static public void addStudent(Student o){
		ctl.addStudent(o);
	}
	
	static public void addEnrolledSubject(String id, int index) {
		UUID id2 = UUID.fromString(id);
		ctl.addEnrolledSubject(id2, index);
	}
	
	
	
	
	static public List<Group> getGroups(){
		return ctl.getGroups();
	}
	
	static public List<Subject> getSubjects(){
		return ctl.getSubjects();
	}
	
	static public List<Teacher> getTeachers(){
		return ctl.getTeachers();
	}
	
	static public List<Student> getStudents(){
		return ctl.getStudents();
	}
	
	
	
	static public void setGroups(List<Group> groups) {
		ctl.setGroups(groups);
	}
	

	static public void setSubjects(List<Subject> subjects) {
		ctl.setSubjects(subjects);
	}
	

	static public void setTeachers(List<Teacher> teachers) {
		ctl.setTeachers(teachers);
	}
	

	static public void setStudents(List<Student> students) {
		ctl.setStudents(students);
	}
	
}
