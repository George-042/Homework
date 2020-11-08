package net.georgprog.app;

import net.georgprog.domain.Task;
import net.georgprog.domain.enums.Category;
import net.georgprog.domain.enums.Priority;

public class App {

    public static void main(String[] args) {

        /**
         * To change the id, use set. By default, id = 0 (Integer).
         */

        Task task1 = new Task.Builder()
                .withName("Toilet")
                .withDate("24.11.2020")
                .withCategory(Category.HOME)
                .withPriority(Priority.NECESSARY)
                .build();
        System.out.println("By default, id = " + task1.getId());
        task1.setId("None");
        System.out.println(task1.toString());

        Task task2 = new Task.Builder()
                .withName("Academy")
                .withDate("09.11.2020")
                .withCategory(Category.MONDAY)
                .withPriority(Priority.IMPORTANT)
                .build();
        System.out.println(task2.toString());

        Task task3 = new Task.Builder()
                .withName("Think")
                .withDate("Now")
                .withCategory(Category.BIG_BRAIN)
                .withPriority(Priority.NOT_IMPORTANT)
                .build();
        System.out.println(task3.toString());
    }
}
