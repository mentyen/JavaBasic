package com.class36_Exeption;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileReading {
	public static void main(String[] args) {
		try {
			FileReader file=new FileReader("c:users/Tolik/Desctop/testing.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
