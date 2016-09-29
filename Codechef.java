package codechef;

import java.util.Scanner;

public class Codechef {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt(),n;
        
        
        
        while((t--)>0){
                int count=0,maxcount=0;
                n=sc.nextInt();
                String arr=new String(sc.nextLine());
                //char arr[]=str.toCharArray();
                for(int i=0;i<n;i++){
                count=1;
                for(int j=i+1;j<n;j++){
                     if(arr.charAt(i)==arr.charAt(j))
                         count++;
                  }
                 if(maxcount<count){
                      maxcount=count;
                 }
                }
                System.out.println(maxcount-n);
    
        }
    }
    
}
