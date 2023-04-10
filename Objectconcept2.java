
public class Objectconcept2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
john t=new john();
t.display();
t.sub();
t.sum();
t.show();

	}

}
class P{
	int a=20;
	int b=10;
	int c=5;
	void sum() {
		System.out.println(a+b+c);
	}
}
class Q extends P{
	int d=30;
	int k=10;
	void sub() {
		System.out.println(d-k);
	}
}
class Mac extends Q{
	int a=10;
	
	void show() {
		System.out.println("this is multilevel");
		
	}
}
class john extends Mac{
	int d=5;
	void display() {
		System.out.println("multilevelobj");
	}

	}
