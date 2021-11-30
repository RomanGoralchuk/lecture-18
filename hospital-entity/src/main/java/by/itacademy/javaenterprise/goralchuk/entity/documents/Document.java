package by.itacademy.javaenterprise.goralchuk.entity.documents;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.MappedSuperclass;

@Data
@MappedSuperclass
@NoArgsConstructor
public abstract class Document {
    @Column(name = "cardID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long numberOfDocumentInBase;
}
