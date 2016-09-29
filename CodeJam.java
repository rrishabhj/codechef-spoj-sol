package codechef;

import java.util.*;
import java.lang.*;
import java.io.*;

class CodeJam
{
	public static void switchStack(char ch[],int top){
		for(int j=0;j<top;j++,top--){
			ch[top]=ch[j];
		}
	}
	public static void main (String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=1;i<=t;i++){
			String str=sc.next();
			char ch[]=str.toCharArray();
			int count=0;
				
			for(int j=0;j<str.length()-1;j++)
			{
				if(ch[j]!=ch[j+1]){
					switchStack(ch,j);
					count++;
				}
                                
			}
                        if(ch[0]=='-')
                            count++;
			System.out.println("Case #"+i+": "+count);
		}
	
	}
	
}