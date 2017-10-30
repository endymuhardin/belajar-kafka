package id.artivisi.belajar.belajarkafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class Pengirim {

    private static final Logger logger = LoggerFactory.getLogger(Pengirim.class);
    private String topic = "belajarkafka";
    @Autowired private KafkaTemplate<String, String> kafkaTemplate;


    public void kirim(String pesan){
        logger.info("Mengirim pesan [{}] ke topic [{}]", pesan, topic);
        kafkaTemplate.send(topic, pesan);
    }
}
