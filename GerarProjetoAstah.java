import com.change_vision.jude.api.inf.AstahAPI;
import com.change_vision.jude.api.inf.editor.BasicModelEditor;
import com.change_vision.jude.api.inf.editor.IModelEditorFactory;
import com.change_vision.jude.api.inf.editor.ITransactionManager;
import com.change_vision.jude.api.inf.editor.UseCaseDiagramEditor;
import com.change_vision.jude.api.inf.editor.UseCaseModelEditor;
import com.change_vision.jude.api.inf.model.IAssociation;
import com.change_vision.jude.api.inf.model.IClass;
import com.change_vision.jude.api.inf.model.IModel;
import com.change_vision.jude.api.inf.model.IUseCase;
import com.change_vision.jude.api.inf.presentation.INodePresentation;
import com.change_vision.jude.api.inf.project.ProjectAccessor;

import java.awt.geom.Point2D;

/**
 * Gerador do projeto Astah da U3.
 *
 * Ao ser executado em um ambiente que tenha Astah UML/Professional e a API
 * configurada no classpath, cria o arquivo nativo:
 * Thomas_Rangel_Bugs_U3_Boa_Moradia.asta
 *
 * A API do Astah não é redistribuída neste pacote; ela acompanha/depende da
 * instalação licenciada do Astah.
 */
public class GerarProjetoAstah {

    /**
     * Ponto de entrada do programa.
     * Cria o projeto, inicia uma transação, monta os modelos e apresentações,
     * salva o .asta e fecha o projeto.
     */
    public static void main(String[] args) throws Exception {
        String caminho = args.length > 0
                ? args[0]
                : new java.io.File("Thomas_Rangel_Bugs_U3_Boa_Moradia.asta").getAbsolutePath();

        ProjectAccessor projeto = AstahAPI.getAstahAPI().getProjectAccessor();
        ITransactionManager transacao = projeto.getTransactionManager();

        try {
            // Cria o arquivo nativo de projeto do Astah.
            System.out.println("Criando: " + caminho);
            projeto.create(caminho);
            IModel raiz = projeto.getProject();

            // Toda criação/edição de modelos via Astah API deve ocorrer em transação.
            transacao.beginTransaction();

            criarDiagrama(projeto, raiz);

            // Confirma todas as alterações feitas no projeto.
            transacao.endTransaction();

            // Grava o conteúdo no arquivo .asta criado acima.
            projeto.save();
            projeto.close();

            System.out.println("Arquivo .asta criado com sucesso: " + caminho);
        } catch (Exception erro) {
            // Se ocorrer qualquer falha durante a edição, desfaz a transação.
            if (transacao.isInTransaction()) {
                transacao.abortTransaction();
            }
            throw erro;
        }
    }

