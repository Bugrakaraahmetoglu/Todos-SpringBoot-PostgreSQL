package bugrakstudio.MyTodo.dataAccess.abstracts.jpa;

import bugrakstudio.MyTodo.entities.concretes.Category;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CategoryDao extends JpaRepository<Category, Integer> {
}
