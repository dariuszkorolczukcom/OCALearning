package src.basic;

class Examples {
	public static void main(String...args) {
		System.out.println("true&false: "+(true&false));
		System.out.println("\ntrue&true: "+(true&true));
		System.out.println("\ntrue&&false: "+(true&&false));
		System.out.println("\ntrue&&true: "+(true&&true));
		System.out.println("\ntrue|false: "+(true|false));
		System.out.println("\ntrue|true: "+(true|true));
		System.out.println("\nfalse||true: "+(false||true));
		System.out.println("\nfalse||false: "+(false||false));
		System.out.println("\ntrue^false: "+(true^false));
		System.out.println("\ntrue^true: "+(true^true));
		System.out.println("\nfalse^true: "+(false^true));
		System.out.println("\nfalse^false: "+(false^false));

		int a=0,b=0,c=0,d=0;

		boolean e = a++==1&b++==1;
		boolean f = c++==1&&d++==1;
		System.out.println("boolean e = a++==1&b++==1\nboolean f = c++==1&&d++==1");
		System.out.printf("a: %d b: %d c: %d d: %d \n bool e: %b bool f: %b\n\n",a,b,c,d,e,f);
		a=0;b=0;c=0;d=0;
		e = ++a==1&++b==1;
		f = ++c==1&&++d==1;
		System.out.println("boolean e = ++a==1&++b==1\nboolean f = ++c==1&&++d==1");
		System.out.printf("a: %d b: %d c: %d d: %d \n bool e: %b bool f: %b\n\n",a,b,c,d,e,f);
		a=0;b=0;c=0;d=0;
		e = a++==1|b++==1;
		f = c++==1||d++==1;
		System.out.println("boolean e = a++==1|b++==1\nboolean f = c++==1||d++==1");
		System.out.printf("a: %d b: %d c: %d d: %d \n bool e: %b bool f: %b\n\n",a,b,c,d,e,f);
		a=0;b=0;c=0;d=0;
		e = ++a==1|++b==1;
		f = ++c==1||++d==1;
		System.out.println("boolean e = ++a==1|++b==1\nboolean f = ++c==1||++d==1");
		System.out.printf("a: %d b: %d c: %d d: %d \n bool e: %b bool f: %b\n\n",a,b,c,d,e,f);
	}
}
