import java.util.Scanner;
class Main
{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int i;
		while(true){
			i=sc.nextInt();
			if(i==42)
				break;
			System.out.println(i);
		}
	}
}