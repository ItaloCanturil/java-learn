# Desafio Java: Central de Ocorrências Hospitalares

## Introdução

A proposta é construir uma **Central de Ocorrências Hospitalares**, simulando um sistema interno usado por um hospital municipal para registrar, classificar, encaminhar e resolver ocorrências de diferentes setores.

O sistema será executado via console e não deve utilizar banco de dados, arquivos ou coleções avançadas. O foco é praticar Java base, orientação a objetos, polimorfismo e tratamento de exceções.

---

## Objetivo

Criar um sistema em Java para gerenciar ocorrências internas de um hospital, permitindo:

* cadastrar setores;
* cadastrar funcionários responsáveis;
* abrir ocorrências;
* classificar ocorrências por tipo;
* calcular prioridade;
* encaminhar ocorrências para funcionários compatíveis;
* iniciar atendimento;
* finalizar ou cancelar ocorrências;
* listar ocorrências cadastradas;
* gerar relatórios simples;
* aplicar regras de negócio com exceções customizadas.

O desafio deve ser implementado utilizando apenas os recursos estudados até a aula 105.

---

## Conhecimentos que serão aplicados

Neste desafio, você deverá aplicar os seguintes conceitos:

### Fundamentos da linguagem

* Tipos primitivos;
* `String`;
* operadores aritméticos, relacionais e lógicos;
* estruturas condicionais;
* `switch`;
* laços de repetição;
* arrays;
* arrays multidimensionais, se necessário.

### Métodos e organização

* Métodos com retorno;
* métodos sem retorno;
* parâmetros;
* uso do `this`;
* separação de responsabilidades;
* reutilização de código.

### Orientação a objetos

* Classes;
* objetos;
* atributos;
* métodos;
* encapsulamento;
* modificadores de acesso;
* construtores;
* sobrecarga de métodos;
* sobrecarga de construtores;
* blocos de inicialização;
* atributos e métodos `static`;
* constantes com `final`.

### Associação

* Associação entre objetos;
* objetos contendo outros objetos;
* objetos contendo arrays de outros objetos.

### Herança e polimorfismo

* Herança;
* uso de `super`;
* sobrescrita de métodos;
* classes abstratas;
* métodos abstratos;
* interfaces;
* polimorfismo;
* `instanceof`;
* casting;
* uso de `protected`.

### Enumerações

* Criação de `enum`;
* uso de enum para representar status, prioridade, tipo e criticidade;
* enum com atributos e métodos, se necessário.

### Exceções

* `RuntimeException`;
* `IllegalArgumentException`;
* exceções checked;
* exceções unchecked;
* `try`;
* `catch`;
* multi-catch;
* `finally`;
* `throws`;
* exceções customizadas;
* regras de exceções em sobrescrita de métodos.

---

## Descrição do desafio

Você deverá desenvolver uma aplicação de console chamada **Central de Ocorrências Hospitalares**.

O sistema deve permitir que diferentes setores de um hospital registrem ocorrências internas, como:

* problema em impressora;
* computador sem rede;
* erro em sistema;
* paciente aguardando atendimento;
* sala sem profissional disponível;
* solicitação de transporte;
* problema administrativo;
* equipamento crítico parado.

Cada ocorrência deverá possuir um tipo, uma prioridade, um status, um setor de origem e, quando possível, um funcionário responsável.

O sistema deverá aplicar regras para impedir ações inválidas, como encaminhar uma ocorrência de transporte para um técnico de TI ou finalizar uma ocorrência que já foi cancelada.

---

## Requisitos do desafio

### 1. Menu principal

O sistema deve possuir um menu no console com opções semelhantes a:

```text
=== Central de Ocorrências Hospitalares ===

1 - Cadastrar setor
2 - Cadastrar funcionário
3 - Abrir ocorrência
4 - Encaminhar ocorrência
5 - Iniciar atendimento
6 - Finalizar ocorrência
7 - Cancelar ocorrência
8 - Listar ocorrências
9 - Relatório por prioridade
10 - Sair
```

