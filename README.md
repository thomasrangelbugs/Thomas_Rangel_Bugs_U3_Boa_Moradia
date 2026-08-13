# U3 — Diagrama de Casos de Uso — Boa Moradia

Entrega acadêmica de **Thomas Rangel Bugs**: diagrama de casos de uso da imobiliária **Boa Moradia**, com atores **Cliente** e **Vendedor**.

## Como usar / abrir

1. Abra o projeto no Astah: **File → Open** → `Thomas_Rangel_Bugs_U3_Boa_Moradia.asta`
2. Confira o diagrama **U3 - Boa Moradia - Casos de Uso**
3. Para só visualizar, use `Thomas_Rangel_Bugs_U3_Boa_Moradia.png` ou `.svg`
4. A documentação textual está em `DOCUMENTACAO_CASOS_DE_USO.md`
5. O exemplo em Java (`BoaMoradiaService.java`) ilustra as funções do diagrama; não é um sistema completo

### Casos de uso

**Cliente:** consultar imóveis, ver detalhes, agendar visita, consultar agendamentos  
**Vendedor:** manter cadastro de imóveis, consultar agenda, confirmar/atualizar status da visita

## Linguagem e tecnologias

- **Astah** — arquivo `.asta` do diagrama
- **PlantUML** (`.puml`) — fonte textual do diagrama
- **Java** — exemplo didático das funções e gerador do `.asta` (`GerarProjetoAstah.java`)
- **Markdown** — descrição dos casos de uso

## Estrutura do projeto

```
U3_Thomas_Rangel_Bugs_Boa_Moradia/
├── Thomas_Rangel_Bugs_U3_Boa_Moradia.asta   # entrega principal (Astah)
├── Thomas_Rangel_Bugs_U3_Boa_Moradia.png    # imagem do diagrama
├── Thomas_Rangel_Bugs_U3_Boa_Moradia.svg    # versão vetorial
├── Thomas_Rangel_Bugs_U3_Boa_Moradia.puml   # fonte PlantUML
├── DOCUMENTACAO_CASOS_DE_USO.md             # descrição de cada UC
├── BoaMoradiaService.java                   # funções comentadas
├── GerarProjetoAstah.java                   # gerador via API Astah
├── LEIA-ME_ENTREGA.txt
└── export_verificacao/                      # export extra do diagrama
```

## Autor

Thomas Rangel Bugs
