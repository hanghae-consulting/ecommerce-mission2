package com.example.kafka.config;

import com.example.kafka.Event;
import io.confluent.kafka.serializers.KafkaAvroDeserializer;
import io.confluent.kafka.serializers.KafkaAvroDeserializerConfig;
import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.common.serialization.StringDeserializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.config.ConcurrentKafkaListenerContainerFactory;
import org.springframework.kafka.core.*;

import java.util.HashMap;
import java.util.Map;

@EnableKafka
@Configuration
public class KafkaConsumerConfig {
    @Bean
    public ConsumerFactory<String, Event> consumerFactory(){
        // TODO #1: Kafka Consumer Factory를 생성하는 메서드를 구현하세요.
        // 요구사항:
        // - Kafka 서버의 bootstrap 설정을 구성해야 합니다.
        // - StringDeserializer와 KafkaAvroDeserializer를 사용하여 메시지를 역직렬화해야 합니다.
        // - Schema Registry를 설정하여 Avro 메시지를 읽을 수 있도록 해야 합니다.
        // - specific.avro.reader 옵션이 true 여야 합니다.
    }

    @Bean
    public ConcurrentKafkaListenerContainerFactory<String, Event> kafkaListenerContainerFactory(){
        // TODO #2: Kafka Listener Container Factory를 생성하는 메서드를 구현하세요.
        // 요구사항:
        // - consumerFactory를 사용하여 Kafka 리스너를 생성해야 합니다.
        // - 메시지를 처리할 수 있도록 설정해야 합니다.
    }
}
