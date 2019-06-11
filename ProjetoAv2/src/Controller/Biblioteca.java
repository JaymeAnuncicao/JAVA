/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import View.frameInicio;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
/**
 *
 * @author jayme
 */
public class Biblioteca extends AbstractTableModel{

    
    
    
    ArrayList<Livro> livros = new ArrayList<Livro>();
            
            
            
    private String[] colunas = {"Nome","Editora","Edição","Área"};
    private frameInicio i;
    @Override
    public String getColumnName(int column) {
        return colunas[column]; //To change body of generated methods, choose Tools | Templates.
    }
    
    public void addArray(){
        this.fireTableDataChanged();
    }
     @Override
    public String toString() {
        String values= " ";
        System.out.println("Lista de Livros:");
        for( Livro livro : livros){
            values += "Nome: "+livro.getNome() + "| Editora: " +livro.getEditora()+"| Edição: "+livro.getEdicao()+"| Área: "+livro.getArea();
            values += "\n";
          
        }
        return values;
    }

    @Override
    public int getRowCount() {
        return livros.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int linha, int coluna) {
        switch(coluna){
            case 0:
                return livros.get(linha).getNome();
            case 1:
                return livros.get(linha).getEditora();
            case 2:
                return livros.get(linha).getEdicao();
            case 3:
                return livros.get(linha).getArea();
        }
        return null;
    }
    public void update(int linha, String nome, String editora, int edicao, String area){
        livros.get(linha).setNome(nome);
        livros.get(linha).setEditora(editora);
        livros.get(linha).setEdicao(edicao);
        livros.get(linha).setArea(area);
        this.fireTableDataChanged();
    }
   public void up(String nome, String editora, int edicao, String area){
       Livro livro = new Livro(nome,editora,edicao,area);
        livros.add(livro);
        System.out.println(livro.getNome());
        this.fireTableDataChanged();

   }
   
   public void remove(int row){
       livros.remove(row);
       this.fireTableDataChanged();

   }
   public void removeAll(){
       livros.clear();
       this.fireTableDataChanged();

   }
}
