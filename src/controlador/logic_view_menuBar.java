package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import vista.view_menuBar;

public class logic_view_menuBar implements ActionListener{
	
	private view_menuBar delegado;

	public logic_view_menuBar(view_menuBar delegado) {
		super();
		this.delegado = delegado;
		this.delegado.newMenu.addActionListener(this);
		this.delegado.openMenu.addActionListener(this);
		this.delegado.closeMenu.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==delegado.newMenu) {
			JOptionPane.showMessageDialog(delegado, "Nuevo Registros");
		}else if(e.getSource()==delegado.openMenu) {
			JOptionPane.showMessageDialog(delegado, "Abrir Registro");
		}else if(e.getSource()==delegado.closeMenu) {
			System.exit(0);
		}
		
	}
	

}
