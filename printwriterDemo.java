package chapter13;

import java.io.PrintWriter;

public class printwriterDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintWriter p=new PrintWriter(System.out,true);
		p.println("This is a string");
		int i=-7;
		p.println(i);
		double d=4.5e-7;
		p.println(d);
		

	}

}
