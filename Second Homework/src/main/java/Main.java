//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        Person a = new Person("Ahmed", "Amir");
        Person b = new Person("Ahmed", "Bamir");
        Person c = new Person("Ahmed", "Camir");
        Person d = new Person("Ahmed", "Damir");
        Person e = new Person("Ahmed", "Eamir");
        Person[] people = {c,a,b,d,e};
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
        Rectangle[] rectangles = {rectangle1,rectangle2,rectangle3,rectangle4,rectangle5};
        rectangles = s.sort(rectangles);
        for (Rectangle rectangle : rectangles) {
            System.out.println(rectangle.length + " " + rectangle.width);
        }


    }
}
