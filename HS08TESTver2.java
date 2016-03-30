import java.io.*;

class Main
{
	private static int n,k,t,count=0;
	public static void main(String args[]){
		
		try{
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		
		
		n=Integer.parseInt(reader.readLine());
		k=Integer.parseInt(reader.readLine());
		
		
		
		while(n>0){
			
		t=Integer.parseInt(reader.readLine());
		if(t%k==0)
			count++;
		System.out.println(count);
		n--;
		
			}
		
		}catch(IOException e){
				e.printStackTrace();
		}
}
}
