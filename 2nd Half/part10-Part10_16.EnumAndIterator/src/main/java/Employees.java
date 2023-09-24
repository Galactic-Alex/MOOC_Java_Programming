import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Employees {
    List<Person> people;

    public Employees() {
        people = new ArrayList<>();
    }

    public List<Person> getPeople() {
        return people;
    }

    public void add(Person personToAdd) {
        people.add(personToAdd);
    }

    public void add(List<Person> peopleToAdd) {
        people.addAll(peopleToAdd);
    }

    public void print() {
        Iterator<Person> personIterator = people.iterator();
        while (personIterator.hasNext()) {
            System.out.println(personIterator.next());
        }
    }

    public void print(Education education) {
        Iterator<Person> personIterator = people.iterator();
        int counter = 0;
        while (personIterator.hasNext()) {
            if (personIterator.next().getEducation().equals(education)) {
                System.out.println(people.get(counter));
                counter++;
            }
        }
    }

    public void fire(Education education) {
        Iterator<Person> personIterator = people.iterator();
        while (personIterator.hasNext()) {
            if (personIterator.next().getEducation().equals(education)) {
                personIterator.remove();
            }
        }
    }
}
