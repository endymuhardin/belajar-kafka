package id.artivisi.belajar.belajarkafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class Penerima {

    private static final Logger logger = LoggerFactory.getLogger(Penerima.class);

    @KafkaListener(topics = "belajarkafka")
    public void terimaPesan(String msg) {
        logger.info("Menerima pesan : [{}]",msg);
    }
}
