package com.example.demo;

import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

import java.util.Map;

@RestController
public class InfoController {
    public Mono<Map<String, Object>> getInfo() {
        return Mono.just(Map.of(
                "programming-language", "Java",
                "web-framework", "micronaut",
                "build-tool", "maven"
        ));
    }
}
