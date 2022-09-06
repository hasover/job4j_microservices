package model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "user_test_question_answers")
@Data
public class UserTestQuestionAnswers {
    @EmbeddedId
    private UserTestQuestionAnswersKey key;

    @ManyToOne
    @MapsId("userId")
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @MapsId("testId")
    @JoinColumn(name = "test_id")
    private Test test;

    @ManyToOne
    @MapsId("questionId")
    @JoinColumn(name = "question_id")
    private Question question;

    @ManyToOne
    @MapsId("answerId")
    @JoinColumn(name = "question_id")
    private Answer answer;
}
