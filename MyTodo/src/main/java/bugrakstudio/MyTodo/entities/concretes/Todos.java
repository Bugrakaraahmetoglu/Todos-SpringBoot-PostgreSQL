package bugrakstudio.MyTodo.entities.concretes;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "todos")

public class Todos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "todos_id")
    private Integer id; // ID tipini String olarak değiştirin

    @Column(name = "todos_desc")
    private String todos_desc;

    @ManyToOne
    @JoinColumn(name = "categories_id")
    private Category category;
}