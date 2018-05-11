
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		System.out.println(4%4);
//		int counter = 0;
//		for(int i=0; i < 30; i++) {
//			if(i%4 != 0) {
//				counter = counter+1;
//			}
//		}
		
//		System.out.println(counter);
		int b[]={1,2,3,4};
		int a[]={1,9,3,5};
		
		Test.func(a, b);
	}
	
	public static void func(int a[], int b[]) {
		int counter = 0;
		for(int i=0; i<a.length; i++) {
			for(int x=0; x<a.length; x++) {
				if(a[i] == b[x]) {
					counter++;
					System.out.println("The common elements are: " + b[x]);
				}
			}
		}
		System.out.println("There are " + counter + "common elements");
	}

}
