/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Ventanas;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author chris
 */
public class VentanaPrincipal extends javax.swing.JFrame {
    private boolean casilla[][] = new boolean[3][3];
    private int matriz[][] = new int[3][3];
    private String turno = "usuario1";
    private String usuario1, usuario2;
    private int vecesGano1 = 0, vecesGano2 = 0, vecesEmpate = 0;

    /**
     * Creates new form VentanaPrincipal
     */
    public VentanaPrincipal(String usuario1, String usuario2) {
        this.usuario1 = usuario1;
        this.usuario2 = usuario2;
        initComponents();
        setSize(600, 600);
        setLocationRelativeTo(null);
        llenarCasillas();
        llenarMatriz();
    }


    public String getUsuario1() {
        return usuario1;
    }

    public void setUsuario1(String usuario1) {
        this.usuario1 = usuario1;
    }

    public String getUsuario2() {
        return usuario2;
    }

    public void setUsuario2(String usuario2) {
        this.usuario2 = usuario2;
    }

    private void llenarCasillas() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                casilla[i][j] = true;
            }
        }
    }

    private void llenarMatriz() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = 0;
            }
        }
    }

    private void dibujarX(JButton boton) {
        boton.setIcon(new ImageIcon(getClass().getResource("/Imagenes/x.png")));
    }

    private void dibujarO(JButton boton) {
        boton.setIcon(new ImageIcon(getClass().getResource("/Imagenes/o.png")));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btn00 = new javax.swing.JButton();
        btn01 = new javax.swing.JButton();
        btn02 = new javax.swing.JButton();
        btn10 = new javax.swing.JButton();
        btn11 = new javax.swing.JButton();
        btn12 = new javax.swing.JButton();
        btn20 = new javax.swing.JButton();
        btn21 = new javax.swing.JButton();
        btn22 = new javax.swing.JButton();
        BrrMenu = new javax.swing.JMenuBar();
        menuJuego = new javax.swing.JMenu();
        subMenuRestart = new javax.swing.JMenuItem();
        subMenuTable = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        subMenuExit = new javax.swing.JMenuItem();
        MenuAyuda = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new java.awt.GridLayout(3, 3));

        btn00.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn00ActionPerformed(evt);
            }
        });
        jPanel1.add(btn00);

        btn01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn01ActionPerformed(evt);
            }
        });
        jPanel1.add(btn01);

        btn02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn02ActionPerformed(evt);
            }
        });
        jPanel1.add(btn02);

        btn10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn10ActionPerformed(evt);
            }
        });
        jPanel1.add(btn10);

        btn11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn11ActionPerformed(evt);
            }
        });
        jPanel1.add(btn11);

        btn12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn12ActionPerformed(evt);
            }
        });
        jPanel1.add(btn12);

        btn20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn20ActionPerformed(evt);
            }
        });
        jPanel1.add(btn20);

        btn21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn21ActionPerformed(evt);
            }
        });
        jPanel1.add(btn21);

        btn22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn22ActionPerformed(evt);
            }
        });
        jPanel1.add(btn22);

        menuJuego.setText("Juego");
        menuJuego.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        menuJuego.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuJuegoActionPerformed(evt);
            }
        });

        subMenuRestart.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        subMenuRestart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/restart.jpg"))); // NOI18N
        subMenuRestart.setText("Comenzar de nuevo");
        subMenuRestart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subMenuRestartActionPerformed(evt);
            }
        });
        menuJuego.add(subMenuRestart);

        subMenuTable.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        subMenuTable.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/table.png"))); // NOI18N
        subMenuTable.setText("Mostrar Tabla de resultados");
        subMenuTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subMenuTableActionPerformed(evt);
            }
        });
        menuJuego.add(subMenuTable);
        menuJuego.add(jSeparator1);

        subMenuExit.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        subMenuExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/exit.png"))); // NOI18N
        subMenuExit.setText("Salir");
        subMenuExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subMenuExitActionPerformed(evt);
            }
        });
        menuJuego.add(subMenuExit);

        BrrMenu.add(menuJuego);

        MenuAyuda.setText("Ayuda");
        MenuAyuda.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        MenuAyuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuAyudaActionPerformed(evt);
            }
        });
        BrrMenu.add(MenuAyuda);

        setJMenuBar(BrrMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 459, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuJuegoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuJuegoActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_menuJuegoActionPerformed

    private void btn00ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn00ActionPerformed
        // TODO add your handling code here:
        if (casilla[0][0] == true) {    //verificar que aun no se ha dado click sobre ese boton
            if (turno.equalsIgnoreCase("usuario1")) {    //verificar el turno del jugador
                dibujarX(btn00);
                matriz[0][0] = 1;
                turno = "usuario2";// cambio de turno
            } else {  //turno usuario 2
                dibujarO(btn00);
                matriz[0][0] = 2;
                turno = "usuario1"; // cambio de turno
            }
        }
        casilla[0][0] = false;
        comprobarGanador();
    }//GEN-LAST:event_btn00ActionPerformed

    private void btn01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn01ActionPerformed
        // TODO add your handling code here:
        if (casilla[0][1] == true) {    //verificar que aun no se ha dado click sobre ese boton
            if (turno.equalsIgnoreCase("usuario1")) {    //verificar el turno del jugador
                dibujarX(btn01);
                matriz[0][1] = 1;
                turno = "usuario2";// cambio de turno
            } else {  //turno usuario 2
                dibujarO(btn01);
                matriz[0][1] = 2;
                turno = "usuario1"; // cambio de turno
            }
        }
        casilla[0][1] = false;
        comprobarGanador();
    }//GEN-LAST:event_btn01ActionPerformed

    private void btn02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn02ActionPerformed
        // TODO add your handling code here:
        if (casilla[0][2] == true) {    //verificar que aun no se ha dado click sobre ese boton
            if (turno.equalsIgnoreCase("usuario1")) {    //verificar el turno del jugador
                dibujarX(btn02);
                matriz[0][2] = 1;
                turno = "usuario2";// cambio de turno
            } else {  //turno usuario 2
                dibujarO(btn02);
                matriz[0][2] = 2;
                turno = "usuario1"; // cambio de turno
            }
        }
        casilla[0][2] = false;
        comprobarGanador();
    }//GEN-LAST:event_btn02ActionPerformed

    private void btn10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn10ActionPerformed
        // TODO add your handling code here:

        if (casilla[1][0] == true) {    //verificar que aun no se ha dado click sobre ese boton
            if (turno.equalsIgnoreCase("usuario1")) {    //verificar el turno del jugador
                dibujarX(btn10);
                matriz[1][0] = 1;
                turno = "usuario2";// cambio de turno
            } else {  //turno usuario 2
                dibujarO(btn10);
                matriz[1][0] = 2;
                turno = "usuario1"; // cambio de turno
            }
        }
        casilla[1][0] = false;
        comprobarGanador();
    }//GEN-LAST:event_btn10ActionPerformed

    private void btn11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn11ActionPerformed
        // TODO add your handling code here:
        if (casilla[1][1] == true) {    //verificar que aun no se ha dado click sobre ese boton
            if (turno.equalsIgnoreCase("usuario1")) {    //verificar el turno del jugador
                dibujarX(btn11);
                matriz[1][1] = 1;
                turno = "usuario2";// cambio de turno
            } else {  //turno usuario 2
                dibujarO(btn11);
                matriz[1][1] = 2;
                turno = "usuario1"; // cambio de turno
            }
        }
        casilla[1][1] = false;
        comprobarGanador();
    }//GEN-LAST:event_btn11ActionPerformed

    private void btn12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn12ActionPerformed
        // TODO add your handling code here:

        if (casilla[1][2] == true) {    //verificar que aun no se ha dado click sobre ese boton
            if (turno.equalsIgnoreCase("usuario1")) {    //verificar el turno del jugador
                dibujarX(btn12);
                matriz[1][2] = 1;
                turno = "usuario2";// cambio de turno
            } else {  //turno usuario 2
                dibujarO(btn12);
                matriz[1][2] = 2;
                turno = "usuario1"; // cambio de turno
            }
        }
        casilla[1][2] = false;
        comprobarGanador();
    }//GEN-LAST:event_btn12ActionPerformed

    private void btn20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn20ActionPerformed
        // TODO add your handling code here:
        if (casilla[2][0] == true) {    //verificar que aun no se ha dado click sobre ese boton
            if (turno.equalsIgnoreCase("usuario1")) {    //verificar el turno del jugador
                dibujarX(btn20);
                matriz[2][0] = 1;
                turno = "usuario2";// cambio de turno
            } else {  //turno usuario 2
                dibujarO(btn20);
                matriz[2][0] = 2;
                turno = "usuario1"; // cambio de turno
            }
        }
        casilla[2][0] = false;
        comprobarGanador();
    }//GEN-LAST:event_btn20ActionPerformed

    private void btn21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn21ActionPerformed
        // TODO add your handling code here:

        if (casilla[2][1] == true) {    //verificar que aun no se ha dado click sobre ese boton
            if (turno.equalsIgnoreCase("usuario1")) {    //verificar el turno del jugador
                dibujarX(btn21);
                matriz[2][1] = 1;
                turno = "usuario2";// cambio de turno
            } else {  //turno usuario 2
                dibujarO(btn21);
                matriz[2][1] = 2;
                turno = "usuario1"; // cambio de turno
            }
        }
        casilla[2][1] = false;
        comprobarGanador();
    }//GEN-LAST:event_btn21ActionPerformed

    private void btn22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn22ActionPerformed
        // TODO add your handling code here:

        if (casilla[2][2] == true) {    //verificar que aun no se ha dado click sobre ese boton
            if (turno.equalsIgnoreCase("usuario1")) {    //verificar el turno del jugador
                dibujarX(btn22);
                matriz[2][2] = 1;
                turno = "usuario2";// cambio de turno
            } else {  //turno usuario 2
                dibujarO(btn22);
                matriz[2][2] = 2;
                turno = "usuario1"; // cambio de turno
            }
        }
        casilla[2][2] = false;
        comprobarGanador();
    }//GEN-LAST:event_btn22ActionPerformed

    private void subMenuExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subMenuExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_subMenuExitActionPerformed

    private void subMenuTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subMenuTableActionPerformed
        VentanaMostrarResultados ventanaMR = new VentanaMostrarResultados(this, true, usuario1, usuario2, vecesGano1, vecesGano2, vecesEmpate);
        ventanaMR.setVisible(true);
    }//GEN-LAST:event_subMenuTableActionPerformed

    private void subMenuRestartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subMenuRestartActionPerformed
        vecesGano1 = 0;
        vecesGano2 = 0;
        vecesEmpate = 0;
        reiniciarJuego();
    }//GEN-LAST:event_subMenuRestartActionPerformed

    private void MenuAyudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuAyudaActionPerformed
        URL url = null;
        try {
            url = new URL("https://es.wikipedia.org/wiki/Tres_en_linea");
            Desktop.getDesktop().browse(url.toURI());
        } catch (URISyntaxException ex) {
            System.out.println(ex);
            Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            System.out.println(ex);
            Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_MenuAyudaActionPerformed

    /**
     * @param args the command line arguments
     */
    private void comprobarGanador() {
        boolean ganador1 = false;
        boolean ganador2 = false;
        int empate = 0;
        //comprobar si el ganador es el usuario 1
        ganador1 = comprobar(1);
        //comprobar si el ganador es el usuario 2
        ganador2 = comprobar(2);

        if (ganador1 == true) {
            vecesGano1++;
            //System.out.println("El ganador es el usuario " + usuario1);
            VentanaGanador ventanaG = new VentanaGanador(usuario1, this);
            ventanaG.setVisible(true);
            reiniciarJuego();

        } else if (ganador2 == true) {
            vecesGano2++;
            //System.out.println("El ganador es el usuario " + usuario2);
            VentanaGanador ventanaG = new VentanaGanador(usuario2, this);
            ventanaG.setVisible(true);
            reiniciarJuego();
        } else {
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (matriz[i][j] != 0) {
                        empate++;
                    }
                }
            }
            if (empate == 9) {
                vecesEmpate++;
                //System.out.println("Empate");
                VentanaEmpate ventanaE = new VentanaEmpate(this);
                ventanaE.setVisible(true);
                reiniciarJuego();
            }
            empate = 0;
        }
    }

    private boolean comprobar(int num) {
        boolean ganador = false;
        if (matriz[0][0] == num && matriz[0][1] == num && matriz[0][2] == num) {
            ganador = true;
        } else if (matriz[1][0] == num && matriz[1][1] == num && matriz[1][2] == num) {
            ganador = true;
        } else if (matriz[2][0] == num && matriz[2][1] == num && matriz[2][2] == num) {
            ganador = true;
        } else if (matriz[0][0] == num && matriz[1][0] == num && matriz[2][0] == num) {
            ganador = true;
        } else if (matriz[0][1] == num && matriz[1][1] == num && matriz[2][1] == num) {
            ganador = true;
        } else if (matriz[0][2] == num && matriz[1][2] == num && matriz[2][2] == num) {
            ganador = true;
        } else if (matriz[2][2] == num && matriz[1][1] == num && matriz[2][2] == num) {
            ganador = true;
        } else if (matriz[0][2] == num && matriz[1][1] == num && matriz[2][0] == num) {

            ganador = true;
        }
        return ganador;
    }

    private void reiniciarJuego() {
        llenarCasillas();
        llenarMatriz();

        btn00.setIcon(null);
        btn01.setIcon(null);
        btn02.setIcon(null);
        btn10.setIcon(null);
        btn11.setIcon(null);
        btn12.setIcon(null);
        btn20.setIcon(null);
        btn21.setIcon(null);
        btn22.setIcon(null);

    }

    public void quienJuegaPrimero() {
        VentanaEscogerTurno ventanaET = new VentanaEscogerTurno(this, true, usuario1, usuario2);
        ventanaET.setVisible(true);
        turno = ventanaET.getTurno();
    }


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
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal(null, null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar BrrMenu;
    private javax.swing.JMenu MenuAyuda;
    private javax.swing.JButton btn00;
    private javax.swing.JButton btn01;
    private javax.swing.JButton btn02;
    private javax.swing.JButton btn10;
    private javax.swing.JButton btn11;
    private javax.swing.JButton btn12;
    private javax.swing.JButton btn20;
    private javax.swing.JButton btn21;
    private javax.swing.JButton btn22;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JMenu menuJuego;
    private javax.swing.JMenuItem subMenuExit;
    private javax.swing.JMenuItem subMenuRestart;
    private javax.swing.JMenuItem subMenuTable;
    // End of variables declaration//GEN-END:variables
}
