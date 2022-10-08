package misc;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;
import java.util.logging.Logger;
import java.util.logging.Level;

public class PropertyFile {
	
	
	public class SubjectPropertyFile {
		private Properties subjectProperties;
		private boolean fileExists;
		
		public SubjectPropertyFile() {
			subjectProperties = new Properties();
		}

		public Properties getSubjectProperties() {
			return subjectProperties;
		}

		public void setSubjectProperties(Properties subjectProperties) {
			this.subjectProperties = subjectProperties;
		}

		public boolean isFileExists() {
			return fileExists;
		}

		public void setFileExists(boolean fileExists) {
			this.fileExists = fileExists;
		}
		
		
		public void open() {
			try {
				File file = new File("subjects.config.properties");
				if(file.isFile() && file.canRead()) {
					InputStream input = new FileInputStream("subjects.config.properties");
					subjectProperties.load(input);
					input.close();
					fileExists = true;
					
				}else {
					fileExists = false;
				}
				
			}catch(IOException e) {
				Logger.getLogger(SubjectPropertyFile.class.getName()).log(Level.SEVERE, "SubjectPropertyFile", e);
				
			}
			
		}
		
		
		
		public String getProperty(String key) {
		return subjectProperties.getProperty(key);
			
		}
	
	    public void setProperty(String key, String value) {
	    	subjectProperties.setProperty(key, value);
	    	
	    }
	
		
	    public boolean save() {
	    	boolean response;
	    	try {
	    		OutputStream os = new FileOutputStream("subjects.config.properties");
	    		subjectProperties.store(os, "Configuración");
	    		os.flush();
	    		os.close();
	    		response = true;
	    	}catch(IOException e) {
	    		response = false;
	    		Logger.getLogger(SubjectPropertyFile.class.getName()).log(Level.SEVERE, "SubjectPropertyFile", e);
	    	}
	    	
	    	return response;
	    }
	    
		
		
	}
	
	
	
	
	
	public class GroupPropertyFile {
		private Properties groupProperties;
		private boolean fileExists;
		
		public GroupPropertyFile() {
			groupProperties = new Properties();
		}

		public Properties getGroupProperties() {
			return groupProperties;
		}

		public void setGroupProperties(Properties groupProperties) {
			this.groupProperties = groupProperties;
		}

		public boolean isFileExists() {
			return fileExists;
		}

		public void setFileExists(boolean fileExists) {
			this.fileExists = fileExists;
		}
		
		public void open() {
			try {
				File file = new File("groups.config.properties");
				if(file.isFile() && file.canRead()) {
					InputStream input = new FileInputStream("groups.config.properties");
					groupProperties.load(input);
					input.close();
					fileExists = true;
					
				}else {
					fileExists = false;
				}
				
			}catch(IOException e) {
				Logger.getLogger(GroupPropertyFile.class.getName()).log(Level.SEVERE, "GroupPropertyFile", e);
				
			}
			
		}
		
		
		
		public String getProperty(String key) {
		return groupProperties.getProperty(key);
			
		}
	
	    public void setProperty(String key, String value) {
	    	groupProperties.setProperty(key, value);
	    	
	    }
	
		
	    public boolean save() {
	    	boolean response;
	    	try {
	    		OutputStream os = new FileOutputStream("groups.config.properties");
	    		groupProperties.store(os, "Configuración");
	    		os.flush();
	    		os.close();
	    		response = true;
	    	}catch(IOException e) {
	    		response = false;
	    		Logger.getLogger(GroupPropertyFile.class.getName()).log(Level.SEVERE, "GroupPropertyFile", e);
	    	}
	    	
	    	return response;
	    }
		
	}
	
	
	
	
	
	
	public class TeacherPropertyFile {
		private Properties teacherProperties;
		private boolean fileExists;
		
		public TeacherPropertyFile() {
			teacherProperties = new Properties();
		}

		public Properties getTeacherProperties() {
			return teacherProperties;
		}

		public void setTeacherProperties(Properties teacherProperties) {
			this.teacherProperties = teacherProperties;
		}

		public boolean isFileExists() {
			return fileExists;
		}

		public void setFileExists(boolean fileExists) {
			this.fileExists = fileExists;
		}
		
		public void open() {
			try {
				File file = new File("teachers.config.properties");
				if(file.isFile() && file.canRead()) {
					InputStream input = new FileInputStream("teachers.config.properties");
					teacherProperties.load(input);
					input.close();
					fileExists = true;
					
				}else {
					fileExists = false;
				}
				
			}catch(IOException e) {
				Logger.getLogger(TeacherPropertyFile.class.getName()).log(Level.SEVERE, "TeacherPropertyFile", e);
				
			}
			
		}
		
		
		
		public String getProperty(String key) {
		return teacherProperties.getProperty(key);
			
		}
	
	    public void setProperty(String key, String value) {
	    	teacherProperties.setProperty(key, value);
	    	
	    }
	
		
	    public boolean save() {
	    	boolean response;
	    	try {
	    		OutputStream os = new FileOutputStream("teachers.config.properties");
	    		teacherProperties.store(os, "Configuración");
	    		os.flush();
	    		os.close();
	    		response = true;
	    	}catch(IOException e) {
	    		response = false;
	    		Logger.getLogger(TeacherPropertyFile.class.getName()).log(Level.SEVERE, "TeacherPropertyFile", e);
	    	}
	    	
	    	return response;
	    }
		
		
		
	}
	
	
	
	
	
	
	public class StudentPropertyFile {
		private Properties studentProperties;
		private boolean fileExists;
		
		public StudentPropertyFile() {
			studentProperties = new Properties();
		}

		public Properties getStudentProperties() {
			return studentProperties;
		}

		public void setStudentProperties(Properties studentProperties) {
			this.studentProperties = studentProperties;
		}

		public boolean isFileExists() {
			return fileExists;
		}

		public void setFileExists(boolean fileExists) {
			this.fileExists = fileExists;
		}
		
		public void open() {
			try {
				File file = new File("students.config.properties");
				if(file.isFile() && file.canRead()) {
					InputStream input = new FileInputStream("students.config.properties");
					studentProperties.load(input);
					input.close();
					fileExists = true;
					
				}else {
					fileExists = false;
				}
				
			}catch(IOException e) {
				Logger.getLogger(StudentPropertyFile.class.getName()).log(Level.SEVERE, "StudentPropertyFile", e);
				
			}
			
		}
		
		
		
		public String getProperty(String key) {
		return studentProperties.getProperty(key);
			
		}
	
	    public void setProperty(String key, String value) {
	    	studentProperties.setProperty(key, value);
	    	
	    }
	
		
	    public boolean save() {
	    	boolean response;
	    	try {
	    		OutputStream os = new FileOutputStream("student s.config.properties");
	    		studentProperties.store(os, "Configuración");
	    		os.flush();
	    		os.close();
	    		response = true;
	    	}catch(IOException e) {
	    		response = false;
	    		Logger.getLogger(StudentPropertyFile.class.getName()).log(Level.SEVERE, "StudentPropertyFile", e);
	    	}
	    	
	    	return response;
	    }
		
		
	}
	
	
	

}
