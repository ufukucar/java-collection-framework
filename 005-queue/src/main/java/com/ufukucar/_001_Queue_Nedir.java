package com.ufukucar;

import java.util.PriorityQueue;
import java.util.Queue;

public class _001_Queue_Nedir {
    public static void main(String[] args) {

        System.out.println("FIFO mantığı ile çalışır... ");
        System.out.println("PriorityQueue içeriden sıralı değildir, ama elemanları öncelik sırasına göre çıkarır.");
        System.out.println("toString() çıktısı veya for-each ile dolanmak sıralı görünüm vermez!");
        System.out.println("Gerçek sıralı görünüm için poll() ile sırayla çıkarmak gerekir!");
        System.out.println("add() ve offer() ekleme için kullanılır. add () Exception atar, offer() atmaz!\n");

        System.out.println("*********************************************");

        Queue<Integer> priorityQueue = new PriorityQueue<>();

        priorityQueue.add(10);
        priorityQueue.offer(3);
        priorityQueue.add(7);
        priorityQueue.add(30);

        System.out.println("Heap içindeki görüntüsü: " + priorityQueue);

        System.out.println("*********************************************");

        while (!priorityQueue.isEmpty()) {
            System.out.print(priorityQueue.poll() + " ");
        }
        System.out.println("\n*********************************************");

        System.out.println(priorityQueue.peek());

        System.out.println("\n*********************************************");

        priorityQueue.add(10);
        priorityQueue.offer(3);
        priorityQueue.add(7);
        priorityQueue.add(30);

        System.out.println("Heap içindeki görüntüsü: " + priorityQueue);
        System.out.println("Temizliyoruz....");
        priorityQueue.clear();
        System.out.println(priorityQueue.peek());
        System.out.println("\n*********************************************");



    }
}