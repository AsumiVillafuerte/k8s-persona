package pe.edu.vallegrande.asumi_persona_rest.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table("personas")
public class Persona {

    @Id
    @Column("id")
    private Long id;
    
    @Column("nombre")
    private String nombre;
    
    @Column("apellido")
    private String apellido;
    
    @Column("email")
    private String email;
}