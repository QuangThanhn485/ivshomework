package IVSHomeWork.Files;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.Writer;
import java.util.Scanner;


import IVSHomeWork.Math.*;
public class FileInOutTest {
	static general general =new general(null);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final String linkFile ="E:/Java/database.txt";
		//delete(linkFile);
		testWriteFormFile(linkFile);
		testReadFromFile(linkFile);

	}
	public static void testWriteFormFile(String file)
	{
	    try {
            File statText = new File(file);
            Writer output = new FileWriter(statText);
            while (true) {
    		String input =String.valueOf(general.inputString("input contens : "));
    		if(input.equals("~"))break;
		    output.append(input);
			}
		    //output.write(input);
	        output.close();
	        System.out.println("Successfully wrote to the file.");
	      } catch (Exception e) {
	        System.out.println("An error occurred. :"+e);
	        e.printStackTrace();
	      }
	}
	public static void testReadFromFile(String file)
	{
	    try {
	        File myObj = new File(file);
	        Scanner myReader = new Scanner(myObj);
	        while (myReader.hasNextLine()) {
	          String data = myReader.nextLine();
	          System.out.println(data);
	        }
	        myReader.close();
	      } catch (FileNotFoundException e) {
	        System.out.println("An error occurred.");
	        e.printStackTrace();
	      }
	}
	public static void delete(String file)
	{
	    File myObj = new File(file);
	    if (myObj.delete()) { 
	      System.out.println("Deleted the file: " + myObj.getName());
	    } else {
	      System.out.println("Failed to delete the file.");
	    }
	}
}
