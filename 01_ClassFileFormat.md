# JVM

## 1：JVM基础知识

1. 什么是JVM
   1. java虚拟机,跨语言的平台,实现java跨平台
   2. 可以实现多种语言跨平台,只要该语言可以编译成.class文件
   3. 解释执行.class文件
2. 常见的JVM
   1. Hotspot oracle
   2. Jrocket BEA被oracle收购
   3. J9  IBM
   4. VM Microsoft
   5. TaobaoVM 阿里
   6. LiQuidVM 直接针对硬件 oracle
   7. zing azul最新垃圾回收的业界标杆

## 2：ClassFileFormat

1. 数据类型:u1 u2 u4 u8和_info(表类型)

   1. _info的来源是hotspot源码中的写法

2. 查看16进制格式的ClassFile

   1. sublime/notepad/
   2. IDEA插件-BinEd	

3. 有很多可以观察ByteCode的方法

   1. javap
   2. JBE-可以直接修改
   3. JClassLib-IDEA插件

4. classfile组成

   ClassFIle{

   ​		u4 magic;

   ​		u2 miner_version;

   ​		u2 major_version;

   ​		u2 constant_pool_count;

   ​		cp_info constant_pool[constant_pool_count - 1];

   ​		u2

   ​	}

## 3：类编译-加载-初始化

hashcode
锁的信息（2位 四种组合）
GC信息（年龄）
如果是数组，数组的长度

## 4：JMM

new Cat()
pointer -> Cat.class
寻找方法的信息

## 5：对象

1：句柄池 （指针池）间接指针，节省内存
2：直接指针，访问速度快

## 6：GC基础知识

栈上分配
TLAB（Thread Local Allocation Buffer）
Old
Eden
老不死 - > Old

## 7：GC常用垃圾回收器

new Object()
markword          8个字节
类型指针           8个字节
实例变量           0
补齐                  0		
16字节（压缩 非压缩）
Object o
8个字节 
JVM参数指定压缩或非压缩

