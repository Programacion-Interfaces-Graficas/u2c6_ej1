package vista;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.SwingUtilities;

import controlador.logic_view_menuBar;
public class view_menuBar extends JFrame{
	public JMenuItem newMenu;
	public JMenuItem openMenu;
	public JMenuItem closeMenu;
	public view_menuBar() {
		setTitle("Menu Bar Ejemplo");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("Archivo");
        JMenu editMenu = new JMenu("Editar");
        JMenu helpMenu = new JMenu("Ayuda");
        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(helpMenu);
        newMenu=new JMenuItem("Nuevo");
        openMenu=new JMenuItem("Abrir");
        closeMenu=new JMenuItem("Cerrar");
        fileMenu.add(newMenu);
        fileMenu.add(openMenu);
        fileMenu.add(closeMenu);
        setJMenuBar(menuBar);
        setVisible(true);
        new logic_view_menuBar(this);
        
	}
	 public static void main(String[] args) {
		//Crea la ventana en el subproceso de entrega de eventos
			SwingUtilities.invokeLater(new Runnable() {
				public void run() {
					new view_menuBar();
					
				}		
			});

	        
	    }
	
}
