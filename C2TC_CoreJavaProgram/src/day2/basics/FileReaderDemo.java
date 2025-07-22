package day2.basics;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;

public class FileReaderDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// use the class loader to get the resource url for the file in the same package
		URL resource = FileReaderDemo.class.getResource("demo.txt");
		//check if the resource url is null(file not found)
		if(resource == null) {
		System.err.print("");
		return;
		}
		//convert the url to a File object
		File file = new File(resource.getFile());
		//create a filereader object to read the file
		FileReader fileReader = new FileReader(file);
		//create a buffered object to wrap the Filereader
		BufferedReader reader = new BufferedReader(fileReader);
		//variable to hold each line read from the file
		String Line;
		//Read the file line by line using readLine() method
		while((Line=reader.readLine())!=null) {
			//print each line to the console
			System.out.println(Line);
		}
		//close the bufferreader to free up the resource
		reader.close();
		

	}

}
