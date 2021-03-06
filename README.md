# interview

## 收集整理了平时遇到的面试题


- [数据结构&算法](#数据结构&算法)
- [设计模式](#设计模式)
- [Java基础](#Java基础)
- [JVM](#JVM)
- [数据库](#数据库)
- [Spring](#Spring)
- [系统设计](#系统设计)
- [文章](#文章)


### 数据结构&算法
1. Hash表的时间复杂度为什么是O(1)
2. HashMap 如何解决 Hash 冲突，为什么要将链表转为红黑树
3. HashMap 在多线程情况下会遇到什么问题
4.  如何用 1G 内存对 200G 的数据进行排序


### 设计模式
1. 说说你熟悉的设计模式
2. 说说 proxy 跟 decorator 的区别


### Java基础
1. 说说 Java 中几种 Map 的实现，都有什么特性
2. ConcurrentHashMap怎么实现线程安全的
3. Synchronized 四种锁状态的升级
4.  说说 volatile 的应用场景


### JVM
1. 内存溢出跟内存泄漏有什么区别
2. 说说 java.lang.NoClassDefFoundError 跟 java.lang.ClassNotFoundException 的区别
3. new一个对象过程中发生了什么


### 数据库
1. 为什么PrepareStatement性能更好更安全
2. 为什么数据库用 B+ 树而不是二叉树存储数据
3. 分别说说 MySQL 中的 binlog、redo log、undo log
4. 事务提交的过程中，是怎么记录日志的
5. 什么是索引下推
6. 什么是最左前缀原则
7. 什么是回表
8.  说说 MySQL 的垂直扩展与水平扩展
9. 说说 MySQL 中一条 SQL 的执行过程。在客户端输入一条命令，例如 `select * from t_test_a where id =1`，客户端跟服务端都发生了什么？


### Spring
1. @Autowired 跟 @Resource 有什么区别

### 系统设计
1. 你们的系统有哪些数据不一致的地方，是怎么解决的


### 文章
[互斥锁、自旋锁、读写锁、悲观锁、乐观锁的应用场景](https://mp.weixin.qq.com/s/6QrQ0TZVqSQq26Rms0_mvA)  
[分库分表 vs NewSQL数据库](https://mp.weixin.qq.com/s/9S-o2jy9YRt2U48LLSLldA)  
[synchronized四种锁状态的升级](https://blog.csdn.net/IPI715718/article/details/90243723)  
