
//Imports
import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Color;
   
class GUIMaquinaExpendedora extends JFrame{
    //Atributos de instancia
    private MaquinaExpendedora ME;
    private MEPro MaquinaPro;
    private Container contenedor;
    private JPanel panelExpendedora;
    private JPanel panelRetirarExpendedora;
    private JPanel panelPro;
    private JPanel panelRetirarPro;
   
    private JPanel Cartel1;
    private JLabel logo1;
    private JPanel botones1;
    private JButton botonCafe;
    private JButton botonRecCafe;
    private JButton botonRetirarCafe;
   
    private JPanel Cartel2;
    private JLabel logo2;
    private JPanel botones2;
    private JPanel botones3;
    private JButton botonCafePro;
    private JButton botonCarioca;
    private JButton botonRecCafePro;
    private JButton botonRecCarioca;
    private JButton botonRetirarPro;
   
    private JPanel Cliente;
    private JLabel FTCafe;
    private JLabel CartelCafe;
   
    private JPanel Cliente2;
    private JLabel FTCafe2;
    private JLabel CartelCafe2;
   
    //Constructor
    public GUIMaquinaExpendedora(){
        //La ventana
        super("Maquinas Expendedoras");
        setSize(400,300);
        contenedor=getContentPane();
        contenedor.setLayout(new GridLayout(2,2));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
       
        //Inicializan valores de maquinas
        ME=new MaquinaExpendedora();
        MaquinaPro=new MEPro();
       
        //Paneles
        armarPanelExpendedora();
        armarPanelPro();
        armarPanelRetirarExpendedora();
        armarPanelRetirarPro();
       
        setVisible(true);
    }
   
