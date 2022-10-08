package dol;

import java.util.UUID;

public class Subject implements IShow {
	private UUID id;
	private String name;
	private UUID assingedTeacher;
	
	public Subject() {
	
		id = UUID.randomUUID();
		
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


	
	
	
	
	
	

	public UUID getAssingedTeacher() {
		return assingedTeacher;
	}



	public void setAssingedTeacher(UUID assingedTeacher) {
		this.assingedTeacher = assingedTeacher;
	}



	public void setId(UUID id) {
		this.id = id;
	}



	@Override
	public void showDataAsRow() {
		System.out.printf("\nNombre de la materia: %s Numero de identificacion: %s Maestro asignado: $s", 
				getName(),
				getId().toString(),
				getAssingedTeacher().toString());
		
	}



	@Override
	public void showDataAsForm() {
		System.out.printf("\nNombre de la materia: %s", getName());
		System.out.printf("\nNumero de identificacion: %s", getId().toString());
	}
	
	
	

}
