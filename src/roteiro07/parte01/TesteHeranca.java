package roteiro07.parte01;

public class TesteHeranca {
    public static void main(String[] args) {
        Component button = new Component("Button");
        Component textBox = new Component("TextBox");
        Component textField = new Component("TextField");
        Component checkBox = new Component("CheckBox");
        Component combobox = new Component("ComboBox");
        Component label = new Component("Label");
        Component radiobutton = new Component("RadioButton");
        Container c1 = new GridContainer(2, 2);

        // Criando um GridContainer para adicionar os elementos
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
    }
}