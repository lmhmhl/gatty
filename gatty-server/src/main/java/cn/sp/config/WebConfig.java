package cn.sp.config;

import cn.sp.filter.PluginFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.config.EnableWebFlux;

/**
 * @Author: Gatty
 * @Description:
 * @Date: Created in 2020/12/25
 */
@Configuration
@EnableWebFlux
@EnableConfigurationProperties(ServerConfigProperties.class)
public class WebConfig {

    @Bean
    public PluginFilter pluginFilter(@Autowired ServerConfigProperties properties) {
        return new PluginFilter(properties);
    }
}
