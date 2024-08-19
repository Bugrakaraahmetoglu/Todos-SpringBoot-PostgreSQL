package bugrakstudio.MyTodo.business.concretes;

import bugrakstudio.MyTodo.business.abstracts.CategoryService;
import bugrakstudio.MyTodo.core.utilities.results.DataResult;
import bugrakstudio.MyTodo.core.utilities.results.Result;
import bugrakstudio.MyTodo.core.utilities.results.SuccessDataResult;
import bugrakstudio.MyTodo.core.utilities.results.SuccessResult;
import bugrakstudio.MyTodo.dataAccess.abstracts.jpa.CategoryDao;
import bugrakstudio.MyTodo.entities.concretes.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryManager implements CategoryService {


    private CategoryDao categoryDao;
    @Autowired

    public CategoryManager(CategoryDao categoryDao) {
        this.categoryDao = categoryDao;
    }

    @Override
    public DataResult<List<Category>> getAllCategories() {
        return new SuccessDataResult<List<Category>>(this.categoryDao.findAll(),"Categoriler Listelendi");
    }

    @Override
    public Result add(Category category) {
        this.categoryDao.save(category);
        return new SuccessResult("Ürün Eklendi");
    }
}
