package com.ufukucar;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.StringJoiner;

public class _002_Personel implements Comparable<_002_Personel> {

    private int sicilNo;
    private String ad;
    private String soyad;

    public _002_Personel(int sicilNo, String ad, String soyad) {
        this.sicilNo = sicilNo;
        this.ad = ad;
        this.soyad = soyad;
    }

    public int getSicilNo() {
        return sicilNo;
    }

    public void setSicilNo(int sicilNo) {
        this.sicilNo = sicilNo;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", _002_Personel.class.getSimpleName() + "[", "]")
                .add("sicilNo=" + sicilNo)
                .add("ad='" + ad + "'")
                .add("soyad='" + soyad + "'")
                .toString();
    }

    // Personel sınıfını queue da tutabilmek için Comparable interface ini implement edilmeli
    @Override
    public int compareTo(_002_Personel p) {

        if ( this.getSicilNo() < p.getSicilNo() ) {
            return -1;
        }

        else if ( this.getSicilNo() > p.getSicilNo() ) {
            return 1;
        }
        else {
            return 0;
        }
    }


    public static void main(String[] args) {


        Queue<_002_Personel> personelQueue = new PriorityQueue<>();

        personelQueue.add(new _002_Personel(123, "Zeki", "Çalışkan"));
        personelQueue.add(new _002_Personel(101, "Gökhan", "Çelik"));
        personelQueue.add(new _002_Personel(158, "Ahmet", "Emre"));
        personelQueue.add(new _002_Personel(144, "Fatoş", "Çalışkan"));

        System.out.println("Queue muzdaki elemanlar: ");

        while (!personelQueue.isEmpty()) {
            System.out.println("Çıkan eleman: " + personelQueue.poll());
        }


    }

}
