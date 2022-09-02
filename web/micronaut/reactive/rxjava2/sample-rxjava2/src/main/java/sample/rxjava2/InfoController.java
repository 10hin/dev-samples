package sample.rxjava2;

import io.micronaut.http.annotation.*;

@Controller("/info")
public class InfoController {

    @Get(uri="/", produces="text/plain")
    public String index() {
        return "Example Response";
    }
}