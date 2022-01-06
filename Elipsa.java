
package test;

import static java.lang.Math.abs;


public class Elipsa extends Punct{
    
    int raza;
    double arie;
    int a;
    int b;
    double pi=3.14;
    public Elipsa(){
       
        Punct p4 = new Punct();
        a=abs(x);
        b=abs(p4.y);
        
        arie();
        afisare();
    }
    
    public void arie(){
        arie=a*b*pi;
    }
    
     public void afisare(){
        System.out.println("aria elipsei este: "+arie);
    }
}
