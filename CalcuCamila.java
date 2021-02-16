//btn.setPreferredSize(new Dimension(40, 40));
//btn.setBackground(Color.YELLOW);
import javax.swing.*;
import java.awt.event.*;
import java.awt.Color;
import java.awt.Dimension;

public class CalcuCamila extends JFrame{
   static double resultado;
   JPanel panel;
   JTextField n1;
   JTextField n2;
   JTextField r;
   JLabel letrero;
   JButton btnSuma;
   JButton btnResta;
   JButton btnMultiplicacion;
   JButton btnDivision;
   JButton btnSalir;
   
   
    public CalcuCamila(){
       initComponents();
    }
   
    private void initComponents(){
      setSize(300, 200); //tamaño de la pantalla
      n1 = new JTextField(12);  //introducir datos
      //n1.setBackground(Color.RED);
      n2 = new JTextField(12);
      letrero = new JLabel(" = ");
      r = new JTextField(18);
      r.setEditable(false);
      btnSuma = new JButton("SUMA");
      //btnSuma.setPreferredSize(new Dimension(40, 40));
      btnSuma.setBackground(Color.YELLOW);
      btnResta = new JButton("RESTA");
      btnResta.setBackground(Color.PINK);
      btnMultiplicacion = new JButton("MULTIPLICACIÓN");
      btnMultiplicacion.setBackground(Color.BLUE);
      btnDivision = new JButton("DIVISION");
      btnDivision.setBackground(Color.ORANGE);
      btnSalir = new JButton("Salir");
      btnSalir.setBackground(Color.RED);
      
      btnSuma.addMouseListener(new Suma());
      btnResta.addMouseListener(new Resta());
      btnMultiplicacion.addMouseListener(new Multiplicacion());
      btnDivision.addMouseListener(new Division());
      btnSalir.addMouseListener(new Salir());
      
      panel = new JPanel();
      setTitle("Calculadora Camila Mora Olivera");
      panel.add(n1);
      panel.add(n2);
      panel.add(letrero);
      panel.add(r);
      panel.add(btnSuma);
      panel.add(btnResta);
      panel.add(btnMultiplicacion);
      panel.add(btnDivision);
      panel.add(btnSalir);
      setContentPane(panel);
      setVisible(true);
    }
    
    private class Suma extends MouseAdapter{
    double num1=0;
    double num2=0;
    public void mouseClicked(MouseEvent event){
       if( n1.getText().equals("") || n2.getText().equals(""))
               JOptionPane.showMessageDialog(null, "INGRESE LOS VALORES CORRESPONDIENTES");
       else{
         try{  
            num1 = Double.parseDouble(n1.getText());
            num2 = Double.parseDouble(n2.getText());
            resultado = num2 + num1;
            r.setText(String.valueOf(resultado));
            n1.setText("");
            n1.requestFocus();
            n2.setText("");            
            
         }catch(NumberFormatException a){
            n1.setText("");
            n2.setText("");   
            JOptionPane.showMessageDialog(null, "INCORRECTO");
         }
       }
    }
  }
  
  private class Resta extends MouseAdapter{
    double num1=0;
    double num2=0;
    public void mouseClicked(MouseEvent event){
       if( n1.getText().equals("") || n2.getText().equals(""))
              JOptionPane.showMessageDialog(null, "INGRESE LOS VALORES CORRESPONDIENTES");
       else{
         try{  
            num1 = Double.parseDouble(n1.getText());
            num2 = Double.parseDouble(n2.getText());
            resultado = num1-num2;
            r.setText(String.valueOf(resultado));
            n1.setText("");
            n1.requestFocus();
            n2.setText("");
            
         }catch(NumberFormatException a){
            n1.setText("");
            n2.setText("");   
            JOptionPane.showMessageDialog(null, "INCORRECTO");
         }
       }
    }
  }
  
  private class Multiplicacion extends MouseAdapter{
    double num1=0;
    double num2=0;
    public void mouseClicked(MouseEvent event){
      if( n1.getText().equals("") || n2.getText().equals(""))
            JOptionPane.showMessageDialog(null, "INGRESE LOS VALORES CORRESPONDIENTES");
      else{
         try{  
            num1 = Double.parseDouble(n1.getText());
            num2 = Double.parseDouble(n2.getText());
            resultado = num1*num2;
            r.setText(String.valueOf(resultado));
            n1.setText("");
            n1.requestFocus();
            n2.setText("");      
         }catch(NumberFormatException a){
            n1.setText("");
            n2.setText("");   
            JOptionPane.showMessageDialog(null, "INCORRECTO");
         }   
       }
     }
  }
  
  private class Division extends MouseAdapter{
    double num1=0;
    double num2=0;
    public void mouseClicked(MouseEvent event){
      if(n1.getText().equals("") || n2.getText().equals("") || n2.getText().equals("0"))
            JOptionPane.showMessageDialog(null, "INGRESE LOS VALORES CORRESPONDIENTES");
      else{
         try{  
            num1 = Double.parseDouble(n1.getText());
            num2 = Double.parseDouble(n2.getText());
            resultado = num1/num2;
            r.setText(String.valueOf(resultado));
            n1.setText("");
            n1.requestFocus();
            n2.setText("");   
         }catch(NumberFormatException a){
            n1.setText("");
            n2.setText("");
            JOptionPane.showMessageDialog(null, "INCORRECTO");  
         }  
       }
     }
  }
  
  private class Salir extends MouseAdapter{
    public void mouseClicked(MouseEvent event){
      JOptionPane.showMessageDialog(null, "Adios");
      System.exit(0);   
    }
  }
}