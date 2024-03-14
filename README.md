=Atividadde final de curso
==Resumo
Implementar a API que forneça os endpoinst para executar o CRUD das entidades
descritas no modelo que segue.
==Modelo
Classes Curso, Estudante e Matricula sendo esta ultima fruto do relacionamento de muitos para muitos entre Curso e Estudante.
Curso, terá os atributos id, titulo, creditos e lista de matriculas.
Estudante, terá os atributos id, nome, datamatricula e lista de matriculas.
==Atividade
Assumir que a comunicação com o backend (API) será realizada utilizando JSON.
Implementar os seguintes endpoints para as entidades acima:
*Curso
GET /curso Deve retornar a lista de Cursos
GET /curso/{id} Deve retornar o Curso com o Id = {id}
POST /curso Deve criar um novo Curso
PATCH /curso Deve atualizar o o Curso
DELETE /curso/{id} Deve excluir o Curso com o Id = {id}
*Estudante
GET /estudante Deve retornar a lista de Estudantes
GET /estudante/{id} Deve retornar o Estudante com o Id = {id}
POST /estudante Deve criar um o Estudante
PATCH /estudante Deve atualizar o Estudante com o Id = {id}
DELETE /estudante/{id} Deve excluir o Estudante com o Id = {id}
*Matrícula
GET /matricula Deve retornar a lista de Matrícula
GET /matricula/{id} Deve retornar o Matrícula com o Id = {id}
POST /matricula Deve criar um o Matrícula
PATCH /matricula Deve atualizar o Matrícula com o Id = {id}
DELETE /matricula/{id} Deve excluir o Matrícula com o Id = {id}
