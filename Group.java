package home.Task_16;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Group {
    @JacksonXmlElementWrapper(useWrapping = false)
    private String name;
    @JsonProperty("person")
    @JacksonXmlElementWrapper(useWrapping = false)
    private List<Person> persons = new ArrayList<>();

    public Group(String name) {
        this.name = name;
    }

    public void addPerson(Person person) {
        persons.add(person);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Person> getPersons() {
        return persons;
    }

    public void setPersons(List<Person> persons) {
        this.persons = persons;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || object.getClass() != this.getClass()) {
            return false;
        }
        Group group = (Group) object;
        return getName().equals(group.getName()) &&
                Objects.equals(getPersons(), group.getPersons());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getPersons());
    }

    @Override
    public String toString() {
        return "Group{" +
                "name='" + name + '\'' +
                ", persons=" + persons +
                '}';
    }
}
