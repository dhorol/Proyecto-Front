package ProyectoF.Backend.Proyecto3.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Estudiante")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class EstudianteEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)

    private Long id;
    private String Rut;
    private String Nombres;
    private String Apellidos;
    private String Email;
    private Integer cod_carr;


}
