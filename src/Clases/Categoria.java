
package Clases;


/**
 *
 * @author Fabián
 */
public class Categoria {
    public String tipo;
    public int codigo;

    public Categoria(String tipo, int codigo) {
        this.tipo = tipo;
        this.codigo = codigo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

}
