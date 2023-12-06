package ProyectoF.Backend.Proyecto3.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "carreras")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CarrerasEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)

    private Integer Codigo;
    private  String Nombre_carrera;
}
