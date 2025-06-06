# API de Validação de Perfis – Java + Quarkus

Este projeto é uma API REST desenvolvida com Quarkus e Java 17, focada em validação de dados de perfis (clientes e profissionais) com retorno de logs personalizados.

---

## 🚀 Tecnologias Utilizadas

- Java 21 
- Quarkus 3.23.2  
- Jakarta REST (JAX-RS)  
- Jackson (JSON)  
- Postman (para testes)  

---

## 📁 Estrutura de Pastas
java/
└── org/
    └── acme/
        ├── conf/
        │   └── LogConfig.java
        ├── controller/
        │   └── RotaTest.java
        ├── dto/
        │   ├── ClienteDTO.java
        │   ├── PerfilGlobalDTO.java
        │   └── ProfissionalDTO.java
        ├── service/
        │   ├── LogicaControleCliente.java
        │   └── LogicaControleProfissional.java
        ├── util/
        │   ├── logicadecontrole/
        │   │   ├── LogicaDeControleCliente.java
        │   │   └── LogicaDeControleProfissional.java
        │   └── logicadevalidacao/
        │       ├── LogicaDeCadastro.java
        │       ├── LogicaDeDadosCliente.java
        │       └── LogicaDeDadosProfissional.java
        └── GreetingResource.java

---

## 📌 Endpoint
Aqui você faz o teste com o perfil cliente
/teste/rota/perfil/cliente

#### 📥 Request JSON

{
  "clientes": [
    {
      "id": "12345",  
      "nome": "João da Silva",
      "email": "joao@email.com"
    }
  ]
}

---

# 🧩 Mini Lógica de Cadastro com API REST

Essa foi uma forma prática de demonstrar uma mini lógica de cadastro utilizando uma API REST.

Embora o exemplo seja simples, é de extrema importância destacar a necessidade de **validações de dados**. Todo sistema robusto precisa de um controle eficaz para evitar inconsistências e falhas.

## 🧠 Estrutura: DTO `PerfilGlobal`

Um ponto central da lógica é o DTO chamado `PerfilGlobal`.  
Nele, você encontrará:

- Um campo `id`
- Duas listas:
  - `cliente`
  - `profissional`

Essa composição cria um **laço lógico** entre os elementos, funcionando como uma **mini demonstração de árvore binária**.

## 💡 Conclusão

Se o seu objetivo é criar um sistema híbrido com múltiplos papéis e relacionamentos entre dados, esse tipo de estrutura é essencial.  
Ela facilita a expansão e mantém a lógica organizada, mesmo em aplicações maiores.