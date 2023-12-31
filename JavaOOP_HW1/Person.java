package JavaOOP_HW1;
import java.util.ArrayList;
import java.util.List;

class Person {
    private String name;
    private List<Person> children;

    public Person(String name) {
        this.name = name;
        this.children = new ArrayList<>();
    }

    public void addChild(Person child) {
        children.add(child);
    }

    public List<Person> getChildren() {
        return children;
    }

    public String getName() {
        return name;
    }
}