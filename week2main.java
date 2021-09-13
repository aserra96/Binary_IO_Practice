package week2Activity;
//i had no idea where to go for this
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class week2main {
	
	public static void main(String[] args) {
		try {
			String filename = ("src/CS2013ActWk2 SampleText1.txt");
			FileInputStream file = new FileInputStream(filename);
			
			String fullData = "";
			ArrayList<String> seperateData = new ArrayList<String>();
			
			int data = file.read();
			while(data!=-1) {
				if ((char)data != '\n' && (char)data != '\r');
				fullData += (char)data;
			}
			
			if ((char)data == '\n') {
				seperateData.add(fullData);
				fullData = "";
			}
			data = file.read();
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			
		}
	}
//		try {
//			FileInputStream data = new FileInputStream(new File("C:\\Users\\black\\Desktop\\Java Code\\Week2Activity\\src\\week2Activity\\CS2013ActWk2 SampleText1.txt"));
//			
//			Scanner readData = new Scanner(new File("CS2013ActWk2 SampleText1.txt"));
//			String token1 = "/t ";
//			StringBuilder build = new StringBuilder();
//			while (readData.hasNext()) {
//				build.append(readData.nextLine());
//			}
//			
//			List<String> temps = new ArrayList<String>();
//				
//			try {
//				FileOutputStream newdata = new FileOutputStream(new File("newdata.txt"));
//			
//			}
//			catch (IOException ex) {
//				ex.printStackTrace();
//				
//			}
//		} catch (FileNotFoundException ex) {
//			ex.printStackTrace();
//			
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//		System.out.print("data read");
	
}
