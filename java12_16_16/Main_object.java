package java12_16_16;

import java.awt.List;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;

public class Main_object {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("object.dat"));
			
			output.writeObject(new Integer[] {1,2,3});
			output.writeObject(new Date());
			output.writeDouble(12.5);
			output.close();
			
			ObjectInputStream input = new ObjectInputStream(new FileInputStream("object.dat"));
			
			System.out.println(input.readObject());
			System.out.println(input.readObject());
			System.out.println(input.readDouble());
			input.close();
		}catch (EOFException e){
			
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
