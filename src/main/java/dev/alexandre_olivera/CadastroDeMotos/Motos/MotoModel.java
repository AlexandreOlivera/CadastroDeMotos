package dev.alexandre_olivera.CadastroDeMotos.Motos;

import dev.alexandre_olivera.CadastroDeMotos.Comprador.CompradorModel;
import jakarta.persistence.*;

@Entity
@Table(name = "tb_cadastro")
public class MotoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String fabricante;
    private String modelo;
    private String cor;
    private String categoria;
    private int anoFabricacao;
    private double cilindrada;

    @ManyToOne
    @JoinColumn(name = "comprador_id")
    private CompradorModel comprador;

    public MotoModel() {
    }

    public MotoModel(String fabricante, String modelo, String cor, String categoria, int anoFabricacao, double cilindrada) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.cor = cor;
        this.categoria = categoria;
        this.anoFabricacao = anoFabricacao;
        this.cilindrada = cilindrada;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public double getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(double cilindrada) {
        this.cilindrada = cilindrada;
    }
}
