
package Controller;

/**
 *
 * @author jayme
 */
public class Livro {
    private String nome;
    private String editora;
    private int edicao;
    private String area;

    public String getNome() {
        return nome;
    }

    public Livro(String nome, String editora, int edicao, String area) {
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

    public int getEdicao() {
        return edicao;
    }

    public void setEdicao(int edicao) {
        this.edicao = edicao;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }
}
