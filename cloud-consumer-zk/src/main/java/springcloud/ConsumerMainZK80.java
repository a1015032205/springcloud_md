package springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author: 秒度
 * @Email: fangxin.md@Gmail.com
 * @Date: 2020-07-09 23:22
 * @Description: 服务消费者80端口
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ConsumerMainZK80 {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerMainZK80.class);
    }
}
