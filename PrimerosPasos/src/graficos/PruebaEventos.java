package graficos;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class PruebaEventos {
	
	public static void main(String[] args) {
		
		MarcoE mimarco=new MarcoE();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mimarco.setVisible(true);
		
		
		
	}

}

class MarcoE extends JFrame{
	
	public MarcoE() {
		setTitle("Trabajando con eventos");
		setSize(600,400);
		setLocationRelativeTo(null);
		LaminaE milamina=new LaminaE();
		add(milamina);
		
	}
}

class LaminaE extends JPanel implements ActionListener{
	
	JButton botonR=new JButton("Rojo");
	JButton botonV=new JButton("Verde");
	JButton botonA=new JButton("Amarillo");
	
	public LaminaE() {
		
		add(botonR);
		add(botonV);
		add(botonA);
		
		botonR.addActionListener(this);
		botonV.addActionListener(this);
		botonA.addActionListener(this);
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==botonR) {
			setBackground(Color.red);
		}
		if(e.getSource()==botonV) {
			setBackground(Color.green);
		}
		if(e.getSource()==botonA) {
			setBackground(Color.yellow);
		}
		
	}
	
}

