package com.gbdfn.springcloud.consumer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @link {http://127.0.0.1:5500/consumerHello}
 */
@RestController
@Slf4j
public class ConsumerController {

    @Value("${serviceName}")
    private String serviceName;

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(value = "/consumerHello", method = RequestMethod.GET)
    public String index() {

        return "FROM " + serviceName + ": " + restTemplate.getForEntity("http://" + serviceName + "/hello", String.class).getBody();

    }
}
