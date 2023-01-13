package org.ricksanches.apiconsumer.resources;

import org.ricksanches.apiconsumer.entities.ResultCharacter;
import org.ricksanches.apiconsumer.services.DataConsumerService;
import org.ricksanches.apiconsumer.services.DataConsumerServiceRestTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class DataConsumerResource {

    @Autowired
    private DataConsumerService dataConsumerService;

    @Autowired
    private DataConsumerServiceRestTemplate restTemplate;

    @GetMapping(name = "{name}")
    public ResponseEntity<ResultCharacter> findAllCharacter(@RequestParam String name){
        ResultCharacter resultCharacter =  dataConsumerService.findAllCharacter(name);

        return resultCharacter.getResults().isEmpty() ?
                ResponseEntity.notFound().build() : ResponseEntity.ok().body(resultCharacter);
    }

/* //Crie duas formas de fazer uma consulta a api rest. Por Feign e RestTemplate.

    @GetMapping(name = "{name}")
    public ResponseEntity<ResultCharacter> findCharacterByName(@RequestParam String name){
        ResultCharacter resultCharacter =  restTemplate.findCharacterByName(name);

        return resultCharacter.getResults().isEmpty() ?
                ResponseEntity.notFound().build() : ResponseEntity.ok().body(resultCharacter);
    }

 */
}
