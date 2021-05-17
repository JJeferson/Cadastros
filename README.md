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
