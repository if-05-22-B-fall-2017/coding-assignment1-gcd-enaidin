/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gcd;

/**
 *
 * @author Enaidin
 */
public class GCD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Eucledian:");
        System.out.println(gcdEucledian(85, 51));
        System.out.println(gcdEucledian(798, 1178));
        System.out.println(gcdEucledian(17, 13));
        System.out.println("\nPrime:");
        System.out.println(gcdPrimeFactors(85, 51));
        System.out.println(gcdPrimeFactors(798, 1178));
        System.out.println(gcdPrimeFactors(17, 13));
    }
    
    private static int gcdPrimeFactors(int x, int y) {
        int r = 1;
        int pf = 2;
        
        while(x != 1){
            if((x % pf == 0) && (y % pf == 0)){
                x /= pf;
                y /= pf;
                r *= pf;
            }
            else if(x % pf == 0)
                x /= pf;
            
            else if(y % pf == 0)
                y /= pf;
            
            else
                pf++;
        }
        
        return r;
    }
    
    private static int gcdEucledian(int x, int y) {
        if(y == 0)
            return x;
        
        return gcdEucledian(y, x%y);
    }
}
