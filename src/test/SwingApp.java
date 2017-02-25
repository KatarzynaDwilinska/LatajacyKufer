package test;

import javax.swing.JFrame;

public class SwingApp extends JFrame {

private static final long serialVersionUID = 1L;

public SwingApp() {
    setSize(800, 400);
    setTitle("Moja aplikacja Swing1");
    setDefaultCloseOperation(EXIT_ON_CLOSE);
  }

  public static void main(String[] args) {
    SwingApp simple = new SwingApp();
    
    simple.setVisible(true);
  }
}