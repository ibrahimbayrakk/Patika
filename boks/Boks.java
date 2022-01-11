
package boks;


public class Boks {

   
    public static void main(String[] args) {
        Fighter ali = new Fighter("Ali" , 20 , 90, 80, 10);
        Fighter veli = new Fighter("Veli" , 50 , 100, 80, 20);
        Ring r = new Ring(ali,veli , 90 , 100);
        r.run();
        
    }
    
}
