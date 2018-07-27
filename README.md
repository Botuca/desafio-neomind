# desafio-neomind

## Como executar

.Vou mencionar UM DOS jeitos que eu aprendi para executar o código, existem outros meios, use o que achar mais confortável. Utilizei a IDE Eclipse para a criação do código.

1º - Baixe o repositório desafio-neomind.

2º - Caso tenha baixado o arquivo compactado, descompacte-o em sua pasta de preferência.

3º - Abre o Eclipse.

4º - Clique em "File" e em seguida em "Import...".

5º - Em "Select an import source:", escolha a pasta escrito "General", em seguida selecione "Existing Projects into Workspace".

6º - Clique em "Next".

7º - Selecione a opção "Select root directory:", em seguida clique em "Browse..." na opção selecionada.

8º - Procure a pasta baixada do repositório desafio-neomind e clique em "Finish".

.Com isso, na aba de "Project Explorer", a pasta estará carregada. Com isso, expanda-a até encontrar a pasta "src" e expanda-a. Encontre o pacote "default package" e expande-o. Deverá aparecer o arquivo Clock.java e Main.java. Dê dois cliques em ambos para abrí-los no editor de texto do Eclipse e clique em Run. No console do Eclipse, aparecerá o código sendo executado.

## Sobre a classe Main:
.Dentro dessa classe, está a parte executável do desafio, é ela quem vai pedir as informações necessárias ao usuário para depois enviar
ao método que retorna o ângulo entre os ponteiros. Também será inicializado as variáveis e criado as instâncias do 
Calendar, GregorianCalendar e Clock. 

.Logo após o input das variáveis, é utilizado o ".set(Calendar.HOUR_OF_DAY, hourPointer);"
para colocar o valor de "hourPointer" dentro da instância "time", sendo assim, editando a hora dentro de uma instância do 
GregorianCalendar. O mesmo acontece com a variável "minutePointer", porém, chamando o ".set(Calendar.MINUTE, minutePointer);"
e editando os minutos na instância "time".

.Após editar ambos, o "time" é passado como argumento para o método "returnAngleClock". Depois da variável "angleDiff" assumir o
valor retornado do método, é imprimido no console o ângulo formado entre os ponteiros.


## Sobre a classe Clock:

.A única coisa que ela suporta é o método "returnAngleClock(GregorianCalendar time)". A classe não necessita de nenhum
outro atributo e nem mesmo outro método por causa de sua simplicidade.

.Dentro do método returnAngleClock, imprime uma saída para mostrar o horário que o usuário digitou previamente. O motivo 
de eu ter imprimido isso dentro do método, foi para mostrar que o horário que foi passado não foi alterado.

.É criado duas variáveis double para guardar o valor das horas e dos minutos em radianos. Essa transformação é feita para
facilitar quando for feito a transformação para ângulo, que é uma regra de 3. Logo após, é imprimido na tela o valor 
somente para mostrar os valores adquiridos, mas essas duas variáveis poderiam ser poupadas.

### Para transformar as horas em radianos, é necessário saber quanto que 1 hora vale em radianos:
- Utilizei a igualdade conhecida: 360º = 2*PI;
- Para completar uma volta no relógio, é necessário 12 horas;
- Portanto, se 12 horas = 360º, podemos substituir na igualdade, formando: 12 = 2*PI;
- Então, divido os dois lados da igualdade. Obtemos que: 12/12 = (2*PI)/12, para saber quanto vale 1 hora em radianos. 
- Simplificando: 1 hora = PI/6.

.Para transformar os minutos em radianos, é utilizado a mesma ideia para transformar as horas, porém, é preciso 60 minutos
para dar uma volta inteira no relógio. Então, 60min = 2*PI. Depois divido os dois lados por 60. Temos que: 1min = PI/30.

.Com essas duas fórmulas adquiridas, eu multipliquei o horário que o usuário digitou por PI/6 (para as horas) e PI/30 (para os
minutos.

.Em seguida, criei mais duas variáveis para guardar os valores em ângulos (poderiam ser usados as mesmas variáveis que usei
para os radianos, mas preferi criar outras para ficar mais claro o que cada variável está guardando.

### Para transformar em ângulos, usei os valores em radianos das horas e dos minutos.
- Utilizo a igualdade conhecida na matemática: 2*PI = 360º. 
- Como eu tenho meu valor em radianos("hourRad" ou "minuteRad"), posso montar uma regra de três: 

2*PI      ---- 360º

"hourRad" ---- "hourAngle"

ou

2*PI 	    ---- 360º

"minuteRad" ---- "minuteAngle"

e assim consigo transformar o horário em ângulo.

.Por fim, eu crio uma variável "angleDiff", que vai guardar a diferença entre o ponteiro dos minutos e das horas
(long angleDiff = (long) (minuteAngle - hourAngle)). O cast para long foi necessário pois os valores a serem subtraídos são int's 
e a variável que vai guardar o valor, é um long.

.Fiz uma condição caso o ângulo das horas seja maior que o ângulo dos minutos. Caso isso aconteça, então a diferença dos ângulos será
negativa, então, somei 360 no "angleDiff", para deixá-la positiva e consequentemente pegar o ângulo certo. Se não, a diferença
será positiva e somente retorno o "angleDiff".

### OBS: 
1 - O código dentro do método "returnAngleClock(GregorianCalendar time)", poderia ser menor e mais direto, porém, preferi deixá-lo assim
para facilitar a leitura e sua lógica.

2 - Na descrição do desafio, notei que nas premissas, mais especificamente a: "00:15h possui um ângulo de 45". Percebi que o ângulo correto seria 90º, então assumi que foi um erro de digitação,
já que não consegui ter outra interpretação dessa suposta premissa. Portanto, em meu código, o resultado de 00:15 é 90º.

3 -  Pela simplicidade do problema, achei desnecessário a utilização da biblioteca GregorianCalendar para guardar o horário. Sem o seu uso, o código ficaria bem menor e mais simples. Porém,
como foi dado como construtor do método na descrição, preferi utilizar o GregorianCalendar para não alterar o método.





