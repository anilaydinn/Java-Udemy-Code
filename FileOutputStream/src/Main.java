import java.io.*;

public class Main {

	public static void main(String[] args) {
		
		FileOutputStream fos = null;
		//File file = new File("dosya.txt");
		
		try {
			
			fos = new FileOutputStream("dosya.txt", true);
				
			//byte[] array = {101, 75, 66, 68};
			
			String s = "Mustafa Murat";
			
			byte[] s_array = s.getBytes();
			
			fos.write(s_array);	
		}
		catch(FileNotFoundException e) {
			
			System.out.println("File Not Found Exception oluştu....");
		}
		catch(IOException e) {
			
			System.out.println("Dosyaya yazılırken bir hata oluştu...");
		}
		finally {
			
			try {
				
				fos.close();
			}
			catch(IOException e) {
				
				System.out.println("Dosya kapatılırken bir hata oluştu...");
			}
		}
	}
}
