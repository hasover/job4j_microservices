package model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.Set;

@Entity
@Data
public class Test {
    @Id
    private int id;
    private String name;
    @ManyToMany
    private Set<Question> questions;

}
