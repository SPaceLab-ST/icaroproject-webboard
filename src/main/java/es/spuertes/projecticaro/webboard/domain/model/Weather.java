package es.spuertes.projecticaro.webboard.domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Weather extends Entry{

    private String temp;
    private String pressure;
    private String humidity;
    private String wind_direction;
    private String wind_speed;
    private String wind_gust;
    private String rain_1h;
    private String rain_24h;
    private String rain_mn;
    private String luminosity;

}
