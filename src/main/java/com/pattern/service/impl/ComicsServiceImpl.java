package com.pattern.service.impl;

import com.pattern.client.MarvelClient;
import com.pattern.model.ComicsResponse;
import com.pattern.service.ComicsService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Date;

import static org.springframework.util.DigestUtils.md5DigestAsHex;

@Service
@AllArgsConstructor
public class ComicsServiceImpl implements ComicsService {
    private static final String PUBLIC_KEY = "${public.key}";
    private static final String PRIVATE_KEY = "${private.key}";
    private MarvelClient client;

    public ComicsResponse buscarTodos() {
        var horaTransacao = new Date().getTime();
        return client.buscarTodos(horaTransacao, PUBLIC_KEY, PRIVATE_KEY);
    }
    public String gerarHash(Long horaTransacao) {
        return md5DigestAsHex((horaTransacao + PRIVATE_KEY + PUBLIC_KEY).getBytes());
    }
}
