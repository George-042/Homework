package net.georgprog.app;

import net.georgprog.domain.Task;
import net.georgprog.domain.enums.Category;
import net.georgprog.domain.enums.Priority;
import net.georgprog.exceptions.CheckedException;
import net.georgprog.exceptions.UncheckedException;

import java.util.*;

public class App {

    public static boolean EXCEPTION = true;

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

        System.out.println();
        try {
            throwsCheckedException();
        } catch (CheckedException e) {
            System.out.println("Exception is handled. Error code - " + e);
        } finally {
            System.out.println("Part \"finally\" is running");
        }

        System.out.println();
        methodUncheckedException();

        System.out.println();
        enter();
    }

    public static void throwsCheckedException() throws CheckedException {
        System.out.println("Checked method is running!");
        throw new CheckedException();
    }

    public static void methodUncheckedException() {
        System.out.println("Unchecked method is running!");
        if (!EXCEPTION) {
            throw new UncheckedException();
        }
    }

    public static void enter() {
        try {
            System.out.println("Enter string for exception");
            int in = new Scanner(System.in).nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Incorrect input. Try again. Error code - " + e);
            enter();
        }
    }
}
