package com.ant.test;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import org.apache.tools.ant.Task;


public class ReadFile extends Task{
	
	
    String message;
public void setMessage(String abc) {
message = abc;
}
	
	 public void execute() {
	 String content;
	try {
		content = new String(Files.readAllBytes(Paths.get(message)));
		
		 System.out.println(content);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 
	 
	
	 }

}
