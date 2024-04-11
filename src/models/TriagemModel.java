package models;

/**
 *
 * @author Onacio
 */
public class TriagemModel {
    private int id;
    private String dt_registro;
    private String nome;
    private String tipo;
    private String dt_nascimento;
    private String dt_coleta;
    private String unidade;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDt_registro() {
        return dt_registro;
    }

    public void setDt_registro(String dt_registro) {
        this.dt_registro = dt_registro;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDt_nascimento() {
        return dt_nascimento;
    }

    public void setDt_nascimento(String dt_nascimento) {
        this.dt_nascimento = dt_nascimento;
    }

    public String getDt_coleta() {
        return dt_coleta;
    }

    public void setDt_coleta(String dt_coleta) {
        this.dt_coleta = dt_coleta;
    }

    public String getUnidade() {
        return unidade;
    }

    public void setUnidade(String unidade) {
        this.unidade = unidade;
    }

    
}
