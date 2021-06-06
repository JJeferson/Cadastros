# API-Cadastros
 Implementação de JPQL
 

<p align="left">
<strong> API de Cadastros</strong>.
<p>
<p align="left">  
Atenção: API roda na porta 9000 </br>
Como rodar:  </br>
1)Instale ou rode MySQL, crie banco de dados chamado "cadastros" sem senha. </br>
2)Baixe o repositório e o execute. </br>
</br></br>
Endpoints disponiveis: </br>
-cliente: </br>
[post] /cliente - grava novo cliente </br>
[put] /cliente - altera cliente </br>
[get]/clientepornome/{nome}   - busca cliente por nome </br> 
[get]/clienteporid/{id}  - busca cliente por id  </br>
[get] /deletecliente  - deleta cliente </br>
</br></br>
-Cidade: </br> 
[post] /cidade - grava nova cidade </br>
[get] /cidadepornome/{nome} - cidades por nome  </br>
[get] /cidadeporestado/{estado} - cidades por estado  </br>
[get] /cidades - todas cidades  </br>
</p>

<p align="left"> 
<strong>Testar o RabbitMQ.  </strong></br>
Instale o Docker, baixe uma imagem do Rabbitmq.</br>
Então o comand como administrador no cmd: </br>
docker run -d --name rabbitmq -p 5672:5672 -p 5673:5673 -p 15672:15672 rabbitmq:3.8-management   </br>
</br>
Poderá abrir o console dele no :  http://localhost:15672/ </br>
</br>
Para testar o envio mande um post na porta 9000 em seu localhost em /rabbitmq/envia</br>
a url no post fica: http://localhost:9000/rabbitmq/envia</br>
o reciver http://localhost:9000/rabbitmq/recebe</br>

 <p align="left"> 