    //Metodos
    private ImageIcon cargarImagen(String nombreArchivo){
        java.net.URL url = getClass().getResource("/" + nombreArchivo);
        if (url != null) {
            return new ImageIcon(url);
        }
        return new ImageIcon(nombreArchivo);
    }
    public void armarPanelExpendedora(){
        panelExpendedora=new JPanel();
        Color beige= new Color(230, 230, 200);//Declaramos el color especifico mediante RGB
        panelExpendedora.setBackground(beige);
        panelExpendedora.setLayout(new GridLayout(2,1));
       
        //Se crean objetos
        Cartel1=new JPanel();
        Cartel1.setBackground(beige);
        Cartel1.setLayout(new FlowLayout(FlowLayout.CENTER));
        logo1=new JLabel();
        ImageIcon iconoOriginal = cargarImagen("maquina_cafetera_logo.png");
        Image imagenEscalada = iconoOriginal.getImage().getScaledInstance(270, 200, Image.SCALE_SMOOTH);
        logo1.setIcon(new ImageIcon(imagenEscalada));
        panelExpendedora.add(logo1);
        Cartel1.add(logo1);
        panelExpendedora.add(Cartel1);
       
        botones1=new JPanel();
        botones1.setBackground(beige);
        botones1.setLayout(new FlowLayout());
        botonCafe= new JButton("Cafe");
        botonCafe.setPreferredSize(new Dimension(150, 55));
        botonRecCafe=new JButton("Recargar Cafe");
        botonRecCafe.setPreferredSize(new Dimension(150, 55));
        OyenteCaf cafME= new OyenteCaf();
        OyenteRecCaf recCafME= new OyenteRecCaf();
        //Se "enlazan" los botones con los oyentes
        botonCafe.addActionListener(cafME);
        botonRecCafe.addActionListener(recCafME);
        //Se agregan los botones al panel
        botones1.add(botonCafe);
        botones1.add(botonRecCafe);
        panelExpendedora.add(botones1);
       
        contenedor.add(panelExpendedora);
    }
    public void armarPanelRetirarExpendedora(){
        panelRetirarExpendedora=new JPanel();
        Color beige= new Color(230, 230, 200);
        panelRetirarExpendedora.setBackground(beige);
        panelRetirarExpendedora.setLayout(new GridLayout(2,1));
       
        botonRetirarCafe=new JButton("Retirar Cafe");
        botonRetirarCafe.setPreferredSize(new Dimension(150, 55));
        botonRetirarCafe.setEnabled(false);
        OyenteRetirarCaf retirarCaf= new OyenteRetirarCaf();
        botonRetirarCafe.addActionListener(retirarCaf);
        panelRetirarExpendedora.add(botonRetirarCafe);
       
        Cliente= new JPanel();
        Cliente.setBackground(beige);
        Cliente.setLayout(new FlowLayout());
        FTCafe=new JLabel();
        ImageIcon iconoOriginal = cargarImagen("ImagenBlanco.png");
        Image imagenEscalada = iconoOriginal.getImage().getScaledInstance(250, 250, Image.SCALE_SMOOTH);
        FTCafe.setIcon(new ImageIcon(imagenEscalada));
        CartelCafe=new JLabel("");
       
        Cliente.add(FTCafe);
        Cliente.add(CartelCafe);
        panelRetirarExpendedora.add(Cliente);
       
        contenedor.add(panelRetirarExpendedora);
    }
    public void armarPanelRetirarPro(){
        panelRetirarPro=new JPanel();
        panelRetirarPro.setLayout(new GridLayout(2,1));
        Color marronOscuro= new Color(126,99, 78);
        panelRetirarPro.setBackground(marronOscuro);
         
        botonRetirarPro=new JButton("Retirar Cafe");
        botonRetirarPro.setPreferredSize(new Dimension(150, 55));
        botonRetirarPro.setEnabled(false);
        OyenteRetirarPro RetirarPro= new OyenteRetirarPro();
        botonRetirarPro.addActionListener(RetirarPro);
        panelRetirarPro.add(botonRetirarPro);
       
        Cliente2=new JPanel();
        Cliente2.setBackground(marronOscuro);
        Cliente2.setLayout(new FlowLayout());
        FTCafe2=new JLabel();
        ImageIcon iconoOriginal = cargarImagen("ImagenBlanco.png");
        Image imagenEscalada = iconoOriginal.getImage().getScaledInstance(250, 250, Image.SCALE_SMOOTH);
        FTCafe2.setIcon(new ImageIcon(imagenEscalada));
        CartelCafe2=new JLabel("");
       
        Cliente2.add(FTCafe2);
        Cliente2.add(CartelCafe2);
        panelRetirarPro.add(Cliente2);
       
        contenedor.add(panelRetirarPro);
    }
    public void armarPanelPro(){
        panelPro= new JPanel();
        Color marronOscuro= new Color(126,99, 78);//Declaramos el color especifico mediante RGB
        panelPro.setBackground(marronOscuro);
        panelPro.setLayout(new GridLayout(3,1));
       
        //Se crean objetos
        Cartel2=new JPanel();
        Cartel2.setBackground(marronOscuro);
        Cartel2.setLayout(new FlowLayout(FlowLayout.CENTER));
        logo2=new JLabel();
        ImageIcon iconoOriginal = cargarImagen("maquina_cafetera_pro_logo.png");
        Image imagenEscalada = iconoOriginal.getImage().getScaledInstance(270, 200, Image.SCALE_SMOOTH);
        logo2.setIcon(new ImageIcon(imagenEscalada));
        Cartel2.add(logo2);
        panelPro.add(Cartel2);
       
        botones2=new JPanel();
        botones2.setBackground(marronOscuro);
        botones2.setLayout(new FlowLayout());
        botones3=new JPanel();
        botones3.setBackground(marronOscuro);
        botones3.setLayout(new FlowLayout());
        botonCafePro=new JButton("Cafe");
        botonCafePro.setPreferredSize(new Dimension(150, 55));
        botonCarioca=new JButton("Carioca");
        botonCarioca.setPreferredSize(new Dimension(150, 55));
        botonRecCafePro=new JButton("Recargar Cafe");
        botonRecCafePro.setPreferredSize(new Dimension(150, 55));
        botonRecCarioca=new JButton("Recargar Carioca");
        botonRecCarioca.setPreferredSize(new Dimension(150, 55));
        OyenteCafPro cafPro=new OyenteCafPro();
        OyenteRecCafPro recCafPro=new OyenteRecCafPro();
        OyenteCarioca carioca=new OyenteCarioca();
        OyenteRecCarioca recCarioca=new OyenteRecCarioca();
       
        //"Enlazamos" oyentes y botones
        botonCafePro.addActionListener(cafPro);
        botonRecCafePro.addActionListener(recCafPro);
        botonCarioca.addActionListener(carioca);
        botonRecCarioca.addActionListener(recCarioca);
       
        //AgregarBotones al Panel
        botones2.add(botonCafePro);
        botones2.add(botonRecCafePro);
        botones3.add(botonCarioca);
        botones3.add(botonRecCarioca);
        panelPro.add(botones2);
        panelPro.add(botones3);
       
        contenedor.add(panelPro);
    }
   
