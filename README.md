# TrabProgII
Repositório destinado ao Trabalho Prático de Programação II.

///---------------------///---------------------///

Cenário:

Com o crescimento de um Clube social, percebeu-se a necessidade de criar um sistema informatizado capaz de manter um controle
sobre as informações de seus sócios e também sobre a arrecadação do Clube. Dessa forma, foi requisitado um software capaz de
realizar algumas atribuições.

Requisitos:

1 -> Uma função capaz de informar quantos sócios existem ao todo no clube.
+ informaQntSocios()

2 -> Uma função capaz de informar quantos sócios existem em cada categoria.
+ informaSociosPorCategoria(): String

3 -> Uma função capaz de calcular a arrecadação dos sócios em cada classificação, bem como a arrecadação total do Clube.
+ informaArrecadacao(): String

4 -> Uma meio capaz de adicionar um Socio novo. (Não podendo haver repetição de matrícula ou CPF).
  4.1 - validarInfo(cpf : String) boolean
  4.2 - validarInfo(matricula : int) boolean

5 -> Uma função capaz de remover um Socio (Caso sua matricula esteja registrada).
+ removerSocio(matricula : int): boolean

----------------------------------------

A tabela de preços do Clube é a seguinte:

Dia avulso: R$25,00
Mensalidade: $225,00
Anuidade: R$980,00

----------------------------------------

--> Esse trabalho foi criado em conjunto com @KevinStrey

