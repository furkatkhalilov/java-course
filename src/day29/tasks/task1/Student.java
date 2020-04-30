package day29.tasks.task1;

import java.util.ArrayList;

public class Student {
    String name;
    int maxCredit;
    ArrayList<Lesson> lessons = new ArrayList<>();

    void takeLesson(Lesson subject) {
        // calculate how many credits we have currently
        int currentTotalCredit = 0;
        for(Lesson lesson : lessons) {
            currentTotalCredit += lesson.credit;
        }

        // control maximum credit that student can have
        if(currentTotalCredit < maxCredit) {
            lessons.add(subject);
        }

    }

}
