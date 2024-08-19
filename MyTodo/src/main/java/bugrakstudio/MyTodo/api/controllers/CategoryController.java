package bugrakstudio.MyTodo.api.controllers;

import bugrakstudio.MyTodo.business.abstracts.CategoryService;
import bugrakstudio.MyTodo.core.utilities.results.DataResult;
import bugrakstudio.MyTodo.core.utilities.results.Result;
import bugrakstudio.MyTodo.entities.concretes.Category;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/categories")
public class CategoryController {

    private CategoryService categoryService;

    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @GetMapping("getAllCategories")
    public DataResult<List<Category>> getAllCategories(){
        return this.categoryService.getAllCategories();
    }

    @PostMapping("/addCategory")
    public Result add(Category category){
        return this.categoryService.add(category);
    }

}