    /**
     * Cria os dois atores obrigatórios, os casos de uso, as associações e
     * suas apresentações visuais no diagrama.
     */
    private static void criarDiagrama(ProjectAccessor projeto, IModel raiz) throws Exception {
        IModelEditorFactory modelos = projeto.getModelEditorFactory();
        UseCaseModelEditor useCaseModel = modelos.getUseCaseModelEditor();
        BasicModelEditor basicModel = modelos.getBasicModelEditor();

        // Cria os DOIS atores exigidos no enunciado.
        IClass cliente = useCaseModel.createActor(raiz, "Cliente");
        IClass vendedor = useCaseModel.createActor(raiz, "Vendedor");

        // Cria as funções (casos de uso) do Cliente.
        IUseCase consultarImoveis = useCaseModel.createUseCase(raiz, "Consultar imóveis");
        IUseCase visualizarDetalhes = useCaseModel.createUseCase(raiz, "Visualizar detalhes do imóvel");
        IUseCase agendarVisita = useCaseModel.createUseCase(raiz, "Agendar visita");
        IUseCase consultarMeusAgendamentos = useCaseModel.createUseCase(raiz, "Consultar meus agendamentos");

        // Cria as funções (casos de uso) do Vendedor.
        IUseCase manterCadastro = useCaseModel.createUseCase(raiz, "Manter cadastro de imóveis");
        IUseCase consultarAgenda = useCaseModel.createUseCase(raiz, "Consultar agenda de visitas");
        IUseCase atualizarStatus = useCaseModel.createUseCase(raiz, "Confirmar / atualizar status da visita");

        // Cria as associações do Cliente com seus casos de uso.
        IAssociation a1 = associar(basicModel, cliente, consultarImoveis);
        IAssociation a2 = associar(basicModel, cliente, visualizarDetalhes);
        IAssociation a3 = associar(basicModel, cliente, agendarVisita);
        IAssociation a4 = associar(basicModel, cliente, consultarMeusAgendamentos);

        // Cria as associações do Vendedor com seus casos de uso.
        IAssociation a5 = associar(basicModel, vendedor, manterCadastro);
        IAssociation a6 = associar(basicModel, vendedor, consultarAgenda);
        IAssociation a7 = associar(basicModel, vendedor, atualizarStatus);

        // Obtém o editor visual específico de diagrama de casos de uso.
        UseCaseDiagramEditor diagrama = projeto.getDiagramEditorFactory().getUseCaseDiagramEditor();
        diagrama.createUseCaseDiagram(raiz, "U3 - Boa Moradia - Casos de Uso");

        // Desenha o limite visual do sistema. O retângulo é apenas apresentação.
        diagrama.createRect(new Point2D.Double(180, 40), 680, 600);
        diagrama.createText("Aplicativo Boa Moradia", new Point2D.Double(205, 55));

        // Posiciona atores fora do limite do sistema.
        INodePresentation pCliente = diagrama.createNodePresentation(cliente, new Point2D.Double(40, 250));
        INodePresentation pVendedor = diagrama.createNodePresentation(vendedor, new Point2D.Double(900, 250));

        // Posiciona os casos de uso dentro do limite do sistema.
        INodePresentation pConsultar = diagrama.createNodePresentation(consultarImoveis, new Point2D.Double(260, 105));
        INodePresentation pDetalhes = diagrama.createNodePresentation(visualizarDetalhes, new Point2D.Double(570, 105));
        INodePresentation pAgendar = diagrama.createNodePresentation(agendarVisita, new Point2D.Double(410, 235));
        INodePresentation pMeusAg = diagrama.createNodePresentation(consultarMeusAgendamentos, new Point2D.Double(250, 365));
        INodePresentation pManter = diagrama.createNodePresentation(manterCadastro, new Point2D.Double(570, 365));
        INodePresentation pAgenda = diagrama.createNodePresentation(consultarAgenda, new Point2D.Double(275, 500));
        INodePresentation pStatus = diagrama.createNodePresentation(atualizarStatus, new Point2D.Double(575, 500));

        // Desenha visualmente cada associação criada no modelo.
        diagrama.createLinkPresentation(a1, pCliente, pConsultar);
        diagrama.createLinkPresentation(a2, pCliente, pDetalhes);
        diagrama.createLinkPresentation(a3, pCliente, pAgendar);
        diagrama.createLinkPresentation(a4, pCliente, pMeusAg);
        diagrama.createLinkPresentation(a5, pVendedor, pManter);
        diagrama.createLinkPresentation(a6, pVendedor, pAgenda);
        diagrama.createLinkPresentation(a7, pVendedor, pStatus);
    }

    /**
     * Função auxiliar que cria uma associação UML simples entre um ator e
     * um caso de uso. IUseCase é compatível com IClass na API do Astah.
     */
    private static IAssociation associar(BasicModelEditor editor, IClass ator, IUseCase casoDeUso)
            throws Exception {
        return editor.createAssociation(ator, casoDeUso, "", "", "");
    }
}
