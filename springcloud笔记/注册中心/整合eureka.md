# 微服务定义：

![image-20200708214335733](typora-user-images/image-20200708214335733.png)

![image-20200708214407019](typora-user-images/image-20200708214407019.png)![image-20200708214422294](typora-user-images/image-20200708214422294.png)

![image-20200708214458491](typora-user-images/image-20200708214458491.png)![image-20200708214539497](typora-user-images/image-20200708214539497.png)![image-20200708214625842](typora-user-images/image-20200708214625842.png)





# 京东架构

![image-20200708214817866](typora-user-images/image-20200708214817866.png)



# 阿里架构

![image-20200708214844618](typora-user-images/image-20200708214844618.png)



![image-20200708214935891](typora-user-images/image-20200708214935891.png)

![image-20200708214924469](typora-user-images/image-20200708214924469.png)





![image-20200708215014764](typora-user-images/image-20200708215014764.png)

![image-20200708215125917](typora-user-images/image-20200708215125917.png)



![image-20200708215218561](typora-user-images/image-20200708215218561.png)







# 微服务版本介绍





![image-20200708215239611](typora-user-images/image-20200708215239611.png)



![image-20200708215902496](typora-user-images/image-20200708215902496.png) 

![image-20200708220132074](typora-user-images/image-20200708220132074.png)![image-20200708220235139](typora-user-images/image-20200708220235139.png)

![image-20200708220350313](typora-user-images/image-20200708220350313.png)

![image-20200708220426786](typora-user-images/image-20200708220426786.png) 

![image-20200708221742004](typora-user-images/image-20200708221742004.png) 





# maven聚合工程

![image-20200708231040011](typora-user-images/image-20200708231040011.png)



![image-20200708231302827](typora-user-images/image-20200708231302827.png)





# EUREKA介绍

![image-20200715210644792](typora-user-images/image-20200715210644792.png)

![image-20200715210716155](typora-user-images/image-20200715210716155.png)![image-20200715210723695](typora-user-images/image-20200715210723695.png)![image-20200715211015303](typora-user-images/image-20200715211015303.png)



# 单机EUREKA

![image-20200715211423998](typora-user-images/image-20200715211423998.png)





![image-20200715215056536](typora-user-images/image-20200715215056536.png)

 

![image-20200715230406492](typora-user-images/image-20200715230406492.png)





搭建EUREKA 集群

![image-20200720201901835](typora-user-images/image-20200720201901835.png)



![image-20200720202305653](typora-user-images/image-20200720202305653.png)

# eureka相互注册

![image-20200720202355614](typora-user-images/image-20200720202355614.png)

服务提供者和服务消费者

![image-20200720205250301](typora-user-images/image-20200720205250301.png)

![image-20200720205313893](typora-user-images/image-20200720205313893.png)

# 访问测试

![image-20200720205630894](typora-user-images/image-20200720205630894.png)



# 搭建服务提供者集群



![image-20200720210611656](typora-user-images/image-20200720210611656.png)

# 新建8002和8003，在controller加入port

![image-20200720213015316](typora-user-images/image-20200720213015316.png)

# 修改服务消费者的服务提供者的服务地址 注意加个/  不然代码要加

![image-20200720220030577](typora-user-images/image-20200720220030577.png)



# 提供负载均衡能力

![image-20200720213259312](typora-user-images/image-20200720213259312.png)

![image-20200720213310967](typora-user-images/image-20200720213310967.png)

# 修改服务名称和IP显示

![image-20200722202110186](typora-user-images/image-20200722202110186.png)

![image-20200722202543131](typora-user-images/image-20200722202543131.png)

# 服务发现Discovery

![image-20200722202754578](typora-user-images/image-20200722202754578.png)



![image-20200722205546158](typora-user-images/image-20200722205546158.png)

![image-20200722210440574](typora-user-images/image-20200722210440574.png)

![image-20200722205627381](typora-user-images/image-20200722205627381.png)

# 访问测试

![image-20200722210409063](typora-user-images/image-20200722210409063.png)





# eureka自我保护

![image-20200722210951616](typora-user-images/image-20200722210951616.png)

![image-20200722211009176](typora-user-images/image-20200722211009176.png)

![image-20200722211200160](typora-user-images/image-20200722211200160.png)

![image-20200722211356044](typora-user-images/image-20200722211356044.png)

![image-20200722211428984](typora-user-images/image-20200722211428984.png)



# 修改eureka的心跳时间

服务端

![image-20200722212333432](typora-user-images/image-20200722212333432.png)

客户端

![image-20200722212405697](typora-user-images/image-20200722212405697.png)

# eureka停更说明

