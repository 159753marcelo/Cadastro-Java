package classe;

public class ProdutoTeste {
    public static void main (String[] args){
        Produto p1 = new Produto();
        p1.nome = " Notebook";
        p1.preco = 456.36;
        p1.desconto = 0.25;
        var p2 = new Produto();
        p2.nome = "Lápis";
        p2.preco = 5.25;
        p2.desconto = 0.29;


        System.out.print(p1.nome);
        System.out.print(p2.nome);

        double precofinal1 = p1.preco *(1-p1.desconto );
        double precofinal2 = p1.preco *(1-p2.desconto );
        double mediaCarrinho = (precofinal1+precofinal2) / 2;

        System.out.printf("Média do carrinho = R$%.2f.", mediaCarrinho );
    }
}