package system.project.boxd.model;

import jakarta.persistence.*;

@Entity
@Table(name = "moradia")
public class Moradia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_moradia")
    private Integer idMoradia;
    @Column(name = "nome_condominio", length = 100)
    private String nomeCondominio;
    @Column(name = "numero_bloco")
    private Integer numeroBloco;
    @Column(name = "numero_ap")
    private Integer numeroAp;
}
