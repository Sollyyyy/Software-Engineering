import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        Person a = new Person("Ahmed", "Amir");
        Person b = new Person("Ahmed", "Bamir");
        Person c = new Person("Ahmed", "Camir");
        Person d = new Person("Ahmed", "Damir");
        Person e = new Person("Ahmed", "Eamir");
        List<Person> people = new ArrayList<>();
        people.add(a);
        people.add(e);
        people.add(b);
        people.add(d);
        people.add(c);
        Sorter s = new Sorter();
        people = s.sort(people);
        for (Person person : people) {
            System.out.println(person);
        }
        Rectangle rectangle1 = new Rectangle(3,7);
        Rectangle rectangle2 = new Rectangle(2,9);
        Rectangle rectangle3 = new Rectangle(6,12);
        Rectangle rectangle4 = new Rectangle(3,3);
        Rectangle rectangle5 = new Rectangle(2,2);
        List<Rectangle> rectangles = new ArrayList<>();
        rectangles.add(rectangle1);
        rectangles.add(rectangle2);
        rectangles.add(rectangle3);
        rectangles.add(rectangle5);
        rectangles.add(rectangle4);
        rectangles = s.sort(rectangles);
        for (Rectangle rectangle : rectangles) {
            System.out.println(rectangle.length + " " + rectangle.width);
        }
        System.out.println(s.compare(rectangle2,rectangle1));
        System.out.println(s.compare(c,a));

    }
}
