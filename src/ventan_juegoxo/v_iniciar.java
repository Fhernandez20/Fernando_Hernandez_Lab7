/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ventan_juegoxo;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author Cjuarez45
 */
public class v_iniciar extends javax.swing.JFrame {
private jugadores registro;
    
    JLabel juegoArreglo[][] = new JLabel[3][3];
    String llenoX = JOptionPane.showInputDialog("player X: ");
    String lleno0 = JOptionPane.showInputDialog("player O: ");
    int contadorJuego = 0;
    String ganador = "";
    String jugardoXO = "X";
    int posFila;
    int posColumna;
    String jugador1;
    String jugador2;

    /**
     * Creates new form v_iniciar
     */
    public v_iniciar(jugadores registro) {
        juegoArreglo[0][0] = posicion0_0;
        juegoArreglo[0][1] = posicion0_1;
        juegoArreglo[0][2] = posicion0_2;
        //filas 1
        juegoArreglo[1][0] = posicion1_0;
        juegoArreglo[1][1] = posicion1_1;
        juegoArreglo[1][2] = posicion1_2;
        //filas 2
        juegoArreglo[2][0] = posicion2_0;
        juegoArreglo[2][1] = posicion2_1;
        juegoArreglo[2][2] = posicion2_2;

        jugador1=registro.getJugadoresSesion();
        nombreX.setText("X:" +jugador1);
        jugador2=registro.getJugadoresSesion();
        nombreO.setText("O:" +jugador2);  
    }

