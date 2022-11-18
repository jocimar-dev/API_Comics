package com.pattern.service.impl;

import com.pattern.client.MarvelClient;
import com.pattern.model.ComicsResponse;
import com.pattern.service.ComicsService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.Date;

import static org.springframework.util.DigestUtils.md5DigestAsHex;

@Service
@AllArgsConstructor
public class ComicsServiceImpl implements ComicsService {
    private static final String PUBLIC_KEY = "${public.key}";
    private static final String PRIVATE_KEY = "${private.key}";

    @Autowired
    private MarvelClient client;

    public ComicsResponse buscarTodos() {
        var timeStamp = new Date().getTime();
        return client.buscarTodos(timeStamp, PUBLIC_KEY, PRIVATE_KEY);
    }
    public String gerarHash(Long horaTransacao) {
        return md5DigestAsHex((horaTransacao + PRIVATE_KEY + PUBLIC_KEY).getBytes());
    }
}
