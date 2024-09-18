import java.util.Scanner;

public class HitungDurasi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan waktu awal (hh:mm): ");
        String waktuAwal = sc.nextLine();

        System.out.print("Masukkan waktu akhir (hh:mm): ");
        String waktuAkhir = sc.nextLine();

        String[] bagianWaktuAwal = waktuAwal.split(":");
        int jamAwal = Integer.parseInt(bagianWaktuAwal[0]);
        int menitAwal = Integer.parseInt(bagianWaktuAwal[1]);

        String[] bagianWaktuAkhir = waktuAkhir.split(":");
        int jamAkhir = Integer.parseInt(bagianWaktuAkhir[0]);
        int menitAkhir = Integer.parseInt(bagianWaktuAkhir[1]);

        int totalMenitAwal = (jamAwal * 60) + menitAwal;

        int totalMenitAkhir = (jamAkhir * 60) + menitAkhir;

        int durasiMenit = totalMenitAkhir - totalMenitAwal;

        if (durasiMenit < 0) {
            durasiMenit += 24 * 60;
        }

        System.out.println("Durasi waktu: " + durasiMenit + " menit");

        sc.close();
    }
}
