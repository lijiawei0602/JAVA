package java12_16_16;

import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;



public class Main_num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1;
		try {
			DataOutputStream output = new DataOutputStream(new FileOutputStream("Exercise19_8.dat"));
			
			output.writeInt(i);
			
			DataInputStream input = new DataInputStream(new FileInputStream("Exercise19_8.dat"));
			while(i<10){
				System.out.println(input.readInt());
				i++;
				output.writeInt(i);
				
			}
			
		}catch (EOFException e){
			
		}
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
