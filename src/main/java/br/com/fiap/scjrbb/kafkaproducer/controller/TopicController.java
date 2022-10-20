package br.com.fiap.scjrbb.kafkaproducer.controller;

import br.com.fiap.scjrbb.kafkaproducer.producer.TopicProducer;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping(value = "/kafka")
public class TopicController {

    @Autowired
    private TopicProducer producer;

    @GetMapping(value = "/send")
    public void send(){
        producer.sendToTopic("Mensagem a ser enviada para o Kafka");
    }
}
