import org.w3c.dom.css.Rect;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static java.lang.System.exit;

public class Sorter {
    public Sorter()
    {

    }
    public <T> List<T> sort(List<T> list)
    {
        if (list == null || list.isEmpty()) {
            return null;
        }
        List<T> resultList = new ArrayList<>(list);
        Object firstElement = list.getFirst();

        if (firstElement instanceof Rectangle)
        {
            List<Rectangle> rectangles = (List<Rectangle>) resultList;
            Collections.sort(rectangles, Comparator.comparingDouble(Rectangle::calculateArea));
            return resultList;
        }
        else if (firstElement instanceof Person) {
            // Deal with Persons: sort by their age
            List<Person> persons = (List<Person>) resultList;
            Collections.sort(persons, Comparator.comparing(Person::getSurName));
            return resultList;
        } else {
            throw new IllegalArgumentException("Sorter only supports Lists of Person or Rectangle.");
        }

    }
//    public Rectangle[] sort(Rectangle[] rectangles)
//    {
//        int n = rectangles.length;
//        boolean swapped;
//        Rectangle temp;
//        for(int i = 0; i < n-1; i++)
//        {
//            swapped = false;
//            for (int j = 0; j < n - i - 1; j++) {
//                if (rectangles[j].calculateArea() > rectangles[j+1].calculateArea())
//                {
//                    temp = rectangles[j];
//                    rectangles[j] = rectangles[j + 1];
//                    rectangles[j + 1] = temp;
//                    swapped = true;
//                }
//            }
//            if (!swapped)
//                break;
//        }
//        return rectangles;
//    }
//
//    public Person[] sort(Person[] people){
//        int n = people.length;
//        boolean swapped;
//        Person temp;
//        for(int i = 0; i < n-1; i++)
//        {
//            swapped = false;
//            for (int j = 0; j < n - i - 1; j++) {
//                if (people[j].getSurName().compareTo(people[j+1].getSurName()) > 0) {
//                    temp = people[j];
//                    people[j] = people[j + 1];
//                    people[j + 1] = temp;
//                    swapped = true;
//                }
//            }
//            if (!swapped)
//                break;
//        }
//        return people;
//    }

    public <T> boolean compare(T a, T b)
    {
        if (a == null || b == null) {
            return false;
        }
        if (a instanceof Person && b instanceof Person) {
            Person first = (Person) a;
            Person second = (Person) b;
            return first.getSurName().compareTo(second.getSurName()) < 0;
        }
        else if (a instanceof Rectangle && b instanceof Rectangle){
            Rectangle first = (Rectangle) a;
            Rectangle second = (Rectangle) b;
            return first.calculateArea() < second.calculateArea();
        }
        return false;
    }
//    public boolean compare(Rectangle a, Rectangle b)
//    {
//        return a.calculateArea() < b.calculateArea();
//    }
}
