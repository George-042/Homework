package net.georgprog.app;

import net.georgprog.domain.tasks.OneTimeTask;
import net.georgprog.domain.tasks.ReusableTask;

public class App {

    public static void main(String[] args) {
        OneTimeTask task = new OneTimeTask("Toilet", "Thursday",
                "Important", "24.06.2020", "Artyom");
        System.out.println(task);
        task.execute();
        System.out.println("priority: " + task.getPriority());
        System.out.println("priority (changed): ");
        task.setPriority("Not important");
        System.out.println("priority: " + task.getPriority());
        task.complete();

        System.out.println();

        ReusableTask task1 = new ReusableTask("it-academy", "Monday",
                "Important", "09.11.2020", 80);
        System.out.println(task1);
        task1.execute();
        System.out.println("levelOfUtility: " + task1.getLevelOfUtility());
        System.out.println("levelOfUtility (changed): ");
        task1.setLevelOfUtility(100);
        System.out.println("levelOfUtility: " + task1.getLevelOfUtility());
        task1.complete();
    }
}
