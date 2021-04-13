# Lab03 - Lombriga no Aquário

## Classe AquarioLombriga

Representa uma lombriga dentro de um aquário. A cabeça é representada por uma cabeça "O" e por um corpo "@". O aquário é representado por "#". Assim, uma lombriga de tamanho 4 em um aquário de tamanho 8 é representada como: `#@@@O###`.

### Atributos

* `int aquarioDireita` - tamanho do aquário à direita da lombriga;

* `int aquarioEsquerda` - tamanho do aquário à esquerda da lombriga;

* `int lombriga` - tamanho da lombriga;

* `String sentido` - direção da cabeça da lombriga: "direita" ou "esquerda".

### Métodos

* `construtor` - no construtor é informado como parâmetro: o tamanho do aquário, o tamanho da lombriga e a posição da lombriga no aquário;
* `crescer` - a lombriga cresce uma unidade dentro do aquário somente se houver espaço para ela crescer na direção oposta à cabeça -- a lombriga só cresce se houver espaço no aquário na direção do crescimento, caso contrário, ela não crescerá, mesmo que o método seja chamado;
* `mover` - a lombriga se move uma unidade na direção para a qual está virada à cabeça; se ela estiver no limite do aquário (para o lado que ela está virada a cabeça) e for chamado este método ela vira de lado em vez de andar;
* `virar` - a lombriga vira de lado;
* `apresenta` - retorna uma String contendo a apresentação da lombriga no aquário no estado atual, conforme foi descrito anteriormente.

### Casos Especiais

Nesse programa caso a lombriga inicializada seja maior que o aquário, o aquário é inicializado do mesmo tamanho que a lombriga. Caso a posição inicial não permita a colocação da lombriga dentro do aquário, a lombriga é inicializada na posição 1. A lombriga sempre começa virada para a direita.

## Classe Animação

Apresenta na tela uma sequência de animações mostrando os diferentes movimentos da lombriga dentro do aquário a partir de um comando do tipo `AALLPP$$$$`, em que:

* `AA` - é um número (sempre ocupando dois caracteres) representando o tamanho do aquário; por exemplo, `08` representa um aquário de tamanho 8;
* `LL` - é um número (sempre ocupando dois caracteres) representando o tamanho da lombriga; por exemplo, `04` representa uma lombriga de tamanho 4;
* `PP` - é um número (sempre ocupando dois caracteres) representando a posição inicial da lombriga no aquário. A lombriga começa sempre virada para a direita, portanto trata-se da posição da ponta da cauda; por exemplo, `03` representa uma lombriga na posição 3.
* `$` - cada caractere subsequente (que aparece como `$`) representa um dos possíveis comandos de animação, equivalentes aos métodos da lombriga:
  * `C` - a lombriga cresce;
  * `M` - a lombriga se move;
  * `V` - a lombriga vira.

### Atributos

* `int aquario` - tamanho inicial do aquário;

* `int posicao` - posicao inicial da lombriga dentro do aquario;

* `int lombriga` - tamanho inicial da lombriga;

* `String sequencia` - sequencia de movimentos que a lombriga ainda precisa fazer;

*  `AquarioLombriga estado` - objeto que representa a lombriga dentro do aquário.

### Métodos

* `construtor` - no construtor é informado como parâmetro: a string de animação, conforme a descrição anterior;
* `apresenta` - retorna uma String com a lombriga no aquário no estado atual (a primeira vez que o método é chamado, apresenta o estado inicial da lombriga - sem animação);
* `passo` - executa um único passo da animação.

## Notebook Lombriga no Aquário

A resolução do laboratório está no seguinte [notebook](https://github.com/HannahPlath/MC322/blob/main/Lab03/notebook/lab-lombriga-ra198642.ipynb).


## Arquivo Java Lombriga no Aquário

A resolução do laboratório feita no Eclipse está no seguinte [arquivo](https://github.com/HannahPlath/MC322/blob/main/Lab03/src/).

