package springcourse.dao;

import org.springframework.stereotype.Component;
import springcourse.models.Person;

import java.util.ArrayList;
import java.util.List;

@Component
public class PersonDAO {

    private List<Person> people;

    {
        people = new ArrayList<>();

        people.add(new Person(1, "tom"));
        people.add(new Person(2, "jack"));
        people.add(new Person(3, "joe"));
        people.add(new Person(4, "billy"));
    }

    public List<Person> index() {
        return people;
    }

    public Person show(int id) {
        return people.stream().filter(person  -> person.getId() == id).findAny().orElse(null);
    }
}
