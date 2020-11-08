package net.georgprog.domain;

import net.georgprog.domain.enums.Category;
import net.georgprog.domain.enums.Priority;

public class Task<T> implements Taskable {

    /**
     * To change the id, use set. By default, id = 0.
     */

    private String name;
    private String date;
    private Category category;
    private Priority priority;
    private T id;

    public Task(T id) {
        this.id = id;
    }

    public static class Builder {
        private Task newTask;

        public Builder() {
            newTask = new Task<Integer>(0);
        }

        public Builder withName(String name) {
            newTask.name = name;
            return this;
        }

        public Builder withDate(String date) {
            newTask.date = date;
            return this;
        }

        public Builder withCategory(Category category) {
            newTask.category = category;
            return this;
        }

        public Builder withPriority(Priority priority) {
            newTask.priority = priority;
            return this;
        }

        public Task build() {
            return newTask;
        }
    }

    public void execute() {
        System.out.println("Task in progress!");
    }

    public void complete() {
        System.out.println("The task is completed!");
    }

    @Override
    public String toString() {
        return "name='" + name +
                ", date='" + date +
                ", category=" + category +
                ", priority=" + priority +
                ", id=" + id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Priority getPriority() {
        return priority;
    }

    public void setPriority(Priority priority) {
        this.priority = priority;
    }

    public T getId() {
        return id;
    }

    public void setId(T id) {
        this.id = id;
    }
}
