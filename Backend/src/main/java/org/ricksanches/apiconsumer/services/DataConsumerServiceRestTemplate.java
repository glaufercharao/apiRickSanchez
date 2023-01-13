package org.ricksanches.apiconsumer.services;

import org.ricksanches.apiconsumer.entities.ResultCharacter;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

@Service
public class DataConsumerServiceRestTemplate {

    public ResultCharacter findCharacterByName(String name){
        String URL = "https://rickandmortyapi.com/api/character?name=";
        RestTemplate restTemplate = new RestTemplate();
        ResultCharacter resultCharacter = restTemplate.getForObject(URL+name,
                ResultCharacter.class);
        return resultCharacter;
    }
}
