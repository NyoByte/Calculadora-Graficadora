package Main;



import java.awt.Image;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;


public class Graficadora extends javax.swing.JFrame {

   
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
        definicion = new javax.swing.JTextField();
        jPanel4 = grafica.obtieneGrafica();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
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

        definicion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                definicionActionPerformed(evt);
            }
        });
        getContentPane().add(definicion, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 214, -1));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 460, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 340, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 460, 340));

        jButton2.setBackground(new java.awt.Color(102, 255, 102));
        jButton2.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jButton2.setText("Graficar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 30, 90, -1));

        jButton3.setBackground(new java.awt.Color(102, 255, 102));
        jButton3.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jButton3.setText("Añadir");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 60, 90, -1));

        jLabel6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel6.setText("Eje Y");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));

        jLabel7.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel7.setText("Eje X");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 450, -1, -1));
        getContentPane().add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 10, 90, 90));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void definicionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_definicionActionPerformed
   
    }//GEN-LAST:event_definicionActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
          
            String def = definicion.getText();
            double x0= -10;
            double xn= 10;
            double d= 0.1;
            
            Funcion f = new Funcion(def);
            double[] x=f.rango(x0, xn, d);
            double [] y = f.eval(x);
            grafica.crearGrafica(def, x, y);
        } catch (Exception ex) {
            Logger.getLogger(Graficadora.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        
        try {
         String def = definicion.getText();
            double x0= -10;
            double xn= 10;
            double d= 0.1;
            
            Funcion f = new Funcion(def);
            double[] x=f.rango(x0, xn, d);
            double [] y = f.eval(x);
            grafica.agregarGrafica(def, x, y);
        } catch (Exception ex) {
            Logger.getLogger(Graficadora.class.getName()).log(Level.SEVERE, null, ex);
        }


     
    }//GEN-LAST:event_jButton3ActionPerformed

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
    private javax.swing.JButton Graficadora;
    private javax.swing.JButton Operacional;
    private javax.swing.JTextField definicion;
    private javax.swing.JLabel fondo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel logo;
    // End of variables declaration//GEN-END:variables

    Grafica grafica=new Grafica("Grafico de la Funcion", "X", "Y");



}




