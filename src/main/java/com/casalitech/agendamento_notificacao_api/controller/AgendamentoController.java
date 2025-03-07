package com.casalitech.agendamento_notificacao_api.controller;

import com.casalitech.agendamento_notificacao_api.dto.AgendamentoRecord;
import com.casalitech.agendamento_notificacao_api.dto.AgendamentoRecordOut;
import com.casalitech.agendamento_notificacao_api.service.AgendamentoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/agendamento")

public class AgendamentoController {

    private  final AgendamentoService agendamentoService;

    @PostMapping
    public ResponseEntity<AgendamentoRecordOut>gravarAgendamento(@RequestBody AgendamentoRecord agendamentoRecord){
   return  ResponseEntity.ok(agendamentoService.gravarAgendamento(agendamentoRecord));

    }
}
