package system.project.boxd.model;

import jakarta.persistence.*;

@Entity
@Table(name = "pedido")
public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_pedido")
    private Integer idPedido;
    @Column(name = "nome_morador", length = 100)
    private String nomeMorador;
    @Column(name = "numero_bloco")
    private Integer numeroBloco;
    @Column(name = "numero_ap")
    private Integer numeroAp;
    @Column(name = "numero_condominio")
    private String nomeCondominio;
    @Column(name = "id_morador")
    private Integer idMorador;
    @Column(name = "cpf", length = 15)
    private String cpf;

}
