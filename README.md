# ☕ Coffiler - Compilador para CoffieLang


Este repositório contém a implementação do **Coffiler**, um compilador desenvolvido como Trabalho Final da disciplina de Compiladores. O projeto processa a linguagem **CoffieLang** (um subconjunto estrito da linguagem C) e gera código nativo **Assembly x86-64**.

---

## 👨‍💻 Equipe

* **[Armando Braga]**
* **[Sophia Ishii]**

---

## 📑 Sobre o Projeto

O objetivo deste projeto foi construir um compilador completo, abordando todas as fases do processo de tradução, desde a análise do código fonte até a geração de código de máquina.

### Arquitetura do Compilador
O fluxo de compilação segue o seguinte pipeline:

1.  **Pré-processador:** Tratamento de macros (`#define`) e inclusão de arquivos (`#include`).
2.  **Front-end (ANTLR 4):**
    * *Lexer:* Tokenização do código fonte.
    * *Parser:* Geração da Árvore Sintática (Parse Tree).
3.  **Análise Semântica (Java):**
    * Verificação de tipos (Type Checking).
    * Controle de escopo (Tabela de Símbolos).
    * Validação de inicialização de variáveis.
4.  **Código Intermediário (TAC):** Geração de instruções linearizadas (Three-Address Code).
5.  **Back-end (Assembly):** Tradução do TAC para Assembly x86-64.



## ✅ Funcionalidades Implementadas

O compilador atende aos requisitos da especificação da linguagem C simplificada, incluindo:

### 1. Tipos de Dados e Variáveis
* **Primitivos:** `int`, `float`, `char`.
* **Ponteiros:** Declaração (`int *ptr`), endereço (`&var`) e desreferência (`*ptr`).
* **Arrays:** Vetores unidimensionais com alocação estática.
* **Verificação Semântica:** O compilador emite erros se uma variável for usada sem ser inicializada ou se houver incompatibilidade de tipos (ex: atribuir struct a int).

### 2. Estruturas de Controle
* **Condicionais:** `if`, `if-else`, `switch-case`.
* **Laços:** `while`, `do-while`, `for`.
* **Fluxo:** `break`, `return`.

### 3. Funções
* Suporte a procedimentos (`void`) e funções com retorno.
* Suporte a **Recursão** (gerenciamento correto da pilha de ativação `rbp`/`rsp`).
* Integração nativa com `printf`, `scanf`, `gets`, `puts`, `atoi`, `atof`.

### 4. Estruturas Compostas
* **Structs:** Definição e acesso a campos (ex: `ponto.x`).
* **Unions:** Suporte a compartilhamento de memória entre campos.

---
