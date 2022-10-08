package dol;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Group implements IShow {
	private UUID id;
    private String name;
    private List<UUID> studentsId;
    
    public Group() {
    	id = UUID.randomUUID();
    	studentsId = new ArrayList<>();
    }

	public UUID getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<UUID> getStudentsId() {
		return studentsId;
	}

	public void setStudentsId(List<UUID> students) {
		this.studentsId = students;
	}
	
	
	public void addStudentId(UUID id) {
		studentsId.add(id);
		
	}
	
	
	

	@Override
	public void showDataAsRow() {
		System.out.printf("Numero de identificacion: %s Nombre del grupo: %s", 
				getId(),
				getName());
		System.out.println("==Estudiantes inscritos==");
		for(int i = 0; i < studentsId.size(); i++) {
			System.out.println(studentsId.get(i));
		}
		
	}

	@Override
	public void showDataAsForm() {
		System.out.printf("\nNumero de identificacion: %s", getId());
		System.out.printf("\nNombre del grupo: %s", getName
				());
	}
    
    
    

}
