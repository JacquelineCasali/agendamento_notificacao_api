package com.casalitech.agendamento_notificacao_api.repositores;

import com.casalitech.agendamento_notificacao_api.entides.Agendamento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AgendamentoRepository extends JpaRepository<Agendamento, Long> {


}
