import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Excercise5 {
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file = new File("F:\\Capgemini Exceller SW\\Sprint 1 resources\\Lab Books\\Sample.txt");
		FileInputStream filestream = new FileInputStream(file);
		InputStreamReader input = new InputStreamReader(filestream);
        BufferedReader reader = new BufferedReader(input);
        String line;
        int countWord = 0;
        int sentenceCount = 0;
        int characterCount = 0;
        
        while((line = reader.readLine()) != null)
        {
        	if(!line.equals(""))
        	{
        		 characterCount += line.length();
        		 String[] wordList = line.split("\\s+");
                 countWord += wordList.length;
                 String[] sentenceList = line.split("[!?.:]+");
                 sentenceCount += sentenceList.length;
                 
        	}
        }
        System.out.println("Total word count = " + countWord);
        System.out.println("Total number of sentences = " + sentenceCount);
        System.out.println("Total number of characters = " + characterCount);
        reader.close();
	}

}
