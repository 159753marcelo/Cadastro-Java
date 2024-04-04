package daata;

public class DataTeste {
    public static void main(String[] args) { 

         Data d1 = new Data();

         d1.dia = 06;
         d1.mes = 03;
         d1.ano = 1215;

       System.out.printf( "%d/%d/%d\n" , d1.dia, d1.mes,  d1.ano );

        var d2 = new Data();
        d2.dia = 29;
        d2.mes = 12;
        d2.ano = 1967;
        
        System.out.printf("%d/%d/%d" , d2.dia, d2.mes, d2.ano);
        
        }
    
}
