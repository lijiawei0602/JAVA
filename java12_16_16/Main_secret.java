package java12_16_16;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main_secret {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileOutputStream output = new FileOutputStream("Exercise19_9.dat");
			FileInputStream input = new FileInputStream("Exercise19_9.dat");
			FileOutputStream outputStream = new FileOutputStream("Exercise19_10.dat");
			output.write(new byte[] {1,2});
			while(true){
				int x = input.read();
				x += (byte)5;
				outputStream.write(x);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
