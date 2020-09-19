package chapter13;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class showFile2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		FileInputStream fin2;

if(args.length!=1) {
	System.out.println("Usage:ShowFile filename");
	return;
}
try {
	fin2=new FileInputStream(args[0]);
	
}catch(FileNotFoundException e) {
	System.out.println("cannot open file");
	return;
}
try {
	do {
		i=fin2.read();
		if(i!=-1)System.out.print((char)i);
		
		
	}while (i!=-1);
}catch(IOException e) {
	System.out.println("Error Reading File");
	
}finally {
try {fin2.close();

}catch(IOException e) {
	System.out.println("Error closing File");
}
}
	}

}