import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class HelloWorldApp{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\user\\Desktop\\java1\\out.txt"));
		
		while(true) {
			String line = br.readLine();
			if(line==null) break;
			System.out.println(line);
		}
		br.close();
	}	
}