package chapter13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TinyEdit {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br3=new BufferedReader(new InputStreamReader(System.in));
		String str[]=new String[100];
		System.out.println("Enter Line Of Text");
		System.out.println("Enter 'stop' to exit");
		for (int i=0;i<100;i++) {
			str[i]=br3.readLine();
			if(str[i].equals("stop"))
				break;
		
		}
		System.out.println("\nhere is your file: ");
		for (int i=0;i<100;i++) {
			if(str[i].equals("stop"))
				break;
				System.out.println(str[i]);	
				
	}

}
}
