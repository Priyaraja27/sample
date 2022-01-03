package Arrays;

import java.util.Scanner;

public class Pascals {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter your age");
		int age=s.nextInt();
       //for(int i=1;i<=10;i++)
    	 //  System.out.println(i);
		if(age>18)
			System.out.println("eligible to vote");
		else 
		System.out.println("not eligible to vote");
		
	}

}
