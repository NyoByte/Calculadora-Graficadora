package Main;

import java.awt.Image;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class Graficadora extends javax.swing.JFrame {
    private Grafica grafica = new Grafica("Grafico de la Funcion", "X", "Y");
    private Lista lista = new Lista();
   
    public Graficadora() {
        initComponents();
//        ImageIcon imagen = new ImageIcon(getClass().getResource("/imagenes/logo.png"));
//        Icon icono = new ImageIcon(imagen.getImage().getScaledInstance(logo.getWidth(), logo.getHeight(), Image.SCALE_DEFAULT));
//        logo.setIcon(icono);
//        this.repaint();
//        ImageIcon fondo1 = new ImageIcon(getClass().getResource("/imagenes/fondo.jpg"));
//        Icon iconoFondo = new ImageIcon(fondo1.getImage().getScaledInstance(fondo.getWidth(), fondo.getHeight(), Image.SCALE_DEFAULT));
//        fondo.setIcon(iconoFondo);
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();
        Graficadora = new javax.swing.JButton();
        Operacional = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtFuncion = new javax.swing.JTextField();
        Cuadrante = grafica.obtieneGrafica();
        Graficar = new javax.swing.JButton();
        Añadir = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 153, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Graficadora.setText("Graficadora");
        Graficadora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GraficadoraActionPerformed(evt);
            }
        });
        getContentPane().add(Graficadora, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, -1, -1));

        Operacional.setText("Operacional");
        Operacional.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OperacionalActionPerformed(evt);
            }
        });
        getContentPane().add(Operacional, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel1.setText("Función");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, -1));

        txtFuncion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFuncionActionPerformed(evt);
            }
        });
        getContentPane().add(txtFuncion, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 214, -1));

        Cuadrante.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout CuadranteLayout = new javax.swing.GroupLayout(Cuadrante);
        Cuadrante.setLayout(CuadranteLayout);
        CuadranteLayout.setHorizontalGroup(
            CuadranteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 460, Short.MAX_VALUE)
        );
        CuadranteLayout.setVerticalGroup(
            CuadranteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 340, Short.MAX_VALUE)
        );

        getContentPane().add(Cuadrante, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 460, 340));

        Graficar.setBackground(new java.awt.Color(153, 153, 255));
        Graficar.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        Graficar.setText("Graficar");
        Graficar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GraficarActionPerformed(evt);
            }
        });
        getContentPane().add(Graficar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 30, 90, -1));

        Añadir.setBackground(new java.awt.Color(153, 153, 255));
        Añadir.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        Añadir.setText("Añadir");
        Añadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AñadirActionPerformed(evt);
            }
        });
        getContentPane().add(Añadir, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 60, 90, -1));

        jLabel6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel6.setText("Eje Y");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));

        jLabel7.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel7.setText("Eje X");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 450, -1, -1));
        getContentPane().add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 10, 90, 90));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtFuncionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFuncionActionPerformed
   
    }//GEN-LAST:event_txtFuncionActionPerformed

    private void GraficarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GraficarActionPerformed
        try{
            String def = txtFuncion.getText();
            lista.Agregar(def);
            double x0= -10;
            double xn= 10;
            double d= 0.1;
            
            Funcion f = new Funcion(def);
            double[] x = f.Rango(x0, xn, d);
            double [] y = f.Eval(x);
            grafica.CrearGrafica(def, x, y);
        }catch(Exception ex) {
            Logger.getLogger(Graficadora.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_GraficarActionPerformed

    private void AñadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AñadirActionPerformed
        try{
            String def = txtFuncion.getText();
            if(lista.ExisteItem(def)==false){
                lista.Agregar(def);
                double x0= -10;
                double xn= 10;
                double d= 0.1;

                Funcion f = new Funcion(def);
                double[] x=f.Rango(x0, xn, d);
                double [] y = f.Eval(x);
                grafica.AgregarGrafica(def, x, y);
            }else{
                
            }
        }catch(Exception ex) {
            Logger.getLogger(Graficadora.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }//GEN-LAST:event_AñadirActionPerformed

    private void GraficadoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GraficadoraActionPerformed

    }//GEN-LAST:event_GraficadoraActionPerformed

    private void OperacionalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OperacionalActionPerformed
        Calculadora cal = new Calculadora();
        cal.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_OperacionalActionPerformed

    public static void main(String args[]) {    
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Graficadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Añadir;
    private javax.swing.JPanel Cuadrante;
    private javax.swing.JButton Graficadora;
    private javax.swing.JButton Graficar;
    private javax.swing.JButton Operacional;
    private javax.swing.JLabel fondo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel logo;
    private javax.swing.JTextField txtFuncion;
    // End of variables declaration//GEN-END:variables
}




