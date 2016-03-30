import java.util.Scanner;
class Main
{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int n,k,t,count=0;
		n=sc.nextInt();
		k=sc.nextInt();
		while(n>0){
			
			t=sc.nextInt();
		if(t%k==0)
			count++;
		
		
			n--;
		}
		System.out.println(count);
	}
}