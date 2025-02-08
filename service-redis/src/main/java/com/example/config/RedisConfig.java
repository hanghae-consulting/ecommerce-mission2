package com.example.config;

import com.example.cache.CacheSubscriber;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisClusterConfiguration;
import org.springframework.data.redis.connection.lettuce.LettuceConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.listener.PatternTopic;
import org.springframework.data.redis.listener.RedisMessageListenerContainer;
import org.springframework.data.redis.listener.adapter.MessageListenerAdapter;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

@Configuration
@EnableRedisHttpSession
public class RedisConfig {
    @Bean
    public LettuceConnectionFactory redisConnectionFactory(){
        // TODO #1: Redis 클러스터 연결을 위한 ConnectionFactory를 생성하세요.
        // 요구사항:
        // - Redis 클러스터 구성을 사용해야 합니다.
        // - 클러스터 노드 정보를 설정해야 합니다.
    }

    @Bean
    public RedisTemplate<String, Object> redisTemplate(LettuceConnectionFactory redisConnectionFactory){
        // TODO #2: RedisTemplate을 생성하여 Redis에 데이터를 저장하고 가져오는 기능을 구현하세요.
        // 요구사항:
        // - 주어진 ConnectionFactory를 사용해야 합니다.
        // - Redis에 데이터를 직렬화 및 역직렬화할 수 있어야 합니다.
    }
}
