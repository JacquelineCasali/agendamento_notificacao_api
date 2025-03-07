package com.casalitech.agendamento_notificacao_api.dto;

import java.time.LocalDateTime;

import com.casalitech.agendamento_notificacao_api.enums.StatusNotificacaoEnum;
import com.fasterxml.jackson.annotation.JsonFormat;
public record AgendamentoRecordOut(
Long id,
        String emailDestinatario,
        String telefoneDestinatario,
        String mensagem,
        @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy HH:mm:ss")
        LocalDateTime dataHoraEnvio,
StatusNotificacaoEnum statusNotificacao
) {
}
