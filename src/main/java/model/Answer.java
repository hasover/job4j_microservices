package model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class Answer {
    @Id
    private int id;
    private String answer;
}
