package org.ricksanches.apiconsumer.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Location {
    private String name;
    private String url;
}
