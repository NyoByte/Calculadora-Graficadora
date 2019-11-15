package Main;

import java.awt.Image;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Graficadora extends javax.swing.JFrame {
    private Grafica grafica = new Grafica("Grafico de la Funcion", "X", "Y");
    private Lista lista = new Lista();
    private boolean esdecimal=false, haynumero=false, hayX=false;
    private int contparentesis=0;
    
    public Graficadora() {
        initComponents();
        ImageIcon imagen = new ImageIcon(getClass().getResource("/Imagenes/LogoUlima.png"));
        Icon icono = new ImageIcon(imagen.getImage().getScaledInstance(logo.getWidth(), logo.getHeight(), Image.SCALE_DEFAULT));
        logo.setIcon(icono);
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
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        Button_C = new javax.swing.JButton();
        Button_ParéntesisL = new javax.swing.JButton();
        Button_X = new javax.swing.JButton();
        Button_Exp = new javax.swing.JButton();
        Button_N0 = new javax.swing.JButton();
        Button_N1 = new javax.swing.JButton();
        Button_N4 = new javax.swing.JButton();
        Button_N5 = new javax.swing.JButton();
        Button_N3 = new javax.swing.JButton();
        Button_N6 = new javax.swing.JButton();
        Button_Multiplicacion = new javax.swing.JButton();
        Button_N9 = new javax.swing.JButton();
        Button_N2 = new javax.swing.JButton();
        Button_N7 = new javax.swing.JButton();
        Button_N8 = new javax.swing.JButton();
        Button_Decimal = new javax.swing.JButton();
        Button_Resta = new javax.swing.JButton();
        Button_Suma = new javax.swing.JButton();
        Button_Retroseso = new javax.swing.JButton();
        Button_Division = new javax.swing.JButton();
        Button_Log = new javax.swing.JButton();
        Button_Sin = new javax.swing.JButton();
        Button_Cos = new javax.swing.JButton();
        Button_Tan = new javax.swing.JButton();
        Button_Abs = new javax.swing.JButton();
        Button_ParéntesisR = new javax.swing.JButton();

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
        setTitle("Graficadora By.Nyo");
        setBackground(new java.awt.Color(153, 153, 255));
        setLocation(new java.awt.Point(600, 200));
        setSize(new java.awt.Dimension(0, 0));
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
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, -1, -1));

        txtFuncion.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtFuncion.setForeground(new java.awt.Color(153, 153, 153));
        txtFuncion.setDisabledTextColor(new java.awt.Color(0, 0, 153));
        txtFuncion.setEnabled(false);
        txtFuncion.setSelectedTextColor(new java.awt.Color(102, 255, 102));
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
            .addGap(0, 490, Short.MAX_VALUE)
        );
        CuadranteLayout.setVerticalGroup(
            CuadranteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 270, Short.MAX_VALUE)
        );

        getContentPane().add(Cuadrante, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, 490, 270));

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
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, -1, -1));

        jLabel7.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel7.setText("Eje X");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 530, -1, -1));
        getContentPane().add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 10, 90, 90));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 520, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 10, 20, 520));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 510, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 540, 510, 20));

        Button_C.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Button_C.setForeground(new java.awt.Color(251, 54, 1));
        Button_C.setText("C");
        Button_C.setMaximumSize(new java.awt.Dimension(20, 30));
        Button_C.setMinimumSize(new java.awt.Dimension(20, 30));
        Button_C.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_CActionPerformed(evt);
            }
        });
        getContentPane().add(Button_C, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 60, 25));

        Button_ParéntesisL.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Button_ParéntesisL.setText("(");
        Button_ParéntesisL.setMaximumSize(new java.awt.Dimension(20, 30));
        Button_ParéntesisL.setMinimumSize(new java.awt.Dimension(20, 30));
        Button_ParéntesisL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_ParéntesisLActionPerformed(evt);
            }
        });
        getContentPane().add(Button_ParéntesisL, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, 45, 25));

        Button_X.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Button_X.setForeground(new java.awt.Color(0, 153, 153));
        Button_X.setText("x");
        Button_X.setToolTipText("");
        Button_X.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Button_X.setMaximumSize(new java.awt.Dimension(20, 30));
        Button_X.setMinimumSize(new java.awt.Dimension(20, 30));
        Button_X.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_XActionPerformed(evt);
            }
        });
        getContentPane().add(Button_X, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 160, 45, 60));

        Button_Exp.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Button_Exp.setText("^");
        Button_Exp.setMaximumSize(new java.awt.Dimension(20, 30));
        Button_Exp.setMinimumSize(new java.awt.Dimension(20, 30));
        Button_Exp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_ExpActionPerformed(evt);
            }
        });
        getContentPane().add(Button_Exp, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 45, 25));

        Button_N0.setBackground(new java.awt.Color(255, 255, 255));
        Button_N0.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Button_N0.setText("0");
        Button_N0.setMaximumSize(new java.awt.Dimension(20, 30));
        Button_N0.setMinimumSize(new java.awt.Dimension(20, 30));
        Button_N0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_N0ActionPerformed(evt);
            }
        });
        getContentPane().add(Button_N0, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 80, 25));

        Button_N1.setBackground(new java.awt.Color(255, 255, 255));
        Button_N1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Button_N1.setText("1");
        Button_N1.setMaximumSize(new java.awt.Dimension(20, 30));
        Button_N1.setMinimumSize(new java.awt.Dimension(20, 30));
        Button_N1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_N1ActionPerformed(evt);
            }
        });
        getContentPane().add(Button_N1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 40, 25));

        Button_N4.setBackground(new java.awt.Color(255, 255, 255));
        Button_N4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Button_N4.setText("4");
        Button_N4.setMaximumSize(new java.awt.Dimension(20, 30));
        Button_N4.setMinimumSize(new java.awt.Dimension(20, 30));
        Button_N4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_N4ActionPerformed(evt);
            }
        });
        getContentPane().add(Button_N4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 40, 25));

        Button_N5.setBackground(new java.awt.Color(255, 255, 255));
        Button_N5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Button_N5.setText("5");
        Button_N5.setMaximumSize(new java.awt.Dimension(20, 30));
        Button_N5.setMinimumSize(new java.awt.Dimension(20, 30));
        Button_N5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_N5ActionPerformed(evt);
            }
        });
        getContentPane().add(Button_N5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, 40, 25));

        Button_N3.setBackground(new java.awt.Color(255, 255, 255));
        Button_N3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Button_N3.setText("3");
        Button_N3.setMaximumSize(new java.awt.Dimension(20, 30));
        Button_N3.setMinimumSize(new java.awt.Dimension(20, 30));
        Button_N3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_N3ActionPerformed(evt);
            }
        });
        getContentPane().add(Button_N3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, 40, 25));

        Button_N6.setBackground(new java.awt.Color(255, 255, 255));
        Button_N6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Button_N6.setText("6");
        Button_N6.setMaximumSize(new java.awt.Dimension(20, 30));
        Button_N6.setMinimumSize(new java.awt.Dimension(20, 30));
        Button_N6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_N6ActionPerformed(evt);
            }
        });
        getContentPane().add(Button_N6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, 40, 25));

        Button_Multiplicacion.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Button_Multiplicacion.setText("*");
        Button_Multiplicacion.setMaximumSize(new java.awt.Dimension(20, 30));
        Button_Multiplicacion.setMinimumSize(new java.awt.Dimension(20, 30));
        Button_Multiplicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_MultiplicacionActionPerformed(evt);
            }
        });
        getContentPane().add(Button_Multiplicacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, 45, 25));

        Button_N9.setBackground(new java.awt.Color(255, 255, 255));
        Button_N9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Button_N9.setText("9");
        Button_N9.setMaximumSize(new java.awt.Dimension(20, 30));
        Button_N9.setMinimumSize(new java.awt.Dimension(20, 30));
        Button_N9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_N9ActionPerformed(evt);
            }
        });
        getContentPane().add(Button_N9, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 40, 25));

        Button_N2.setBackground(new java.awt.Color(255, 255, 255));
        Button_N2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Button_N2.setText("2");
        Button_N2.setMaximumSize(new java.awt.Dimension(20, 30));
        Button_N2.setMinimumSize(new java.awt.Dimension(20, 30));
        Button_N2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_N2ActionPerformed(evt);
            }
        });
        getContentPane().add(Button_N2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, 40, 25));

        Button_N7.setBackground(new java.awt.Color(255, 255, 255));
        Button_N7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Button_N7.setText("7");
        Button_N7.setMaximumSize(new java.awt.Dimension(20, 30));
        Button_N7.setMinimumSize(new java.awt.Dimension(20, 30));
        Button_N7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_N7ActionPerformed(evt);
            }
        });
        getContentPane().add(Button_N7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 40, 25));

        Button_N8.setBackground(new java.awt.Color(255, 255, 255));
        Button_N8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Button_N8.setText("8");
        Button_N8.setMaximumSize(new java.awt.Dimension(20, 30));
        Button_N8.setMinimumSize(new java.awt.Dimension(20, 30));
        Button_N8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_N8ActionPerformed(evt);
            }
        });
        getContentPane().add(Button_N8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, 40, 25));

        Button_Decimal.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Button_Decimal.setText(".");
        Button_Decimal.setMaximumSize(new java.awt.Dimension(20, 30));
        Button_Decimal.setMinimumSize(new java.awt.Dimension(20, 30));
        Button_Decimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_DecimalActionPerformed(evt);
            }
        });
        getContentPane().add(Button_Decimal, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 220, 40, 25));

        Button_Resta.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Button_Resta.setText("-");
        Button_Resta.setMaximumSize(new java.awt.Dimension(20, 30));
        Button_Resta.setMinimumSize(new java.awt.Dimension(20, 30));
        Button_Resta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_RestaActionPerformed(evt);
            }
        });
        getContentPane().add(Button_Resta, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, 45, 25));

        Button_Suma.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Button_Suma.setText("+");
        Button_Suma.setMaximumSize(new java.awt.Dimension(20, 30));
        Button_Suma.setMinimumSize(new java.awt.Dimension(20, 30));
        Button_Suma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_SumaActionPerformed(evt);
            }
        });
        getContentPane().add(Button_Suma, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, 45, 25));

        Button_Retroseso.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        Button_Retroseso.setText("<--");
        Button_Retroseso.setMaximumSize(new java.awt.Dimension(20, 30));
        Button_Retroseso.setMinimumSize(new java.awt.Dimension(20, 30));
        Button_Retroseso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_RetrosesoActionPerformed(evt);
            }
        });
        getContentPane().add(Button_Retroseso, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, 60, 25));

        Button_Division.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Button_Division.setText("/");
        Button_Division.setMaximumSize(new java.awt.Dimension(20, 30));
        Button_Division.setMinimumSize(new java.awt.Dimension(20, 30));
        Button_Division.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_DivisionActionPerformed(evt);
            }
        });
        getContentPane().add(Button_Division, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, 45, 25));

        Button_Log.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Button_Log.setText("Log");
        Button_Log.setMaximumSize(new java.awt.Dimension(20, 30));
        Button_Log.setMinimumSize(new java.awt.Dimension(20, 30));
        Button_Log.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_LogActionPerformed(evt);
            }
        });
        getContentPane().add(Button_Log, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 130, 60, 25));

        Button_Sin.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Button_Sin.setText("Sin");
        Button_Sin.setMaximumSize(new java.awt.Dimension(20, 30));
        Button_Sin.setMinimumSize(new java.awt.Dimension(20, 30));
        Button_Sin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_SinActionPerformed(evt);
            }
        });
        getContentPane().add(Button_Sin, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 160, 60, 25));

        Button_Cos.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Button_Cos.setText("Cos");
        Button_Cos.setMaximumSize(new java.awt.Dimension(20, 30));
        Button_Cos.setMinimumSize(new java.awt.Dimension(20, 30));
        Button_Cos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_CosActionPerformed(evt);
            }
        });
        getContentPane().add(Button_Cos, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 190, 60, 25));

        Button_Tan.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Button_Tan.setText("Tan");
        Button_Tan.setMaximumSize(new java.awt.Dimension(20, 30));
        Button_Tan.setMinimumSize(new java.awt.Dimension(20, 30));
        Button_Tan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_TanActionPerformed(evt);
            }
        });
        getContentPane().add(Button_Tan, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 220, 60, 25));

        Button_Abs.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Button_Abs.setText("|x|");
        Button_Abs.setMaximumSize(new java.awt.Dimension(20, 30));
        Button_Abs.setMinimumSize(new java.awt.Dimension(20, 30));
        Button_Abs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_AbsActionPerformed(evt);
            }
        });
        getContentPane().add(Button_Abs, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 100, 60, 25));

        Button_ParéntesisR.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Button_ParéntesisR.setText(")");
        Button_ParéntesisR.setMaximumSize(new java.awt.Dimension(20, 30));
        Button_ParéntesisR.setMinimumSize(new java.awt.Dimension(20, 30));
        Button_ParéntesisR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_ParéntesisRActionPerformed(evt);
            }
        });
        getContentPane().add(Button_ParéntesisR, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 130, 45, 25));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtFuncionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFuncionActionPerformed
   
    }//GEN-LAST:event_txtFuncionActionPerformed

    private void GraficarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GraficarActionPerformed
        if(contparentesis==0){
            try{
                String def = txtFuncion.getText();
                lista.Agregar(def);
                double x0= -25;
                double xn= 25;
                double d= 0.1;

                Funcion f = new Funcion(def);
                double[] x = f.Rango(x0, xn, d);
                double [] y = f.Eval(x);
                grafica.CrearGrafica(def, x, y);
            }catch(Exception ex) {
                Logger.getLogger(Graficadora.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            JOptionPane.showMessageDialog(null, "Falta cerrar "+contparentesis+" paréntesis");
        }
    }//GEN-LAST:event_GraficarActionPerformed

    private void AñadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AñadirActionPerformed
        if(contparentesis==0){
        try{
            String def = txtFuncion.getText();
            if(lista.ExisteItem(def)==false){
                lista.Agregar(def);
                double x0= -25;
                double xn= 25;
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
        }else{
            JOptionPane.showMessageDialog(null, "Falta cerrar "+contparentesis+" paréntesis");
        }
    }//GEN-LAST:event_AñadirActionPerformed

    private void GraficadoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GraficadoraActionPerformed

    }//GEN-LAST:event_GraficadoraActionPerformed

    private void OperacionalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OperacionalActionPerformed
        Calculadora cal = new Calculadora();
        cal.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_OperacionalActionPerformed

    private void Button_CActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_CActionPerformed
        txtFuncion.setText("");
        hayX=false;
        esdecimal=false;
        haynumero=false;
        contparentesis=0;
    }//GEN-LAST:event_Button_CActionPerformed

    private void Button_ParéntesisLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_ParéntesisLActionPerformed
        if(txtFuncion.getText().endsWith("+") || txtFuncion.getText().endsWith("-") || txtFuncion.getText().endsWith("*")
            || txtFuncion.getText().endsWith("/") || txtFuncion.getText().endsWith("^") ||
            txtFuncion.getText().endsWith("(") || haynumero==false){
            txtFuncion.setText(txtFuncion.getText()+"(");
            esdecimal=false;
            contparentesis++;
        }
    }//GEN-LAST:event_Button_ParéntesisLActionPerformed

    private void Button_XActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_XActionPerformed
        if(!txtFuncion.getText().endsWith(")") && !txtFuncion.getText().endsWith("0") && !txtFuncion.getText().endsWith("1") && !txtFuncion.getText().endsWith("2")
                 && !txtFuncion.getText().endsWith("3") && !txtFuncion.getText().endsWith("4") && !txtFuncion.getText().endsWith("5") && !txtFuncion.getText().endsWith("6")
                 && !txtFuncion.getText().endsWith("7") && !txtFuncion.getText().endsWith("8") && !txtFuncion.getText().endsWith("9") && !txtFuncion.getText().endsWith(".")
                 && !txtFuncion.getText().endsWith("x")){
            txtFuncion.setText(txtFuncion.getText()+"x");
            hayX=false;
            haynumero=true;
            esdecimal=true;
        }
    }//GEN-LAST:event_Button_XActionPerformed

    private void Button_ExpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_ExpActionPerformed
        if(haynumero==true){
            if((txtFuncion.getText().endsWith("+") || txtFuncion.getText().endsWith("-") || txtFuncion.getText().endsWith("*") ||
                txtFuncion.getText().endsWith("/") || txtFuncion.getText().endsWith("^")|| txtFuncion.getText().endsWith("(")) ||
            txtFuncion.getText().endsWith(".")){
        }else{
            txtFuncion.setText(txtFuncion.getText()+"^");
            esdecimal=false;
        }
        }
    }//GEN-LAST:event_Button_ExpActionPerformed

    private void Button_N1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_N1ActionPerformed
        if(!txtFuncion.getText().endsWith(")") && !txtFuncion.getText().endsWith("x")){
            txtFuncion.setText(txtFuncion.getText()+"1");
            haynumero=true;
        }
    }//GEN-LAST:event_Button_N1ActionPerformed

    private void Button_N4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_N4ActionPerformed
        if(!txtFuncion.getText().endsWith(")") && !txtFuncion.getText().endsWith("x")){
            txtFuncion.setText(txtFuncion.getText()+"4");
            haynumero=true;
        }
    }//GEN-LAST:event_Button_N4ActionPerformed

    private void Button_N5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_N5ActionPerformed
        if(!txtFuncion.getText().endsWith(")") && !txtFuncion.getText().endsWith("x")){
            txtFuncion.setText(txtFuncion.getText()+"5");
            haynumero=true;
        }
    }//GEN-LAST:event_Button_N5ActionPerformed

    private void Button_N3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_N3ActionPerformed
        if(!txtFuncion.getText().endsWith(")") && !txtFuncion.getText().endsWith("x")){
            txtFuncion.setText(txtFuncion.getText()+"3");
            haynumero=true;
        }
    }//GEN-LAST:event_Button_N3ActionPerformed

    private void Button_N6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_N6ActionPerformed
        if(!txtFuncion.getText().endsWith(")") && !txtFuncion.getText().endsWith("x")){
            txtFuncion.setText(txtFuncion.getText()+"6");
            haynumero=true;
        }
    }//GEN-LAST:event_Button_N6ActionPerformed

    private void Button_MultiplicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_MultiplicacionActionPerformed
        if(haynumero==true){
            if((txtFuncion.getText().endsWith("+") || txtFuncion.getText().endsWith("-") || txtFuncion.getText().endsWith("*") ||
                txtFuncion.getText().endsWith("/") || txtFuncion.getText().endsWith("^")|| txtFuncion.getText().endsWith("(")) ||
            txtFuncion.getText().endsWith(".")){
        }else{
            txtFuncion.setText(txtFuncion.getText()+"*");
            esdecimal=false;
        }
        }
    }//GEN-LAST:event_Button_MultiplicacionActionPerformed

    private void Button_N9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_N9ActionPerformed
        if(!txtFuncion.getText().endsWith(")") && !txtFuncion.getText().endsWith("x")){
            txtFuncion.setText(txtFuncion.getText()+"9");
            haynumero=true;
        }
    }//GEN-LAST:event_Button_N9ActionPerformed

    private void Button_N2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_N2ActionPerformed
        if(!txtFuncion.getText().endsWith(")") && !txtFuncion.getText().endsWith("x")){
            txtFuncion.setText(txtFuncion.getText()+"2");
            haynumero=true;
        }
    }//GEN-LAST:event_Button_N2ActionPerformed

    private void Button_N7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_N7ActionPerformed
        if(!txtFuncion.getText().endsWith(")") && !txtFuncion.getText().endsWith("x")){
            txtFuncion.setText(txtFuncion.getText()+"7");
            haynumero=true;
        }
    }//GEN-LAST:event_Button_N7ActionPerformed

    private void Button_N8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_N8ActionPerformed
        if(!txtFuncion.getText().endsWith(")") && !txtFuncion.getText().endsWith("x")){
            txtFuncion.setText(txtFuncion.getText()+"8");
            haynumero=true;
        }
    }//GEN-LAST:event_Button_N8ActionPerformed

    private void Button_DecimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_DecimalActionPerformed
        if (esdecimal==true) {
            //Ya tiene punto decimal y no lo vuelve a asignar
        }else{
            if(haynumero==true){
                if (!txtFuncion.getText().endsWith("+") && !txtFuncion.getText().endsWith("-") && !txtFuncion.getText().endsWith("*") &&
                    !txtFuncion.getText().endsWith("/")&& !txtFuncion.getText().endsWith("^")) {
                    txtFuncion.setText(txtFuncion.getText()+".");
                    esdecimal=true;
                }
            }
        }
    }//GEN-LAST:event_Button_DecimalActionPerformed

    private void Button_N0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_N0ActionPerformed
        if (esdecimal==true) {
            if(!txtFuncion.getText().endsWith("x")){
                txtFuncion.setText(txtFuncion.getText()+"0");
            }
        }else{
            if(!txtFuncion.getText().endsWith(")") && !txtFuncion.getText().endsWith("x")){
                txtFuncion.setText(txtFuncion.getText()+"0");
                haynumero=true;
            }
        }
    }//GEN-LAST:event_Button_N0ActionPerformed

    private void Button_RestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_RestaActionPerformed
        if((txtFuncion.getText().endsWith("+") || txtFuncion.getText().endsWith("-")) || txtFuncion.getText().endsWith(".")){
        }else{
            txtFuncion.setText(txtFuncion.getText()+"-");
            esdecimal=false;
        }
    }//GEN-LAST:event_Button_RestaActionPerformed

    private void Button_SumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_SumaActionPerformed
        if(haynumero==true){
            if((txtFuncion.getText().endsWith("+") || txtFuncion.getText().endsWith("-") || txtFuncion.getText().endsWith("*") ||
                txtFuncion.getText().endsWith("/") || txtFuncion.getText().endsWith("^")|| txtFuncion.getText().endsWith("(")) ||
            txtFuncion.getText().endsWith(".")){
        }else{
            txtFuncion.setText(txtFuncion.getText()+"+");
            esdecimal=false;
        }
        }
    }//GEN-LAST:event_Button_SumaActionPerformed

    private void Button_RetrosesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_RetrosesoActionPerformed
        if (txtFuncion.getText().length()>0) {
            if(txtFuncion.getText().endsWith("(")){
                contparentesis--;
            }
            if(txtFuncion.getText().endsWith(")")){
                contparentesis++;
            }
            if(txtFuncion.getText().endsWith(".")){
                esdecimal=false;
            }
            if(txtFuncion.getText().endsWith("x")){
                hayX=true;
                esdecimal=false;
            }
            if(txtFuncion.getText().endsWith("+")||txtFuncion.getText().endsWith("*")||
                txtFuncion.getText().endsWith("/")||txtFuncion.getText().endsWith("^")){
                esdecimal=true;
            }
            if(txtFuncion.getText().endsWith("-")){
                txtFuncion.setText(txtFuncion.getText().substring(0,txtFuncion.getText().length()-1));
                if(txtFuncion.getText().endsWith("/")||txtFuncion.getText().endsWith("*")||txtFuncion.getText().endsWith("^")){
                    esdecimal=false;
                }else{
                    esdecimal=true;
                }
            }else{
                txtFuncion.setText(txtFuncion.getText().substring(0,txtFuncion.getText().length()-1));
            }
        }
        if (txtFuncion.getText().length()==0) {
            Button_CActionPerformed(evt);
        }
    }//GEN-LAST:event_Button_RetrosesoActionPerformed

    private void Button_DivisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_DivisionActionPerformed
        if(haynumero==true){
            if((txtFuncion.getText().endsWith("+") || txtFuncion.getText().endsWith("-") || txtFuncion.getText().endsWith("*") ||
                txtFuncion.getText().endsWith("/") || txtFuncion.getText().endsWith("^")|| txtFuncion.getText().endsWith("(")) ||
                txtFuncion.getText().endsWith(".")){
            }else{
                txtFuncion.setText(txtFuncion.getText()+"/");
                esdecimal=false;
            }    
        }
    }//GEN-LAST:event_Button_DivisionActionPerformed

    private void Button_LogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_LogActionPerformed
        if(haynumero==false){
            txtFuncion.setText(txtFuncion.getText()+"Log(");
            hayX=true;
            esdecimal=false;
            contparentesis++;
        }else{
            if((txtFuncion.getText().endsWith("+") || txtFuncion.getText().endsWith("-") || txtFuncion.getText().endsWith("*") ||
            txtFuncion.getText().endsWith("/") || txtFuncion.getText().endsWith("^")|| txtFuncion.getText().endsWith("("))){
                txtFuncion.setText(txtFuncion.getText()+"Log(");
                hayX=true;
                esdecimal=false;
                contparentesis++;
            }
        }
    }//GEN-LAST:event_Button_LogActionPerformed

    private void Button_SinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_SinActionPerformed
        if(haynumero==false){
            txtFuncion.setText(txtFuncion.getText()+"Sin(");
            hayX=true;
            esdecimal=false;
            contparentesis++;
        }else{
            if((txtFuncion.getText().endsWith("+") || txtFuncion.getText().endsWith("-") || txtFuncion.getText().endsWith("*") ||
            txtFuncion.getText().endsWith("/") || txtFuncion.getText().endsWith("^")|| txtFuncion.getText().endsWith("("))){
                txtFuncion.setText(txtFuncion.getText()+"Sin(");
                hayX=true;
                esdecimal=false;
                contparentesis++;
            }
        }
    }//GEN-LAST:event_Button_SinActionPerformed

    private void Button_CosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_CosActionPerformed
        if(haynumero==false){
            txtFuncion.setText(txtFuncion.getText()+"Cos(");
            hayX=true;
            esdecimal=false;
            contparentesis++;
        }else{
            if((txtFuncion.getText().endsWith("+") || txtFuncion.getText().endsWith("-") || txtFuncion.getText().endsWith("*") ||
            txtFuncion.getText().endsWith("/") || txtFuncion.getText().endsWith("^")|| txtFuncion.getText().endsWith("("))){
                txtFuncion.setText(txtFuncion.getText()+"Cos(");
                hayX=true;
                esdecimal=false;
                contparentesis++;
            }
        }
    }//GEN-LAST:event_Button_CosActionPerformed

    private void Button_TanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_TanActionPerformed
        if(haynumero==false){
            txtFuncion.setText(txtFuncion.getText()+"Tan(");
            hayX=true;
            esdecimal=false;
            contparentesis++;
        }else{
            if((txtFuncion.getText().endsWith("+") || txtFuncion.getText().endsWith("-") || txtFuncion.getText().endsWith("*") ||
            txtFuncion.getText().endsWith("/") || txtFuncion.getText().endsWith("^")|| txtFuncion.getText().endsWith("("))){
                txtFuncion.setText(txtFuncion.getText()+"Tan(");
                hayX=true;
                esdecimal=false;
                contparentesis++;
            }
        }
    }//GEN-LAST:event_Button_TanActionPerformed

    private void Button_AbsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_AbsActionPerformed
        if(haynumero==false){
            txtFuncion.setText(txtFuncion.getText()+"Abs(");
            hayX=true;
            esdecimal=false;
            contparentesis++;
        }else{
            if((txtFuncion.getText().endsWith("+") || txtFuncion.getText().endsWith("-") || txtFuncion.getText().endsWith("*") ||
            txtFuncion.getText().endsWith("/") || txtFuncion.getText().endsWith("^")|| txtFuncion.getText().endsWith("("))){
                txtFuncion.setText(txtFuncion.getText()+"Abs(");
                hayX=true;
                esdecimal=false;
                contparentesis++;
            }
        }
    }//GEN-LAST:event_Button_AbsActionPerformed

    private void Button_ParéntesisRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_ParéntesisRActionPerformed
        if (contparentesis!=0) {
            if((txtFuncion.getText().endsWith("+") || txtFuncion.getText().endsWith("-") || txtFuncion.getText().endsWith("*") ||
                txtFuncion.getText().endsWith("/") || txtFuncion.getText().endsWith("^")|| txtFuncion.getText().endsWith("(")) ||
                    txtFuncion.getText().endsWith(".")){
            }else{
                if(contparentesis==1 && hayX==true){
                    JOptionPane.showMessageDialog(null, "Debe agregar la variable x");
                }else{
                    txtFuncion.setText(txtFuncion.getText()+")");
                    esdecimal=false;
                    contparentesis--;
                }
            }  
        }
    }//GEN-LAST:event_Button_ParéntesisRActionPerformed

    public static void main(String args[]) {    
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Graficadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Añadir;
    private javax.swing.JButton Button_Abs;
    private javax.swing.JButton Button_C;
    private javax.swing.JButton Button_Cos;
    private javax.swing.JButton Button_Decimal;
    private javax.swing.JButton Button_Division;
    private javax.swing.JButton Button_Exp;
    private javax.swing.JButton Button_Log;
    private javax.swing.JButton Button_Multiplicacion;
    private javax.swing.JButton Button_N0;
    private javax.swing.JButton Button_N1;
    private javax.swing.JButton Button_N2;
    private javax.swing.JButton Button_N3;
    private javax.swing.JButton Button_N4;
    private javax.swing.JButton Button_N5;
    private javax.swing.JButton Button_N6;
    private javax.swing.JButton Button_N7;
    private javax.swing.JButton Button_N8;
    private javax.swing.JButton Button_N9;
    private javax.swing.JButton Button_ParéntesisL;
    private javax.swing.JButton Button_ParéntesisR;
    private javax.swing.JButton Button_Resta;
    private javax.swing.JButton Button_Retroseso;
    private javax.swing.JButton Button_Sin;
    private javax.swing.JButton Button_Suma;
    private javax.swing.JButton Button_Tan;
    private javax.swing.JButton Button_X;
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
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel logo;
    private javax.swing.JTextField txtFuncion;
    // End of variables declaration//GEN-END:variables
}




