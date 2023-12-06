package ProyectoF.Backend.Proyecto3.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Notas")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class NotasEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Integer anio;
    private Integer sem;
    private String cod_alumno;
    private Integer cod_asig;
    private Double nota;
}
