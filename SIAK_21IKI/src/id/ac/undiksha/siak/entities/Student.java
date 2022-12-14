package id.ac.undiksha.siak.entities;

public class Student extends Person{
	
	private String	nim;
	private String	name;
	private String	address;
	private boolean	gender; // 0 female, 1 male
	private String	studyProgram;
	private String	department;
	private String	faculty;
	
	
	public Student() {
		super();
		this.nim 			= "<invalid nim>";
		this.studyProgram	= "<invalid study program>";
		this.department		= "<invalid department>";
		this.faculty		= "<invalid faculty>";
		
	}
	
	
	
	
	/*public Student(String nim, String name, String address, boolean gender, String studyProgram, String department,
			String faculty) {
		super();
		this.nim = nim;
		this.name = name;
		this.address = address;
		this.gender = gender;
		this.studyProgram = studyProgram;
		this.department = department;
		this.faculty = faculty;
	}*/



	public Student(String name, String address, boolean gender, String nim, String studyProgram, String department, String faculty) {
		super(name, address, gender);
		// TODO Auto-generated constructor stub
		this.nim = nim;
		this.studyProgram = studyProgram;
		this.department = department;
		this.faculty = faculty;
	}



	public void printAllInfo() {
		System.out.println("NIM: " 				+ this.nim);
		System.out.println("Name: " 			+ getName());
		System.out.println("Address: " 			+ getAddress());
		System.out.println("Study Program: " 	+ this.studyProgram);
		System.out.println("Department: " 		+ this.department);
		System.out.println("Faculty:" 			+ this.faculty);
		
		System.out.println("Gender: " + (gender ? "Male" : "Female"));
	}
	
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}

	public String getNim() {
		return nim;
	}

	public void setNim(String nim) {
		this.nim = nim;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public boolean isGender() {
		return gender;
	}

	public void setGender(boolean gender) {
		this.gender = gender;
	}

	public String getStudyProgram() {
		return studyProgram;
	}

	public void setStudyProgram(String studyProgram) {
		this.studyProgram = studyProgram;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getFaculty() {
		return faculty;
	}

	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}
}
