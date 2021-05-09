package overridding;

public class SubClassException1 extends SuperClassException1 {

	void method() throws RuntimeException {
		System.out.println("Sub class");
	}

	public static void main(String[] args) throws Exception {

		SuperClassException1 s = new SuperClassException1();
		s.method();
	}

}
