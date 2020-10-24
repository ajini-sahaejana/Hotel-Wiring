/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel.wiring;

import java.util.Scanner;

/**
 *
 * @author Ajini Sahejana
 */
public class HotelWiring {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        int tc = 0;
        int maxrooms = 0;
        
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
            if (a >= 1 && a <= 20){
                tc = a;
            }
        
        for (int i = 0; i < tc; i++) {
            int m = 0, n = 0, k = 0;
            int b = in.nextInt();           //no of floors
            if (b >= 1 && b <= 1000000){
                    m = b;
                }
            int c = in.nextInt();           //no of rooms
            if (c >= 1 && c <= 1000000){
                    n = c;
                }
            int d = in.nextInt();           //no of turning off MS
            if (d >= 1 && d <= m){
                    k = d;
            }
            System.out.println("m: "+m+"  "+"n: "+n+"  "+"k: "+k);
        
            for (int j = k; j <= m; j++) {
                int f = in.nextInt();
                int g = in.nextInt();
                
                if (j==1) {
                    if (f==m || f==0) {
                        maxrooms = n;
                    }
                    if (g==m || g==0) {
                        maxrooms += n;
                    }
                System.out.println("maxrooms: "+maxrooms);
                break;
                }
                
                if (j==2) {
                    if (f==m || f==0) {
                        maxrooms = n;
                    }
                    if (g==m || g==0) {
                        maxrooms += n;
                    }
                    else
                        maxrooms++;
                    
                System.out.println("maxrooms: "+maxrooms);
                break;
                }
            }
        }
    }
    
}
