package peaksoft.dao;

import peaksoft.entity.*;

import java.util.List;

public interface DaoService {
    void createTables();
    void savePerson(List<Person> personList, List<Car>carList, List<SocialMedia>socialMediaList,
                    Company company, Garage garage);
    void deletePersonById(int id);


}
