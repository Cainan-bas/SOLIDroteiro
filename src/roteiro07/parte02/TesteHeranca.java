package roteiro07.parte02;

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


/* A solução apresentada atende as novas demandas nos requisitos do projeto, onde foi possivel fazer a implementação de novo tipos de containers no sistema com diferentes caracteristicas,
   mas uma critica a esse modelo é no quesito da escalabilidade, onde para cada tipo de container novo sera necessario criar uma nova classe, o que pode gerar um grande numero de classes no sistema.
*/