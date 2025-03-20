package dev.alexandre_olivera.CadastroDeMotos.Comprador;

import dev.alexandre_olivera.CadastroDeMotos.Motos.MotoModel;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "tb_comprador")
public class CompradorModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    private String cpf;
    private String telefone;
    private double orcamento;
    private MotoModel moto;

    @OneToMany(mappedBy = "comprador")
    private List<MotoModel> motos;

    public CompradorModel() {
    }

    public CompradorModel(Long id, String nome, String email, String cpf, String telefone, double orcamento, MotoModel moto) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.cpf = cpf;
        this.telefone = telefone;
        this.orcamento = orcamento;
        this.moto = moto;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public double getOrcamento() {
        return orcamento;
    }

    public void setOrcamento(double orcamento) {
        this.orcamento = orcamento;
    }

    public MotoModel getMoto() {
        return moto;
    }

    public void setMoto(MotoModel moto) {
        this.moto = moto;
    }
    
}
