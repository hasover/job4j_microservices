package model;


import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Entity
@Data
public class Question {
    @Id
    private int id;
    private String question;
    @ManyToMany
    private Set<Answer> possibleAnswers;
}
