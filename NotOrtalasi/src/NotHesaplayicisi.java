import java.util.Scanner;
public class NotHesaplayicisi {
    public static void main(String[] args) {
        double Mat,Fiz,Kim,Turk,Tar,Muz;
        double sonuc;
        Scanner girdi=new Scanner(System.in);

        System.out.print("Matematik Notunuzu Giriniz: ");
        Mat= girdi.nextDouble();
        System.out.print("Fizik Notunuzu Giriniz: ");
        Fiz=girdi.nextDouble();
        System.out.print("Kimya Notunuzu Giriniz: ");
        Kim=girdi.nextDouble();
        System.out.print("Türkçe Notunuzu Giriniz: ");
        Turk=girdi.nextDouble();
        System.out.print("Tarih Notunuzu Giriniz: ");
        Tar=girdi.nextDouble();
        System.out.print("Müzik Notunuzu Giriniz: ");
        Muz=girdi.nextDouble();

        sonuc=(Mat+Fiz+Kim+Turk+Tar+Muz)/6;
        System.out.println(sonuc >= 60 ? "Tebrikler Sınıfı Geçtiniz" : "Sınıf Tekrarı");




    }
}
