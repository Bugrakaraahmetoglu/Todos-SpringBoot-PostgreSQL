package bugrakstudio.MyTodo.business.concretes;

import bugrakstudio.MyTodo.business.abstracts.TodosService;
import bugrakstudio.MyTodo.core.utilities.results.DataResult;
import bugrakstudio.MyTodo.core.utilities.results.Result;
import bugrakstudio.MyTodo.core.utilities.results.SuccessDataResult;
import bugrakstudio.MyTodo.core.utilities.results.SuccessResult;
import bugrakstudio.MyTodo.dataAccess.abstracts.jpa.TodosDao;
import bugrakstudio.MyTodo.entities.concretes.Todos;
import bugrakstudio.MyTodo.entities.dtos.TodosWithCategoryDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TodosManager implements TodosService {

    private final TodosDao todosDao;



    @Override
    public DataResult<List<Todos>> getAllTodos() {
        return new SuccessDataResult<List<Todos>>(this.todosDao.findAll(),"Data listelendi");

    }

    @Override
    public DataResult<List<TodosWithCategoryDto>> getTodosWithCategoryDetails() {
        return new SuccessDataResult<List<TodosWithCategoryDto>>(this.todosDao.getTodosWithCategoryDetails(), "Data Listelendi");
    }

    @Override
    public DataResult<List<Todos>> getTodosByCategoryId(int categoryId) {
        return new SuccessDataResult<List<Todos>>(this.todosDao.findByCategoryId(categoryId),"Data Listelendi");
    }

    @Override
    public Result add(Todos product) {
       this.todosDao.save(product);
       return new SuccessResult("Ürün EKlendi");
    }


}
