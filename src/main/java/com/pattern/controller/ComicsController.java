package com.pattern.controller;

import com.pattern.model.ComicsResponse;
import com.pattern.service.ComicsService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.HttpStatus.OK;

@RestController
@AllArgsConstructor
@RequestMapping("/marvel")
public class ComicsController {

    @Autowired
    private ComicsService service;

    @ResponseStatus(OK)
    @GetMapping("/comics")
    public ComicsResponse buscarTodos() {
        return service.buscarTodos();
    }





}
