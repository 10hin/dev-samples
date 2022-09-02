package sample.reactor;

import io.micronaut.http.annotation.*;
import reactor.core.publisher.Mono;

import java.util.Map;

@Controller("/info")
public class InfoController {

    @Get(uri="/", produces="application/json; charset=utf-8")
    public Mono<Map<String, Object>> index() {
        return Mono.just(Map.of(
                "programming-language", "Java",
                "web-framework", "micronaut",
                "build-tool", "maven"
        ));
    }

}