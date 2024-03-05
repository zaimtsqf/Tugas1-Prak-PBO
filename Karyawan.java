/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package manusia;

/**
 *
 * @author LENOVO
 */
class Karyawan extends Manusia implements Hiburan {
    void makan() {
        System.out.println("Karyawan makan siang di kantor");
    }

    void tidur() {
        System.out.println("Karyawan tidur di malam hari setelah bekerja");
    }

    void bekerja() {
        System.out.println("Karyawan bekerja di perusahaan");
    }

    public void nontonFilm() {
        System.out.println("Karyawan nonton film di akhir pekan");
    }
}
