# Descrição do Laboratório 1

Considere o problema simples de empréstimo abaixo em que cada parcela é calculada como:

> Parcela<sub>mês</sub> = Parcela<sub>mês-1</sub> * (1 + J / 100)

Sendo que: 

* S: valor da primeira parcela

* N: número de parcelas

* J: percentual de juros mensal

Este laboratório teve como **OBJETIVO** escrever um programa que retornasse as parcelas do empréstimo.

Os valores de empréstimo usados para os exercícios abaixo foram: S = 200, N = 5 e J = 1%.

### **Parte 1** 
Escrever um programa que calcule as parcelas do empréstimo.

### **Parte 2:**
Resolver o mesmo problema anterior mas utilizando uma função chamada "proximaParcela" que deve calcular uma única parcela do empréstimo. Deve-se evitar dependências do módulo com o programa principal.

### **Parte 3:**
A função "proximaParcela" deve ser modificada para que o programa principal não precise ficar enviando informações já informadas no começo. Ou seja, a função deve possuir uma memória do estado do empréstimo.

### **Parte 4:**
A partir da resolução da parte 2, deve-se modificar a função "proximaParcela" para que ela receba apenas um parâmetro que possa representar o estado do empréstimo.

### **Parte 5:**
Nessa parte é acrescentado mais um empréstimo cujos dados são: S = 500, N = 7 e J = 2%. O programa principal deve conseguir controlar as parcelas de modo paralelo e manter um controle separado de cada empréstimo.


## A resolução do problema está no seguinte [notebook](https://github.com/HannahPlath/MC322/blob/main/Lab01/notebook/emprestimo01-ra198642.ipynb).
