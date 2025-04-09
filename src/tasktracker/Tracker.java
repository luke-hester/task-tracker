package tasktracker;

import java.util.ArrayList;

public class Tracker {
    int current_id = 0;

    ArrayList<Task> tasks = new ArrayList<>();

    void add(String name){
        current_id += 1;
        int id = current_id;
        Task task = new Task(name, id);
        tasks.add(task);
        System.out.println("Task added successfully (ID: " + id + ")");
    }
}
