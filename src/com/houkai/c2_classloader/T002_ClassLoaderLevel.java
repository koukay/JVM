package com.houkai.c2_classloader;

import sun.misc.Launcher;

public class T002_ClassLoaderLevel {
    public static void main(String[] args) {
//        Launcher
        System.out.println("String.class.getClassLoader() --->"+String.class.getClassLoader());//bootstrap
        System.out.println("sun.awt.HKSCS.class.getClassLoader() --->"+sun.awt.HKSCS.class.getClassLoader());//bootstrap
        System.out.println("sun.net.spi.nameservice.dns.DNSNameService.class.getClassLoader() --->"+sun.net.spi.nameservice.dns.DNSNameService.class.getClassLoader());//sun.misc.Launcher$ExtClassLoader@677327b6
        System.out.println("T002_ClassLoaderLevel.class.getClassLoader() --->"+T002_ClassLoaderLevel.class.getClassLoader());//我们自己写的,用sun.misc.Launcher$AppClassLoader@18b4aac2
        System.out.println("sun.net.spi.nameservice.dns.DNSNameService.class.getClassLoader().getClass().getClassLoader() --->"+sun.net.spi.nameservice.dns.DNSNameService.class.getClassLoader().getClass().getClassLoader());//bootstrap
        System.out.println("T002_ClassLoaderLevel.class.getClassLoader().getClass().getClassLoader() --->"+T002_ClassLoaderLevel.class.getClassLoader().getClass().getClassLoader());//bootstrap
        System.out.println("new T006_MSBClassLoader().getParent() --->"+new T006_MSBClassLoader().getParent());
        System.out.println("ClassLoader.getSystemClassLoader() --->"+ClassLoader.getSystemClassLoader());
        System.out.println("Integer.class.getClassLoader()  "+Integer.class.getClassLoader());//bootstrap
    }
}
