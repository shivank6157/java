package Unit_03;
import java.util.Scanner;

/*P14_ExceptionHanding.java:
1- obj.basicException() {/ by zero}
2- obj.handleException() {use of try and catch}
3- obj.multipleCatch() {multiple catch for one try block}
4- obj.inputMismatchException() {nextInt() and enter string}
5- obj.stackOverFlowError() {unstoppable recursion}
6- obj.indexOutOfBoundException() {a[10] in a[3] array}
7- obj.nullPointerException() {s.lenght() when s is null}
8- obj.useOfThrow() {manually throw exception}
9- obj.useOfThrows&Finally() {declare what possible exceptions may occur, finally always run}*/

class exception{
	void basicException() {
		int b=0;
		int a=10/b;
		System.out.println(a);
		System.out.println("Done!");
	}
	void handelException() {
		try {
			int b=0;
			int a=10/b;
			System.out.println(a);
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
			System.out.println("Done!");
		}
	}
	void multipleCatch() {
		
		try {
			int b=0;
			int a=10/b;
			System.out.println(a);
		}//child class exception came first 
		catch (ArithmeticException e) {
			System.out.println(e.getMessage() + " Arithmeetic!!!!");
			System.out.println("Done!");
		}catch(Exception e) {
			System.out.println(e.getMessage() + " exception!!");
		}
	}
	void inputMinsmatchException() {
		try {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the number:");
		    int number=sc.nextInt();
		    System.out.println("You entered:" + number);
		} catch (InputMismatchException e) {
			System.out.println(e + " Resolved");
		}
		
		System.out.println("Done!!!!!");
	}
    void stackOverFlowError(int i) {
		try {
			while(i>0) {
	    		i++;
	    		stackOverFlowError(i);
	    	}
			//this is error cant resolved because it is not a ecption
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("Other code execute!!");
    	
	}
    
    void indexOutofBoundException() {
	  try {
		int[] num= {1,2,3,4};
		System.out.println(num[10]);
	} catch (IndexOutOfBoundsException e) {
		System.out.println(e.getMessage());
	}
	  System.out.println("Done!!");
    }
    void nullPointerException() {
	
     }
    void useofThrow(int age) throws Exception
    {
    	if(age<18)
    	{
    		throw new Exception();
    	}
    	 else
    		{
    			System.out.println("you are allowed to enter");
    		}
    	}
    	
    
    void useofThrow_And_Finally()
    {
    
    	
    }
     

}
public class P14_ExceptionHandling {

	
public static void main(String args[]) {
	exception obj=new exception();
//	obj.basicException();
//	obj.handelException();
//	obj.multipleCatch();
//	obj.inputMinsmatchException();
//	obj.stackOverFlowError(2);
	obj.indexOutofBoundException();
	obj.nullPointerException();
	obj.useofThrow(18);
	obj.useofThrow_And_Finally();
}
}
