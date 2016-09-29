/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codechefbeg;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Jindal
 */
public class CodechefBeg {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int[] price_arr={1,2,4,8,16,32,64,128,256,512,1024,2048};
        while(t>0){
           int p=sc.nextInt();
           int end=price_arr.length-1;
           int count=0;
              end=binarySearch(price_arr, p, end);
           while(p!=0){
               end=binarySearch(price_arr, p, end);
                p=p-price_arr[end];
               count++;
           }
           System.out.println(count);
           t--;
        }
    
    }
    public static int binarySearch(int arr[],int num,int end){
        int beg=0;
        int mid=(beg+end)/2;
        while(beg<=end){
            
            if(arr[mid]==num)
                return mid;
            else if(arr[mid]<num){
                beg=mid+1;
            }
            else{
                end=mid-1;
            }
            
            mid=(beg+end)/2;
        }
        
        return mid;
        
    }
    
}
