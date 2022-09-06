package es.spuertes.projecticaro.webboard.service;

import es.spuertes.projecticaro.webboard.domain.model.AprsResponse;
import org.json.JSONObject;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface JSONObjectToAprsWeatherResponse {
    JSONObjectToAprsWeatherResponse MAPPER = Mappers.getMapper(JSONObjectToAprsWeatherResponse.class);

    AprsResponse JSONObjectToAprsResponse(JSONObject jsonObject);
}
