package Unit_01;
/* 
   -Normally an Array is a collection of similar types of similar types of elements which has contiguous memory location.
   -java array is an object which contains element of a similar data type.
   - We can store only a fixed set of elements in a Java array
   - size limit issue:
      - we can store only the fixed size of elements in the array
      - It does not grow its size at runtime
      - To solve this problem, collection framework is used in java which grows automatically
    
   -There are two types of array in java
      -single dimensional array 
      -multidimensional array 
    
   -declare an Array in java-
   
     DataType arrayRefvar[];
     OR
     DataType [] arrayRefvar;
     
 */

public class P6_Task01_ArraysInJava 
{
	public static void main(String [] args)
	{
		//Declaration
		int array1[];
		
		int[] array2;
		int []array3;
		
		// Can not do it as we have not provide it any memory /space yet!
		// array1[0]=1;
		
		//Initialization,during initialization we have to provide the size of the array
		
		array1= new int[6]; //{1,2,3,4};
		
		// Assigning values to the java array 
		for (int i=0;i<array1.length;i++) // length is the property of array
			array1[i]=i;
		
		int array4[]= {33,3,4,5}; // declaration,instantiation and initialiazation
		
		// passing array to method
		arrayAsParameter(array4);
		
		// passing anonymous array in a method
		arrayAsParameter(new int[] {33,3,4,5});
		
		// Returning Array from the Method
		int[] array5=arrayAsReturnType();
		System.out.println(array5.toString());
		
		// Array index out of bound exception
		int arr[]= {50,60,70,80};
		for(int i=0;i<= arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		
		//MultiDimensional Array in java
		int[][] arr6= new int[3][3];//3 row and 3 column
		
		for(int i=0,j=0;i<3 && j<3;i++,j++)
		{
			System.out.println(arr6[i][j]);
		}
		
		int counter=0;
		for(int i=0,j=0;i<3 && j<3;i++,j++)
		{
			counter++;
			arr6[i][j]=counter;
		}
		
		for(int i=0,j=0;i<3 && j<3;i++,j++)
		{
			System.out.println(arr6[i][j]);
		}
		
		
 		}
	
	static void arrayAsParameter(int arr[]) // declare empty array as parameter
	{
		for(int i=0;i<arr.length;i++) // length is the property of array
		  System.out.println(arr[i]);
	}
     
	 // Returning Array from the Method
	 static int [] arrayAsReturnType()
	 {
		 int array4[]= {33,3,4,5};
		 return array4;
	 }

}
