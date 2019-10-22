package com.zhy;

import java.util.Random;

public class Consumer implements Runnable {


    private Integer total = 10000;

    private Object obj = new Object();

    @Override
    public void run() {
       while(true){
           synchronized (obj){
               if(total>=1){
                   try {
                       int sleepTime =  new Random().nextInt(10)+1;
                       Thread.sleep(sleepTime);
                       System.out.println("程序休眠了"+sleepTime+"毫秒！");
                   } catch (InterruptedException e) {
                       e.printStackTrace();
                   }
                   total--;
                   System.out.println(Thread.currentThread().getName()+"卖出了一张票，还剩"+total+"票");
               }else{
                   System.exit(0);
               }
           }
       }
    }
}
