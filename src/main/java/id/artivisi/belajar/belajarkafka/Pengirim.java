package id.artivisi.belajar.belajarkafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class Pengirim {
    @Autowired private KafkaTemplate<String, String> kafkaTemplate;

    public void kirim(String pesan){
        kafkaTemplate.send("belajarkafka", pesan);
    }
}
