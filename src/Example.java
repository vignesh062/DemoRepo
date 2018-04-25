
public class Example {

	private int i;
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + i;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Example other = (Example) obj;
		if (i != other.i)
			return false;
		return true;
	}
	public static void main(String[] args) {
		Example e1= new Example();
		Example e2= new Example();
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
	}
}
