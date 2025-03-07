package com.casalitech.agendamento_notificacao_api.service;

import com.casalitech.agendamento_notificacao_api.dto.AgendamentoRecord;
import com.casalitech.agendamento_notificacao_api.dto.AgendamentoRecordOut;
import com.casalitech.agendamento_notificacao_api.mapper.IAgendamentoMapper;
import com.casalitech.agendamento_notificacao_api.repositores.AgendamentoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class AgendamentoService {

    @Autowired
private final AgendamentoRepository agendamentoRepository;

private final IAgendamentoMapper agendamentoMapper;

public AgendamentoRecordOut gravarAgendamento(AgendamentoRecord agendamento){
return  agendamentoMapper.paraOut(
        agendamentoRepository.save(agendamentoMapper.paraEntity(agendamento)))
       ;
}

}
