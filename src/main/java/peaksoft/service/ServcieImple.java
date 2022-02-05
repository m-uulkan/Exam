package peaksoft.service;

import peaksoft.dao.DaoService;
import peaksoft.dao.DaoServiceImpl;

public class ServcieImple implements ServiceInt{
    DaoService dao=new DaoServiceImpl();
    @Override
    public void createTables() {
        dao.createTables();

    }

    @Override
    public void savePerson() {

    }

    @Override
    public void deletePersonById(int id) {

    }

    @Override
    public void saveSocialMedia() {

    }

    @Override
    public void deleteById() {

    }
}
