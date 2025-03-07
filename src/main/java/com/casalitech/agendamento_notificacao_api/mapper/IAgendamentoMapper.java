package com.casalitech.agendamento_notificacao_api.mapper;

import com.casalitech.agendamento_notificacao_api.dto.AgendamentoRecord;
import com.casalitech.agendamento_notificacao_api.dto.AgendamentoRecordOut;
import com.casalitech.agendamento_notificacao_api.entides.Agendamento;
import com.casalitech.agendamento_notificacao_api.repositores.AgendamentoRepository;
import org.mapstruct.Mapper;

import static org.mapstruct.MappingConstants.ComponentModel.SPRING;

@Mapper(componentModel = SPRING)
public interface IAgendamentoMapper {

    Agendamento paraEntity (AgendamentoRecord agendamento);
    AgendamentoRecordOut paraOut (Agendamento agendamento);

}
