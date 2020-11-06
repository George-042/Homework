package net.georgprog.domain.tasks;

import net.georgprog.domain.Task;

public class ReusableTask extends Task {

    private int levelOfUtility;

    public ReusableTask(String name, String category, String priority, String date, int levelOfUtility) {
        super(name, category, priority, date);
        this.levelOfUtility = levelOfUtility;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", levelOfUtility = " + levelOfUtility;
    }

    public int getLevelOfUtility() {
        return levelOfUtility;
    }

    public void setLevelOfUtility(int levelOfUtility) {
        this.levelOfUtility = levelOfUtility;
    }
}
