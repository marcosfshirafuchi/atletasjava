# DESAFIO: Atletas Java

Fazer um programa para ler uma quantidade N (supor N > 0), depois ler os dados de N atletas (nome,
sexo, altura, peso). Depois, mostrar um relatório contendo:<br><br>

 Peso médio dos atletas<br>
 Nome do atleta mais alto<br>
 Porcentagem de homens<br>
 Altura média das mulheres<br><br>

Caso não sejam digitadas mulheres, a altura média não poderá ser calculada (pois divisão por zero não
existe). Neste caso, apenas mostrar a mensagem "Não há mulheres cadastradas".<br><br>
Fazer validações de dados para altura e peso, não permitindo digitar valores não positivos para esses
dados. Faça também a validação do sexo, não permitindo valores diferentes de F e M.<br><br>
Dica: para validar o sexo, a lógica é: tem que pedir para o usuário digitar novamente enquanto o valor
digitado for diferente de "F" E diferente de "M"<br><br>

EXEMPLO 1:<br>
Qual a quantidade de atletas? 3<br>
Digite os dados do atleta numero 1:<br>
Nome: Carlos Silva<br>
Sexo: M<br>
Altura: -1.5<br>
Valor invalido! Favor digitar um valor positivo: 0<br>
Valor invalido! Favor digitar um valor positivo: 1.75<br>
Peso: 84.8<br>
Digite os dados do atleta numero 2:<br>
Nome: Maria José<br>
Sexo: F<br>
Altura: 1.71<br>
Peso: 64.5<br>
Digite os dados do atleta numero 3:<br>
Nome: Teresa Borges<br>
Sexo: R<br>
Valor invalido! Favor digitar F ou M: S<br>
Valor invalido! Favor digitar F ou M: F<br>
Altura: 1.65<br>
Peso: 0<br>
Valor invalido! Favor digitar um valor positivo: -60<br>
Valor invalido! Favor digitar um valor positivo: 54.3<br><br>
RELATÓRIO:<br>
Peso médio dos atletas: 67.87<br>
Atleta mais alto: Carlos Silva<br>
Porcentagem de homens: 33.3 %<br>
Altura média das mulheres: 1.68<br><br>

EXEMPLO 2:<br>
Qual a quantidade de atletas? 1<br>
Digite os dados do atleta numero 1:<br>
Nome: Carlos Silva<br>
Sexo: M<br>
Altura: 1.75<br>
Peso: 84.8<br><br>
RELATÓRIO:<br>
Peso médio dos atletas: 84.80<br>
Atleta mais alto: Carlos Silva<br>
Porcentagem de homens: 100.0 %<br>
Não há mulheres cadastradas<br><br>

## Ferramentas utilizadas

<a href="https://www.java.com" target="_blank"> <img src="https://raw.githubusercontent.com/devicons/devicon/master/icons/java/java-original.svg" alt="java" width="200" height="200"/> </a> 
     <img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/github/github-original-wordmark.svg" alt="github" width="200" height="200" />
     <img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/intellij/intellij-original-wordmark.svg" alt="IntelliJ" width="200" height="200"/>
