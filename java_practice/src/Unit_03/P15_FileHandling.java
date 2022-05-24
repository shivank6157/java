package Unit_03;

import java.io.BufferedReader;

public class P15_FileHandling {

	public static void main(String[] args) {
		
		
		FileHandlingInJava obj= new FileHandlingInJava();
		obj.takeInputFromAFileNotFromConsole();
//		obj.saveOutputIntoFile();
//		obj.createALogFile();
		

	}

}

class FileHandlingInJava
{
	void takeInputFromAFileNotFromConsole()
	{
		String file1= "input.txt";
		File file=new File(file1);
		
		BufferedReader br = new BufferedReader(new FileReader(file));
		
		String st;
		while((st=br.readLine())!=null)
		{
			System.out.println(st);
		}
		
		List<String>listofStrings=new ArrayList<String>();
		
		String Line=br.readLine();
		
		while(Line!=null)
		{
			listofStrings.add(Line);
			Line=br.readLine();
		}
		
		for(String str: listofStrings)
		{
			System.out.println(str);
		}
		
		System.out.println("\n");
		br.close();
	}
	
	void saveOutputIntoFile()
	{
		
	}
	
	void createALogFile()
	{
		
	}
}