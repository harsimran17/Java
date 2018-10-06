package fileIO;

import java.io.File;
import java.io.IOException;

public class FileSize {

	public static void main(String[] args) throws IOException {
		File file = new File("first_file.txt");
		System.out.println(file.length());
		
		file.createNewFile();
		System.out.println(file.length());

	}

}
