package concepts;

public class UseEnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(TestEnum x : TestEnum.values())
			System.out.println(x);
	}
	public enum TestEnum {
		A,B,C
	}
}
