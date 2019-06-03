/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
/**
 *
 * @author jayme
 */
public class Biblioteca extends AbstractTableModel{
    ArrayList<Livro> livros = new ArrayList<Livro>();
    private String[] colunas = {"Nome","Editora","Edição","Área"};

    @Override
    public String getColumnName(int column) {
        return colunas[column]; //To change body of generated methods, choose Tools | Templates.
    }
    
    
     @Override
    public String toString() {
        String values= " ";
        System.out.println("Lista de contatos:");
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
    
   public void addRow(Livro l){
       livros.add(l);
       this.fireTableDataChanged();
   }
   
   public void remove(int row){
       livros.remove(row);
       this.fireTableDataChanged();

   }
}
