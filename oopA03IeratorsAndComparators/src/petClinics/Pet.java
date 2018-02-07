package petClinics;

public class Pet {

	private String name; 
	private Integer age; 
	private String kind;
	
	public Pet(String name, int age, String kind) {
		super();
		this.name = name;
		this.age = age;
		this.kind = kind;
	}
	
	public Integer getAge() {
		return age;
	}
	public String getName() {
		return name;
	}
	public String getKind() {
		return kind;
	}
	
	@Override
    public String toString() {
        return String.format("%s %s %s",
                this.getName(), this.getAge(), this.getKind());
    }
}
