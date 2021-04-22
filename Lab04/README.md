# Lab04 - Jogo Resta 1

O objetivo deste laboratório é escrever um conjunto de classes que representem um jogo de Resta 1.

## Tabuleiro

O tabuleiro do jogo e suas coordenadas serão representados da seguinte forma.

![Captura de Tela (10)](https://user-images.githubusercontent.com/42322108/115715756-d9b18b00-a34e-11eb-9fcd-d02d3cef1263.png)

## Entrada

A entrada do programa será um arquivo `.csv` contendo todos os comandos a serem executados pelo jogo. Cada comando consistirá de uma posição inicial e uma posição final, separadas por `:`. Assim, `f4:d4` representa um comando em que a peça sai da casa f4 e vai até a casa d4.

## Saída 

O programa contém duas saídas:

* `saída padrão` - imprime a posição inicial e final da peça assim como o estado do tabuleiro após o movimento;
*  `vetor de strings` - contém todos os estados do tabuleiro durante o jogo.

## Classes

Para a resolução desse laboratório foram criadas quatro classes:

* `CSVReader` - realiza a leitura do csv de entrada;
* `Tabuleiro` - constroi o tabuleiro e retorna seu estado atual;
*  `Peca` - realiza a leitura da jogada, valida o movimento e move a peça no tabuleiro;
*  `AppRestaUm` - executa o jogo.


## Arquivo Java Jogo Resta Um

A resolução do laboratório feita no Eclipse está no seguinte [arquivo](https://github.com/HannahPlath/MC322/blob/main/Lab04/src/).

### Observação

Esse laboratório foi feito em conjunto com o aluno Gabriel Silva Vieira de Melo.
