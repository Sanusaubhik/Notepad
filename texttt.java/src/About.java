import java.awt.Font;

import javax.swing.*;

public class About extends JFrame {
    About(){
        setBounds(100,100,500,400);
        setTitle("About notepad app");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        JLabel textLable=new JLabel("<html>welcome motherFucker,is a simple trext editor.dont go magiggiri doing here.</html>");
        textLable.setBounds(100,50,300,300);
        textLable.setFont(new Font(Font.SANS_SERIF,Font.PLAIN,16));
        add(textLable);
    }

    public static void main(String args[]){
        new About().setVisible(true);
    }
    
}

