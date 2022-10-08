package dol;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

public class Teacher extends Person implements IShow {
	private String profession;
	private int experienceYears;
	private List<UUID> assingedSubjectsId;
	private List<UUID> assingedGroupsId;
	
	
	
	
	
	public Teacher() {
		super();
		assingedSubjectsId = new ArrayList<>();
		assingedGroupsId = new ArrayList<>();
	}

	public String getProfession() {
		return profession;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}

	public int getExperienceYears() {
		return experienceYears;
	}

	public void setExperienceYears(int experienceYears) {
		this.experienceYears = experienceYears;
	}

	public List<UUID> getAssingedSujects() {
		return assingedSubjectsId;
	}

	public void setAssingedSujects(List<UUID> assingedSujects) {
		this.assingedSubjectsId = assingedSujects;
	}

	public List<UUID> getAssingedGroups() {
		return assingedGroupsId;
	}

	public void setAssingedGroups(List<UUID> assingedGroups) {
		this.assingedGroupsId = assingedGroups;
	}

	@Override
	public String getFirstName() {
		// TODO Auto-generated method stub
		return super.getFirstName();
	}

	@Override
	public void setFirstName(String firstName) {
		// TODO Auto-generated method stub
		super.setFirstName(firstName);
	}

	@Override
	public String getMiddleName() {
		// TODO Auto-generated method stub
		return super.getMiddleName();
	}

	@Override
	public void setMiddleName(String middleName) {
		// TODO Auto-generated method stub
		super.setMiddleName(middleName);
	}

	@Override
	public String getSurName() {
		// TODO Auto-generated method stub
		return super.getSurName();
	}

	@Override
	public void setSurName(String surName) {
		// TODO Auto-generated method stub
		super.setSurName(surName);
	}

	@Override
	public String getSecondSurName() {
		// TODO Auto-generated method stub
		return super.getSecondSurName();
	}

	@Override
	public void setSecondSurName(String secondSurName) {
		// TODO Auto-generated method stub
		super.setSecondSurName(secondSurName);
	}

	@Override
	public Gender getGender() {
		// TODO Auto-generated method stub
		return super.getGender();
	}

	@Override
	public void setGender(Gender gender) {
		// TODO Auto-generated method stub
		super.setGender(gender);
	}

	@Override
	public Date getBirthDate() {
		// TODO Auto-generated method stub
		return super.getBirthDate();
	}

	@Override
	public void setBirthDate(Date birthDate) {
		// TODO Auto-generated method stub
		super.setBirthDate(birthDate);
	}

	@Override
	public int getAge() {
		// TODO Auto-generated method stub
		return super.getAge();
	}

	@Override
	public void setAge(int age) {
		// TODO Auto-generated method stub
		super.setAge(age);
	}

	@Override
	public UUID getId() {
		// TODO Auto-generated method stub
		return super.getId();
	}

	
	
	public String genderToString() {
		if(getGender() == Gender.FEMALE) {
			return "Mujer";
		}else {
			
			return "Hombre";
		}
		
	}
	
	
	public void addSubjectId(UUID id) {
		assingedSubjectsId.add(id);
	}
	
	public void addGroupId(UUID id) {
		assingedGroupsId.add(id);
	}
	
	
	
	
	
	@Override
	public void showDataAsRow() {
		System.out.printf("Numero de identificacion: %s Primer nombre: %s Segundo nombre: %s Primer apellido: %s Segundo apellido: %s Genero: %s Fecha de nacimiento: %D Edad: %d Profesion: %s Años de experiencia: %d",
				getId(),
				getFirstName(),
				getMiddleName(),
				getSurName(),
				getSecondSurName(),
				genderToString(),
				getBirthDate(),
				getAge(),
				getProfession(),
				getExperienceYears());
		System.out.println("==Materias asignadas==");
		for(int i = 0; i < assingedSubjectsId.size(); i++) {
			System.out.println(assingedSubjectsId.get(i));
		}
		System.out.println("==Grupos asignados==");
		for(int i = 0; i < assingedGroupsId.size(); i++) {
			System.out.println(assingedGroupsId.get(i));
		}
		
	}

	@Override
	public void showDataAsForm() {
		System.out.printf("\nNumero de identificacion: %s", getId().toString());
		System.out.printf("\nPrimer nombre: %s", getFirstName());
		System.out.printf("\nSegundo nombre: %s", getMiddleName());
		System.out.printf("\nPrimer apellido: %s", getSurName());
		System.out.printf("\nSegundo apellido: %s", getSecondSurName());
		System.out.printf("\nGenero: %s", genderToString());
		System.out.printf("\nFecha de nacimiento: %s", getBirthDate());
		System.out.printf("\nEdad: %s", getAge());
		System.out.printf("\nProfesion: %s", getProfession());
		System.out.printf("\nAños de experiencia: %s", getExperienceYears());

		
	}
	
	
	
	
	
	
	
	
	
	

}
