package com.houkai.c3_jmm;


import com.mashibing.jvm.agent.ObjectSizeAgent;

public class T03_SizeOfAnObject {
    /**
     * 压缩后
     * 16
     * 16
     * 32
     * 不压缩
     * 16
     * 24
     * 40
     * @param args
     */
    public static void main(String[] args) {
        //Padding对齐，8的倍数
        //对象头8,指针引用(分压缩和不压缩,压缩是4,不压缩是8),如果是8不加padding,如果是4得加4padding,不压缩:16,压缩后16
        System.out.println(ObjectSizeAgent.sizeOf(new Object()));
        //对象头8,指针引用(分压缩和不压缩,压缩是4,不压缩是8),再加上4个数组长度,如果压缩就不加padding,如果不压缩需要加4padding,不压缩:24,压缩后16
        System.out.println(ObjectSizeAgent.sizeOf(new int[] {}));
        //对象头8,指针引用(分压缩和不压缩,压缩是4,不压缩是8),id是4,name是4,age是4,b1是1,b2是1,o是4,b3是1,不压缩:40,压缩后32
        System.out.println(ObjectSizeAgent.sizeOf(new P()));
    }

    //一个Object占多少个字节
    // -XX:+UseCompressedClassPointers -XX:+UseCompressedOops
   // -XX:-UseCompressedClassPointers表示不压缩
    // Oops = ordinary object pointers
    private static class P {
                        //8 _markword
                        //4 _class pointer
        int id;         //4
        String name;    //4
        int age;        //4

        byte b1;        //1
        byte b2;        //1

        Object o;       //4
        byte b3;        //1

    }
}
