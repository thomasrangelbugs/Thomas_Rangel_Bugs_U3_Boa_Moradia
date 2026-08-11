/**
 * U3 - Exemplo didático de automação da Imobiliária Boa Moradia.
 * Aluno: Thomas Rangel Bugs
 *
 * IMPORTANTE:
 * A atividade pede um DIAGRAMA DE CASOS DE USO. Este código é material extra
 * para demonstrar, de forma simples, como as funções representadas no diagrama
 * poderiam existir em um software.
 */
public class BoaMoradiaService {

    /**
     * Consulta os imóveis disponíveis no sistema.
     * Em uma aplicação real, este método buscaria os dados em um banco de dados
     * e poderia receber filtros como cidade, bairro, valor e tipo de imóvel.
     */
    public void consultarImoveis() {
        System.out.println("Listando imóveis disponíveis...");
    }

    /**
     * Exibe os detalhes de um imóvel selecionado pelo cliente.
     * @param idImovel identificador do imóvel que será consultado.
     */
    public void visualizarDetalhesImovel(int idImovel) {
        System.out.println("Exibindo detalhes do imóvel: " + idImovel);
    }

    /**
     * Registra uma solicitação de visita feita pelo cliente.
     * @param idImovel imóvel que o cliente deseja visitar.
     * @param dataHora data e horário escolhidos para a visita.
     */
    public void agendarVisita(int idImovel, String dataHora) {
        System.out.println("Visita agendada para o imóvel " + idImovel + " em " + dataHora);
    }

    /**
     * Mostra os agendamentos vinculados a um cliente.
     * @param idCliente identificador do cliente.
     */
    public void consultarMeusAgendamentos(int idCliente) {
        System.out.println("Consultando agendamentos do cliente: " + idCliente);
    }

    /**
     * Cadastra ou atualiza um imóvel no sistema.
     * Esta é uma função típica do ator Vendedor.
     * @param idImovel identificador do imóvel.
     * @param descricao descrição resumida do imóvel.
     */
    public void manterCadastroImovel(int idImovel, String descricao) {
        System.out.println("Salvando imóvel " + idImovel + ": " + descricao);
    }

    /**
     * Permite que o vendedor visualize todas as visitas registradas.
     * Em um sistema real, poderia receber uma data como filtro.
     */
    public void consultarAgendaVisitas() {
        System.out.println("Exibindo agenda de visitas...");
    }

    /**
     * Atualiza o estado de uma visita, por exemplo: PENDENTE, CONFIRMADA ou REALIZADA.
     * @param idAgendamento identificador do agendamento.
     * @param novoStatus situação que será gravada.
     */
    public void atualizarStatusVisita(int idAgendamento, String novoStatus) {
        System.out.println("Agendamento " + idAgendamento + " atualizado para " + novoStatus);
    }
}
