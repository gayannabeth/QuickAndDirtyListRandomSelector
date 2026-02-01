package gay.annabeth;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sysin = new Scanner(System.in);
		
		try {
			System.out.print("Enter file name: ");
			String filePath = sysin.nextLine();
			FileReader fileReader = new FileReader(filePath);
			Scanner fileScanner = new Scanner(fileReader);
			List<String> list = new ArrayList<>();
			while (fileScanner.hasNext()) {
				list.add(fileScanner.nextLine());
			}
			fileScanner.close();
			
			if (list.isEmpty()) throw new IllegalStateException("Empty List!");
			
			Random random = new Random();
			
			System.out.println(list.get(random.nextInt(list.size())));
			
			System.out.println("Press enter to exit.");
			sysin.nextLine();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		sysin.close();
	}
}