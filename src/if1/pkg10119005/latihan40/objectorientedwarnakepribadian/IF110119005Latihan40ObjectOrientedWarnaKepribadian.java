/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119005.latihan40.objectorientedwarnakepribadian;

/**
 *
 * @author Hayin
 * NAMA     : Hayin Ananta
 * KELAS    : IF-1
 * NIM      : 10119005
 * Deskripsi Program : Program ini memberitahu kepribadian dengan memilih
 *                     warna yang ada dengan berbasis objek
 */
public class IF110119005Latihan40ObjectOrientedWarnaKepribadian {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        WarnaKepribadian kepribadian = new WarnaKepribadian();
        kepribadian.inputWarna();
        kepribadian.inputNama();
        kepribadian.cekKepribadian();
    }
    
}
