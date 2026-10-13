import org.w3c.dom.css.Rect;

public class Sorter {
    public Sorter()
    {

    }
    public Rectangle[] sort(Rectangle[] rectangles)
    {
        int n = rectangles.length;
        boolean swapped;
        Rectangle temp;
        for(int i = 0; i < n-1; i++)
        {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (rectangles[j].calculateArea() > rectangles[j+1].calculateArea())
                {
                    temp = rectangles[j];
                    rectangles[j] = rectangles[j + 1];
                    rectangles[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped)
                break;
        }
        return rectangles;
    }

    public Person[] sort(Person[] people){
        int n = people.length;
        boolean swapped;
        Person temp;
        for(int i = 0; i < n-1; i++)
        {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (people[j].getSurName().compareTo(people[j+1].getSurName()) > 0) {
                    temp = people[j];
                    people[j] = people[j + 1];
                    people[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped)
                break;
        }
        return people;
    }

    public boolean compare(Person a, Person b)
    {
        return a.getSurName().compareTo(b.getSurName()) < 0;
    }
    public boolean compare(Rectangle a, Rectangle b)
    {
        return a.calculateArea() < b.calculateArea();
    }
}
