package system.project.boxd.model;

import jakarta.persistence.*;

@Entity
@Table(name = "morador")
public class Morador {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_morador")
    private Integer idMorador;
    @Column(name = "cpf", length = 15)
    private String cpf;
    @Column(name = "nome_morador", length = 50)
    private String nomeMorador;
    @Column(name = "idade")
    private Integer idade;
    @Column(name = "numero_bloco")
    private Integer numeroBloco;
    @Column(name = "numero_ap")
    private Integer numeroAp;
    @Column(name = "nome_condominio", length = 100)
    private String nomeCondominio;
}
