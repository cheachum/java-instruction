package ui;

import java.io.IOException;
import java.nio.file.*;

public class FileIOApp {

	public static void main(String[] args) throws IOException {
		//p.463 create directory
		String dirString = "c:/temp/sub1/sub2";
		Path dirPath = Paths.get(dirString);
		if (Files.notExists(dirPath)) {
			Files.createDirectories(dirPath);
		}
		else {
			System.out.println("directory already exists");
		}
		
		// p.462 Create a file 
		String fileString = "temp.txt";
		Path filePath = Paths.get(dirString, fileString);
		if (Files.notExists(filePath)) {
			Files.createFile(filePath);
		}
		else {
			System.out.println("Files already exists, Dummy!");
		}
		
		System.out.println(filePath.getNameCount());
		System.out.println(filePath.toString());
		System.out.println(filePath.toAbsolutePath());
		System.out.println(Files.isWritable(filePath));
		System.out.println(Files.isHidden(filePath));
		System.out.println(filePath.getRoot());
		for (int i=0; i < filePath.getNameCount(); i++) {
			System.out.println(filePath.getName(i));
			
			//p463 display files in a directory
			System.out.println("Directory:  "+dirPath.toAbsolutePath());
		}
		

	}

}
