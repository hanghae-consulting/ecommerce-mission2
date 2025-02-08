package com.example.kafka.config;

import com.example.kafka.Event;
import io.confluent.kafka.serializers.KafkaAvroSerializer;
import org.apache.kafka.clients.admin.NewTopic;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.common.serialization.StringSerializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.core.DefaultKafkaProducerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.core.ProducerFactory;

import java.util.HashMap;
import java.util.List;

@EnableKafka
@Configuration
public class KafkaProducerConfig {
    @Bean
    public ProducerFactory<String, Event> producerFactory(){
        // TODO #1: Kafka Producer Factory를 생성하는 메서드를 구현하세요.
        // 요구사항:
        // - Kafka 서버의 bootstrap 설정을 구성해야 합니다.
        // - StringSerializer와 KafkaAvroSerializer를 사용하여 메시지를 직렬화해야 합니다.
        // - Schema Registry를 설정하여 Avro 메시지를 사용할 수 있도록 해야 합니다.
    }

    @Bean
    public KafkaTemplate<String, Event> kafkaTemplate(){
        // TODO #2: KafkaTemplate을 생성하는 메서드를 구현하세요.
        // 요구사항:
        // - producerFactory를 사용하여 KafkaTemplate을 생성해야 합니다.
    }

    @Bean
    public List<NewTopic> defaultTopic() {
        // TODO #3: 기본 Kafka 토픽을 생성하는 메서드를 구현하세요.
        // 요구사항:
        // - 최소 하나의 기본 토픽을 생성해야 합니다.
        // - 토픽의 파티션 수와 복제 계수를 설정해야 합니다.
    }
}
