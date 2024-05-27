package advance;

import advance.accessmodifires.DerivedClass;

public class OutsideClass {
	
	    public static void main(String[] args) {
	        DerivedClass derived = new DerivedClass();
	        
	     
	        System.out.println("Derived Variable: " + derived.derivedVariable);
	        
	        
	        derived.derivedMethod();
	    }
}
