package Ventanas;

import Clases.DatosGraficos;
import Clases.PintanrDibujos;
import Clases.AlgoritmoDijkstra;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JOptionPane;

/**
 *
 * @author Jesus
 */
public class Inicio extends javax.swing.JFrame {

    private int Numerotope = 0;//Cantidad de nodos

    DatosGraficos arboles = new DatosGraficos();

    
    public static void PintarFiguras(int tope, DatosGraficos arboles) {//pinta lo que esta antes en el panel 
        for (int j = 0; j < tope; j++) {
            for (int k = 0; k < tope; k++) {
                if (arboles.getmAdyacencia(j, k) == 1) {
                    PintanrDibujos.pinta_Linea(jPanel1.getGraphics(), arboles.getCordeX(j), arboles.getCordeY(j), arboles.getCordeX(k), arboles.getCordeY(k), arboles.getmCoeficiente(j, k));
                }
            }
        }
        for (int j = 0; j < tope; j++) {
            PintanrDibujos.pinta_Circulo(jPanel1.getGraphics(), arboles.getCordeX(j), arboles.getCordeY(j), arboles.getNombre(j));
        }

    }

    
    public Inicio() {
        initComponents();
        EleccionDestino.setEnabled(false);
        EleccionOrigen.setEnabled(false);
        BuscarCamino.setEnabled(false);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MostrarCaminos = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        colorOrigen = new javax.swing.JLabel();
        txtColorOrigen = new javax.swing.JLabel();
        colorDestino = new javax.swing.JLabel();
        txtColorDestino = new javax.swing.JLabel();
        colorNodoVisitado = new javax.swing.JLabel();
        txtColorNodoRecorrido = new javax.swing.JLabel();
        BotonSalir = new javax.swing.JButton();
        ImgMapa = new javax.swing.JLabel();
        EleccionDestino = new javax.swing.JComboBox<>();
        BuscarCamino = new javax.swing.JButton();
        EleccionOrigen = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtKMAcumulados = new javax.swing.JTextArea();
        txtDestino = new javax.swing.JLabel();
        kmRecorridos = new javax.swing.JLabel();
        txtOrigen = new javax.swing.JLabel();
        LateralSuperior = new javax.swing.JLabel();
        LateralSuperior2 = new javax.swing.JLabel();
        kmRecorridos2 = new javax.swing.JLabel();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        MostrarCaminos.setBackground(new java.awt.Color(102, 102, 102));
        MostrarCaminos.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        MostrarCaminos.setForeground(new java.awt.Color(255, 255, 255));
        MostrarCaminos.setText("Mostrar Caminos");
        MostrarCaminos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MostrarCaminosActionPerformed(evt);
            }
        });
        getContentPane().add(MostrarCaminos, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, 220, 50));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        colorOrigen.setBackground(new java.awt.Color(51, 255, 0));
        colorOrigen.setOpaque(true);
        jPanel1.add(colorOrigen, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 490, 20, 20));

        txtColorOrigen.setBackground(new java.awt.Color(0, 0, 0));
        txtColorOrigen.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtColorOrigen.setForeground(new java.awt.Color(255, 255, 255));
        txtColorOrigen.setText("Origen---------------->");
        txtColorOrigen.setOpaque(true);
        jPanel1.add(txtColorOrigen, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 480, 190, 40));

        colorDestino.setBackground(new java.awt.Color(255, 0, 0));
        colorDestino.setOpaque(true);
        jPanel1.add(colorDestino, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 530, 20, 20));

        txtColorDestino.setBackground(new java.awt.Color(0, 0, 0));
        txtColorDestino.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtColorDestino.setForeground(new java.awt.Color(255, 255, 255));
        txtColorDestino.setText("Destino--------------->");
        txtColorDestino.setOpaque(true);
        jPanel1.add(txtColorDestino, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 520, 190, 40));

        colorNodoVisitado.setBackground(new java.awt.Color(255, 255, 0));
        colorNodoVisitado.setOpaque(true);
        jPanel1.add(colorNodoVisitado, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 570, 20, 20));

        txtColorNodoRecorrido.setBackground(new java.awt.Color(0, 0, 0));
        txtColorNodoRecorrido.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtColorNodoRecorrido.setForeground(new java.awt.Color(255, 255, 255));
        txtColorNodoRecorrido.setText("Nodo Recorrido ----->");
        txtColorNodoRecorrido.setOpaque(true);
        jPanel1.add(txtColorNodoRecorrido, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 560, 190, 40));

        BotonSalir.setBackground(new java.awt.Color(255, 51, 51));
        BotonSalir.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        BotonSalir.setForeground(new java.awt.Color(255, 255, 255));
        BotonSalir.setText("X");
        BotonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonSalirActionPerformed(evt);
            }
        });
        jPanel1.add(BotonSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 10, 50, 50));

        ImgMapa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Municipios_de_Izabal.jpg"))); // NOI18N
        ImgMapa.setToolTipText("");
        jPanel1.add(ImgMapa, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 5, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 0, 740, 720));

        EleccionDestino.setBackground(new java.awt.Color(0, 0, 102));
        EleccionDestino.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        EleccionDestino.setForeground(new java.awt.Color(255, 255, 255));
        EleccionDestino.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Livingston", "El estor", "Los amates", "Morales", "Puerto Barrios", " " }));
        EleccionDestino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EleccionDestinoActionPerformed(evt);
            }
        });
        getContentPane().add(EleccionDestino, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 150, 240, 50));

        BuscarCamino.setBackground(new java.awt.Color(0, 0, 102));
        BuscarCamino.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        BuscarCamino.setForeground(new java.awt.Color(255, 255, 255));
        BuscarCamino.setText("Buscar Camino mas corto");
        BuscarCamino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarCaminoActionPerformed(evt);
            }
        });
        getContentPane().add(BuscarCamino, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, 300, 60));

        EleccionOrigen.setBackground(new java.awt.Color(0, 0, 102));
        EleccionOrigen.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        EleccionOrigen.setForeground(new java.awt.Color(255, 255, 255));
        EleccionOrigen.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Livingston", "El estor", "Los amates", "Morales", "Puerto Barrios" }));
        EleccionOrigen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EleccionOrigenActionPerformed(evt);
            }
        });
        getContentPane().add(EleccionOrigen, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 90, 240, 50));

        txtKMAcumulados.setColumns(20);
        txtKMAcumulados.setRows(5);
        jScrollPane1.setViewportView(txtKMAcumulados);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 310, 280, 40));

        txtDestino.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        txtDestino.setForeground(new java.awt.Color(255, 255, 255));
        txtDestino.setText("Selecciona el destino:");
        getContentPane().add(txtDestino, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 260, 40));

        kmRecorridos.setBackground(new java.awt.Color(0, 0, 0));
        kmRecorridos.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        kmRecorridos.setForeground(new java.awt.Color(255, 255, 255));
        kmRecorridos.setOpaque(true);
        getContentPane().add(kmRecorridos, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 430, 150, 30));

        txtOrigen.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        txtOrigen.setForeground(new java.awt.Color(255, 255, 255));
        txtOrigen.setText("Selecciona el origen:");
        getContentPane().add(txtOrigen, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 250, 40));

        LateralSuperior.setBackground(new java.awt.Color(0, 0, 0));
        LateralSuperior.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        LateralSuperior.setForeground(new java.awt.Color(0, 0, 153));
        LateralSuperior.setOpaque(true);
        getContentPane().add(LateralSuperior, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 720));

        LateralSuperior2.setBackground(new java.awt.Color(0, 0, 0));
        LateralSuperior2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        LateralSuperior2.setForeground(new java.awt.Color(255, 255, 255));
        LateralSuperior2.setText("                            Bienvenido A Re:Creator");
        LateralSuperior2.setOpaque(true);
        getContentPane().add(LateralSuperior2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 530, 30));

        kmRecorridos2.setBackground(new java.awt.Color(0, 0, 0));
        kmRecorridos2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        kmRecorridos2.setForeground(new java.awt.Color(255, 255, 255));
        kmRecorridos2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        kmRecorridos2.setText("  Kilometros recorridos:");
        kmRecorridos2.setOpaque(true);
        getContentPane().add(kmRecorridos2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 430, 170, 30));

        Fondo.setBackground(new java.awt.Color(0, 0, 0));
        Fondo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cat art.png"))); // NOI18N
        Fondo.setOpaque(true);
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 540, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void MostrarCaminosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MostrarCaminosActionPerformed
        //jMenuItem2.setEnabled(false);
        EleccionOrigen.setEnabled(true);
        MostrarCaminos.setEnabled(false);
        MostrarCaminos.setVisible(false);
        txtKMAcumulados.setEnabled(false);

        jPanel1.paint(jPanel1.getGraphics());

        int Matriz[][] = {
            {0, 1, 0, 1, 1},
            {1, 0, 1, 0, 0},
            {0, 1, 0, 1, 0},
            {1, 0, 1, 0, 1},
            {1, 0, 0, 1, 0},};

        double camin[][] = {
            {0, 229.5, 0, 224.6, 264},
            {229.5, 0, 118, 0, 0},
            {0, 118, 0, 43.5, 0},
            {224.6, 0, 43.5, 0, 54.7},
            {264, 0, 0, 54.7, 0},};

        int xx1[] = {295, 175, 320, 440, 540};
        int yy1[] = {150, 285, 340, 260, 185};
        String nom[] = {"1", "2", "3", "4", "5"};

        for (int j = 0; j < 5; j++) {
            arboles.setCordeX(j, xx1[j]);
            arboles.setCordeY(j, yy1[j]);
            arboles.setNombre(j, nom[j]);

        }
        for (int j = 0; j < 5; j++) {
            for (int k = 0; k < 5; k++) {
                arboles.setmAdyacencia(j, k, Matriz[j][k]);
                arboles.setmCoeficiente(j, k, camin[j][k]);
            }
        }
        Numerotope = 5;
        PintarFiguras(Numerotope, arboles);
    }//GEN-LAST:event_MostrarCaminosActionPerformed

    
   
    private void EleccionDestinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EleccionDestinoActionPerformed
        BuscarCamino.setEnabled(true);
    }//GEN-LAST:event_EleccionDestinoActionPerformed

    
    
    private void EleccionOrigenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EleccionOrigenActionPerformed
        EleccionDestino.setEnabled(true);
    }//GEN-LAST:event_EleccionOrigenActionPerformed

    
    
    private void BuscarCaminoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarCaminoActionPerformed
        int origen = 0, destino = 0;
        String nombreOrigen, nombreDestino;
        nombreOrigen = (String) EleccionOrigen.getSelectedItem();
        nombreDestino = (String) EleccionDestino.getSelectedItem();

        if ("Livingston".equals(nombreOrigen)) {
            origen = 0;
        }
        if ("El estor".equals(nombreOrigen)) {
            origen = 1;
        }
        if ("Los amates".equals(nombreOrigen)) {
            origen = 2;
        }
        if ("Morales".equals(nombreOrigen)) {
            origen = 3;
        }
        if ("Puerto Barrios".equals(nombreOrigen)) {
            origen = 4;
        }

        if ("Livingston".equals(nombreDestino)) {
            destino = 0;
        }
        if ("El estor".equals(nombreDestino)) {
            destino = 1;
        }
        if ("Los amates".equals(nombreDestino)) {
            destino = 2;
        }
        if ("Morales".equals(nombreDestino)) {
            destino = 3;
        }
        if ("Puerto Barrios".equals(nombreDestino)) {
            destino = 4;
        }

        if (origen == destino) {
            Font fuente = new Font("Arial", Font.BOLD, 18);
            txtKMAcumulados.setFont(fuente);
            txtKMAcumulados.setText("Ya estas en este lugar");
            txtKMAcumulados.setEnabled(false);
            txtKMAcumulados.setForeground(Color.RED);

        } else {
            AlgoritmoDijkstra Dijkstra = new AlgoritmoDijkstra(arboles, Numerotope, origen, destino);
            Dijkstra.dijkstra();

            Font fuente = new Font("Arial", Font.BOLD, 18);
            txtKMAcumulados.setFont(fuente);
            txtKMAcumulados.setText("Esta es la ruta mas corta");
            txtKMAcumulados.setForeground(Color.BLUE);
            txtKMAcumulados.setEnabled(false);

            kmRecorridos.setText(Dijkstra.getAcumulado() + " KM");
        }


    }//GEN-LAST:event_BuscarCaminoActionPerformed

    
    private void BotonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonSalirActionPerformed
        System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_BotonSalirActionPerformed

    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Inicio().setVisible(true);
        });
    }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonSalir;
    private javax.swing.JButton BuscarCamino;
    private javax.swing.JComboBox<String> EleccionDestino;
    private javax.swing.JComboBox<String> EleccionOrigen;
    private javax.swing.JLabel Fondo;
    private javax.swing.JLabel ImgMapa;
    private javax.swing.JLabel LateralSuperior;
    private javax.swing.JLabel LateralSuperior2;
    private javax.swing.JButton MostrarCaminos;
    private javax.swing.JLabel colorDestino;
    private javax.swing.JLabel colorNodoVisitado;
    private javax.swing.JLabel colorOrigen;
    public static javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel kmRecorridos;
    private javax.swing.JLabel kmRecorridos2;
    private javax.swing.JLabel txtColorDestino;
    private javax.swing.JLabel txtColorNodoRecorrido;
    private javax.swing.JLabel txtColorOrigen;
    private javax.swing.JLabel txtDestino;
    private javax.swing.JTextArea txtKMAcumulados;
    private javax.swing.JLabel txtOrigen;
    // End of variables declaration//GEN-END:variables
}
