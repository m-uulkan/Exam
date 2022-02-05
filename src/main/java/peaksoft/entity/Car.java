package peaksoft.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="car")

public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;
    @Column(nullable=false)
    private String mark;
    private String producedCountry;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="person_id")
    private Person person;


    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "garage_id")
    private Garage garage;

    public Garage getGarage() {
        return garage;
    }

    public void setGarage(Garage garage) {
        this.garage = garage;
    }

    public Car() {
    }

    public Car(String mark, String producedCountry) {
        this.mark = mark;
        this.producedCountry = producedCountry;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getProducedCountry() {
        return producedCountry;
    }

    public void setProducedCountry(String producedCountry) {
        this.producedCountry = producedCountry;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}
