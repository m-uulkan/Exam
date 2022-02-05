package peaksoft.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="Company")

public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;
    @Column(name="company_name",nullable = false,unique = true,length = 30)
    private String companyName;
    private String location;

    @OneToMany(mappedBy = "company",
               cascade =CascadeType.ALL)
    private List<Person> personList;



    public Company() {
    }

    public Company(String companyName, String location) {
        this.companyName = companyName;
        this.location = location;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public List<Person> getPersonList() {
        return personList;
    }

    public void setPersonList(List<Person> personList) {
        this.personList = personList;
    }

    @Override
    public String toString() {
        return "Company{" +
                "id=" + id +
                ", companyName='" + companyName + '\'' +
                ", location='" + location + '\'' +
                ", personList=" + personList +
                '}';
    }
}
