package br.main.appppsomaab;

/**
 *
 * @author Emanoel Borges
 */
//Paradigma Procedural(Procedimental)
public class AppPPsomaAB {
    
    private static double soma(double X, double Y){
        return X + Y;
    }
    public static void main(String[] args){
        double A,B,X;
        A = 1.0;
        B = 2.3;
        X = A + B;
        System.out.println("A soma de A + B e:"+soma(A,B));
        System.out.println("A soma 2 de A + B e:"+ X);
    }
}
