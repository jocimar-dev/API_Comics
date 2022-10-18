package com.pattern.contoller;

import com.pattern.model.ComicsResponse;
import com.pattern.service.ComicsService;
import com.pattern.service.impl.ComicsServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.HttpStatus.OK;

@RestController
@AllArgsConstructor
@RequestMapping("/marvel")
public class ComicsController {
    private ComicsService service;

    @ResponseStatus(OK)
    @GetMapping("/comics")
    public ComicsResponse buscarTodos() {
        return service.buscarTodos();
    }





}
