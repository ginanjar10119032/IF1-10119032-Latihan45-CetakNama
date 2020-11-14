/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119032.latihan45.cetaknama;
import java.util.Scanner;

/**
 *
 * @author Ginanjar Tubagus Gumilar
 * Nama     : Ginanjar Tubagus Gumilar
 * Kelas    : IF 1
 * NIM      : 10119032
 * Deskripsi Program : Berisi program untuk menampilkan cetak nama
 * dengan pendekatan berorientasi objek
 */
public class IF110119032Latihan45CetakNama {
    private static String nama;
    private static int jumlah;
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("=====Aplikasi Pencetak Nama=====");
        System.out.print("Masukan nama anda : ");
        nama = input.nextLine();
        System.out.print("Mau cetak berapa kali? : ");
        jumlah = input.nextInt();
        
        Printer printer1 = new Printer();
        printer1.setNama(nama);
        printer1.setJmlCetak(jumlah);
        printer1.cetak(nama);
        printer1.cetak(jumlah, nama);
        
    }
}