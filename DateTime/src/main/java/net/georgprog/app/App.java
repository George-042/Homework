package net.georgprog.app;

import net.georgprog.domain.Task;
import net.georgprog.domain.enums.Category;
import net.georgprog.domain.enums.Priority;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

public class App {

    public static void main(String[] args) {

        List<Task> tasks = new ArrayList<>();

        Task task1 = new Task.Builder()
                .withName("Toilet")
                .withDate(new GregorianCalendar(2020, Calendar.NOVEMBER, 12)
                        .getTime())
                .withCategory(Category.HOME)
                .withPriority(Priority.NECESSARY)
                .build();
        Task.addToList(task1, tasks);
        Task.printList(tasks);
        System.out.println();

        Task task2 = new Task.Builder()
                .withName("Academy")
                .withDate(new GregorianCalendar(2020, Calendar.AUGUST, 15)
                        .getTime())
                .withCategory(Category.MONDAY)
                .withPriority(Priority.IMPORTANT)
                .build();
        Task.addToList(task2, tasks);
        Task.printList(tasks);
        System.out.println();

        Task task3 = new Task.Builder()
                .withName("Think")
                .withDate(new GregorianCalendar(2020, Calendar.DECEMBER, 5)
                        .getTime())
                .withCategory(Category.BIG_BRAIN)
                .withPriority(Priority.NOT_IMPORTANT)
                .build();
        Task.addToList(task3, tasks);
        Task.printList(tasks);

        /*
         * The current date is selected from the object's field
         */
        System.out.println("\nNumber of days to selected deadline: "
                + task1.checkDeadline(LocalDate.of(2020, 12, 7)));
    }
}
