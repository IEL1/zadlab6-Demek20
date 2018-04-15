package pl.edu.ur.oopl6.zad1;

public class SkladoweStatyczne {

    public static void main(String[] args) {
        // TODO zad 3
        
        System.out.println(Figury.PoleKola(0.5));
        System.out.println(Figury.ObwodKola(0.5));
        
        
        System.out.format("%.2f%n",Figury.ObwodKwadrat(3.4));
        System.out.format("%.2f%n",Figury.PoleKwadratu(3.3));
        
        double a = Figury.ObwodProstokat(3, 4);
        System.out.println(a+" <---<< tutej");
        //System.out.printf("%.2d%n",);
        //System.out.printf("%.2d%n",Figury.PoleProstokat(3, 4));
        
        System.out.format("%.2f%n",Figury.PoleStozek(4.4, 0.5,4.0));
        System.out.format("%.2f%n",Figury.ObjetoscStozek(4.4, 0.5));
        
        System.out.format("%.2f%n",Figury.PoleWalec(4.4, 2.0));
        System.out.format("%.2f%n",Figury.ObjetoscWalec(4.4, 2.0));
        
        
        
        
    }
    
}
