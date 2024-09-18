import javax.swing.JOptionPane;

public class Lingkaran {
    public static void main(String[] args) {
        final double pi = 3.14;

        String inputJariJari = JOptionPane.showInputDialog("Masukkan jari-jari lingkaran:");

        double jariJari = Double.parseDouble(inputJariJari);

        double luasLingkaran = pi * (jariJari * jariJari);

        double kelilingLingkaran = 2 * pi * jariJari;

        JOptionPane.showMessageDialog(null, "Luas Lingkaran: " + luasLingkaran + "\nKeliling Lingkaran: " + kelilingLingkaran);
    }
}
