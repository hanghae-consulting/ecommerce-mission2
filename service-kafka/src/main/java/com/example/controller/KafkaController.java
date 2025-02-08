package com.example.controller;

import com.example.kafka.Event;
import com.example.kafka.KafkaProducer;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/kafka")
public class KafkaController {
    private final KafkaProducer kafkaProducer;

    KafkaController(KafkaProducer kafkaProducer) {
        this.kafkaProducer = kafkaProducer;
    }

    @PostMapping("/send")
    public String sendMessage(@RequestBody Event message){
        // TODO #1: 메시지를 Kafka의 기본 토픽으로 전송하는 기능을 구현하세요.
        // 요구사항:
        // - 메시지를 지정된 기본 토픽으로 전송합니다.
        // - 메시지는 JSON 형식으로 변환되어야 합니다.
    }

    @PostMapping("/send/topic/{topic}/key/{key}")
    public String sendKeyMessage(@PathVariable String topic, @PathVariable String key, @RequestBody Event message){
        // TODO #2: 키 값을 포함하여 특정 토픽으로 메시지를 전송하는 기능을 구현하세요.
        // 요구사항:
        // - 지정된 키를 사용하여 특정 토픽으로 메시지를 전송합니다.
        // - 키를 기반으로 메시지가 특정 파티션으로 라우팅되어야 합니다.
    }

    @PostMapping("/send/many/{topic}")
    public String sendManyMessage(@PathVariable String topic, @RequestBody Event message){
        // TODO #3: 10,000개의 메시지를 특정 토픽으로 반복 전송하는 기능을 구현하세요.
        // 요구사항:
        // - 하나의 요청으로 10,000개의 메시지를 순차적으로 전송합니다.
        // - 각 메시지의 아이디는 순서대로 0~9999 입니다.
    }

    @PostMapping("/send/many/{topic}/key/{key}")
    public String sendKeyWithMessage(@PathVariable String topic, @PathVariable String key, @RequestBody Event message){
        // TODO #4: 키 값을 포함하여 10,000개의 메시지를 특정 토픽으로 반복 전송하는 기능을 구현하세요.
        // 요구사항:
        // - 지정된 키를 사용하여 10,000개의 메시지를 특정 토픽으로 전송합니다.
        // - 각 메시지의 아이디는 순서대로 0~9999 입니다.
    }
}
