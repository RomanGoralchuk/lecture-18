package by.itacademy.javaenterprise.goralchuk.entity.documents;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Immutable;

import javax.persistence.*;

@Data
@NoArgsConstructor
@ToString(callSuper=true)
@Entity
@Table(name = "prophylacticLeave")
public class ProphylacticLeave extends Document {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long numberProphylacticLeave;
    private String description;
}