O menu deve continuar sendo exibido até que o usuário escolha a opção de sair.

---

### 2. Cadastro de setores

O sistema deve permitir o cadastro de setores do hospital.

Cada setor deve possuir, no mínimo:

* código;
* nome;
* nível de criticidade;
* responsável textual ou funcionário responsável.

Exemplos de setores:

* Recepção;
* Triagem;
* Emergência;
* Farmácia;
* Transporte;
* TI;
* Administração.

A criticidade do setor deve ser representada por um `enum`.

Exemplo:

```text
BAIXA
MEDIA
ALTA
CRITICA
```

---

### 3. Cadastro de funcionários

O sistema deve permitir cadastrar funcionários responsáveis por atender ocorrências.

Cada funcionário deve possuir, no mínimo:

* nome;
* matrícula;
* setor;
* status ativo ou inativo.

Deve existir uma classe abstrata `Funcionario`.

A partir dela, crie especializações como:

* `TecnicoTI`;
* `EnfermeiroResponsavel`;
* `Motorista`;
* `Administrador`.

Cada tipo de funcionário deve ter regras próprias sobre quais ocorrências consegue atender.

---

### 4. Cadastro de ocorrências

O sistema deve permitir abrir diferentes tipos de ocorrências.

Cada ocorrência deve possuir, no mínimo:

* código;
* descrição;
* setor de origem;
* status;
* prioridade;
* funcionário responsável;
* quantidade de tentativas de atendimento.

Deve existir uma classe abstrata `Ocorrencia`.

A partir dela, crie especializações como:

* `OcorrenciaTecnica`;
* `OcorrenciaAssistencial`;
* `OcorrenciaTransporte`;
* `OcorrenciaAdministrativa`.

Cada tipo de ocorrência deve implementar sua própria regra de cálculo de prioridade.

---

### 5. Status da ocorrência

O status da ocorrência deve ser representado por um `enum`.

Sugestão de status:

```text
ABERTA
EM_ANALISE
ENCAMINHADA
EM_ATENDIMENTO
RESOLVIDA
CANCELADA
```

O sistema deve impedir mudanças de status inválidas.

---

### 6. Prioridade da ocorrência

A prioridade da ocorrência deve ser representada por um `enum`.

Sugestão de prioridades:

```text
BAIXA
MEDIA
ALTA
URGENTE
```

Cada tipo de ocorrência deve calcular sua prioridade com base nas regras do sistema.

Exemplos:

* ocorrência assistencial em setor crítico deve ser urgente;
* ocorrência técnica em setor crítico deve ter prioridade alta ou urgente;
* ocorrência administrativa geralmente deve começar com prioridade baixa ou média;
* ocorrência de transporte pode variar conforme a criticidade do setor.

---

### 7. Interfaces obrigatórias

O sistema deve possuir pelo menos duas interfaces.

Sugestão:

#### Interface `Atendivel`

Representa algo que pode ser atendido.

Deve definir comportamentos como:

* iniciar atendimento;
* finalizar atendimento;
* cancelar atendimento.

#### Interface `Priorizavel`

Representa algo que pode ter prioridade calculada.

Deve definir comportamentos como:

* calcular prioridade;
* verificar se é urgente.

---

### 8. Serviços

Crie uma classe de serviço para centralizar as operações principais do sistema.

Sugestão:

```text
CentralOcorrenciasService
```

Essa classe pode ser responsável por:

* armazenar arrays de setores;
* armazenar arrays de funcionários;
* armazenar arrays de ocorrências;
* cadastrar novos registros;
* buscar registros por código;
* encaminhar ocorrência;
* iniciar atendimento;
* finalizar ocorrência;
* cancelar ocorrência.

Também é possível criar uma classe separada para relatórios:

```text
RelatorioService
```

---

## Regras do desafio

