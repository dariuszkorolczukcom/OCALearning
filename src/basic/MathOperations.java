package src.basic;

public class MathOperations {
	
	public static void main(String[] args){
		String path = System.getProperty("java.library.path");
		System.out.println(path);
	}
    public int add(int one, int two){
        return one + two;
    }
		public int substract(int one, int two) {
			return one - two;
		}
		public int multiply(int one, int two) {
			return one * two;
		}
		public int divide(int one, int two) {
		 return one / two;
		}
		public int modulo(int one, int two) {
			return one % two;
		}
}