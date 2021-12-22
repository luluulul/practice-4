package ru.mirea.prac4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class BorderExample extends JFrame
{
    private void checker(){
        jl1.setText("Result: "+a+" X "+b);
        if(a == b){
            l.setText("Winner: DRAW");
        }else if(a<b){
            l.setText("Winner: AC Milan");
        }else{
            l.setText("Winner: Real Madrid");
        }
    }
    int a = 0;
    int b = 0;
    JButton but1 = new JButton("AC Milan");
    JButton but2 = new JButton("Real Madrid");
    JLabel jl1 = new JLabel("Result: 0 X 0");
    JLabel jl2 = new JLabel("Last Scorer: N/A");
    Label l = new Label("Winner: DRAW");
    JPanel[] pnl = new JPanel[12];

    public BorderExample()
    {
        setLayout(null);
        but1.setBounds(150,20,140,40);
        but2.setBounds(360,20,140,40);
        but1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                a++;
                jl2.setText("Last Scorer: AC Milan");
                checker();
            }
        });
        but2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                b++;
                jl2.setText("Last Scorer: Real Madrid");
                checker();
            }
        });
        jl1.setBounds(150,50,140,40);
        jl2.setBounds(360,50,140,40);
        l.setBounds(580,50,180,40);
        add(but1);
        add(but2);
        add(jl1);
        add(jl2);
        add(l);
        setSize(800,500);
    }
    public static void main(String[]args)
    {
        new BorderExample().setVisible(true);
    }
}