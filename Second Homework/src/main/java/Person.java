public class Person {
    private String firstName;
    private String surName;
    public Person(String firstName,String surName)
    {
        this.firstName = firstName;
        this.surName = surName;
    }
    public String getSurName() { return surName; }

    @Override
    public String toString() {
        return firstName + " " + surName;
    }
}
