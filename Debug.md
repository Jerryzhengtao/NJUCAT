# Debug记录

## 3.3 

Hibernate根据实体类自动创建表失败（comment，user表成功，blog表失败）

错误显示blog表和另外两个表id外键关联失败

1.发现每个实体类id字段相同，怀疑字段冲突，遂改名，分别从id 改为userId，blogId，commentId

结果：失败

2.发现id字段类型有差别，Long和long，遂将更改类型

结果：失败

3.检查Blog实体类发现有属性like，怀疑和数据库保留字冲突，遂更改属性名like为likes

结果：bug解决，建表成功