    //metodos para habilitar/Deshabilitar maquinaExpendedora
    private void deshabilitarBotones(){//Deshabilitar los botones para hacer mas cafe(MaquinaExpendedora)
        botonCafe.setEnabled(false);
        botonRecCafe.setEnabled(false);
        botonRetirarCafe.setEnabled(true);
    }
    private void habilitarBotones(){//habilitar los botones para hacer mas cafe(MaquinaExpendedora)
        botonCafe.setEnabled(true);
        botonRecCafe.setEnabled(true);
        botonRetirarCafe.setEnabled(false);
    }
   
    //Metodos para habilitar/Desahabilitar maquinaPro
    private void deshabilitarBotonesPro(){//Deshabilitar los botones para hacer mas cafe(MaquinaPro)
        botonCafePro.setEnabled(false);
        botonCarioca.setEnabled(false);
        botonRecCafePro.setEnabled(false);
        botonRecCarioca.setEnabled(false);
        botonRetirarPro.setEnabled(true);
    }
    private void habilitarBotonesPro(){//habilitar los botones para hacer mas cafe(MaquinaPro)
        botonCafePro.setEnabled(true);
        botonCarioca.setEnabled(true);
        botonRecCafePro.setEnabled(true);
        botonRecCarioca.setEnabled(true);
        botonRetirarPro.setEnabled(false);
    }
   
    //Clases internas(MaquinaExpendedora)
    private class OyenteCaf implements ActionListener{
        public void actionPerformed(ActionEvent event){
            if(ME.vasosCafe()>=1){
                ME.cafe();
                CartelCafe.setText("Aqui tiene su Cafe");
                ImageIcon iconoOriginal = cargarImagen("Cafe.png");
                Image imagenEscalada = iconoOriginal.getImage().getScaledInstance(250, 250, Image.SCALE_SMOOTH);
                FTCafe.setIcon(new ImageIcon(imagenEscalada));
            }else{
                CartelCafe.setText("No puede preparar Cafe, recargar maquina.");
            }
            deshabilitarBotones();
        }
    }
    private class OyenteRecCaf implements ActionListener{
        public void actionPerformed(ActionEvent event){
            ME.recargarCafe();
        }
    }
    private class OyenteRetirarCaf implements ActionListener{
        public void actionPerformed(ActionEvent event){
            CartelCafe.setText("");
            ImageIcon iconoOriginal = cargarImagen("ImagenBlanco.png");
            Image imagenEscalada = iconoOriginal.getImage().getScaledInstance(250, 250, Image.SCALE_SMOOTH);
            FTCafe.setIcon(new ImageIcon(imagenEscalada));
            habilitarBotones();
        }
    }
    //Clases internas(MaquinaPro)
    private class OyenteCafPro implements ActionListener{
        public void actionPerformed(ActionEvent event){
            if(MaquinaPro.vasosCafe()>=1){
                MaquinaPro.cafe();
                CartelCafe2.setText("Aqui tiene su Cafe.");
                ImageIcon iconoOriginal = cargarImagen("Cafe.png");
                Image imagenEscalada = iconoOriginal.getImage().getScaledInstance(250, 250, Image.SCALE_SMOOTH);
                FTCafe2.setIcon(new ImageIcon(imagenEscalada));
            }else{
                CartelCafe2.setText("No puede preparar Cafe, recargar maquina.");
            }
            deshabilitarBotonesPro();
        }
    }
    private class OyenteRecCafPro implements ActionListener{
        public void actionPerformed(ActionEvent event){
            MaquinaPro.recargarCafe();
        }
    }
    private class OyenteCarioca implements ActionListener{
        public void actionPerformed(ActionEvent event){
            if(MaquinaPro.vasosCarioca()>=1){
                MaquinaPro.carioca();
                CartelCafe2.setText("Aqui tiene su Cafe Carioca.");
                ImageIcon iconoOriginal = cargarImagen("Carioca.png");
                Image imagenEscalada = iconoOriginal.getImage().getScaledInstance(250, 250, Image.SCALE_SMOOTH);
                FTCafe2.setIcon(new ImageIcon(imagenEscalada));
            }else{
                CartelCafe2.setText("No puede preparar cafe Carioca.");
            }
            deshabilitarBotonesPro();
        }
    }private class OyenteRecCarioca implements ActionListener{
        public void actionPerformed(ActionEvent event){
            MaquinaPro.recargarCarioca();
        }
    }
    private class OyenteRetirarPro implements ActionListener{
        public void actionPerformed(ActionEvent event){
            CartelCafe2.setText("");
            ImageIcon iconoOriginal = cargarImagen("ImagenBlanco.png");
            Image imagenEscalada = iconoOriginal.getImage().getScaledInstance(250, 250, Image.SCALE_SMOOTH);
            FTCafe2.setIcon(new ImageIcon(imagenEscalada));
            habilitarBotonesPro();
        }
    }
}