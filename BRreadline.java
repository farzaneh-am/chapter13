package chapter13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BRreadline {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
BufferedReader br2=new BufferedReader(new InputStreamReader(System.in));
String str;
System.out.println("Enter Line Of Text");
System.out.println("Enter 'stop' to exit");
do {
	str=br2.readLine();
	System.out.println(str);
	
	
}while(!str.equals("stop"));
	}

}
