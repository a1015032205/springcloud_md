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

安装nacos   在bin下运行  以单机启动

# startup.cmd -m standalone

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

# 配置中心

![image-20200805213748906](nacos.assets/image-20200805213748906.png)

![image-20200805213823402](nacos.assets/image-20200805213823402.png)

![image-20200805213911365](nacos.assets/image-20200805213911365.png)

![image-20200805213935475](nacos.assets/image-20200805213935475.png)

![image-20200805214056484](nacos.assets/image-20200805214056484.png)

![image-20200805214123845](nacos.assets/image-20200805214123845.png)

![image-20200805214249479](nacos.assets/image-20200805214249479.png)

![image-20200805214439027](nacos.assets/image-20200805214439027.png)

![image-20200805214524344](nacos.assets/image-20200805214524344.png)

![image-20200805214626250](nacos.assets/image-20200805214626250.png)

![image-20200805214638187](nacos.assets/image-20200805214638187.png)

# 再次注意！接口方法不能为private

![image-20200805230307610](nacos.assets/image-20200805230307610.png)

修改nacos  及时更新

![image-20200805231137332](nacos.assets/image-20200805231137332.png)

![image-20200805231306481](nacos.assets/image-20200805231306481.png)

![image-20200805231320358](nacos.assets/image-20200805231320358.png)

![image-20200805231427146](nacos.assets/image-20200805231427146.png)

DataID 就是dev  test 环境区别

# group

![image-20200805232431518](nacos.assets/image-20200805232431518.png)

![image-20200805232422485](nacos.assets/image-20200805232422485.png)

![image-20200805232341928](nacos.assets/image-20200805232341928.png)

![image-20200805232727267](nacos.assets/image-20200805232727267.png)

# namespace

![image-20200805233024864](nacos.assets/image-20200805233024864.png)

![image-20200805233105437](nacos.assets/image-20200805233105437.png)

![image-20200805233800697](nacos.assets/image-20200805233800697.png)

![image-20200805233751320](nacos.assets/image-20200805233751320.png)

# 集群和持久化

![image-20200805234131973](nacos.assets/image-20200805234131973.png)

![image-20200805234318458](nacos.assets/image-20200805234318458.png)

![image-20200805234450925](nacos.assets/image-20200805234450925.png)

![image-20200805234841221](nacos.assets/image-20200805234841221.png)

![image-20200806002033899](nacos.assets/image-20200806002033899.png)

修改DB的配置  修改cluster.conf

![image-20200806003043633](nacos.assets/image-20200806003043633.png)

![image-20200806003051701](nacos.assets/image-20200806003051701.png)

![image-20200806003335372](nacos.assets/image-20200806003335372.png)

![image-20200806003537695](nacos.assets/image-20200806003537695.png)

![image-20200807213243770](nacos.assets/image-20200807213243770.png)



![image-20200806220149943](nacos.assets/image-20200806220149943.png) ![image-20200806220312296](nacos.assets/image-20200806220312296.png)

启动3个nacos 加入 -p 端口

![image-20200806220826182](nacos.assets/image-20200806220826182.png)