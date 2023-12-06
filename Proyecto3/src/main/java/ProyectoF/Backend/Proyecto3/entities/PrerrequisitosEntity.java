package ProyectoF.Backend.Proyecto3.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Prerrequisitos")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PrerrequisitosEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Integer cod_asig;
    private Integer cod_prerreq;
}
