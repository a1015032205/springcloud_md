![image-20200804211728090](NACOS.assets/image-20200804211728090.png)

![image-20200804211805776](nacos.assets/image-20200804211805776.png)

# https://github.com/alibaba/spring-cloud-alibaba/blob/master/README-zh.md

![image-20200804212053946](nacos.assets/image-20200804212053946.png)

![image-20200804212332123](nacos.assets/image-20200804212332123.png)

![image-20200804212759088](nacos.assets/image-20200804212759088.png)

![image-20200804213731058](nacos.assets/image-20200804213731058.png)

新建nacos模块

父工程引入

```
<dependencyManagement>
    <dependencies>
        <dependency>
            <groupId>com.alibaba.cloud</groupId>
            <artifactId>spring-cloud-alibaba-dependencies</artifactId>
            <version>2.1.1.BUILD-SNAPSHOT</version>
            <type>pom</type>
            <scope>import</scope>
        </dependency>
    </dependencies>
</dependencyManagement>
```

子模块

```java
<dependency>
    <groupId>com.alibaba.cloud</groupId>
    <artifactId>spring-cloud-starter-alibaba-nacos-discovery</artifactId>
</dependency>
```

安装nacos  双击启动

![image-20200804224548283](nacos.assets/image-20200804224548283.png)

![image-20200804224557412](nacos.assets/image-20200804224557412.png)

![image-20200804225357632](nacos.assets/image-20200804225357632.png)

![image-20200804225418248](nacos.assets/image-20200804225418248.png)

![image-20200804225658194](nacos.assets/image-20200804225658194.png)

建立9001  9002  copy  虚拟9003

![image-20200804231248210](nacos.assets/image-20200804231248210.png)

![image-20200804231352197](nacos.assets/image-20200804231352197.png)

![image-20200804232224185](nacos.assets/image-20200804232224185.png)

![image-20200804233546380](nacos.assets/image-20200804233546380.png)

![image-20200804233551570](nacos.assets/image-20200804233551570.png)

![image-20200804233556892](nacos.assets/image-20200804233556892.png)

内部自己整合了ribbon  

![image-20200804233638648](nacos.assets/image-20200804233638648.png)

![image-20200804233941299](nacos.assets/image-20200804233941299.png)

![image-20200804233951398](nacos.assets/image-20200804233951398.png)

![image-20200804234052033](nacos.assets/image-20200804234052033.png)