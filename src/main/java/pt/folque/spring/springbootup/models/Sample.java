package pt.folque.spring.springbootup.models;

import javax.persistence.*;

/**
 * Created by Diogo on 30-Jun-15.
 */
@Entity
@Table(name = "samples")
public class Sample {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column
    private String one;
    @Column
    private String two;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOne() {
        return one;
    }

    public void setOne(String one) {
        this.one = one;
    }

    public String getTwo() {
        return two;
    }

    public void setTwo(String two) {
        this.two = two;
    }
}
