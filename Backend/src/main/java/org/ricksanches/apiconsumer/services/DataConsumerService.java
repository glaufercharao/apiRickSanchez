package org.ricksanches.apiconsumer.services;

import org.ricksanches.apiconsumer.config.FeignConfig;
import org.ricksanches.apiconsumer.entities.ResultCharacter;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Service
@FeignClient(url = "https://rickandmortyapi.com", name = "apiRickSanchez", configuration = FeignConfig.class)
public interface DataConsumerService {

    @GetMapping("/api/character/")
    ResultCharacter findAllCharacter(@RequestParam String name);
}
