
package Controller;

/**
 *
 * @author jayme
 */
public class Livro {
    private String nome;
    private String editora;
    private String edicao;
    private String area;

    public String getNome() {
        return nome;
    }

    public Livro(String nome, String editora, String edicao, String area) {
        this.nome = nome;
        this.editora = editora;
        this.edicao = edicao;
        this.area = area;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String getEdicao() {
        return edicao;
    }

    public void setEdicao(String edicao) {
        this.edicao = edicao;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }
}
