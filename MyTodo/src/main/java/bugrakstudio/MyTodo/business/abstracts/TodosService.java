package bugrakstudio.MyTodo.business.abstracts;

import bugrakstudio.MyTodo.core.utilities.results.DataResult;
import bugrakstudio.MyTodo.core.utilities.results.Result;
import bugrakstudio.MyTodo.entities.concretes.Todos;
import bugrakstudio.MyTodo.entities.dtos.TodosWithCategoryDto;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface TodosService {
    DataResult<List<Todos>> getAllTodos();
    DataResult< List<TodosWithCategoryDto>> getTodosWithCategoryDetails();
    DataResult<List<Todos>> getTodosByCategoryId(int categoryId);
    Result add(Todos product);

}
