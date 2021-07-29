package chap15.ArrayList;

public class SampleObj {
	private String name;
	public SampleObj(String name) {
		this.name = name;
	}
	public String toString() {
		return name;
	}
	
	@Override
	public boolean equals(Object obj) {
		String currentObj = this.toString();
		String otherObj = obj.toString();
		return currentObj.equals(otherObj);
	}
}
