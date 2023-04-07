
public class Arrayinjava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]= {10,30,40,20,12,80,60};
int maxNumber=a[0];
for(int i=0;i<a.length;i++) {
	if(maxNumber<a[i]) {
		maxNumber=a[i];
		
	}
}
System.out.println(maxNumber);
	}

}
