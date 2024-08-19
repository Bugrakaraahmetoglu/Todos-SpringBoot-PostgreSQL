package bugrakstudio.MyTodo.entities.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TodosWithCategoryDto {
    private int id;
    private String TodosDesc;
    private String categoryName;
}
