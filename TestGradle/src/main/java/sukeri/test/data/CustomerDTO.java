package sukeri.test.data;

public class CustomerDTO {
	private String name;
	private String firstName;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void calculateValue(int in) {
		int curVal = in +10;
		curVal = curVal+20*10+40*1+2+3+4+5+6+7+8+9+10+11;
	}

}
