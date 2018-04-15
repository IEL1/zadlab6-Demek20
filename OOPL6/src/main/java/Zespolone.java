import java.util.Scanner;                                                        
import javax.swing.JLabel;
public class Zespolone                                                           
{                                                                                
 public static void main(String[] args)                                          
 {                                                                               
  Scanner in = new Scanner(System.in);                                           
  System.out.println("podaj pierwszą liczbę:");                                  
  System.out.print("Część rzeczywista: ");                                       
  int re1 = in.nextInt();                                                        
  System.out.print("Część urojona: ");                                           
  int im1 = in.nextInt();                                                        
  System.out.println(" ");                                                       
  if ( im1 < 0 )                                                                 
  {                                                                              
   System.out.println("Wprowadzono liczbę: "+re1+" - "+ Math.abs(im1) + "i");    
  }                                                                              
  else                                                                           
  {                                                                              
   System.out.println("Wprowadzono liczbę: "+re1+" + "+im1+"i");                 
  }                                                                              
  System.out.println(" ");                                                       
  System.out.println("podaj drugą liczbę:");                                     
  System.out.print("Część rzeczywista: ");                                       
  int re2 = in.nextInt();                                                        
  System.out.print("Część urojona: ");                                           
  int im2 = in.nextInt();                                                        
  System.out.println(" ");                                                       
  if ( im2 < 0 )                                                                 
  {                                                                              
   System.out.println("Wprowadzono liczbę: "+re1+" - "+ Math.abs(im2)+"i");      
  }                                                                              
  else                                                                           
  {                                                                              
   System.out.println("Wprowadzono liczbę zespoloną: "+re1+" + "+im2+"i");       
  }                                                                              
  System.out.println(" ");                                                       
  System.out.println("Wpisz numer działania");
  System.out.println("1 - sprzężenie");
  System.out.println("2 - dodawanie");                                          
  System.out.println("3 - odejmowanie");                                          
  System.out.println("4 - mnożenie");  
  System.out.println("5 - dzielenie");
  System.out.println("6 - moduł");
  System.out.println("7 - zamiana i działania na postaciach trygonometrycznych");
  int reW=0;                                                                     
  int imW=0;
  double modul_1 = Math.sqrt(Math.pow(re1,2)*Math.pow(im1,2));
  double modul_2 = Math.sqrt(Math.pow(re2,2)*Math.pow(im2,2));  
  
  int mat = in.nextInt();                                                        
  switch (mat)                                                                   
  {
      
      case 1:
      {
          System.out.println("Sprzężenie liczby zespolonej numer 1");
          System.out.println(re1+""+im1*(-1)+"i");
          
          System.out.println("Sprzężenie liczby zespolonej numer 2");
          System.out.println(re2+""+im2*(-1)+"i");
      }
   case 2:                                                                       
  {                                                                              
   reW= re1+re2;                                                                 
   imW= im1+im2;                                                                 
   
   
   break;                                                                        
  }                                                                              
  case 3:                                                                        
  {                                                                              
   reW = re1 - re2;                                                              
   imW=im1-im2;                                                                  
   break;                                                                        
  }                                                                              
  case 4:                                                                        
  {                                                                              
   reW=re1*re2-im1*im2;                                                          
   imW=re2*im1+re1*im2;                                                          
   break;                                                                        
  }
  
  case 5:
  {
  reW = (int) ((int)(re1*re2 + im1*im2)/Math.pow(re2,2)+Math.pow(im2,2));
  imW = (int) ((int) (im1*re2-re1*im2)/Math.pow(re2,2)+Math.pow(im2,2));
  break;
  }
  
  case 6:
  {
    System.out.println("Modul liczby zespolonej numer 1"+modul_1);
    System.out.println("Modul liczby zespolonej numer 2"+modul_2);
    
  }
  
  case 7:
  {
      
      if ((Math.cos(re1/modul_1)>Math.PI &&  Math.sin(im1/modul_1)>Math.PI) || (Math.cos(re2/modul_2)>Math.PI &&  Math.sin(im2/modul_2)>Math.PI)){
      
      double argz1 = 2*Math.PI - Math.abs(re1/modul_1);
      double argz2 = 2*Math.PI - Math.abs(re2/modul_2);
      
      System.out.println("Postać wykładnicza liczby zespolonej numer 1");
      System.out.println(Math.pow(Math.E, argz1));
      
      System.out.println("Postać wykładnicza liczby zespolonej numer 2");
      System.out.println(Math.pow(Math.E, argz2));
      
      System.out.println("Mnożenie liczb zespolonych w postaci wykładniczej");
      System.out.println("e^"+modul_1*modul_2*Math.pow(Math.E,argz1+argz2)+"i");
      
      System.out.println("Dzielenie liczb zespolonych w postaci wykładniczej");
      System.out.println("e^"+(modul_1/modul_2)*Math.pow(Math.E,argz1-argz2)+"i");
  } 
  
  else {
      double argz1 = Math.PI - Math.abs(re1/modul_1); 
      double argz2 = Math.PI - Math.abs(re2/modul_2);
      
      System.out.println("Postać wykładnicza liczby zespolonej numer 1");
      System.out.println(Math.pow(Math.E, argz1));
          System.out.println("e^"+argz1);    
      
      System.out.println("Postać wykładnicza liczby zespolonej numer 2");
      System.out.println(Math.pow(Math.E, argz2));
      System.out.println("e^"+argz2); 
      
      System.out.println("Mnożenie liczb zespolonych w postaci wykładniczej");
      System.out.println(modul_1*modul_2*Math.pow(Math.E,argz1+argz2)+"i");
      
      System.out.println("Dzielenie liczb zespolonych w postaci wykładniczej");
      System.out.println((modul_1/modul_2)*Math.pow(Math.E,argz1-argz2)+"i");
      
          System.out.println("Liczby zespolone trygonometrycznie jako string");
          System.out.println("z ="+modul_1+"(cos("+re1/modul_1+")+isin("+im1/modul_1+")");
          System.out.println("z ="+modul_2+"(cos("+re2/modul_2+")+isin("+im2/modul_2+")");
  }
  
  
   
  
      
      
      
  }
 }                                                                               
 if ( imW < 0 )                                                                  
 {                                                                               
  System.out.println("Wynik: "+ reW + " - "+ Math.abs(imW) +"i");                
 }                                                                               
 else                                                                            
 {                                                                               
  System.out.println("Wynik: "+ reW + " + "+ imW +"i");                          
 } 
     
 }                                                                               
} 