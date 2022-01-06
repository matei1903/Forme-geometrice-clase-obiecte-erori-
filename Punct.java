
package test;

import java.util.Scanner;


public class Punct {
    int x;
    int y;
    
    public Punct(){
        Scanner scan = new Scanner(System.in);
        System.out.println("introduceti coordonatele punctului");
        this.x=scan.nextInt();
        this.y=scan.nextInt();
        afisare();
    }
    
    public void afisare(){
        System.out.println("Punctul este de coordonate (" + x + "," + y + ")");
        
    }
}
