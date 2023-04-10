
public class Objectconcepts {
	
	
	
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub

D objB= new D();

objB.display();
objB.showdata();
objB.sum();
System.out.println("singlelevel");

	}
}
class A {
	int a=20;
	int b=10;
void sum() {
	System.out.println(a+b);
}
	void showdata() { 
		System.out.println("a+b");
	}
}
class D extends A{
	int c=10;
	void display() {
		System.out.println("this is single level");
	}

	
	}
	