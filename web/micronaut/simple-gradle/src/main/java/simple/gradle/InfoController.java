package simple.gradle;

import io.micronaut.http.annotation.*;

import java.util.Map;

@Controller("/info")
public class InfoController {

    @Get(uri="/", produces="application/json; charset=utf-8")
    public Map<String, Object> index() {
        return Map.of(
                "programming-language", "Java",
                "web-framework", "micronaut",
                "build-tool", "gradle"
        );
    }

}
