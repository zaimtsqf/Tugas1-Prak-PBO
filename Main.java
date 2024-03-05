/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package manusia;

/**
 *
 * @author LENOVO
 */
public class Main {
    public static void main(String[] args) {
        Manusia mahasiswa = new Mahasiswa();
        Manusia karyawan = new Karyawan();
        Manusia olahragawan = new Olahragawan();

        // Polymorphic method calls
        mahasiswa.makan();
        mahasiswa.tidur();
        mahasiswa.bekerja();

        karyawan.makan();
        karyawan.tidur();
        karyawan.bekerja();

        olahragawan.makan();
        olahragawan.tidur();
        olahragawan.bekerja();
    }
}
