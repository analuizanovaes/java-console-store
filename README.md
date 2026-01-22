# 🛒 Java Console Store

Um sistema de gerenciamento de carrinho de compras via terminal, desenvolvido para praticar lógica de programação, manipulação de memória e conceitos fundamentais de Orientação a Objetos em Java.

## 📝 Sobre o Projeto

Este projeto foi desenvolvido durante meus estudos de reforço de base em **Back-end**. O objetivo principal não foi apenas fazer o código funcionar, mas implementar boas práticas de arquitetura limpa, como encapsulamento defensivo e manipulação manual de estruturas de dados.

O sistema permite cadastrar produtos, realizar buscas manuais por ID para remoção segura e calcular o valor total do carrinho.

## 🚀 Tecnologias e Conceitos Aplicados

* **Java (JDK 21)**
* **POO (Programação Orientada a Objetos)**
* **Listas Dinâmicas (`ArrayList`)**: Manipulação de coleções de objetos.
* **Lógica de Busca Manual**: Algoritmo para varrer a lista e encontrar objetos pelo ID.
* **Encapsulamento Defensivo**: Decisão arquitetural de **não utilizar Setters** na classe `Product`, garantindo a imutabilidade e consistência dos dados após a criação.
* **`@Override toString`**: Formatação de saída de dados no console.

## ⚙️ Funcionalidades

- [x] **Cadastro de Produtos:** Entrada de ID, Nome e Preço.
- [x] **Listagem:** Visualização dos itens inseridos.
- [x] **Remoção Segura:** O usuário informa um ID, o sistema varre a lista, verifica a existência e remove o objeto sem quebrar referências.
- [x] **Cálculo Total:** Soma automática dos preços dos itens restantes na lista.

## 📦 Como rodar o projeto

1. Certifique-se de ter o **Java (JDK)** instalado em sua máquina.
2. Clone este repositório:
   ```bash
   git clone [https://github.com/analuizanovaes/java-console-store.git](https://github.com/analuizanovaes/java-console-store.git)
Abra o projeto na sua IDE favorita (IntelliJ, Eclipse, VS Code).

Execute o arquivo Main.java.

📸 Exemplo de Uso
Plaintext

How many products? 3

Product #1:
Id: 101
Name: TV
Price: 2000.00

Enter the Id to remove: 101
Removed successfully!

List of remaining products:
102, Mouse, 60.00
Total Price: 60.00

Estudante de Análise e Desenvolvimento de Sistemas e entusiasta do ecossistema Java/Spring. Focada em construir uma base sólida para o desenvolvimento Full-Stack.

Estudos baseados na trilha de Java do professor Nélio Alves.

👩‍💻 Autora: Ana Luiza Fernandes Novaes
