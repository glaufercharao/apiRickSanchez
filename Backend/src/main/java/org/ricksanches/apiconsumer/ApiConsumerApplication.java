package org.ricksanches.apiconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class ApiConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApiConsumerApplication.class, args);
    }

}
