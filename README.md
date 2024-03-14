```markdown
# Atividade final de curso

## Resumo
Implementar a API que forneça os endpoints para executar o CRUD das entidades descritas no modelo que segue.

## Modelo
Classes Curso, Estudante e Matricula, sendo esta última fruto do relacionamento de muitos para muitos entre Curso e Estudante.
Curso terá os atributos id, título, créditos e lista de matrículas.
Estudante terá os atributos id, nome, data de matrícula e lista de matrículas.

## Atividade
Assumir que a comunicação com o backend (API) será realizada utilizando JSON.
Implementar os seguintes endpoints para as entidades acima:

### Curso
| Método               | Descrição                                       | 
|----------------------|-------------------------------------------------| 
| `GET /curso`         | Deve retornar a lista de Cursos                 | 
| `GET /curso/{id}`    | Deve retornar o Curso com o Id = {id}           | 
| `POST /curso`        | Deve criar um novo Curso                        | 
| `PATCH /curso`       | Deve atualizar o Curso                          | 
| `DELETE /curso/{id}` | Deve excluir o Curso com o Id = {id}            | 

### Estudante
| Método                   | Descrição                                   | 
|--------------------------|---------------------------------------------| 
| `GET /estudante`         | Deve retornar a lista de Estudantes         | 
| `GET /estudante/{id}`    | Deve retornar o Estudante com o Id = {id}   | 
| `POST /estudante`        | Deve criar um Estudante                     | 
| `PATCH /estudante`       | Deve atualizar o Estudante com o Id = {id}  | 
| `DELETE /estudante/{id}` | Deve excluir o Estudante com o Id = {id}    | 

### Matrícula
| Método                   | Descrição                                   | 
|--------------------------|---------------------------------------------| 
| `GET /matricula`         | Deve retornar a lista de Matrículas         | 
| `GET /matricula/{id}`    | Deve retornar a Matrícula com o Id = {id}   | 
| `POST /matricula`        | Deve criar uma Matrícula                    | 
| `PATCH /matricula`       | Deve atualizar a Matrícula com o Id = {id}  | 
| `DELETE /matricula/{id}` | Deve excluir a Matrícula com o Id = {id}    | 
```
