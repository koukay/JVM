package com.houkai.c5_gc;

import java.util.LinkedList;
import java.util.List;

//-XX:+PrintGCDetails -XX:+UseConcMarkSweepGC -XX:+PrintFlagsFinal -XX:+PrintVMOptions -
//-XX:+PrintCommandLineFlags
//-Xmn10M -Xms40M -Xmx60M -XX:+PrintCommandLineFlags -XX:+PrintGC
//-XX:+UseConcMarkSweepGC -XX:+PrintCommandLineFlags -XX:+PrintGC
public class T01_HelloGC {
    public static void main(String[] args) {
        System.out.println("HelloGC!");
        List list = new LinkedList();
        for(;;) {
            byte[] b = new byte[1024*1024];
            list.add(b);
        }
    }
}
