package pbo1.nim10118017;

import java.text.DecimalFormatSymbols;
import java.text.DecimalFormat;

/**
 *
 * @author Agung Nurhamidan
 * NAMA                 : Agung Nurhamidan
 * KELAS                : PBO1
 * NIM                  : 10118017
 * Deskripsi Program    : Perhitungan lama tabungan sampai mencapai saldo target.
 * 
 */
public class Main {
    //Konstanta
    public static final String FOOTER = "\n(Developed by : Agung Nurhamidan)";

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        tampilkanTargetSaldoTabungan(3500000, 8, 6000000);
        
        System.out.println(FOOTER);
    }
    
    public static void tampilkanTargetSaldoTabungan(double saldoAwal, double bunga, double saldoTarget) {
        //Mengatur simbol format untuk mata uang Indonesia.
        DecimalFormatSymbols formatSymbols = new DecimalFormatSymbols();
        formatSymbols.setCurrencySymbol("Rp. ");
        formatSymbols.setDecimalSeparator('.');
        
        //Menerapkan simbol format ke bilangan desimal serta mengatur digit pembulatannya.
        DecimalFormat format = (DecimalFormat) DecimalFormat.getCurrencyInstance();
        format.setDecimalFormatSymbols(formatSymbols);
        format.setMaximumFractionDigits(0);
        
        //Menampilkan perulangan hingga mencapai saldo target.
        for (int i = 0; saldoAwal <= saldoTarget; i++) {
            saldoAwal += (saldoAwal * (bunga / 100));
            System.out.println("Saldo di bulan ke-" + (i+1) + " " + format.format(saldoAwal));
        }
    }
    
}
