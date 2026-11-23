package com.example.filehandling;

import java.io.File;
import java.io.IOException;

public class FileDemo {
public static void main(String[] args) {
	try
	{
	File file = new File("test.txt");
	
	if(file.createNewFile())
	{
		System.out.println("File created");
	}
	else
	{
		System.out.println("File already exist");
	}
	}
	catch(IOException e)
	{
		e.printStackTrace();
	}
	
}
}
