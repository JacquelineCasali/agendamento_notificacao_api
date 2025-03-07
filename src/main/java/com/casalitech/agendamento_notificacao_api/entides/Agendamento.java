package com.casalitech.agendamento_notificacao_api.entides;

import com.casalitech.agendamento_notificacao_api.enums.StatusNotificacaoEnum;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Table(name="agendamento")
@Entity
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Agendamento {

    @Id
    // auto incrementado
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;
    private  String emailDestinatario;
    private  String telefoneDestinatario;
    private LocalDateTime dataHoraEnvio;
    private LocalDateTime dataHoraAgendamento;
    private  LocalDateTime dataHoraModificacao;
    private  String mensagem;
    private StatusNotificacaoEnum statusNotificacao;

    // PrePersist grava automaticamente no banco
@PrePersist
    private void prePersist(){
    dataHoraAgendamento=LocalDateTime.now();
    statusNotificacao=StatusNotificacaoEnum.AGENDADO;
}
}
