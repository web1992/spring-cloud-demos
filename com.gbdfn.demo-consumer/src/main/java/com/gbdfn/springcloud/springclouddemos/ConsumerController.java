package com.gbdfn.springcloud.springclouddemos;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @link {http://127.0.0.1:1122/hello}
 */
@RestController
@Slf4j
public class ConsumerController {
    @Autowired
    private DiscoveryClient client;

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(value = "/consumer", method = RequestMethod.GET)
    public String index() {

        return "FROM HELLO-SERVICE: " + restTemplate.getForEntity("http://HELLO-SERVICE/hello", String.class).getBody();

    }
}
