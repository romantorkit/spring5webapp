package guru.springframework.spring5webapp.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

/**
 * Created by romantorkit on 11/6/19
 */
@Entity
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode(exclude = "book")
public class Publisher {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String adress;
    @OneToOne
    @JsonIgnore
    private Book book;

    public Publisher(String name, String adress) {
        this.name = name;
        this.adress = adress;
    }
}
