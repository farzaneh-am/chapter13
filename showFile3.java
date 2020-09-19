package chapter13;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class showFile3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int i;
		FileInputStream fin3=null;

if(args.length!=1) {
	System.out.println("Usage:ShowFile filename");
	return;
}
try {
	fin3=new FileInputStream(args[0]);
	do {
		i=fin3.read();
		if(i!=-1)System.out.print((char)i);
		
	}while (i!=-1);
		}catch(FileNotFoundException e) {
			System.out.print("File Not Found.");
		}catch(IOException e) {
			System.out.print("An IO Error Occurred.");
		}finally {
			try {
				if (fin3!=null)
					fin3.close();
			}catch(IOException e) {
				System.out.println("Error closing File");
				
			}
		}
	}

}