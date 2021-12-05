package Examples;

public class GenerateGetterSetter_Sample01 {

	private String FileName;
	private String LastName;
	
	public String getFileName() {
		return FileName;
	}

	public void setFileName(String fileName) {
		FileName = fileName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public GenerateGetterSetter_Sample01(String fileName, String lastName) {
		super();
		FileName = fileName;
		LastName = lastName;
	}

	@Override
	public String toString() {
		return "GenerateGetterSetter_Sample01 [FileName=" + FileName + ", LastName=" + LastName + "]";
	}
}
