package peaksoft;

import peaksoft.entity.*;
import peaksoft.service.ServcieImple;

import java.util.ArrayList;
import java.util.Comparator;
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
      List<Car>carlist=new ArrayList<>();
      carlist.add(new Car("BT2501","Germany"));
      carlist.add(new Car("BT2502","Italy"));
      carlist.add(new Car("BT2503","Spain"));
      List<SocialMedia>socialMediaList=new ArrayList<>();
      socialMediaList.add(new SocialMedia("instagram"));
      socialMediaList.add(new SocialMedia("odnoklassniki"));
      socialMediaList.add(new SocialMedia("twitter"));
      Company company=new Company("Aktek","street 51 ");
      Company company1=new Company("Aktek1","street 51 ");
      Company company2=new Company("Aktek2","street 51 ");
      Garage garage=new Garage("Garage",true);
      Garage garage1=new Garage("Garage1",false);
      Garage garage2=new Garage("Garage2",true);
      servcieImple.savePerson();

    }
}
