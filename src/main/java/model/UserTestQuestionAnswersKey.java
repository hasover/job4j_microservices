package model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
@Data
public class UserTestQuestionAnswersKey implements Serializable {

    @Column(name = "user_id")
    private int userId;
    @Column(name = "test_id")
    private int testId;
    @Column(name = "question_id")
    private int questionId;
    @Column(name = "answer_id")
    private int answerId;
}
