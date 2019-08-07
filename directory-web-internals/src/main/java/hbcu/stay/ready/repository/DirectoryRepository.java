package hbcu.stay.ready.repository;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import hbcu.stay.ready.domain.Person;

@Repository
public class DirectoryRepository {

    @SuppressWarnings("serial")
    private List<Person> directory = new ArrayList<Person>(){{
        add(new Person("john@email.com","John S","password","1985-11-10"));
        add(new Person("mike@email.com","Mike H","password","1984-12-02"));
        add(new Person("dan@email.com","Dan B","password","1983-03-07"));
        add(new Person("bill@email.com","Bill G","password","1983-06-12"));
        add(new Person("mark@email.com","Mark S","password","1986-02-22"));
    }};

    public Iterable<Person> findAll(){
        return this.directory;
    }

}
