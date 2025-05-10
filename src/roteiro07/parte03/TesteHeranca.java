package roteiro07.parte03;

public class TesteHeranca {
    public static void main(String[] args) {

        Component button = new Component("Button");
        Component textBox = new Component("TextBox");
        Component textField = new Component("TextField");
        Component checkBox = new Component("CheckBox");
        Component combobox = new Component("ComboBox");
        Component label = new Component("Label");
        Component radiobutton = new Component("RadioButton");
        
        // Criando um GridContainer para adicionar os elementos
        Container c1 = new GridContainer(2, 2);
        c1.addComponent(button);
        c1.addComponent(textBox);
        c1.addComponent(textField);
        c1.addComponent(checkBox);
        c1.doLayout();
        System.out.println(" ************************ ");
        
        // Criando um FlowContainer para adicionar os elementos
        Container c2 = new FlowContainer();
        c2.addComponent(combobox);
        c2.addComponent(label);
        c2.addComponent(radiobutton);
        c2.doLayout();
        System.out.println(" ************************ ");

        // Criando um FlowContainer com Bordas Pontilhadas para adicionar os elementos
        Container c3 = new FlowContainerBordaPontilhada();
        c3.addComponent(radiobutton);
        c3.addComponent(label);
        c3.addComponent(combobox);
        c3.doLayout();
        System.out.println(" ************************ ");
        
        // Criando um FlowContainer com Bordas Sólidas para adicionar os elementos
        Container c4 = new FlowContainerBordaSolida();
        c4.addComponent(radiobutton);
        c4.addComponent(label);
        c4.addComponent(combobox);
        c4.doLayout();
    }
}


/* Sim as mudanças foram significativas em relação ao modelo anterior, mas ainda possui o problema no quesito da escalabilidade, pois para cada pequena mudança no container, será
necessário criar uma nova classe, o que pode ser um problema em projetos maiores.
*/