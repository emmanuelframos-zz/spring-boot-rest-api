package com.api.job;

import com.api.integration.service.RedisService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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

    private static Logger logger = LoggerFactory.getLogger(MetricsJob.class);

    private DateFormat simpleDateFormat = new SimpleDateFormat("ddMMyyyyHHmm");

    private RestTemplate restTemplate;

    private RedisService redisService;

    @Value("${metrics.endpoint}")
    private String metricsEndpoint;

    public MetricsJob(RestTemplate restTemplate, RedisService redisService){
        this.restTemplate = restTemplate;
        this.redisService = redisService;
    }

    @Scheduled(cron = "0 */5 * * * *")
    public void saveMetrics(){
        ResponseEntity<String> response = restTemplate.getForEntity(metricsEndpoint, String.class);
        String metrics = response.getBody();
        logger.info("Sending metrics to cache.");
        redisService.put(simpleDateFormat.format(new Date()), metrics);
    }
}