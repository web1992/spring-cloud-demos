package com.gbdfn.springcloud.springclouddemos;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @link {http://127.0.0.1:1122/hello}
 */
@RestController
@Slf4j
public class HelloController {
    @Autowired
    private DiscoveryClient client;

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String index() {

        log.info("client info {}", client);
        return "Hello World";

    }
}
