package net.georgprog.domain;

import net.georgprog.domain.enums.Category;
import net.georgprog.domain.enums.Priority;
import org.junit.Rule;
import org.junit.Test;
import org.junit.experimental.theories.DataPoint;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(Theories.class)
public class TaskTest {

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @DataPoint
    public static LocalDate[] dataForDeadline() {
        return new LocalDate[]
                {LocalDate.of(2021, 1, 15),
                        LocalDate.of(2020, 5, 15),
                        LocalDate.of(1985, 10, 20)};
    }

    @Theory
    public void checkDeadline(LocalDate[] input) throws Exception {
        Task task = new Task.Builder()
                .withName("task")
                .withDate(new GregorianCalendar(2020, Calendar.NOVEMBER, 12)
                        .getTime())
                .build();
        long actual = task.checkDeadline(input[0], true); // input[0] - true
        assertEquals(64, actual);
    }

    @Theory
    public void checkDeadlineWithException(LocalDate[] input) throws Exception {
        expectedException.expect(Exception.class);
        Task task = new Task.Builder()
                .withName("task")
                .withDate(new GregorianCalendar(2020, Calendar.NOVEMBER, 12)
                        .getTime())
                .build();
        long actual = task.checkDeadline(input[0], false);
        assertEquals(63, actual); // expected 64 - true
    }

    @Test
    public void printList() {
        List expected = new ArrayList();
        Task task = new Task.Builder()
                .withName("Task")
                .withPriority(Priority.NECESSARY)
                .build();
        expected.add(task);
        List actual = Task.printList(expected);
        assertEquals(expected, actual);
    }

    @Test
    public void listSort() {
        List expected = new ArrayList();
        Task task = new Task.Builder()
                .withName("Task")
                .withPriority(Priority.NECESSARY)
                .build();
        expected.add(task);
        List actual = Task.listSort(expected);
        assertEquals(expected, actual);
    }

    @Test
    public void listFilter() {
        List expected = new ArrayList();
        Task task = new Task.Builder()
                .withName("Task")
                .withPriority(Priority.NECESSARY)
                .withDate(new GregorianCalendar(2020, Calendar.AUGUST, 15)
                        .getTime())
                .withCategory(Category.BIG_BRAIN)
                .build();
        expected.add(task);
        List actual = Task.listFilter(expected);
        assertEquals(expected, actual);
    }

    @Test
    public void getDistinctList() {
        List expected = new ArrayList();
        Task task = new Task.Builder()
                .withName("Task")
                .withPriority(Priority.NECESSARY)
                .build();
        expected.add(task);
        List actual = Task.getDistinctList(expected);
        assertEquals(expected, actual);
    }

    @Test
    public void getTaskNames() {
        List expected = new ArrayList();
        Task task = new Task.Builder()
                .withName("Task")
                .withPriority(Priority.NECESSARY)
                .withDate(new GregorianCalendar(2020, Calendar.AUGUST, 15)
                        .getTime())
                .withCategory(Category.BIG_BRAIN)
                .build();
        expected.add(task);
        List actual = Task.getTaskNames(expected);
        assertEquals(expected, actual);
    }

    @Test
    public void checkLength() {
        List expected = new ArrayList();
        Task task = new Task.Builder()
                .withName("Task")
                .withPriority(Priority.NECESSARY)
                .withDate(new GregorianCalendar(2020, Calendar.AUGUST, 15)
                        .getTime())
                .withCategory(Category.BIG_BRAIN)
                .build();
        expected.add(task);
        boolean actual = Task.checkLength(expected, 3);
        assertEquals(false, actual);
    }
}