package home.Task_16;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Task_16_1 {
    public static void main(String[] args) throws FileNotFoundException {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        FileReader fileReader = new FileReader("task16json.txt");
        Group restoredGroup = gson.fromJson(fileReader, Group.class);

        System.out.println(restoredGroup);
        restoredGroup.getPersons().forEach(System.out::println);
    }
}
