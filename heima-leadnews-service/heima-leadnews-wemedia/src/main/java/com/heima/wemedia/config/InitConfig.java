package com.heima.wemedia.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * 扫描feign接口，使得可以让spring来管理
 */
@Configuration
@ComponentScan("com.heima.apis.article.fallback")
public class InitConfig {
}
