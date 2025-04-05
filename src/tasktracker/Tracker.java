package tasktracker;

import java.util.ArrayList;

public class Tracker {
    ArrayList<Task> tasks = new ArrayList<>();

    void add(String name){
        Task task = new Task(name);
        tasks.add(task);
        System.out.println("Added task " + name);
    }
}
