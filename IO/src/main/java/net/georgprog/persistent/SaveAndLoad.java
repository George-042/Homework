package net.georgprog.persistent;


import net.georgprog.domain.Task;

import java.io.*;
import java.util.List;


public class SaveAndLoad {

    private static final String PATH = "src/main/resources/tasks.bin";

    public static void saveFile(List<Task> tasks) {
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(PATH));
            objectOutputStream.writeObject(tasks);
            objectOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void loadFile() {
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(PATH));
            List<Task> tasks = (List<Task>) objectInputStream.readObject();
            tasks.forEach(System.out::println);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
