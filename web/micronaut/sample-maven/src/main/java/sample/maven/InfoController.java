package sample.maven;

import io.micronaut.http.annotation.*;

@Controller("/info")
public class InfoController {

    @Get(uri="/", produces="")
    public Map<String, Object> index() {
        return Map.of(
                "programming-langage", "Java",
                "web-framework", "micronaut",
                "build-tool", "maven"
        );
    }

}