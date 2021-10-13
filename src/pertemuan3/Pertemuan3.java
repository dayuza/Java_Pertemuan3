/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan3;

import javax.swing.JOptionPane;

/**
 *
 * @author Dayuza
 */
public class Pertemuan3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        deklarasi variabel
        String kondisi;
        kondisi = JOptionPane.showInputDialog(null, "Silahkan Pilih Kondisi : [biodata, kalkulator]");
        Pertemuan3 per = new Pertemuan3();
        if (kondisi.equals("biodata")) {
            per.biodata();
        } else if (kondisi.equals("kalkulator")) {
            per.kalkulator();
        }
    }

    void biodata() {
        String nama_depan, nama_belakang, tempat, tgl_lahir, alamat, matkul;
        int nohp, nilai;
//        input dengan joptionpane
        nama_depan = JOptionPane.showInputDialog(null, "Masukan Nama depan anda: ");
        nama_belakang = JOptionPane.showInputDialog(null, "Masukan Nama belakang anda: ");
        tempat = JOptionPane.showInputDialog(null, "Masukan Tempat Lahir anda: ");
        tgl_lahir = JOptionPane.showInputDialog(null, "Masukan Tanggal Lahir anda: ");
        nohp = Integer.parseInt(JOptionPane.showInputDialog(null, "Masukan No HP anda: "));
        matkul = JOptionPane.showInputDialog(null, "Masukan Mata Kuliah Anda Hari Ini: ");
        nilai = Integer.parseInt(JOptionPane.showInputDialog(null, "Masukan Nilai Mata Kuliah Anda: "));
        alamat = JOptionPane.showInputDialog(null, "Masukan Alamat Anda: ");

        //    output popup
        JOptionPane.showMessageDialog(null, "==========Biodata=========\n"
                + "Nama : " + nama_depan + " " + nama_belakang + "\n"
                + "Tempat/tanggal lahir : " + tempat + " " + tgl_lahir + "\n "
                + "No HP : " + nohp + "\n"
                + "Nama Mata Kuliah saat ini : " + matkul + "\n"
                + "Nilai Angka : " + nilai + "\n"
                + "Nilai Huruf : " + "\n"
                + "ALamat : " + alamat
        );
    }     
        void kalkulator(){
            String a, b;
            int nilai1, nilai2;
            
            a = JOptionPane.showInputDialog("Masukan Nilai A = ");
            b = JOptionPane.showInputDialog("Masukan Nilai B = ");
            
            nilai1 = Integer.parseInt(a);            
            nilai2 = Integer.parseInt(b);
            
            int tambah = nilai1 + nilai2;
            int kurang = nilai1 - nilai2;
            int kali = nilai1 * nilai2;
            int bagi = nilai1 / nilai2;

            JOptionPane.showMessageDialog(null, "Kalkulator Sederhana Menggunakan JOtionPane \n"
            + "Bilangan 1 =" + nilai1 +"\n"
            + "Bilangan 2 =" + nilai2 +"\n"
            + "Tambah     =" + tambah +"\n"
            + "Kurang     =" + kurang +"\n"
            + "Bagi       =" + bagi   +"\n"
            + "Kali       =" + kali   +"\n"
            );
       }
}
//tugas Teguh Nugratama Dayuza (19100064)