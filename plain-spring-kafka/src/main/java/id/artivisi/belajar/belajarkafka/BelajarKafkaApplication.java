package id.artivisi.belajar.belajarkafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

import java.util.Date;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

@SpringBootApplication @EnableKafka
public class BelajarKafkaApplication implements CommandLineRunner {
	public static Logger logger = LoggerFactory.getLogger(BelajarKafkaApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(BelajarKafkaApplication.class, args).close();
	}

    private final CountDownLatch latch = new CountDownLatch(1);
	@Autowired private Pengirim pengirim;

    @Override
    public void run(String... strings) throws Exception {
        System.out.println("Menjalankan Aplikasi Belajar Kafka");
        pengirim.kirim("Halo Dunia, waktu saat ini : "+new Date());
        System.out.println("Pesan terkirim, menunggu 30 detik");
        latch.await(30, TimeUnit.SECONDS);
    }
}
