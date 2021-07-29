package chap15.Set;

public class Player {
	private String name;
	private String nation;
	public Player(String name) {
		this(name, "");
	}
	public Player(String name, String nation) {
		this.name = name;
		this.nation = nation;
	}
	@Override
	public String toString() {
		return "Player [name=" + name + ", nation=" + nation + "]";
	}
	
	// equals method를 사용하지 않으면 remove 안됨
	public boolean equals(Object obj) {
		String compareValue = obj.toString();
		String thisValue = toString();
		System.out.println("eqauls ");
		return thisValue.equals(compareValue);
	}
	public int hashCode() {
		return toString().hashCode();
	}
}
