package es.spuertes.projecticaro.webboard.service;

import es.spuertes.projecticaro.webboard.domain.model.AprsResponse;

import java.util.List;

public interface AprsCaller {

    AprsResponse getLocation(List<String> aprsIds);

    AprsResponse getMessage(List<String> aprsIds);

    AprsResponse getWeather(List<String> aprsIds);
}
