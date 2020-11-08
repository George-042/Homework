package net.georgprog.domain;

public abstract class Task implements Taskable {

    private String name;
    private String category;
    private String priority;
    private String date;

    public Task(String name, String category, String priority, String date) {
        this.name = name;
        this.category = category;
        this.priority = priority;
        this.date = date;
    }

    public void execute() {
        System.out.println("Task in progress!");
    }

    public void complete() {
        System.out.println("The task has been terminated!");
    }

    @Override
    public String toString() {
        return "name = " + name +
                ", category = " + category +
                ", priority = " + priority +
                ", date = " + date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
