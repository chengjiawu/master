package com.example.demo.comm;

import com.amazonaws.util.DateUtils;
import freemarker.template.utility.DateUtil;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Test {
    public static void main(String[] args) {

    }

}

class CreadThread implements Runnable{
private String ThreadName;
public CreadThread(String ThreadName){
    this.ThreadName = ThreadName;
}
    @Override
    public void run() {
        System.out.println("现在线程"+ThreadName);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
