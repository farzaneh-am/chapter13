package chapter13;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class copyFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i;
FileInputStream fin4=null;
FileOutputStream fout=null;
if(args.length!=2) {
	System.out.println("usage:copyfile from to");
	return;
}
try {
fin4=new FileInputStream(args[0]);
fout=new FileOutputStream(args[1]);
do {
	i=fin4.read();
	if(i!=-1) fout.write(i);
	
}while(i!=-1);
}catch(IOException e) {
	System.out.println("I/o Error: "+e);
	
}finally {
	try {
		if(fin4 !=null) 
			fin4.close();
		}catch(IOException e2) {
			System.out.println("Error Closing Input File");
		}
	try {
		if(fout!=null)
			fout.close();
	}catch(IOException e2) {
		System.out.println("Error Closing output File");
	
}
	}

}
}