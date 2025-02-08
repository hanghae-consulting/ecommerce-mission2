package com.example.config;

import org.redisson.Redisson;
import org.redisson.api.RedissonClient;
import org.redisson.config.Config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RedissonConfig {

    @Bean
    public RedissonClient redissonClient() {
        // TODO #1: Redisson 클라이언트를 생성하는 메서드를 구현하세요.
        // 요구사항:
        // - Redis 클러스터 모드를 사용해야 합니다.
        // - 모든 Redis 노드를 설정해야 합니다.
        // - 클러스터 스캔 간격을 2초로 설정해야 합니다.
    }
}
