package home.Task_16;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.File;
import java.io.IOException;

public class Task_16_2 {
    public static void main(String[] args) {
        Group group = new Group("java");
        group.addPerson(new Person("Alex", 22));
        group.addPerson(new Person("Ben", 44));
        group.addPerson(new Person("Carl", 33));

        XmlMapper xmlMapper = new XmlMapper();
        String fileName = "task16xml.xml";

        try {
            xmlMapper.setDefaultUseWrapper(true);
            xmlMapper.writeValue(new File(fileName), group);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
