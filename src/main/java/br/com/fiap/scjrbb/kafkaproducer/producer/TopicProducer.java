package br.com.fiap.scjrbb.kafkaproducer.producer;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class TopicProducer {
    @Value("${topic.name.producer}")
    private String topicName;

    @Autowired
    private KafkaTemplate<String, String> template;

    private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(TopicProducer.class);

    public void sendToTopic(String message){
        log.info("Payload enviado {}", message);
        template.send(topicName, message);
    }
}
