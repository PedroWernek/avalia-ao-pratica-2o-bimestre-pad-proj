## EXERCICIO 1 - SistemaProcessamentoDeDados

**Padrão Usado:**
- Strategy

**Justificativa:**
- 

## EXERCICIO 2 - SistemaBancario
**Padrão Usado:**
- Adapter

**Justificativa:**
- Como nesse exercício existia um sistema legado não suportado pelo sistema atual
é obrigatório a criação de um adaptador que nos ajude a realizar as operações do
sistema legado de acordo com o processamento do sistema atual,
então o padrão Adapter nos permite fazer isso sem problemas.

## EXERCICIO 3 - SistemaUsinaNuclear
**Padrão Usado:**
- State

**Justificativa:**
- Nesse exercício foi pedido uma forma de se controlar o Estado de uma usina nuclar
e o padrão State permite esse controle, dando aos estados acesso ao Objeto de usina
e mudando de acordo com a temperatura da usina, esse padrão permite que eu mude de
forma dinâmica os estados do objeto de Usina utilizando a assinatura de uma interface
de estado dentro de uma classe que recebe esse estado. Sendo ideal para resolver esse
exercício.

## EXERCICIO 4 - SistemaValidacaoDocumentos
**Padrão Usado:**
- Chain of Responsability

**Justificativa:**
- Eu utilizei o chain pois esse padrão possibilita a execução em cadeia de responsabilidades
  no caso desse exercício era necessário verificar vários fatores de um documento
  então em cada cadeia há a possibilidade de se executar uma operação se caso a outra for executada com sucesso
  essa foi a ideia do exercício, executar tudo em uma cadeia.
