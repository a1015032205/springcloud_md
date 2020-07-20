# 微服务定义：

![image-20200708214335733](C:\Users\秒度\AppData\Roaming\Typora\typora-user-images\image-20200708214335733.png)

![image-20200708214407019](C:\Users\秒度\AppData\Roaming\Typora\typora-user-images\image-20200708214407019.png)![image-20200708214422294](C:\Users\秒度\AppData\Roaming\Typora\typora-user-images\image-20200708214422294.png)

![image-20200708214458491](C:\Users\秒度\AppData\Roaming\Typora\typora-user-images\image-20200708214458491.png)![image-20200708214539497](C:\Users\秒度\AppData\Roaming\Typora\typora-user-images\image-20200708214539497.png)![image-20200708214625842](C:\Users\秒度\AppData\Roaming\Typora\typora-user-images\image-20200708214625842.png)





# 京东架构

![image-20200708214817866](C:\Users\秒度\AppData\Roaming\Typora\typora-user-images\image-20200708214817866.png)



# 阿里架构

![image-20200708214844618](C:\Users\秒度\AppData\Roaming\Typora\typora-user-images\image-20200708214844618.png)



![image-20200708214935891](C:\Users\秒度\AppData\Roaming\Typora\typora-user-images\image-20200708214935891.png)

![image-20200708214924469](C:\Users\秒度\AppData\Roaming\Typora\typora-user-images\image-20200708214924469.png)





![image-20200708215014764](C:\Users\秒度\AppData\Roaming\Typora\typora-user-images\image-20200708215014764.png)

![image-20200708215125917](C:\Users\秒度\AppData\Roaming\Typora\typora-user-images\image-20200708215125917.png)



![image-20200708215218561](C:\Users\秒度\AppData\Roaming\Typora\typora-user-images\image-20200708215218561.png)







# 微服务版本介绍





![image-20200708215239611](C:\Users\秒度\AppData\Roaming\Typora\typora-user-images\image-20200708215239611.png)



![image-20200708215902496](C:\Users\秒度\AppData\Roaming\Typora\typora-user-images\image-20200708215902496.png) 

![image-20200708220132074](C:\Users\秒度\AppData\Roaming\Typora\typora-user-images\image-20200708220132074.png)![image-20200708220235139](C:\Users\秒度\AppData\Roaming\Typora\typora-user-images\image-20200708220235139.png)

![image-20200708220350313](C:\Users\秒度\AppData\Roaming\Typora\typora-user-images\image-20200708220350313.png)

![image-20200708220426786](C:\Users\秒度\AppData\Roaming\Typora\typora-user-images\image-20200708220426786.png) 

![image-20200708221742004](C:\Users\秒度\AppData\Roaming\Typora\typora-user-images\image-20200708221742004.png) 





# maven聚合工程

![image-20200708231040011](C:\Users\秒度\AppData\Roaming\Typora\typora-user-images\image-20200708231040011.png)



![image-20200708231302827](C:\Users\秒度\AppData\Roaming\Typora\typora-user-images\image-20200708231302827.png)





# EUREKA介绍

![image-20200715210644792](C:\Users\秒度\AppData\Roaming\Typora\typora-user-images\image-20200715210644792.png)

![image-20200715210716155](C:\Users\秒度\AppData\Roaming\Typora\typora-user-images\image-20200715210716155.png)![image-20200715210723695](C:\Users\秒度\AppData\Roaming\Typora\typora-user-images\image-20200715210723695.png)![image-20200715211015303](C:\Users\秒度\AppData\Roaming\Typora\typora-user-images\image-20200715211015303.png)



# 单机EUREKA

![image-20200715211423998](C:\Users\秒度\AppData\Roaming\Typora\typora-user-images\image-20200715211423998.png)





![image-20200715215056536](C:\Users\秒度\AppData\Roaming\Typora\typora-user-images\image-20200715215056536.png)

 

![image-20200715230406492](C:\Users\秒度\AppData\Roaming\Typora\typora-user-images\image-20200715230406492.png)





搭建EUREKA 集群

![image-20200720201901835](C:\Users\秒度\AppData\Roaming\Typora\typora-user-images\image-20200720201901835.png)



![image-20200720202305653](C:\Users\秒度\AppData\Roaming\Typora\typora-user-images\image-20200720202305653.png)

# eureka相互注册

![image-20200720202355614](C:\Users\秒度\AppData\Roaming\Typora\typora-user-images\image-20200720202355614.png)

服务提供者和服务消费者

![image-20200720205250301](C:\Users\秒度\AppData\Roaming\Typora\typora-user-images\image-20200720205250301.png)

![image-20200720205313893](C:\Users\秒度\AppData\Roaming\Typora\typora-user-images\image-20200720205313893.png)

# 访问测试

![image-20200720205630894](C:\Users\秒度\AppData\Roaming\Typora\typora-user-images\image-20200720205630894.png)



# 搭建服务提供者集群



![image-20200720210611656](C:\Users\秒度\AppData\Roaming\Typora\typora-user-images\image-20200720210611656.png)

# 新建8002和8003，在controller加入port

![image-20200720213015316](C:\Users\秒度\AppData\Roaming\Typora\typora-user-images\image-20200720213015316.png)

# 修改服务消费者的服务提供者的服务地址 注意加个/  不然代码要加

![image-20200720220030577](C:\Users\秒度\AppData\Roaming\Typora\typora-user-images\image-20200720220030577.png)



# 提供负载均衡能力

![image-20200720213259312](C:\Users\秒度\AppData\Roaming\Typora\typora-user-images\image-20200720213259312.png)

![image-20200720213310967](C:\Users\秒度\AppData\Roaming\Typora\typora-user-images\image-20200720213310967.png)