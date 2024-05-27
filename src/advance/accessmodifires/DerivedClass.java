package advance.accessmodifires;

public class DerivedClass {

	public String derivedVariable = "Derived Variable";
	
	public void baseMethod() {
		System.out.println("Derived Method");
	}
	
	public void derivedMethod() {
		baseMethod();
	}
}
