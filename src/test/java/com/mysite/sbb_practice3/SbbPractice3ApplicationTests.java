package com.mysite.sbb_practice3;

import com.mysite.sbb_practice3.question.Question;
import com.mysite.sbb_practice3.question.QuestionRepository;
import com.mysite.sbb_practice3.question.QuestionService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;

@SpringBootTest
class SbbPractice3ApplicationTests {

    @Autowired
    private QuestionService questionService;

    @Test
    void contextLoads() {
        for (int i = 1; i <= 300; i++) {
            String subject = String.format("테스트 데이터입니다:[%03d]", i);
            String content = "내용무";
            this.questionService.create(subject, content);
        }
    }

}