package rule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: 秒度
 * @Email: fangxin.md@Gmail.com
 * @Date: 2020-07-25 18:10
 * @Description: 修改ribbon的负载均衡策略
 */
@Configuration
public class MyRule {
    @Bean
    public IRule getRule() {
        return new RandomRule();
    }
}
