package es.spuertes.projecticaro.webboard.batsh;

import es.spuertes.projecticaro.webboard.service.AprsCaller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Arrays;

import static es.spuertes.projecticaro.webboard.utils.AprsConstants.ICARO_ID;

@Component
public class AprsBackRunner {

    private AprsCaller aprsCaller;

    @Autowired
    public AprsBackRunner(AprsCaller aprsCaller){
        this.aprsCaller = aprsCaller;
    }

    @Scheduled(fixedRate = 5000)
    public void getValuesAprsWeb(){
        aprsCaller.getWeather(Arrays.asList(ICARO_ID));
    }
}
