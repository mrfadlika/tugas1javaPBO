//@author : Raffi Fadlika
//@nim : 42623002

import java.util.Scanner; //library untuk inputan

public class Suhu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //menampilkan pilihan menu
        System.out.println("1. Fahrenheit ke Celsius");
        System.out.println("2. Celsius ke Fahrenheit");
        System.out.print("Masukkan pilihan Anda: ");
        int pilihanUser = sc.nextInt();

        //input suhu
        System.out.print("Masukkan suhu awal: ");
        double suhuAwal = sc.nextDouble();

        double suhuSetelahDiRubah;

        //menggunakan switch untuk mendeteksi pilihan, soalnya saya pecinta switch
        switch (pilihanUser) {
            case 1:
                suhuSetelahDiRubah = (suhuAwal - 32) * 5/9;
                System.out.println("Hasil dari Fahrenheit ke Celsius: " + suhuSetelahDiRubah + " °C");
                break;
            case 2:
                suhuSetelahDiRubah = (suhuAwal * 9/5) + 32;
                System.out.println("Hasil dari Celsius ke Fahrenheit: " + suhuSetelahDiRubah + " °F");
                break;
            default:
                System.out.println("Opsi tidak ada.");
        }
    }
}
