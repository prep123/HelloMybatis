Is there a way to read file with classpath

1. 先设计数据库的表和字段

2. 构建实体
  - 实体的字段要和对应的表完全一致
  - 实体不应该有构造函数
  
3. insert 是时候要commit！！！

4. MyBatis 的文档真烂

出异常的时候返回的是null值
异常处理是逃不掉了的，除非静默
失败，留下安全隐患，不然肯定
要有几个逻辑处理异常

外部连接的创建和关闭
也是逃不掉的，除非你像内存一样
搞个垃圾回收机制

计算机有的时候真的和很蠢！！！

- 数据库的表和字段

- 确定 Entity

- REST API

- 在简单的写好controler

- 确定dao层

- 确定MyBatis 动态SQL

- 实现，测试dao层

- 实现controller

上面基本就是原型开发阶段


dao接口 方法名

insertOne
deleteOne
selectMany


xml id 命名规范 后面填上实体
的名称作为后缀，保证唯一性

insertOneUser
selectManyUsers

null 和异常处理还没有做