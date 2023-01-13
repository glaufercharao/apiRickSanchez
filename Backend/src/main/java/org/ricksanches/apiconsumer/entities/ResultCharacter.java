package org.ricksanches.apiconsumer.entities;

import jdk.jfr.DataAmount;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResultCharacter {
    private List<Character> results = new ArrayList();
}
