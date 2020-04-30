package day29.tasks.task1;

import java.util.ArrayList;

public class Student {
    String name;
    int maxCredit;
    ArrayList<Lesson> lessons = new ArrayList<>();

    void takeLesson(Lesson subject) {
        lessons.add(subject);
    }

}
