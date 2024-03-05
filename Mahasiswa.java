/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package manusia;

/**
 *
 * @author LENOVO
 */
class Mahasiswa extends Manusia implements Hiburan {
    void makan() {
        System.out.println("Mahasiswa makan di kantin kampus");
    }

    void tidur() {
        System.out.println("Mahasiswa tidur di malam hari setelah belajar");
    }

    void bekerja() {
        System.out.println("Mahasiswa mengerjakan tugas dan mempersiapkan ujian");
    }

    public void nontonFilm() {
        System.out.println("Mahasiswa nonton film setelah belajar");
    }
}