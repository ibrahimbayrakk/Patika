package javaapplication1;

import java.util.Random;


public class JavaApplication1 {
    public static void main(String[] args) {
         MyList<Integer> liste = new MyList<>(30);
        System.out.println("Liste Durumu : " + (liste.isEmpty() ? "Boş" : "Dolu"));
        Random rnd=new Random();
        for (int i = 1; i <= 10; i++) {
            
            liste.add(i*((int) rnd.nextInt(100)));
        }

        System.out.println("Liste Durumu : " + (liste.isEmpty() ? "Boş" : "Dolu"));
        System.out.println("Indeks : " + liste.indexOf(20));
        System.out.println("Indeks :" + liste.indexOf(100));
        System.out.println("Indeks : " + liste.lastIndexOf(20));
        Object[] dizi = liste.toArray();
        System.out.println("Object dizisinin ilk elemanı :" + dizi[0]);
        MyList<Integer> altListem = liste.subList(0, 3);
        System.out.println(altListem.toString());
        System.out.println("Listemde 20 değeri : " + liste.contains(20));
        System.out.println("Listemde 120 değeri : " + liste.contains(120));
        liste.clear();
        System.out.println(liste);
    }
}
