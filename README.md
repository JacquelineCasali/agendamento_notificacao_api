# Cenário
O Magalu tem o desafio de desenvolver uma plataforma de comunicação. Você foi
escolhido(a) para iniciar o desenvolvimento da primeira sprint.

# Objetivo
O objetivo nesta sprint é o de prover 3 serviços (endpoints) relativos ao envio de comunicação
da empresa.
1. Agendamento de envio de comunicação;
2. Consulta do envio da comunicação;
3. Cancelamento do envio da comunicação.

# Requisitos
   1. Criar um endpoint que receba uma solicitação de agendamento de envio de comunicação (1);
   Este endpoint precisa ter, no mínimo, os seguintes campos:
   • Data/Hora para o envio
   • Destinatário
   • Mensagem a ser entregue
   2. Os possíveis formatos de comunicação que podem ser enviados são:
   • email, sms, push e whatsapp
   Neste momento, precisamos deste canal de entrada para realizar o agendamento do envio, ou
   seja, este endpoint (1).
   O envio em si não será desenvolvido nesta etapa: você não precisa se preocupar com a
   implementação do envio propriamente dito.


## 🛠 Tecnologias utilizadas

- **[Java 17]**
- **[Spring Boot]**
- **[JPA / Hibernate]**
- **[Maven]**
- **[Postman]**
- **[springdoc]**
- **[postgresql]**
- **[cors]**
  
## Como executar o projeto 

Pré-requisitos: Java 17

 # clonar repositório
git clone https://github.com/JacquelineCasali/dslist-java

# entrar na pasta do projeto back end

# executar o projeto
./mvnw spring-boot:run

Autora
Jacqueline Casali

https://www.linkedin.com/in/jaquelinecasali/






