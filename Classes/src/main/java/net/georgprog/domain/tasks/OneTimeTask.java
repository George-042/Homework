package net.georgprog.domain.tasks;

import net.georgprog.domain.Task;

public class OneTimeTask extends Task {

    private String personName;

    public OneTimeTask(String name, String category, String priority, String date, String personName) {
        super(name, category, priority, date);
        this.personName = personName;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", personName = " + personName;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }
}
