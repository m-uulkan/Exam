package peaksoft.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import peaksoft.entity.*;
import peaksoft.util.Util;

import java.util.List;

public class DaoServiceImpl implements DaoService{
          Util util=new Util();
    @Override
    public void createTables() {
        try{
            Session session=util.factory().openSession();
            session.beginTransaction();
            session.getTransaction().commit();
            session.close();
        }catch(HibernateException e){
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void savePerson(List<Person> personList, List<Car> carList,
                           List<SocialMedia> socialMediaList, Company company,
                           Garage garage) {
        try{
            Session session=util.factory().openSession();
            session.beginTransaction();
            for (Person person:personList){
                session.save(person);
            }
            for(Car car:carList){
                session.save(car);
            }
            for(SocialMedia socialMedia:socialMediaList){
                session.save(socialMedia);
            }
            personList.stream().forEach(personList1->personList1.setCompany(company));
            carList.stream().forEach(car->car.setGarage(garage));
            for(int i=0;i< personList.size();i++){
                session.save(personList.get(i));
            }
            session.getTransaction().commit();
            session.close();

        }catch(HibernateException e){
            System.out.println(e.getMessage());
        }

    }


    @Override
    public void deletePersonById(int id) {

    }
}
