package p5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileWithTryWithResources {

	public static void main(String[] args) {

		try (BufferedReader reader =
				new BufferedReader(new FileReader("C:\\Users\\sumit\\eclipse-workspace\\Second_Java\\src\\p5\\input.txt"))) {
				String line;
				while ((line = reader.readLine()) != null) {
				System.out.println(line);
				}
				} catch (IOException e) {
				System.out.println("Error reading the file: " + e.getMessage());
				}


	}

}
