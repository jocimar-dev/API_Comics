package com.pattern.service;

import com.pattern.model.ComicsResponse;

public interface ComicsService {
    ComicsResponse buscarTodos();

    String gerarHash(Long horaTransacao);


}
