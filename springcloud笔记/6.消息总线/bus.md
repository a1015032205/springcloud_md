![image-20200803195829876](bus.assets/image-20200803195829876.png)

![image-20200803195943226](bus.assets/image-20200803195943226.png)

![image-20200803200019103](bus.assets/image-20200803200019103.png)

![image-20200803200214357](bus.assets/image-20200803200214357.png)

![image-20200803205214588](bus.assets/image-20200803205214588.png)

新建3366

![image-20200803205455583](bus.assets/image-20200803205455583.png)

![image-20200803205539083](bus.assets/image-20200803205539083.png)

![image-20200803205608413](bus.assets/image-20200803205608413.png)

![image-20200803205631558](bus.assets/image-20200803205631558.png)

3344添加依赖

![image-20200803205813750](bus.assets/image-20200803205813750.png)

![image-20200803210048830](bus.assets/image-20200803210048830.png)

![image-20200803210104270](bus.assets/image-20200803210104270.png)

修改3355 3366  添加上面的依赖和yml的rabbitmq部分  不用暴露端点

启动服务  修改git上的config

# curl -X POST "HTTP://配置中心IP:配置中心端口/actuator/bus-refresh"

![image-20200803212312705](bus.assets/image-20200803212312705.png)

![image-20200803212323361](bus.assets/image-20200803212323361.png)

![image-20200803212334321](bus.assets/image-20200803212334321.png)

# 均已生效

![image-20200803212435708](bus.assets/image-20200803212435708.png)

![image-20200803212451569](bus.assets/image-20200803212451569.png)

![image-20200803212628631](bus.assets/image-20200803212628631.png)

![image-20200803212659557](bus.assets/image-20200803212659557.png)

![image-20200803212819163](bus.assets/image-20200803212819163.png)

# curl -X POST "HTTP://配置中心IP:配置中心端口/actuator/bus-refresh/微服务名称:需要生效的端口"

![image-20200803213440273](bus.assets/image-20200803213440273.png)

![image-20200803213536848](bus.assets/image-20200803213536848.png)

![image-20200803213544455](bus.assets/image-20200803213544455.png)

# 实现3355生效  3366不生效

![image-20200803213727109](bus.assets/image-20200803213727109.png)