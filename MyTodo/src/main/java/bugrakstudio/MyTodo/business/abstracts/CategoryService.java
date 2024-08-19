package bugrakstudio.MyTodo.business.abstracts;

import bugrakstudio.MyTodo.core.utilities.results.DataResult;
import bugrakstudio.MyTodo.core.utilities.results.Result;
import bugrakstudio.MyTodo.entities.concretes.Category;

import java.util.List;

public interface CategoryService {
    DataResult<List<Category>> getAllCategories();
    Result add(Category category);
}
