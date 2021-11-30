package by.itacademy.javaenterprise.goralchuk.entity.documents;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.hibernate.annotations.Immutable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@NoArgsConstructor
@Entity
@ToString(callSuper=true)
@Immutable
public class ProphylacticLeave extends Document {
    @Id
    private Long numberProphylacticLeave;
    private String description;
}
