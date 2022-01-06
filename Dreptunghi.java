
package test;

import static java.lang.Math.abs;


public class Dreptunghi extends Punct{
    
    int L;
    int l;
    double arie;
    
    public Dreptunghi(){
        
        
        Punct p2 = new Punct();
        this.L=abs(p2.x-x);
        this.l=abs(p2.y-y);
       
        arie();
        afisare();
    }
    
    public void arie(){
        
        
        arie=L*l;
    }
    
    public void afisare(){
        System.out.println("aria dreptunghiului este: "+arie);
    }
}
