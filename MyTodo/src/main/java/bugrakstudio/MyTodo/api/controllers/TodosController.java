package bugrakstudio.MyTodo.api.controllers;

import bugrakstudio.MyTodo.business.abstracts.TodosService;
import bugrakstudio.MyTodo.core.utilities.results.DataResult;
import bugrakstudio.MyTodo.core.utilities.results.Result;
import bugrakstudio.MyTodo.entities.concretes.Todos;
import bugrakstudio.MyTodo.entities.dtos.TodosWithCategoryDto;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/todos")
@CrossOrigin
public class TodosController {


    private TodosService todosService;

    @Autowired
    public TodosController(TodosService todosService) {
        this.todosService = todosService;
    }


    @GetMapping("/getAllTodos")
    public DataResult<List<Todos>> getAllTodos(){
        return todosService.getAllTodos();
    }

    @GetMapping("/getTodosWithCategoryDetails")
    DataResult< List<TodosWithCategoryDto>> getTodosWithCategoryDetails(){
        return todosService.getTodosWithCategoryDetails();
    }

    @GetMapping("/getByCategoryId")
    DataResult<List<Todos>> findByCategory_Id(@RequestParam int categoryId){
        return todosService.getTodosByCategoryId(categoryId);
    }

    @PostMapping("/addTodo")
    public Result add(@RequestBody Todos product){
        return this.todosService.add(product);
    }



}
