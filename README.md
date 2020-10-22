# interview

## 收集整理了平时遇到的面试题


- [数据结构&算法](#数据结构&算法)
- [设计模式](#设计模式)
- [JVM](#JVM)
- [数据库](#数据库)
- [系统设计](#系统设计)
- [文章](#文章)


### 数据结构&算法
1. Hash表的时间复杂度为什么是O(1)

### 设计模式
1. 说说你熟悉的设计模式

### JVM
1. 内存溢出跟内存泄漏有什么区别
  - 内存溢出是说程序需要申请的内存超过了JVM当前可以分配的最大内存，溢出。
  - 内存泄漏是说期望被回收的内存对象没有被回收，泄漏。
  - 内存泄露持续发生，很可能引起内存溢出。

### 数据库
1. 为什么PrepareStatement性能更好更安全
2. 为什么数据库用 B+ 树而不是二叉树存储数据
3. 分别说说 MySQL 中的 binlog、redo log、undo log
4. 事务提交的过程中，是怎么记录日志的

### 系统设计
1. 你们的系统有哪些数据不一直的地方，是怎么解决的

### 文章
[互斥锁、自旋锁、读写锁、悲观锁、乐观锁的应用场景](https://mp.weixin.qq.com/s/6QrQ0TZVqSQq26Rms0_mvA)