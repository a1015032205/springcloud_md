# 分布式问题

![image-20200727195537374](Hystrix.assets/image-20200727195537374.png)

## 服务雪崩

![image-20200727195616648](Hystrix.assets/image-20200727195616648.png)



# Hystrix 

![image-20200727195638141](Hystrix.assets/image-20200727195638141.png)

![image-20200727200324554](Hystrix.assets/image-20200727200324554.png)

![image-20200727200518702](Hystrix.assets/image-20200727200518702.png)

![image-20200727200446640](Hystrix.assets/image-20200727200446640.png)

# 新建payment-hystrix8001模块

![image-20200727210428373](Hystrix.assets/image-20200727210428373.png)

通过jmeter压测试 超时接口20000并发

![image-20200727210512515](Hystrix.assets/image-20200727210512515.png)

![image-20200727210518603](Hystrix.assets/image-20200727210518603.png)

# 结果 OK接口服务缓慢 或无法访问！

![image-20200727210705017](Hystrix.assets/image-20200727210705017.png)





# 新建80hystrix模块

![image-20200727215241190](Hystrix.assets/image-20200727215241190.png)

# 远程调用8001成功后  压测8001的超时接口  然后自己在调OK接口  失败！

![image-20200727215331015](Hystrix.assets/image-20200727215331015.png)

![image-20200727215426822](Hystrix.assets/image-20200727215426822.png)

![image-20200727220126671](Hystrix.assets/image-20200727220126671.png)

![image-20200727220246039](Hystrix.assets/image-20200727220246039.png)

![image-20200727220600417](Hystrix.assets/image-20200727220600417.png)

# 8001hystrix加入依赖 超时或者异常处理

![image-20200727220916842](Hystrix.assets/image-20200727220916842.png)

![image-20200727221418805](Hystrix.assets/image-20200727221418805.png)

![image-20200727221427776](Hystrix.assets/image-20200727221427776.png)

# test

![image-20200727221735413](Hystrix.assets/image-20200727221735413.png)



# 80消费者加入hystrix

![image-20200727222937244](Hystrix.assets/image-20200727222937244.png)

![image-20200728204548634](Hystrix.assets/image-20200728204548634.png)

![image-20200728204445170](Hystrix.assets/image-20200728204445170.png)



![image-20200728204612339](Hystrix.assets/image-20200728204612339.png)

![image-20200728204431970](Hystrix.assets/image-20200728204431970.png)

## 全局降级方法

![image-20200728205011873](Hystrix.assets/image-20200728205011873.png)



![image-20200728205942665](Hystrix.assets/image-20200728205942665.png)

![image-20200728211150791](Hystrix.assets/image-20200728211150791.png)



![image-20200728211205297](Hystrix.assets/image-20200728211205297.png)

关闭8001  进行测试  服务降级成功  优先级：方法>controller>server

![image-20200728211243795](Hystrix.assets/image-20200728211243795.png)

# 服务熔断	

![image-20200728211537436](Hystrix.assets/image-20200728211537436.png)

概念

![image-20200728211613136](Hystrix.assets/image-20200728211613136.png)

![image-20200728211759237](Hystrix.assets/image-20200728211759237.png)

![image-20200728212606985](Hystrix.assets/image-20200728212606985.png)

![image-20200728212821403](Hystrix.assets/image-20200728212821403.png)

![image-20200728212925650](Hystrix.assets/image-20200728212925650.png)

![image-20200728213039595](Hystrix.assets/image-20200728213039595.png)

# 8001服务实现类

![image-20200728220348736](Hystrix.assets/image-20200728220348736.png)

![image-20200728220357258](Hystrix.assets/image-20200728220357258.png)



# test：现正常访问，没问题，在连续输入负数访问 在窗口期达到错误率  在输入正数访问  刚开始几次不行  后来可以正常提供服务



![image-20200728220735367](Hystrix.assets/image-20200728220735367.png)

![image-20200728220757335](Hystrix.assets/image-20200728220757335.png)

![image-20200728220807005](Hystrix.assets/image-20200728220807005.png)

![image-20200728221033189](Hystrix.assets/image-20200728221033189.png)

# 服务熔断开启和关闭条件

![image-20200728221057560](Hystrix.assets/image-20200728221057560.png)



![image-20200728221302868](Hystrix.assets/image-20200728221302868.png)

![image-20200728221310132](Hystrix.assets/image-20200728221310132.png)

ALL参数配置说明

![image-20200728221423355](Hystrix.assets/image-20200728221423355.png)

![image-20200728221544521](Hystrix.assets/image-20200728221544521.png)

![image-20200728221626055](Hystrix.assets/image-20200728221626055.png)

![image-20200728221640383](Hystrix.assets/image-20200728221640383.png)

![image-20200728221702301](Hystrix.assets/image-20200728221702301.png)

![image-20200728221715513](Hystrix.assets/image-20200728221715513.png)

![image-20200728222520683](Hystrix.assets/image-20200728222520683.png)

![image-20200728222902136](Hystrix.assets/image-20200728222902136.png)

![image-20200728222939932](Hystrix.assets/image-20200728222939932.png)

![image-20200728223055969](Hystrix.assets/image-20200728223055969.png)



# Hystrix可视化 搭建9001模块

![image-20200728223140356](Hystrix.assets/image-20200728223140356.png)

![image-20200728223324054](Hystrix.assets/image-20200728223324054.png)

![image-20200728223904662](Hystrix.assets/image-20200728223904662.png)

![image-20200728224006915](Hystrix.assets/image-20200728224006915.png)

# http://localhost:9001/hystrix

![image-20200728224024036](Hystrix.assets/image-20200728224024036.png)

# 在8001的启动类加入系列配置

![image-20200728225559824](Hystrix.assets/image-20200728225559824.png)

![image-20200728224208799](Hystrix.assets/image-20200728224208799.png)



![image-20200728225858923](Hystrix.assets/image-20200728225858923.png)

# 访问之后才有图出来

![image-20200728225828597](Hystrix.assets/image-20200728225828597.png)

![image-20200728224601380](Hystrix.assets/image-20200728224637068.png)

![image-20200728230011142](Hystrix.assets/image-20200728230011142.png)

![image-20200728224625037](Hystrix.assets/image-20200728224625037.png)

![image-20200728224650344](Hystrix.assets/image-20200728224650344.png)

![image-20200728224727444](Hystrix.assets/image-20200728224727444.png)