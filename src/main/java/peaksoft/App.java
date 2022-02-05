package peaksoft;

import peaksoft.entity.Person;
import peaksoft.service.ServcieImple;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App
{
    static ServcieImple servcieImple=new ServcieImple();
    public static void main( String[] args )

    {
      servcieImple.createTables();
      List<Person> personList=new ArrayList<>();
      personList.add(new Person("Uulkan",28,"uulkan@mail.com","female"));
      personList.add(new Person("Uulkan1",28,"uulkan@mail.com","female"));
      personList.add(new Person("Uulkan2",28,"uulkan@mail.com","female"));
      servcieImple.savePerson();

    }
}
