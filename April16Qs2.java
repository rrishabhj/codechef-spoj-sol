package codechef;

import java.util.Scanner;

public class April16Qs2 {
    void game(int k){
        
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt(),count;
        while(t>0){
            int r=sc.nextInt();
            int b=sc.nextInt();
            int g=sc.nextInt();
            int k=sc.nextInt();
            count=0;
            if(k==1){
                count+=1;
            }else{
                while(k>0){
                    if(r>0){
                        r--;
                        count++;
                    }
                    if(b>0){
                        b--;
                        count++;
                    }
                    if(g>0){
                        g--;
                        count++;
                    }
                    k--;
                    
                    if(r==0&&b==0||b==0&&g==0||g==0&&r==0){
                        count+=k;
                        k=0;
                    }
                    if(k==1){
                     count++;
                     break;
                    }
                }
            }
            System.out.println(count);
            t--;
        }
    }
    
}
