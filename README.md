Objetivo: Desenvolver um sistema de gerenciamento de hotel que permita o controle de quartos, reservas e check-in/check-out, com foco no acompanhamento de ocupação de quartos e histórico de reservas.
Requisitos Funcionais:

Cadastro de Quartos: O sistema deve permitir o cadastro de quartos, com os seguintes atributos:
  Número do quarto
  Tipo de quarto (solteiro, casal, suite)
  Preço diário
  Disponibilidade (se o quarto está disponível ou ocupado)
  
Cadastro de Reservas: O sistema deve permitir o cadastro de reservas, com os seguintes atributos:
  Nome do hóspede
  Data de check-in e check-out
  Número de quartos reservados
  Tipo de quarto reservado
  
Gerenciamento de Check-in/Check-out: O sistema deve permitir o registro de check-in e check-out de hóspedes, atualizando a disponibilidade dos quartos.Acompanhamento de Ocupação de Quartos O sistema deve registrar a ocupação de quartos por período e gerar um relatório de ocupação, mostrando:
  Número de quartos ocupados
  Tipo de quarto ocupado
  Período de ocupação
  
Histórico de Reservas: O sistema deve gerar um relatório de histórico de reservas por hóspede, mostrando:
  Nome do hóspede
  Data de reserva
  Número de quartos reservados
  Tipo de quarto reservado
  
Requisitos Não Funcionais:
  O sistema deve ser dividido em diferentes classes para melhor organização (ex.: Quarto, Reserva, Hóspede, Hotel).
  O código deve ser orientado a objetos, mas sem o uso de herança, polimorfismo ou encapsulamento.
  As operações de gerenciamento devem ser feitas através de uma interface de linha de comando, permitindo a navegação e interação com o sistema.
  Uso de coleções (arrays ou listas) para armazenar dados de quartos, reservas e hóspedes.
