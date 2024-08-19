package bugrakstudio.MyTodo.dataAccess.abstracts.jpa;

import bugrakstudio.MyTodo.entities.concretes.Todos;
import bugrakstudio.MyTodo.entities.dtos.TodosWithCategoryDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface TodosDao extends JpaRepository<Todos, Integer> {

    @Query("Select new bugrakstudio.MyTodo.entities.dtos.TodosWithCategoryDto(t.id,t.todos_desc,c.category_name) " +
            "From Category c Inner Join c.todos t  ")
    List<TodosWithCategoryDto> getTodosWithCategoryDetails();

    @Query("SELECT t FROM Todos t WHERE t.category.category_id = :categoryId")
    List<Todos> findByCategoryId(@Param("categoryId") int categoryId);



}
