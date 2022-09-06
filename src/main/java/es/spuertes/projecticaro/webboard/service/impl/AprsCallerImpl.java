package es.spuertes.projecticaro.webboard.service.impl;

import es.spuertes.projecticaro.webboard.domain.model.AprsResponse;
import es.spuertes.projecticaro.webboard.service.AprsCaller;
import es.spuertes.projecticaro.webboard.service.JSONObjectToAprsWeatherResponse;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

import static es.spuertes.projecticaro.webboard.utils.AprsConstants.API_KEY;

@Service
public class AprsCallerImpl implements AprsCaller {

    @Value(API_KEY)
    private String apiKey;

    @Override
    public AprsResponse getLocation(List<String> aprsIds) {
        return null;
    }

    @Override
    public AprsResponse getMessage(List<String> aprsIds) {
        return null;
    }

    @Override
    public AprsResponse getWeather(List<String> aprsIds) {

        String ids = String.join(",", aprsIds);
        String url = "https://api.aprs.fi/api/get?name=" + ids + "&what=wx&apikey=" + apiKey + "&format=json";

        try {
            DefaultHttpClient httpClient = new DefaultHttpClient();
            HttpGet getRequest = new HttpGet(
                    url);
            getRequest.addHeader("accept", "application/json");

            HttpResponse response = httpClient.execute(getRequest);

            BufferedReader br = new BufferedReader(
                    new InputStreamReader((response.getEntity().getContent())));

            String responseText = br.readLine();

            JSONObject json = new JSONObject(responseText);
            JSONObjectToAprsWeatherResponse.MAPPER.JSONObjectToAprsResponse(json);

        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }
}
