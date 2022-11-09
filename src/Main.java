import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        System.out.println("Zadanie 1");
        System.out.println("");

        Scanner Wprowadzenie = new Scanner(System.in);
        float firstNumberPryma = Wprowadzenie.nextInt();
        float secondNumberPryma = Wprowadzenie.nextInt();

        float dodawanie = firstNumberPryma + secondNumberPryma;
        String dodawanie1 = String.format("%.2f", dodawanie);
        float odmiennosc = firstNumberPryma - secondNumberPryma;
        String odmiennosc1 = String.format("%.2f", odmiennosc);
        float iloczyn = firstNumberPryma * secondNumberPryma;
        String iloczyn1 = String.format("%.2f", iloczyn);
        float podzil = firstNumberPryma / secondNumberPryma;
        String  podzil1 = String.format("%.2f", iloczyn);


        System.out.println("Suma: "+dodawanie1);
        System.out.println("Odmiennnosc: "+ odmiennosc1);
        System.out.println("Mnozenie: "+ iloczyn1);
        System.out.println("Podzil: "+ podzil1);

        System.out.println("----------------------------------------------");

        System.out.println("Zadanie 2");
        System.out.println("");


    }
}