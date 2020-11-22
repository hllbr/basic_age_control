
package project_x;

import java.util.Scanner;


public class Project_x {


    public static void main(String[] args) {
        Scanner ss = new Scanner(System.in);
        System.out.println("Lütfen yaşınızı giriniz...");
        int yas = ss.nextInt();
        if(yas>20){
            System.out.println("Bu mekana girebilirsiniz");
        }
        else if (yas<20 && yas>=18){
            System.out.println("mekana girebilir fakat içki siparişi veremessiniz");
            System.out.println("yaşınız dolayısıyla saat 23.59 'da mekanı terketmeniz gerekmektedir.");
            System.out.println("*********************************************************************");
            System.out.println("@Prince Eğlence mekanına hoşgeldiniz iyi eğlenceler... ");
        }
        else{
            System.out.println("Mekana giriş izniniz bulunmamaktadır.");
            System.out.println("Lütfen Zorluk Çıkarmayınız...!!!");
        }
   
    }/*
    if blokuna sahip olmayan bir else olamazken else komutuna sahip bir if bloku olabilir....
    */
    
}
