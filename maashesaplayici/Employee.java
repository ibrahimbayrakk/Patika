
package maashesaplayici;

public class Employee {
    String name;
    Double maas;
    int workHours;
    int hireYear;

    Employee(String name,Double maas,int workHours, int hireYear){
        this.name=name;
        this.maas=maas;
        this.workHours=workHours;
        this.hireYear=hireYear;
    }
    // Vergi Hesaplama
    double tax(){
        double vergi=0;
        if (maas>1000) {
            vergi = (maas*3)/100;
        }
        return vergi;
    }
    //Mesai Bonus Ucret
    Double bonus(){
            double bonus=0;
        if (workHours>40) {
            for (int i = 0; i < workHours-40; i++) {
                bonus= bonus+30;
            }  
        }
        return bonus;
    }
    double raiseSalary(){
        int tarih=2021;
        double zam=0;
        tarih=tarih-hireYear;
        if (tarih<10) {
            zam=0.05;
        }else if(10<tarih && tarih<20){
            zam=0.1;
        }else if (tarih>20){
            zam=0.15;
        }
        return zam;
        
    }
    void getData(){
        System.out.println("Adı: "+name);
        System.out.println("Maaşı: "+maas);
        System.out.println("Çalışma Saati: "+workHours);
        System.out.println("Vergi: "+tax());
        System.out.println("Bonus: "+bonus());
        System.out.println("Maaş Artışı: "+raiseSalary()*maas);
        System.out.println("Vergi ve Bonuslar ile Birlikte Maaş: "+(maas+bonus()-tax()));
        System.out.println("Toplam Maaş: "+((maas*raiseSalary())+maas+bonus()-tax()));
    }
    
    
    
}
