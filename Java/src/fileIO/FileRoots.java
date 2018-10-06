package fileIO;

import java.io.File;
import java.util.Iterator;

public class FileRoots {

	public static void main(String[] args) {
		File[] roots = File.listRoots();
		for (File file : roots) {
			System.out.println(file.getPath());
		}

	}

}
