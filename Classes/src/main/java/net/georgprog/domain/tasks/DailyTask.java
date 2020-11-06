package net.georgprog.domain.tasks;

import net.georgprog.domain.Task;

public class DailyTask extends Task {

    private String numberOfDays;

    public DailyTask(String name, String category, String priority, String date, String numberOfDays) {
        super(name, category, priority, date);
        this.numberOfDays = numberOfDays;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", numberOfDays = " + numberOfDays;
    }

    public String getNumberOfDays() {
        return numberOfDays;
    }

    public void setNumberOfDays(String numberOfDays) {
        this.numberOfDays = numberOfDays;
    }
}
