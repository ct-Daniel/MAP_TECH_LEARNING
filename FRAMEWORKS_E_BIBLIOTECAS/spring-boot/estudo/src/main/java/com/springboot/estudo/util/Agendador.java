package com.springboot.estudo.util;

import com.springboot.estudo.service.PessoaImpl;
import com.springboot.estudo.service.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@EnableScheduling
public class Agendador {

    @Autowired
    private PessoaImpl service;

    @Scheduled(cron = "10 0 0 * * *")
    public void verificar_por_hora() {
        service.apaga_cache();
    }

}
