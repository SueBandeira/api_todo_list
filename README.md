# Todo List
___
 - ### Funcionalidades
 -[ ] Criar Tarefa:
   - Adicionar uma nova tarefa com detalhes como título, descrição e status (pendente, em andamento, concluída).
 - [ ] Listar Tarefas:
   - Exibir todas as tarefas.
 - [ ] Buscar Tarefa:
   - Obter detalhes de uma tarefa específica pelo ID.
 - [ ] Atualizar Tarefa:
   - Alterar o título, descrição ou status de uma tarefa existente.
 - [ ] Excluir Tarefa:
   - Remover uma tarefa do sistema.
```java
 //Entidade (Model):
public class Tarefa {
    private Long id;
    private String titulo;
    private String descricao;
    private String status;  // "PENDENTE", "EM_ANDAMENTO", "CONCLUÍDA"
}
```
 - ### Endpoints (Controller):
 - [ ] POST /tarefas:
   - Criar uma nova tarefa.
 - [ ] GET /tarefas:
   - Listar todas as tarefas.
 - [ ] GET /tarefas/{id}:
   - Buscar uma tarefa específica.
 - [ ] PUT /tarefas/{id}:
   - Atualizar uma tarefa.
 - [ ] DELETE /tarefas/{id}:
   - Excluir uma tarefa.
