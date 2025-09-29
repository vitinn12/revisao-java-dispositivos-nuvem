public class Lampada {
    int id;
    String tipo;
    Boolean estado;
    Fornecedor fornecedor;

    public Lampada() {
        this.estado = false;
    }

    public Lampada(int id, String tipo, Fornecedor fornecedor) {
        this.id = id;
        this.tipo = tipo;
        this.estado = false;
        this.fornecedor = fornecedor;
    }

    public void acender() {
        this.estado = true;
    }
    public void apagar() {
        this.estado = false;
    }

    public boolean getEstado() {
        return this.estado;
    }

    public int getId() {
        return this.id;
    }
    public String getTipo() {
        return this.tipo;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    public String toString() {
        return "Lampada id= " + id + ", tipo= " + tipo + ", estado= " + estado + ", fornecedor= " + fornecedor.getNome();
    }

    public Fornecedor getFornecedor() {
        return this.fornecedor;
    }
    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

}
 