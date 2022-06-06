
public class Student {
	private int studeny_id;
	private String name_s;
	private String major;
	public int getStudeny_id() {
		return studeny_id;
	}
	public void setStudeny_id(int studeny_id) {
		this.studeny_id = studeny_id;
	}
	public String getName_s() {
		return name_s;
	}
	public void setName_s(String name_s) {
		this.name_s = name_s;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	@Override
	public String toString() {
		return "Student [studeny_id=" + studeny_id + ", name_s=" + name_s + ", major=" + major + "]";
	}

}
