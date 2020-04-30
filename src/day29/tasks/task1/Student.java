package day29.tasks.task1;

import java.util.ArrayList;

public class Student {
    String name;
    ArrayList<Lesson> lessons = new ArrayList<>();

    void takeLesson(Lesson lesson) {
        lessons.add(lesson);
    }
}
