# 总结
## springboot集成logback+slf4j

1.导入相关依赖
```xml
    <dependency>
        <groupId>org.projectlombok</groupId>
        <artifactId>lombok</artifactId>
        <optional>true</optional>
    </dependency>
```

日志注解：@Slf4j

在application.properties配置logback文件路径
logback的xml文件命名需以spring结尾
```xml
    <!-- 加载上下文配置 -->
    <property resource="application.properties"/>
    <springProperty scope="context" name="LOG_LEVEL" source="log.level"/>
```
可从配置文件控制日志等级

文件分割、保存日志有效期

        
        