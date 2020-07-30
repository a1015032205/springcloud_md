# GateWay介绍



![image-20200730204852261](Gateway.assets/image-20200730204852261.png)

![image-20200730204919211](Gateway.assets/image-20200730204919211.png)

![image-20200730204930387](Gateway.assets/image-20200730204930387.png)

# 网关作用

![image-20200730205131997](Gateway.assets/image-20200730205131997.png)![image-20200730205142171](Gateway.assets/image-20200730205142171.png)

# Zuul 1.0

![image-20200730205228953](Gateway.assets/image-20200730205228953.png)

# Gateway特性

![image-20200730205310255](Gateway.assets/image-20200730205310255.png)

# Gateway与zuul的区别

![image-20200730205409073](Gateway.assets/image-20200730205409073.png)

# zuul 1.0 模型

![image-20200730205536155](Gateway.assets/image-20200730205536155.png)

![image-20200730205547097](Gateway.assets/image-20200730205547097.png)

# Gateway模型

![image-20200730205649982](Gateway.assets/image-20200730205649982.png)

# 三大核心概念 路由（route）  断言（predicate）  过滤（filter）

## 	![image-20200730210206321](Gateway.assets/image-20200730210206321.png)

![image-20200730210233913](Gateway.assets/image-20200730210233913.png)

![image-20200730210417060](Gateway.assets/image-20200730210417060.png)

![image-20200730210357068](Gateway.assets/image-20200730210357068.png)

![image-20200730210437699](Gateway.assets/image-20200730210437699.png)

新建gateway9257

![image-20200730211546093](Gateway.assets/image-20200730211546093.png)



![image-20200730212342314](Gateway.assets/image-20200730212342314.png)

# test 通过9527成功访问

![image-20200730213049827](Gateway.assets/image-20200730213049827.png)

# 两种配置

![image-20200730213154555](Gateway.assets/image-20200730213154555.png)

![image-20200730213211828](Gateway.assets/image-20200730213211828.png)

![image-20200730213310335](Gateway.assets/image-20200730213310335.png)

![image-20200730213419980](Gateway.assets/image-20200730213419980.png)

![image-20200730213716450](Gateway.assets/image-20200730213716450.png)

![image-20200730214829366](Gateway.assets/image-20200730214829366.png) 

![image-20200730215942286](Gateway.assets/image-20200730215942286.png)

![image-20200730221404665](Gateway.assets/image-20200730221404665.png)

# 断言

![image-20200730221348850](Gateway.assets/image-20200730221348850.png)

![image-20200730221432894](Gateway.assets/image-20200730221432894.png)

![image-20200730222700331](Gateway.assets/image-20200730222700331.png)

```
- After=2020-07-30T23:22:12.725+08:00[Asia/Shanghai] #在这个时间之后才生效
```

![image-20200730222603415](Gateway.assets/image-20200730222603415.png)

![image-20200730223658062](Gateway.assets/image-20200730223658062.png)

![image-20200730223722564](Gateway.assets/image-20200730223722564.png)

![image-20200730224053981](Gateway.assets/image-20200730224053981.png)

![image-20200730224136003](Gateway.assets/image-20200730224136003.png)

![image-20200730224154171](Gateway.assets/image-20200730224154171.png)

![image-20200730224230965](Gateway.assets/image-20200730224230965.png)

![image-20200730224256859](Gateway.assets/image-20200730224256859.png)

![image-20200730224331645](Gateway.assets/image-20200730224331645.png)

![image-20200730224407889](Gateway.assets/image-20200730224407889.png)

![image-20200730224431939](Gateway.assets/image-20200730224431939.png)

![image-20200730224453299](Gateway.assets/image-20200730224453299.png)

![image-20200730224511533](Gateway.assets/image-20200730224511533.png)

# 过滤器

![image-20200730224643808](Gateway.assets/image-20200730224643808.png)

![image-20200730224728972](Gateway.assets/image-20200730224728972.png)

![image-20200730224830342](Gateway.assets/image-20200730224830342.png)

![image-20200730224904156](Gateway.assets/image-20200730224904156.png)

![image-20200730231241333](Gateway.assets/image-20200730231241333.png)

# 自定义全局过滤器

![image-20200730224935968](Gateway.assets/image-20200730224935968.png)

![image-20200730230729437](Gateway.assets/image-20200730230729437.png)

问题  config和filter都失效