### Regra 1: não abrir ocorrência sem setor válido

O sistema não deve permitir abrir uma ocorrência para um setor inexistente.

Caso isso aconteça, lance uma exceção customizada, por exemplo:

```text
SetorNaoEncontradoException
```

---

### Regra 2: descrição da ocorrência deve ser válida

A descrição da ocorrência não pode estar vazia e deve possuir um tamanho mínimo.

Caso a descrição seja inválida, lance uma `IllegalArgumentException`.

Exemplo:

```text
Descrição deve possuir pelo menos 10 caracteres.
```

---

### Regra 3: funcionário incompatível não pode receber ocorrência

O sistema não deve permitir encaminhar uma ocorrência para um funcionário incompatível.

Exemplos:

* ocorrência de transporte não pode ser encaminhada para técnico de TI;
* ocorrência técnica não pode ser encaminhada para motorista;
* ocorrência assistencial não pode ser encaminhada para administrador;
* ocorrência administrativa não deve ser encaminhada para enfermeiro.

Caso isso aconteça, lance uma exceção customizada:

```text
FuncionarioIncompativelException
```

---

### Regra 4: funcionário inativo não pode receber ocorrência urgente

Se a ocorrência for urgente, ela não pode ser encaminhada para um funcionário inativo.

Caso isso aconteça, lance uma exceção customizada:

```text
ResponsavelInativoException
```

---

### Regra 5: ocorrência resolvida não pode voltar para atendimento

Se uma ocorrência já estiver com status `RESOLVIDA`, o sistema não deve permitir iniciar atendimento novamente.

Caso isso aconteça, lance uma exceção customizada:

```text
OcorrenciaJaFinalizadaException
```

---

### Regra 6: ocorrência cancelada não pode ser finalizada

Se uma ocorrência estiver com status `CANCELADA`, ela não pode ser finalizada como resolvida.

O sistema deve lançar uma exceção customizada ou impedir a ação com uma mensagem clara.

---

### Regra 7: limite máximo de registros

Como o desafio deve usar arrays, defina limites máximos para os cadastros.

Sugestão:

```text
Máximo de setores: 10
Máximo de funcionários: 20
Máximo de ocorrências: 50
```

Caso o limite seja atingido, o sistema deve lançar uma exceção customizada.

Exemplo:

```text
LimiteDeOcorrenciasException
```

Você também pode criar exceções semelhantes para setores e funcionários.

---

### Regra 8: tentativas de atendimento devem ser registradas

Toda tentativa de atendimento deve incrementar um contador na ocorrência.

Use `finally` em algum ponto do fluxo para garantir que uma ação aconteça independentemente de sucesso ou erro.

Exemplo:

```text
Tentativa de atendimento registrada.
```

---

### Regra 9: regras de exceção em sobrescrita devem ser respeitadas

Crie pelo menos um método em uma classe abstrata ou interface que declare uma exceção.

Exemplo conceitual:

```text
atender(Ocorrencia ocorrencia) throws AtendimentoException
```

Ao sobrescrever esse método nas subclasses, respeite as regras de sobrescrita de exceções:

* a subclasse pode não lançar exceção;
* a subclasse pode lançar a mesma exceção;
* a subclasse pode lançar uma exceção filha;
* a subclasse não deve lançar uma checked exception mais ampla do que a declarada no método original.

---

## Estrutura sugerida de pacotes

Uma estrutura possível para o projeto:

```text
src
└── academy
    └── devdojo
        └── desafio
            ├── domain
            ├── enums
            ├── exception
            ├── service
            └── test
```

### Pacote `domain`

Classes principais do domínio:

```text
Setor
Funcionario
TecnicoTI
Motorista
EnfermeiroResponsavel
Administrador
Ocorrencia
OcorrenciaTecnica
OcorrenciaAssistencial
OcorrenciaTransporte
OcorrenciaAdministrativa
```

### Pacote `enums`

