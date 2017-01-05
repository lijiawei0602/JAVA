package java12_16_16;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main_sum {

	public static void main(String[] args) throws EOFException {
		// TODO Auto-generated method stub
		int sum = 0;
		try {
			DataOutputStream output = new DataOutputStream(new FileOutputStream("Exercise19_3.dat"));
			output.writeInt(5);
			output.writeInt(6);
			output.writeInt(7);
			output.close();
			
			DataInputStream input = new DataInputStream(new FileInputStream("Exercise19_3.dat"));
			
			while(true){
				sum += input.readInt();	
			}
			
		}catch(EOFException e){
			
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(sum);
		
	}

}
