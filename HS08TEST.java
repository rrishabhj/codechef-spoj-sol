import java.util.Scanner;
class Main
{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		double x,y;
		
		x=sc.nextDouble();
		y=sc.nextDouble();
		if(x%5==0&&(x+0.5)<y)
		{
				y=y-x-0.5;
		}
			System.out.println(y);
		
	}
}