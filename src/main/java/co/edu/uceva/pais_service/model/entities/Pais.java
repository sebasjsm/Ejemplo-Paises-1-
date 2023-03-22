package co.edu.uceva.pais_service.model.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="pais") //mapear
public class Pais {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)// valor generado, hagalo con estrategia directa
    private Long id;
    private String nombre;
}
