package peaksoft.entity;

import javax.persistence.*;


@Entity
@Table(name="Garage")
public class Garage {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
   private long id;
   private String name;
   private boolean isEmpty;

   @OneToOne(mappedBy = "garage",
             cascade=CascadeType.ALL)
   private Car car;

    public Garage() {
    }

    public Garage(String name, boolean isEmpty) {
        this.name = name;
        this.isEmpty = isEmpty;
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

    public boolean isEmpty() {
        return isEmpty;
    }

    public void setEmpty(boolean empty) {
        isEmpty = empty;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
        car.setGarage(this);
    }

    @Override
    public String toString() {
        return "Garage{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", isEmpty=" + isEmpty +
                ", car=" + car +
                '}';
    }
}
