# Atividade 1 - Terceiro Bimestre de P.O.O

Este repositório contém o projeto da Atividade 1 do terceiro bimestre de Programação Orientada a Objetos do professor Rogério. O objetivo da atividade foi implementar um sistema que utiliza o **padrão de projeto Abstract Factory** para gerenciar o aluguel de meios de transporte individuais. 

## Descrição do Projeto

O sistema foi desenvolvido para criar e gerenciar transportes individuais, divididos em duas categorias principais: **movidos a bateria** e **movidos a esforço humano**. Para isso, utilizamos o padrão de projeto Abstract Factory, garantindo que a criação dos objetos fosse organizada e modular, facilitando a extensão e a manutenção do código.

### Funcionalidades
- Criação de transportes individuais conforme o tipo de propulsão:
  - **Movidos a Bateria**:
    - Patinetes elétricos.
    - Bicicletas elétricas.
      
  - **Movidos a Esforço Humano**:
    - Bicicletas convencionais.
    - Patins.
    - Skates.
- Mensagens no console simulando o uso dos transportes.

### Estrutura do Projeto

src/
└── com.example.transport
├── Transport.java (Interface)
├── ElectricScooter.java (Classe concreta)
├── ElectricBike.java (Classe concreta)
├── Bicycle.java (Classe concreta)
├── RollerSkates.java (Classe concreta)
├── Skateboard.java (Classe concreta)
├── TransportFactory.java (Fábrica abstrata)
├── ElectricTransportFactory.java (Fábrica concreta)
├── HumanPoweredTransportFactory.java (Fábrica concreta)
└── Main.java (Classe principal)


## Tecnologias Utilizadas
- **Linguagem:** Java 8
- **Ferramenta de Desenvolvimento:** Visual Studio Code (pode utilizar outra ferramenta para fazer o projeto se preferir, como o 
IntelliJ IDEA ou o Eclipse por exemplo)
- **Controle de Versão:** Git/GitHub

## Como Executar o Projeto

### Passos para Compilar e Executar:
1. Compile todas as classes:
   javac -d bin src/com/example/transport/*.java

2. Execute o programa principal:
   java -cp bin com.example.transport.Main

## Exemplo de Saída
Ao executar o programa, o sistema exibirá mensagens no console indicando o uso de cada tipo de transporte:

Andando de Patinete Elétrico.
Andando de Bicicleta Elétrica.
Andando de Bicicleta Convencional.
Andando de Patins.
Andando de Skate.

## Objetivo da Atividade

- Demonstrar a aplicação do padrão de projeto Abstract Factory.
- Dividir transportes em categorias, facilitando a criação e a gestão dos objetos.
- Simular um sistema realista para aluguel de transportes individuais.

## Autor
João Vitor Souza Rodrigues

