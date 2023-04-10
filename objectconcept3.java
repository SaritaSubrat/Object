
public class objectconcept3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		E obt=new E();
		obt.display();
		obt.sub();
		obt.multi();
		K sbt=new K();
		sbt.sum();
		sbt.multi();
	}
}

class R{
	int a=10;
	int b=20;
			void multi() {
			System.out.println(a*b)	;
			}
}
class K extends R{
	int d=5;
	int b=3;
	int a=4;
	void sum() {
		System.out.println(a+b+d);
	}
}
	class E extends R{
		int a=20;
		int b=10;
		void display() {
			System.out.println("this is hierarchy");
		}
		void sub() {
			System.out.println(a-b);
			
			
		}
	

}

	
	

