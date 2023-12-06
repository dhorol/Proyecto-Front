package ProyectoF.Backend.Proyecto3.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Plan_estudios")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Plan_EstudiosEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Integer cod_carr;
    private String cod_plan;
    private Integer nivel;
    private Integer cod_asig;
    private String nom_asig;


}
