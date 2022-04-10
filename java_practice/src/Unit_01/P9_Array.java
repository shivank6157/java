package Unit_01;

/* Tasks given below:
		obj.sortAnArray(array);
		obj.findTheDuplicateElements(array);
		obj.findSecondLargestAndSecondSmallestElement(array);
		obj.leftRotationInAnArray(array); 
		obj.removeElementInArray(array);//(Optional)
 */

public class P9_Array {

	public static void main(String[] args) {

		int[] array = { 1, 2, 3, 4, 5, 4, 6, 2, 3 };
		int n= 9;
		int r=3;
		int removeindex=2;

		QuestionsOnArray obj = new QuestionsOnArray();
		obj.sortAnArray(array,n);
		obj.findTheDuplicateElements(array,n);
		obj.findSecondLargestAndSecondSmallestElement(array,n);
		obj.leftRotationInAnArray(array,r,n);
		obj.removeElementInArray(array,removeindex,n); // (Optional)

	}

}

class QuestionsOnArray {

	void sortAnArray(int[] arr,int n) 
	{
	    for(int i=0;i<n-1;i++)
	    {
	    	for(int j=0;j<n-i-1;j++)
	    	{
	    		if(arr[j]>arr[j+1])
	    		{
	    			int temp=arr[j];
	    			arr[j]=arr[j+1];
	    			arr[j+1]=temp;
	    		}
	    	}
	    }
	    System.out.println("Sorted array is ");
	    for(int i=0;i<n;i++)
	    {
	    	System.out.print(arr[i]+" ");
	    }
	    System.out.println();

	}

	void findTheDuplicateElements(int[] arr,int n) 
	{
		System.out.println("Duplicate elements in array are ");
		for(int i=0;i<n;i++)
		{
			for (int j=i+1;j<n;j++)
			{
				if(arr[i]==arr[j])
					System.out.print(arr[i]);
			}
		}
		  System.out.println();
		

	}

	void findSecondLargestAndSecondSmallestElement(int[] arr,int n)
	{
		for(int i=0;i<n-1;i++)
		{
			for(int j=0;j<n-i-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
				   int temp=arr[j];
				   arr[j]=arr[j+1];
				   arr[j+1]=temp;
			    }
			}
		}
		 
		System.out.println("Second smallest = "+(arr[1]));
		System.out.println("Second largest = "+(arr[n-2]));
	}

	void leftRotationInAnArray(int[] arr,int r,int n) 
	{
		  for(int i = 0; i < r; i++){  
	            int j, first;  
	            first = arr[0];  
	          
	            for(j = 0; j < arr.length-1; j++){    
	                arr[j] = arr[j+1];  
	            }    
	            arr[j] = first;  
	        }  
		  
		  System.out.println("Array after three right rotations ");
		  for(int i=0;i<n;i++)
		  {
			  System.out.print(arr[i]) ;
		  }
		  
		  System.out.println();
		

	}

	void removeElementInArray(int[] arr,int removeIndex,int n) 
	{
		  for(int i = removeIndex; i < arr.length -1; i++){
		        arr[i] = arr[i + 1];
		      }
		  
		  System.out.println("After removing element from index 2 Array is ");
		  for(int i=0;i<n;i++)
		  {
			  System.out.print(arr[i]);
		  }

	}
	
	

}
