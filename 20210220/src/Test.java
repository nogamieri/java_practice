
public class Test {
	public static void main(String args[]){
		int num = 8;
		int array[] = {10 , 20}; 
		
		System.out.println("num = " + num);
		System.out.println("array[0] = " +array[0]);
		
		test(num,array);
		

		System.out.println("num = " + num);
		System.out.println("array[0] = " +array[0]);
		
	}
	
	private static void test(int num, int array[]) {
		num = 5;
		array[0]= 21;
	}
	

}
