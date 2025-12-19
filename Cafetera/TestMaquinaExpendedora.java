import java.awt.*;
import javax.swing.*;

public class TestMaquinaExpendedora {
    public static void main(String[] args) {
        GUIMaquinaExpendedora unaMaquina = new GUIMaquinaExpendedora(); //crea una nueva GUI
        unaMaquina.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE); //LIMPIA LA MEMORIA, destruye todo asi no queda nada ejecutandose
        unaMaquina.pack();//este servicio esd para que mantenga las proporciones que psuimos dentro de la gui
        unaMaquina.setSize(400, 590); //setea el tamaño de la pestaña
        unaMaquina.setVisible(true);//la hace visible
    }
}