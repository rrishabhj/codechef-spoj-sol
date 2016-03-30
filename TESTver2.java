import java.io.*;
 class Main
 {
	 public static void main(String str[]){
		 try{
			BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
			while(true){
				int num=Integer.parseInt(reader.readLine());
				if(num==42)
					break;
				System.out.println(num);
			}
		 }catch(IOException e){
			 e.printStackTrace();
		 }
	 }
 }