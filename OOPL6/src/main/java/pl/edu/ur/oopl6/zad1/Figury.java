package pl.edu.ur.oopl6.zad1;

public class Figury {
    
    /**
     * Inicjalizator statyczny
     */
    static {
        System.out.println("Biblioteka obliczająca wielkość figur geometrycznych!!!");
    }
    
    /**
     * Metoda statyczna obliczająca pole koła
     */
    public static double PoleKola(double r){
        return Math.PI*Math.pow(r,2);
    }
    
    /**
     * Metoda statyczna obliczająca obwód koła
     */
    public static double ObwodKola(double r){
        return 2*Math.PI*r;
    }
    
    public static double ObwodKwadrat(double a){
        return 4*a;
    }
    
    public static double PoleKwadratu(double a){
        return Math.pow(a,2);
    }
    
    public static int ObwodProstokat(int a, int b){
        return 2*a+2*b;
    }
    
    public static int PoleProstokat(int a, int b){
        return a*b;
    }
    
    public static double PoleStozek (double H, double r, double l){
        return Math.PI * Math.pow(r, 2)+(Math.PI*r*l);
    }
    public static double ObjetoscStozek (double H, double r){
        return (Math.PI * Math.pow(r,2)*H)/3;
    }
    
    public static double PoleWalec (double r, double H){
        return 2*Math.PI* Math.pow(r,2)+2*Math.PI*r*H;
    }
    
    public static double ObjetoscWalec (double r, double H){
        return Math.PI*Math.pow(r, 2)*H;
    }
    
}