    boolean respuestas() {
        if (contadorJuego > 4) {
            if ((juegoArreglo[0][0].getText().equals("X") || !juegoArreglo[0][1].getText().equals("X")) || !juegoArreglo[0][2].getText().equals("X")) {
                if (juegoArreglo[0][0].getText().equals("O") && juegoArreglo[0][1].getText().equals("O") && juegoArreglo[0][2].getText().equals("O")) {
                    ganador = "O";
                    return true;
                } else if (juegoArreglo[0][0].getText().equals("X") && juegoArreglo[1][0].getText().equals("X") && juegoArreglo[2][0].getText().equals("X")) {
                    ganador = "X";
                    return true;
                } else if (juegoArreglo[0][0].getText().equals("O") && juegoArreglo[1][0].getText().equals("O") && juegoArreglo[2][0].getText().equals("O")) {
                    ganador = "O";
                    return true;
                } else if (juegoArreglo[0][1].getText().equals("X") && juegoArreglo[1][1].getText().equals("X") && juegoArreglo[2][1].getText().equals("X")) {
                    ganador = "X";
                    return true;
                } else if (juegoArreglo[0][1].getText().equals("O") && juegoArreglo[1][1].getText().equals("O") && juegoArreglo[2][1].getText().equals("O")) {
                    ganador = "O";
                    return true;
                } else if (juegoArreglo[0][2].getText().equals("X") && juegoArreglo[1][2].getText().equals("X") && juegoArreglo[2][2].getText().equals("X")) {
                    ganador = "X";
                    return true;
                } else if (juegoArreglo[0][2].getText().equals("O") && juegoArreglo[1][2].getText().equals("O") && juegoArreglo[2][2].getText().equals("O")) {
                    ganador = "O";
                    return true;
                } else if (juegoArreglo[1][0].getText().equals("X") && juegoArreglo[1][1].getText().equals("X") && juegoArreglo[1][2].getText().equals("X")) {
                    ganador = "X";
                    return true;
                } else if (juegoArreglo[1][0].getText().equals("O") && juegoArreglo[1][1].getText().equals("O") && juegoArreglo[1][2].getText().equals("O")) {
                    ganador = "O";
                    return true;
                } else if (juegoArreglo[2][0].getText().equals("X") && juegoArreglo[2][1].getText().equals("X") && juegoArreglo[2][2].getText().equals("X")) {
                    ganador = "X";
                    return true;
                } else if (juegoArreglo[2][0].getText().equals("O") && juegoArreglo[2][1].getText().equals("O") && juegoArreglo[2][2].getText().equals("O")) {
                    ganador = "O";
                    return true;
                } else if (juegoArreglo[0][0].getText().equals("X") && juegoArreglo[1][1].getText().equals("X") && juegoArreglo[2][2].getText().equals("X")) {
                    ganador = "X";
                    return true;
                } else if (juegoArreglo[0][0].getText().equals("O") && juegoArreglo[1][1].getText().equals("O") && juegoArreglo[2][2].getText().equals("O")) {
                    ganador = "O";
                    return true;
                } else if (juegoArreglo[0][2].getText().equals("X") && juegoArreglo[1][1].getText().equals("X") && juegoArreglo[2][0].getText().equals("X")) {
                    ganador = "X";
                    return true;
                } else if (juegoArreglo[0][2].getText().equals("O") && juegoArreglo[1][1].getText().equals("O") && juegoArreglo[2][0].getText().equals("O")) {
                    ganador = "O";
                    return true;
                } else {
                    ganador = "X";
                    return true;
                }
            }
        }
        return false;
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
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        nombreX = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        filainput = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        columnainput = new javax.swing.JTextField();
        registrarAccion = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        nombreO = new javax.swing.JLabel();
        posicion0_0 = new javax.swing.JLabel();
        posicion2_0 = new javax.swing.JLabel();
        posicion1_2 = new javax.swing.JLabel();
        posicion2_2 = new javax.swing.JLabel();
        posicion1_1 = new javax.swing.JLabel();
        posicion0_2 = new javax.swing.JLabel();
        posicion0_1 = new javax.swing.JLabel();
        posicion1_0 = new javax.swing.JLabel();
        posicion2_1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 102, 255));
        jPanel1.setForeground(new java.awt.Color(51, 102, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel1.setText("X-0");

        jLabel4.setText("0");

        jLabel5.setText("1");

        jLabel6.setText("2");

        jLabel7.setText("0");

        jLabel8.setText("1");

        jLabel9.setText("2");

        nombreX.setText("jugador 1 :");

        jLabel10.setText("fila:");

        jLabel11.setText("columna:");

        registrarAccion.setText("ingresar");
        registrarAccion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                registrarAccionMouseClicked(evt);
            }
        });
        registrarAccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarAccionActionPerformed(evt);
            }
        });

        nombreO.setText("jugador 2 :");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(registrarAccion)
                .addGap(20, 20, 20))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(24, 24, 24)
                                    .addComponent(filainput, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nombreX)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(columnainput, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(nombreO))
                        .addContainerGap(124, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(nombreX)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(nombreO)
                .addGap(55, 55, 55)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(filainput, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addComponent(registrarAccion)
                .addGap(5, 5, 5)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(columnainput, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        posicion0_0.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        posicion2_0.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        posicion1_2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        posicion2_2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        posicion1_1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        posicion0_2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        posicion0_1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        posicion1_0.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        posicion2_1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(posicion0_0, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(posicion0_1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(posicion2_0, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(posicion2_1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(posicion1_0, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(posicion1_1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(posicion1_2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(posicion2_2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(posicion0_2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(45, 45, 45)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(67, 67, 67)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(posicion0_0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(posicion0_1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(posicion0_2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(posicion1_1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(posicion1_2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(posicion1_0, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(posicion2_1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel9)
                        .addComponent(posicion2_0, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(posicion2_2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(71, 71, 71))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void registrarAccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarAccionActionPerformed
        try{
        posFila = Integer.parseInt(filainput.getText());
        posColumna = Integer.parseInt(columnainput.getText());
        
        }catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Ingrese de nuevo un numero valido");
            return;
        }
        if ((posFila < 0 || posColumna < 0) || (posFila > 2 || posColumna > 2)) {
                JOptionPane.showMessageDialog(null, "ingrese un valor dentro del arreglo");
            }
        if (filainput.getText() == null) {
            JOptionPane.showMessageDialog(null, "Ingrese valor en filas");
        } else if (columnainput.getText() == null) {
            JOptionPane.showMessageDialog(null, "Ingrese valor en columna ");
        }
        //si es distinto a vacio
        if (!juegoArreglo[posFila][posColumna].getText().equals("")) {
            filainput.setText("");
            columnainput.setText("");
            JOptionPane.showMessageDialog(null, "Posicion no valida");
            return;
        }

        juegoArreglo[posFila][posColumna].setText(jugardoXO);
        jugardoXO = (jugardoXO.equals("X")) ? "O" : "X";
        filainput.setText("");
        columnainput.setText("");
        contadorJuego++;
        if (9 == contadorJuego) {
            JOptionPane.showMessageDialog(null, "EMPATE");
            this.dispose();
        }
        ganador = (ganador.equalsIgnoreCase("X")) ? jugador1 : jugador2;
        if (respuestas()) {
            JOptionPane.showMessageDialog(null, "Ganaste " + ganador);
            this.dispose();
        }

    }//GEN-LAST:event_registrarAccionActionPerformed

    private void registrarAccionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registrarAccionMouseClicked
        if (filainput.getText().equals("") || columnainput.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Error debe de llenar todos los campos");
        }
        if (filainput.getText().equals(1) && columnainput.getText().equals(1)) {

        }
    }//GEN-LAST:event_registrarAccionMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField columnainput;
    private javax.swing.JTextField filainput;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel nombreO;
    private javax.swing.JLabel nombreX;
    private javax.swing.JLabel posicion0_0;
    private javax.swing.JLabel posicion0_1;
    private javax.swing.JLabel posicion0_2;
    private javax.swing.JLabel posicion1_0;
    private javax.swing.JLabel posicion1_1;
    private javax.swing.JLabel posicion1_2;
    private javax.swing.JLabel posicion2_0;
    private javax.swing.JLabel posicion2_1;
    private javax.swing.JLabel posicion2_2;
    private javax.swing.JButton registrarAccion;
    // End of variables declaration//GEN-END:variables

}
