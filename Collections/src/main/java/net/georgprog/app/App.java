package net.georgprog.app;

import net.georgprog.domain.Task;
import net.georgprog.domain.enums.Category;
import net.georgprog.domain.enums.Priority;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App {

    public static void main(String[] args) {

        List<Task> tasks = new ArrayList<>();

        Task task1 = new Task.Builder()
                .withName("Toilet")
                .withDate("24.11.2020")
                .withCategory(Category.HOME)
                .withPriority(Priority.NECESSARY)
                .build();
        Task.addToList(task1, tasks);
        Task.printList(tasks);
        System.out.println();

        Task task2 = new Task.Builder()
                .withName("Academy")
                .withDate("09.11.2020")
                .withCategory(Category.MONDAY)
                .withPriority(Priority.IMPORTANT)
                .build();
        Task.addToList(task2, tasks);
        Task.printList(tasks);
        System.out.println();

        Task task3 = new Task.Builder()
                .withName("Think")
                .withDate("Now")
                .withCategory(Category.BIG_BRAIN)
                .withPriority(Priority.NOT_IMPORTANT)
                .build();
        Task.addToList(task3, tasks);
        Task.printList(tasks);
        System.out.println("\nSorted list by name:");
        Collections.sort(tasks);
        Task.printList(tasks);
        System.out.println("\nhashCode and equals:\n" + task1.hashCode() +
                "\n" + task1.equals(task2));
    }
}
