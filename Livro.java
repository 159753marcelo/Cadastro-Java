public class Livro {
    String nome;
    String descrição;
    double valor;
    String isbn;
    Autor autor;
    
    


    void mostrarDetalhes() {
        System.out.println(" Mostrando detalhes do livro");
        System.out.println("Nome:" + nome);
        System.out.println("Descrição:" + descrição);
        System.out.println("Valor:" + valor);
        System.out.println("ISBN:" + isbn);

           if (this.temAutor()){
             autor.mostrarDetalhes();
        }
        System.out.println( "--");
    }

    public void aplicaDescontoDe (Double porcentagem){ 
        this.valor -= this.valor*porcentagem;
    }

    boolean temAutor(){
        return this.autor != null;
    }

}
