package q2_a;

public 	class A{
	public int a = 10;
	private int b = 20;
	protected int c = 30;
	int d = 40;
	
	public static void main(String[] args) {
		A a = new A();
		System.out.println(a.a);
		System.out.println(a.b);
		System.out.println(a.c);
		System.out.println(a.d);
	}
	
}

class B extends A{
	
	public static void main(String[] args) {
		B b = new B();
		System.out.println(b.a);
	  //System.out.println(b.b);
		System.out.println(b.c);
		System.out.println(b.d);
	}
}

class C {
	public static void main(String[] args) {
		
		C c = new C();
		System.out.println(c.a);
	  //System.out.println(c.b);
		System.out.println(c.c);
		System.out.println(c.d);
	}
}
