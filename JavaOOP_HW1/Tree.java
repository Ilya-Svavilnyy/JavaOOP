package JavaOOP_HW1;
import java.util.ArrayList;
import java.util.List;

class Tree {
    private Person root;

    public Tree(Person root) {
        this.root = root;
    }

    public Person getRoot() {
        return root;
    }

    public List<Person> getAllChildren(Person person) {
        List<Person> allChildren = new ArrayList<>();
        List<Person> children = person.getChildren();
    
        for (Person child : children) {
            allChildren.add(child);
        }
    
        for (Person child : children) {
            allChildren.addAll(getAllChildren(child));
        }
    
        return allChildren;
    }
}


