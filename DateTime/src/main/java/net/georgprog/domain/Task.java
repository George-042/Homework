package net.georgprog.domain;

import net.georgprog.domain.enums.Category;
import net.georgprog.domain.enums.Priority;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;
import java.util.Objects;

public class Task<T> implements Taskable, Comparable<Task<T>> {

    private String name;
    private Date date;
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

        public Builder withDate(Date date) {
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
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        return "name='" + name +
                ", date='" + dateFormat.format(date) +
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

    public static void listSort(List<Task> tasks) {
        tasks.stream()
                .sorted()
                .forEach(System.out::println);
    }

    public static void listFilter(List<Task> tasks) {
        tasks.stream()
                .filter(task -> task.name.length() > 5)
                .forEach(System.out::println);
    }

    public static void getDistinctList(List<Task> tasks) {
        tasks.stream()
                .distinct()
                .forEach(System.out::println);
    }

    public static void getTaskNames(List<Task> tasks) {
        tasks.stream()
                .map(task -> task.name)
                .forEach(System.out::println);
    }

    public static boolean checkLength(List<Task> tasks, int length) {
        return tasks.stream().allMatch(task -> task.name.length() > length);
    }

    public static void printList(List<Task> tasks) {
        tasks.forEach(System.out::println);
    }

    public long checkDeadline(LocalDate deadline) {
        LocalDate now = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        return Duration.between(now.atStartOfDay(), deadline.atStartOfDay()).toDays();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
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
