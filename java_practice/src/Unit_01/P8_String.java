package Unit_01;

/* Problem Statement:

P8_String: 

(Create separate logic in separate function)

F1 - Check the entered string is palindrome or not? 
  		String s = "75457"
  		Output: Yes it is a palindrome or No it is not a palindrome.

F2 - Make a reverse of a string using?
F3 - String Compare: Check if the strings are equal or not?

 * */

public class P8_String {

	public static void main(String[] args) {

		QuestionsOnString obj = new QuestionsOnString();

		String s1 = new String("75457");
		String s2 = new String("7545a");

		obj.palindromeOrNot(s1);
		obj.reverseOfAString(s2);
		obj.stringEqualOrNot(s1, s2);

	}

}

class QuestionsOnString {

	void palindromeOrNot(String s)
	{
		  String rev="";
		  int length = s.length();
		  for ( int i = length - 1; i >= 0; i-- )
		         rev = rev + s.charAt(i);
		 
		      if (s.equals(rev))
		         System.out.println(s+" is a palindrome");
		      else
		         System.out.println(s+" is not a palindrome");
		  
		

	}

	void reverseOfAString(String s) {
		String rev="";
		  int length = s.length();
		  for ( int i = length - 1; i >= 0; i-- )
		         rev = rev + s.charAt(i);
		  
		  System.out.println("Reverse of the given string is "+rev);

	}
	
	void stringEqualOrNot(String s1,String s2)
	{
		System.out.println(s1.equals(s2));
		
	}
}