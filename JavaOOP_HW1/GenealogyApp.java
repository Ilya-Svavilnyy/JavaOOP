package JavaOOP_HW1;
import java.util.List;

public class GenealogyApp {
    public static void main(String[] args) {
        // Создание персон
        Person person1 = new Person("Person 1");
        Person person2 = new Person("Person 2");
        Person person3 = new Person("Person 3");
        Person person4 = new Person("Person 4");
        Person person5 = new Person("Person 5");
        Person person6 = new Person("Person 6");

        // Создание древа
        Tree tree = new Tree(person1);
        
        // Построение генеалогического древа
        person1.addChild(person2);
        person1.addChild(person3);
        person2.addChild(person4);
        person2.addChild(person5);
        person3.addChild(person6);
        
        // Получение всех детей выбранного человека
        List<Person> allChildren = tree.getAllChildren(person2);
        for (Person child : allChildren) {
            System.out.println("Child: " + child.getName());
        }
    }
}