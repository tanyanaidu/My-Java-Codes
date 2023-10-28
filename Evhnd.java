import java.awt.*;
import java.awt.event.*;
class Evhnd extends Frame implements ActionListener{
    Button b1,b2;
    Evhnd(){
        b1= new Button("TANYA");
        b2= new Button("SADIYA");
        add(b1);
        add(b2);
        GridLayout g = new GridLayout(1,2);
        setLayout(g);
        b1.addActionListener(this);
        b2.addActionListener(this);
    }


    public static void main(String[] args){
        Evhnd m = new Evhnd();
        m.setSize(1000,70);
        m.setVisible(true);
    }

    public void actionPerformed(ActionEvent e){ 
        if(e.getSource()==b1){
            System.out.println("TANYA");
        }
        if(e.getSource()==b2){
            System.out.println("SADIYA");
        }
    }   

}



//Event handling buttons