Enums do sistema:

```text
StatusOcorrencia
Prioridade
CriticidadeSetor
TipoOcorrencia
```

### Pacote `exception`

Exceções customizadas:

```text
AtendimentoException
SetorNaoEncontradoException
FuncionarioIncompativelException
OcorrenciaJaFinalizadaException
LimiteDeOcorrenciasException
ResponsavelInativoException
```

### Pacote `service`

Classes responsáveis pelas regras e operações:

```text
CentralOcorrenciasService
RelatorioService
```

### Pacote `test`

Classe principal para executar o programa:

```text
Main
```

---

## Requisitos mínimos para considerar o desafio concluído

Para considerar o desafio finalizado, o sistema deve conseguir:

* cadastrar pelo menos 3 setores;
* cadastrar pelo menos 4 funcionários, sendo um de cada tipo;
* abrir pelo menos 4 tipos diferentes de ocorrência;
* calcular prioridade de forma diferente conforme o tipo da ocorrência;
* encaminhar ocorrência para funcionário compatível;
* impedir encaminhamento para funcionário incompatível;
* iniciar atendimento de uma ocorrência;
* finalizar uma ocorrência;
* cancelar uma ocorrência;
* impedir atendimento de ocorrência já resolvida;
* impedir finalização de ocorrência cancelada;
* lançar e capturar pelo menos 3 exceções customizadas;
* usar pelo menos uma classe abstrata;
* usar pelo menos uma interface;
* usar pelo menos um `enum`;
* usar encapsulamento nos atributos principais;
* usar herança entre funcionários;
* usar herança entre ocorrências;
* usar sobrescrita de métodos;
* usar polimorfismo com array de `Ocorrencia`;
* usar `instanceof` em pelo menos uma regra específica;
* usar `throws` em pelo menos um método;
* usar `try`, `catch` e `finally`;
* respeitar as regras de exceções em sobrescrita de métodos.

---

## Cenário mínimo de teste manual

Após implementar o sistema, teste o seguinte fluxo:

```text
1. Cadastrar setor Emergência com criticidade CRITICA
2. Cadastrar setor Administração com criticidade BAIXA
3. Cadastrar setor Transporte com criticidade MEDIA

4. Cadastrar João como Técnico de TI ativo
5. Cadastrar Ana como Enfermeira ativa
6. Cadastrar Carlos como Motorista ativo
7. Cadastrar Maria como Administradora ativa

8. Abrir ocorrência assistencial na Emergência
9. Verificar se a prioridade foi calculada como URGENTE
10. Tentar encaminhar a ocorrência para João, Técnico de TI
11. O sistema deve impedir e lançar FuncionarioIncompativelException

12. Encaminhar a ocorrência para Ana, Enfermeira
13. Iniciar atendimento
14. Finalizar ocorrência
15. Tentar iniciar atendimento novamente
16. O sistema deve impedir e lançar OcorrenciaJaFinalizadaException
```

---

## Restrições

Para manter o desafio dentro do conteúdo estudado até a aula 105, não utilize:

* `ArrayList`;
* `HashMap`;
* `List`;
* `Map`;
* `LocalDate`;
* arquivos;
* banco de dados;
* `StringBuilder`;
* streams;
* lambdas;
* generics;
* frameworks.

Use apenas arrays e os recursos já estudados.

---

## Objetivo de aprendizado

Ao finalizar este desafio, você deverá ser capaz de responder melhor perguntas como:

* Esta regra pertence a qual classe?
* Isso deveria ser uma classe, um enum ou uma interface?
* Este comportamento deve ser herdado ou implementado?
* Essa exceção representa uma regra de negócio ou um erro de programação?
* Estou usando polimorfismo ou estou espalhando muitos `if` pelo código?
* O estado do objeto está protegido contra valores inválidos?

O foco não é apenas fazer o programa funcionar, mas praticar uma modelagem orientada a objetos mais próxima de um sistema real.
