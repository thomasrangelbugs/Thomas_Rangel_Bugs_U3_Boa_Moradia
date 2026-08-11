# U3 — Diagrama de Casos de Uso — Imobiliária Boa Moradia

**Aluno:** Thomas Rangel Bugs  
**Atores obrigatórios:** Cliente e Vendedor  
**Objetivo:** modelar uma possível automação para consulta online de imóveis e agendamento de visitas.

## UC01 — Consultar imóveis
**Ator principal:** Cliente  
**Finalidade:** permitir que o cliente consulte os imóveis representados pela imobiliária.  
**Fluxo básico:** o cliente acessa a consulta; o sistema apresenta os imóveis disponíveis; o cliente pode selecionar um imóvel para obter mais informações.

## UC02 — Visualizar detalhes do imóvel
**Ator principal:** Cliente  
**Finalidade:** apresentar as informações do imóvel escolhido.  
**Fluxo básico:** o cliente seleciona um imóvel; o sistema mostra os dados cadastrados e as informações necessárias para avaliar o interesse.

## UC03 — Agendar visita
**Ator principal:** Cliente  
**Finalidade:** permitir a solicitação de uma visita ao imóvel de interesse.  
**Fluxo básico:** o cliente escolhe o imóvel, informa uma data/horário disponível e confirma; o sistema registra o agendamento para acompanhamento da imobiliária.

## UC04 — Consultar meus agendamentos
**Ator principal:** Cliente  
**Finalidade:** permitir que o cliente confira as visitas solicitadas.  
**Fluxo básico:** o sistema localiza os agendamentos vinculados ao cliente e apresenta imóvel, data, horário e situação da visita.

## UC05 — Manter cadastro de imóveis
**Ator principal:** Vendedor  
**Finalidade:** manter a relação de imóveis representados pela imobiliária atualizada.  
**Fluxo básico:** o vendedor cadastra um novo imóvel ou seleciona um imóvel existente; informa/altera dados; o sistema valida e grava as informações.

## UC06 — Consultar agenda de visitas
**Ator principal:** Vendedor  
**Finalidade:** permitir o acompanhamento dos agendamentos feitos pelos clientes.  
**Fluxo básico:** o vendedor acessa a agenda; o sistema apresenta as visitas registradas com imóvel, cliente, data, horário e situação.

## UC07 — Confirmar / atualizar status da visita
**Ator principal:** Vendedor  
**Finalidade:** permitir que o vendedor confirme ou atualize a situação de uma visita.  
**Fluxo básico:** o vendedor seleciona um agendamento; define a situação correspondente; o sistema salva a alteração.

## Observação de modelagem
O cenário solicitado exige exatamente os atores **Cliente** e **Vendedor**. Por isso, o diagrama não adiciona atores externos desnecessários. Os casos de uso representam as principais interações entre esses dois papéis e o aplicativo da Boa Moradia.
