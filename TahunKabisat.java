import javax.swing.JOptionPane;

public class TahunKabisat {
    public static void main(String[] args) {
        String inputTahun = JOptionPane.showInputDialog("Masukkan tahun (1900-2005): ");

        int tahun = Integer.parseInt(inputTahun);

        if (tahun < 1900) {
            JOptionPane.showMessageDialog(null, "Maaf, tahun input dibawah 1900");
        } else if (tahun > 2005) {
            JOptionPane.showMessageDialog(null, "Maaf, tahun input diatas 2005");
        } else {
            if ((tahun % 4 == 0 && tahun % 100 != 0) || (tahun % 400 == 0)) {
                JOptionPane.showMessageDialog(null, tahun + " adalah tahun kabisat");
            } else {
                JOptionPane.showMessageDialog(null, tahun + " bukan tahun kabisat");
            }
        }
    }
}
