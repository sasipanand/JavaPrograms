import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WordDictionary 
{
	
	public static void doesFileExist(String path) 
	{
/*
Method checks for file existence
*/
		try
		{
			File file = new File(path);
			Scanner sc = new Scanner(file);
			
			System.out.println("File Contents: ");
			
			while (sc.hasNextLine())
			{
				System.out.println(sc.nextLine());
			}
				System.out.println();
			
			System.out.println("Words after spliting\n");
			System.out.println();
			
			sc = new Scanner(file);
			while (sc.hasNextLine())
			{
				String read = sc.nextLine();
				if(read.length()==0) continue;
				String[] splited = read.split("[,-]");
				for(int i=0;i<splited.length;i++)
				{
					if(splited[i].length()==0) continue;
					System.out.println(splited[i].trim());
				}
			}
			
			
		}
		catch(FileNotFoundException e)
		{
			System.out.println(" The file name you entered is not found. Exiting program.");
		}
	}
	
	
	public static void main(String[] args) 
	{ 
		Scanner sc = new Scanner(System.in);
		String filename = "";
		
		System.out.print("Please enter a filename: ");
		filename = sc.nextLine();
		
		doesFileExist(filename);
		
	}
}
