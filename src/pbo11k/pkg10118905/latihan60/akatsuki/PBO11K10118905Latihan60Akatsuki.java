/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo11k.pkg10118905.latihan60.akatsuki;

/**
 *
 * @author Fitri
 * NAMA             : Anindira Dina Fitriani
 * NIM              : 10118905
 * KELAS            : IF11 Kariawan
 * Deskripsi        : Program Akatsuki
 */
public class PBO11K10118905Latihan60Akatsuki {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Anggota Akatsuki Berdasarkan Desa");
        System.out.println("");
        Senjata hidan = new Senjata();
        hidan.setNama("Hidan");
        hidan.jenisPetarung("Sabit");
        hidan.asalDesa("Iwagakure");
        TanganKosong nagato = new TanganKosong();
        nagato.setNama("Nagato");
        nagato.jenisPetarung();
        nagato.asalDesa("Amegakure");
    }
    
}
