package com.pattern.client;

import com.pattern.model.ComicsResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "marvel", url = "${chamada.marvel}/v1/public")
public interface MarvelClient {

    @GetMapping("/comics")
    ComicsResponse buscarTodos(@RequestParam("ts") Long ts,
                                      @RequestParam("apikey") String apikey,
                                      @RequestParam("hash") String hash);
}
