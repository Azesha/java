import java.io.IOException;

public class File {
	public static void main(String[] args) {
		java.io.File file = new java.io.File("c://newFile.txt");
		try {
			file.createNewFile();
			System.out.println("file created");
			
		} catch (IOException e) {
			
			//e.printStackTrace();
			System.out.println("Unable to create file");
		}
		
	}

}
