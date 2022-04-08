package Unit_01;

public class P6_Task_02_StringsInJava
{
	 
	public static void main (String args[])
	{
		StringsInJava obj =new StringsInJava();
		obj.StringDefinition();
		obj.charAndString();
	}

}

class StringsInJava
{

void StringDefinition()
{
	String s= "Hello There";
	String s1= new String ("hghghghgj");
	
	System.out.println(s);
	
	// Get the length of the string
	System.out.println(s.length());
	
	//loop through a string
	for(int i=0;i<s.length();i++)
	{
		System.out.println(s.charAt(i));
	}
	
	String first = "Akash";
	String second = "Chauhan";
	
	// Add two strings
	String third = first+second;
	System.out.println(third);
	
	//compare two strings
	boolean result1= first.equals(second);
	System.out.println(result1);
	
	/* Java Strings are immutable 
	 * IN JAVA ,the JVM maintains a string pool to store all of its strings inside memory.
	 * the string pool helps in reusing the strings.
	    - If the string already exists, the new string is not created.
	    - Instead, the new reference ,example points to the already existed string(java).
	    - if the string dooes not exist ,the new string java is created.
	    
	     **/
	
}

/*
 * Character Arrays are mutable but string are not.
 * 
 */

void charAndString()
{
	char[] ch = {'h','e','l','o',' ','e','r'};
	char[] ch2 = {'!','!'};

System.out.println(ch);

for(int i=0;i<ch.length;i++)
{
	System.out.println(ch[i]);
}
	 
String s1= new String(ch);
System.out.println(s1);

// Character arrays are mutable but strings are not;

ch[0]='h';

//s1.charAt(0)='h';

/*
 * join two java strings - '+',can be used to append strings together to form a
 * new string - but not possible in char array
 */
 
s1=s1+'a';// s1 is new object with new memory 

// ch= ch+ch2;

// String to char array

String s2= "GEEKS";
char[] ch4= s2.toCharArray();

//char Array to string

char[] a2= {'A','k','a'};
String s3 = new String(a2);


	
}
}