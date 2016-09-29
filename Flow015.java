/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codechef;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Jindal
 */
public class Flow015 {
    public static void main(String[] args) {
        int year,t;
        Scanner sc=new Scanner(System.in);
        t=sc.nextInt();
        while(t>0){
        year=sc.nextInt();
        Date d=new Date(year,0,0);
            System.out.println(d.getDay());
        t--;
        }
    }
}
