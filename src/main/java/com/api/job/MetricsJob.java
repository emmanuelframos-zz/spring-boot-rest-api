package com.api.job;

import com.api.integration.service.RedisService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class MetricsJob {

    private DateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    private RestTemplate restTemplate;

    private RedisService redisService;

    @Value("${metrics.endpoint}")
    private String metricsEndpoint;

    public MetricsJob(RestTemplate restTemplate, RedisService redisService){
        this.restTemplate = restTemplate;
        this.redisService = redisService;
    }

    @Scheduled(cron = "0 */1 * * * *")
    public void saveMetrics(){
        ResponseEntity<String> response = restTemplate.getForEntity(metricsEndpoint, String.class);
        String metrics = response.getBody();
        redisService.put(simpleDateFormat.format(new Date()), metrics);
    }
}