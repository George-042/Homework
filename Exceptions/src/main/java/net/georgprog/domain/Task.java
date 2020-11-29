package net.georgprog.domain;

import net.georgprog.domain.enums.Category;
import net.georgprog.domain.enums.Priority;

import java.util.List;
import java.util.Objects;

public class Task<T> implements Taskable, Comparable<Task<T>> {

    /**
     * To change the id, use set. By default, id = 0 (Integer).
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

    @Override
    public int compareTo(Task<T> o) {
        return this.getName().compareTo(o.name);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task<?> task = (Task<?>) o;
        return Objects.equals(name, task.name) &&
                Objects.equals(date, task.date) &&
                category == task.category &&
                priority == task.priority &&
                Objects.equals(id, task.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, date, category, priority, id);
    }

    public static void addToList(Task o, List<Task> tasks) {
        tasks.add(o);
    }

    public static void printList(List<Task> tasks) {
        tasks.forEach(System.out::println);
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
