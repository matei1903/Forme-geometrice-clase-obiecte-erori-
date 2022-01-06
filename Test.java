
package test;

import java.util.InputMismatchException;


public class Test {

    
    public static void main(String[] args){
        
        try{
            
            Punct punct1=new Punct();
            
            if(punct1.x>='A'&&punct1.x<='z')
                throw new Eroare("valoare introdusa nu e integer");
            else if(punct1.y>='A'&&punct1.y<='z')
                throw new Eroare("valoare introdusa nu e integer");
           
        } catch(Eroare e){
            System.out.println("eroare"+e);
        }
        catch(InputMismatchException e){
            System.out.println("valoarea introdusa nu e integer");
        }
        
        Punct a=new Dreptunghi();
        Punct b=new Elipsa(); 
    }
    
}
