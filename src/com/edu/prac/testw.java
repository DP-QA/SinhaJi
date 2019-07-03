package com.edu.prac;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class testw {
	public static void main(String args[]) throws IOException
	{
		final BufferedReader tkey= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Type in a string");
		System.out.flush();
		final String s1= tkey.readLine();
		System.out.println("Type in another string");
		System.out.flush();
		final String s2=tkey.readLine();
		final int s1Length= s1.length();
		final int s2Length=s2.length();
		int tcount=0;
		for (int tcharnumber=0; tcharnumber<s1Length && tcharnumber<s2.length(); tcharnumber++)
		{
			final char tchar= s1.charAt(tcharnumber);
			if(s1.charAt(tcharnumber)==s2.charAt(tcharnumber))
					{
				          tcount++;
					}
					}
		System.out.println(tcount);
	}

}
