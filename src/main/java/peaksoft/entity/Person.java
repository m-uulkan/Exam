package peaksoft.entity;

import javax.persistence.*;
import java.util.List;

import static javax.persistence.CascadeType.*;

@Entity
@Table(name="Person")
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;
    @Column(nullable =false)
    private String name;
    private int age;
    @Column(unique = true,nullable = false,length = 25)
    private String email;
    @Column(nullable = false)
    private String gender;

    @ManyToOne(cascade = {DETACH, PERSIST, MERGE, REFRESH} )
    @JoinColumn(name = "company_id")
    private Company company;

    @OneToMany
    @JoinColumn(name="socialMedia_id")
    private List <SocialMedia> socialMediaList;

    @OneToMany(mappedBy = "person")
    @JoinColumn(name="car_id")
    private List<Car>carList;

    public Company getCompany() {
        return company;
    }

    public Person() {
    }

    public Person(String name, int age, String email, String gender) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.gender = gender;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public List<SocialMedia> getSocialMediaList() {
        return socialMediaList;
    }

    public void setSocialMediaList(List<SocialMedia> socialMediaList) {
        this.socialMediaList = socialMediaList;
    }

    public List<Car> getCarList() {
        return carList;
    }

    public void setCarList(List<Car> carList) {
        this.carList = carList;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", gender='" + gender + '\'' +
                ", company=" + company +
                ", socialMediaList=" + socialMediaList +
                ", carList=" + carList +
                '}';
    }
}
