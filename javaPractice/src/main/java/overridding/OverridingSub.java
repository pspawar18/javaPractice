package overridding;

public class OverridingSub extends Overriding {

	public static void main(String[] args) {

		OverridingSub obj = new OverridingSub();
		obj.method();

	}

	public void method() {
		System.out.println("Test of Sub class");
	}

}
