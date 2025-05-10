package roteiro07.parte03;

import java.util.Arrays;

public class GridContainerBordaSolida extends GridContainer {
    // private Component[][] elements;
    // private int lineCounter = 0;
    // private int columnCounter = 0;
    // private int ColumnMax;
    // private int lineMax;

    public GridContainerBordaSolida(int lineMax, int ColumnMax) {
        super(lineMax, ColumnMax);
    }
    @Override
    public void doLayout() {
        System.out.println("O Container utilizado é o GridContainer ");
        System.out.println("Este container contêm bordas solidas");
        System.out.println("Estes são os elementos presentes no container");
        System.out.println(Arrays.deepToString(elements));
        System.out.println("Usando o método dispose como herança para fechar o container");
        this.dispose();
        System.out.println("--------------------------------");
    }
}