package sample.rxjava3;

import io.micronaut.http.annotation.*;
import io.reactivex.rxjava3.core.Single;

import java.util.Map;

@Controller("/info")
public class InfoController {

    @Get(uri="/", produces="application/json; charset=utf-8")
    public Single<Map<String, Object>> index() {
        return Single.just(Map.of(
                "programming-language", "Java",
                "web-framework", "micronaut",
                "build-tool", "maven"
        ));
    }

}