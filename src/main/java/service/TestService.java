package service;

import model.Answer;
import model.Question;
import model.Test;
import model.User;

import java.util.List;

public interface TestService {
    List<Test> findAllTests();

    Test startTest(int id);

    boolean acceptUserAnswersToQuestion(User user, Test test,
                                         Question question, List<Answer> answers);

    void addQuestionToTest(Test test, Question question);

    void endTest(int id);
}
