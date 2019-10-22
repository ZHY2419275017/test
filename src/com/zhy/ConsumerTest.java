package com.zhy;

public class ConsumerTest {

    public static void main(String[] args) {

        Consumer consumer =  new Consumer();

        Thread thread01 = new Thread(consumer,"1号窗口");
        Thread thread02 = new Thread(consumer,"2号窗口");
        Thread thread03 = new Thread(consumer,"3号窗口");
        Thread thread04 = new Thread(consumer,"4号窗口");

        thread01.start();
        thread02.start();
        thread03.start();
        thread04.start();




    }
}
