package id.artivisi.belajar.belajarkafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class Penerima {

    @KafkaListener(topics = "belajarkafka")
    public void terimaPesan(String msg) {
        System.out.println("Pesan : "+msg);
    }
}
