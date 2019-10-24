package src.basic;
import java.util.ArrayList;
import java.util.Collection;
class GenericsDemo {

	    public static void validateTillStringType(Collection<? super Number> collection){
	        //Wild card with Lower bound
	        // Accept collection of objects of type string or SUPER-CLASS of String
	    }

	    public static void validateStringTypes(Collection<? extends Number> collection){
	        //Wild card with Upper bound
	        // Accept collection of objects of type string or SUB-CLASS of String
	    }

	    public static void main(String [] args){
				//super
	        GenericsDemo.validateTillStringType(new ArrayList<Object>());//OK

					GenericsDemo.validateTillStringType(new ArrayList<Number>());//OK

	     // GenericsDemo.validateTillStringType(new ArrayList<Integer>());//Error

			 	//extends
	     // GenericsDemo.validateStringTypes(new ArrayList<Object>());//Error

			 	  GenericsDemo.validateStringTypes(new ArrayList<Number>());//OK

	        GenericsDemo.validateStringTypes(new ArrayList<Integer>());//OK

	    }
}
