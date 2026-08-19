# U3 — Boa Moradia — Diagrama de Casos de Uso

Trabalho acadêmico de **Engenharia de Software**: diagrama de casos de Uso para a imobiliária **Boa Moradia**, com atores Cliente e Vendedor.

**Aluno:** Thomas Rangel Bugs  
**Repositório:** [Thomas_Rangel_Bugs_U3_Boa_Moradia](https://github.com/thomasrangelbugs/Thomas_Rangel_Bugs_U3_Boa_Moradia)

## Propósito

Modelar a automação de consulta online de imóveis e agendamento de visitas, conforme requisitos da disciplina (U3).

## Conteúdo do repositório

| Arquivo | Descrição |
|---------|-----------|
| `Thomas_Rangel_Bugs_U3_Boa_Moradia.asta` | Projeto nativo Astah (entrega principal) |
| `Thomas_Rangel_Bugs_U3_Boa_Moradia.png` / `.svg` | Diagrama exportado |
| `Thomas_Rangel_Bugs_U3_Boa_Moradia.puml` | Fonte PlantUML comentada |
| `DOCUMENTACAO_CASOS_DE_USO.md` | Descrição de cada caso de uso |
| `BoaMoradiaService.java` | Exemplo didático em Java |
| `GerarProjetoAstah.java` | Gerador do `.asta` via API Astah |
| `LEIA-ME_ENTREGA.txt` | Instruções de entrega e checksums |

## Casos de uso

**Cliente:** consultar imóveis, visualizar detalhes, agendar visita, consultar meus agendamentos.

**Vendedor:** manter cadastro de imóveis, consultar agenda de visitas, confirmar/atualizar status da visita.

Detalhamento completo em `DOCUMENTACAO_CASOS_DE_USO.md`.

## Tecnologias

- **Astah** — modelagem UML
- **PlantUML** — diagrama em texto
- **Java** — exemplos de serviço e gerador Astah

## Como abrir

1. **Astah:** File → Open → `Thomas_Rangel_Bugs_U3_Boa_Moradia.asta`
2. **PlantUML:** renderize `Thomas_Rangel_Bugs_U3_Boa_Moradia.puml` (extensão VS Code, site plantuml.com ou CLI)
3. **Java:** compile `BoaMoradiaService.java` e `GerarProjetoAstah.java` com JDK 11+

```bash
javac BoaMoradiaService.java GerarProjetoAstah.java
java BoaMoradiaService
```

## Verificação de integridade

Confira hashes em `SHA256SUMS.txt` após download ou extração do pacote.

## Autor

**Thomas Rangel Bugs** — [github.com/thomasrangelbugs](https://github.com/thomasrangelbugs)
