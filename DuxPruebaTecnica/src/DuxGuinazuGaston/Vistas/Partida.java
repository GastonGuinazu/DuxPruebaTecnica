package DuxGuinazuGaston.Vistas;

import DuxGuinazuGaston.Controlador.ControladorPartido;
import DuxGuinazuGaston.Modelo.Jugador;
import DuxGuinazuGaston.Modelo.Partido;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Partida extends javax.swing.JFrame {

    private ControladorPartido controlador;

    private int cantidadSets = 0;
    private String torneo = "";
    private String jugador1 = "";
    private String jugador2 = "";
    private int porcentajeJug2 = 0;

    private int puntajeJug1 = 0;
    private int puntajeJug2 = 0;

    private int juegosSet1Jug1 = 0;
    private int juegosSet1Jug2 = 0;

    private int juegosSet2Jug1 = 0;
    private int juegosSet2Jug2 = 0;

    private int juegosSet3Jug1 = 0;
    private int juegosSet3Jug2 = 0;

    private int juegosSet4Jug1 = 0;
    private int juegosSet4Jug2 = 0;

    private int juegosSet5Jug1 = 0;
    private int juegosSet5Jug2 = 0;

    private int setsJug1 = 0;
    private int setsJug2 = 0;

    private boolean bandera = true;
    private boolean banderaSaque = true;
    private int contador = 0;

    public Partida(ControladorPartido controlador) {
        initComponents();
        this.controlador = controlador;
        setLocationRelativeTo(null);
        cargarTabla();
        cargarTorneo();
        quienSirve();
    }

    public void cargarTorneo() {
        jugador1 = controlador.obtenerJugador1();
        jugador2 = controlador.obtenerJugador2();
        lblNombreJug1.setText(jugador1);
        lblNombreJug2.setText(jugador2);
        List<Partido> lst = controlador.obtenerPartido();
        for (Partido p : lst) {
            lblTorneo.setText("Torneo " + p.getTorneo());
            lblSets.setText("Mejor de " + p.getSets());
            cantidadSets = p.getSets();
            torneo = p.getTorneo();
        }
        
        if (cantidadSets == 3) {
            lblSetCuatroJug1.setText("");
            lblSetCuatroJug2.setText("");
            lblSetCincoJug1.setText("");
            lblSetCincoJug2.setText("");
        }
    }

    public void cargarTabla() {
        DefaultTableModel model = new DefaultTableModel();
        List<Jugador> lst = controlador.obtenerJugadores();
        model.setColumnIdentifiers(new String[]{"Jugadores"});
        for (Jugador j : lst) {
            model.addRow(new Object[]{j.getNombre_jugador()});
            porcentajeJug2 = j.getProbabilidad();
        }
        tblJugadores.setModel(model);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTorneo = new javax.swing.JLabel();
        lblGanador = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblJugadores = new javax.swing.JTable();
        lblGanadorPunto = new javax.swing.JLabel();
        lblSets = new javax.swing.JLabel();
        btnJugarRonda = new javax.swing.JButton();
        lblPuntosJug1 = new javax.swing.JLabel();
        lblPuntosJug2 = new javax.swing.JLabel();
        lblSetUnoJug1 = new javax.swing.JLabel();
        lblSetUnoJug2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtSetsJug1 = new javax.swing.JTextField();
        txtSetsJug2 = new javax.swing.JTextField();
        lblSetDosJug1 = new javax.swing.JLabel();
        lblSetDosJug2 = new javax.swing.JLabel();
        lblSetTresJug1 = new javax.swing.JLabel();
        lblSetTresJug2 = new javax.swing.JLabel();
        lblSetCuatroJug1 = new javax.swing.JLabel();
        lblSetCuatroJug2 = new javax.swing.JLabel();
        lblSetCincoJug1 = new javax.swing.JLabel();
        lblSetCincoJug2 = new javax.swing.JLabel();
        lblSirveJug1 = new javax.swing.JLabel();
        lblSirveJug2 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblNombreJug1 = new javax.swing.JLabel();
        lblNombreJug2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblTorneo.setFont(new java.awt.Font("Segoe UI Semibold", 1, 24)); // NOI18N
        lblTorneo.setText("Nombre Torneo:");

        lblGanador.setFont(new java.awt.Font("Segoe UI Semibold", 2, 14)); // NOI18N
        lblGanador.setText("Ganador del Punto:");

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        tblJugadores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblJugadores.setAutoscrolls(false);
        tblJugadores.setEnabled(false);
        jScrollPane1.setViewportView(tblJugadores);

        lblGanadorPunto.setText(" ");

        lblSets.setFont(new java.awt.Font("Segoe UI Semibold", 1, 24)); // NOI18N
        lblSets.setText("Mejor de:");

        btnJugarRonda.setText("Jugar punto");
        btnJugarRonda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJugarRondaActionPerformed(evt);
            }
        });

        lblPuntosJug1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblPuntosJug1.setText("0");

        lblPuntosJug2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblPuntosJug2.setText("0");

        lblSetUnoJug1.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        lblSetUnoJug1.setText("0");

        lblSetUnoJug2.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        lblSetUnoJug2.setText("0");

        txtSetsJug1.setEditable(false);
        txtSetsJug1.setText("0");

        txtSetsJug2.setEditable(false);
        txtSetsJug2.setText("0");

        lblSetDosJug1.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        lblSetDosJug1.setText("0");

        lblSetDosJug2.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        lblSetDosJug2.setText("0");

        lblSetTresJug1.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        lblSetTresJug1.setText("0");

        lblSetTresJug2.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        lblSetTresJug2.setText("0");

        lblSetCuatroJug1.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        lblSetCuatroJug1.setText("0");

        lblSetCuatroJug2.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        lblSetCuatroJug2.setText("0");

        lblSetCincoJug1.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        lblSetCincoJug1.setText("0");

        lblSetCincoJug2.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        lblSetCincoJug2.setText("0");

        lblSirveJug1.setText("Sirve -->");

        lblSirveJug2.setText("Sirve -->");

        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 2, 14)); // NOI18N
        jLabel2.setText("Resultado parcial:");

        lblNombreJug1.setText("Jugador Uno");

        lblNombreJug2.setText("Jugador Dos");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(179, 179, 179)
                                .addComponent(jLabel1))
                            .addComponent(lblTorneo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblSets)
                                .addGap(80, 80, 80))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(btnJugarRonda)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblGanador)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblGanadorPunto, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblNombreJug1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblNombreJug2, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtSetsJug2, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                    .addComponent(txtSetsJug1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel2))
                        .addGap(47, 47, 47))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblSirveJug1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblSirveJug2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblPuntosJug2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblSetUnoJug2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblSetDosJug2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblSetTresJug2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblSetCuatroJug2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblPuntosJug1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblSetUnoJug1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblSetDosJug1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblSetTresJug1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblSetCuatroJug1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSalir)
                    .addComponent(lblSetCincoJug1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSetCincoJug2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTorneo)
                    .addComponent(lblSets))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblGanador)
                                .addComponent(lblGanadorPunto))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(3, 3, 3)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtSetsJug1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblNombreJug1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtSetsJug2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblNombreJug2))))
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lblPuntosJug1)
                                        .addComponent(lblSetUnoJug1)
                                        .addComponent(lblSetDosJug1)
                                        .addComponent(lblSetTresJug1)
                                        .addComponent(lblSetCuatroJug1)
                                        .addComponent(lblSetCincoJug1))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(lblPuntosJug2)
                                            .addComponent(lblSetUnoJug2))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(lblSetDosJug2)
                                            .addComponent(lblSetTresJug2)
                                            .addComponent(lblSetCuatroJug2)
                                            .addComponent(lblSetCincoJug2)))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(lblSirveJug1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblSirveJug2)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnJugarRonda)
                        .addGap(25, 25, 25)))
                .addComponent(btnSalir)
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnJugarRondaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJugarRondaActionPerformed

        if (bandera) {
            switch (cantidadSets - (cantidadSets - contador)) {
                case 0:
                    primerSet();
                    break;
                case 1:
                    segundoSet();
                    break;
                case 2:
                    tercerSet();
                    break;
                case 3:
                    cuartoSet();
                    break;
                case 4:
                    quintoSet();
                    break;
            }
        }
        ganador();

    }//GEN-LAST:event_btnJugarRondaActionPerformed

    public void primerSet() {
        double numero = Math.floor(Math.random() * 100 + 1);
        if (numero <= porcentajeJug2) {
            lblGanadorPunto.setText(jugador2);
            if (puntajeJug1 == 45) {
                puntajeJug1 = 40;
                lblPuntosJug1.setText(String.valueOf(puntajeJug1));
            } else if (puntajeJug2 == 45) {
                resetearPuntajes();
                juegosSet1Jug2 += 1;
                ganadorSetX(String.valueOf(juegosSet1Jug1), String.valueOf(juegosSet1Jug2));
                lblSetUnoJug2.setText(String.valueOf(juegosSet1Jug2));
                cambiarBanderaSaque();
                return;
            } else if (puntajeJug2 == 40 && puntajeJug1 == 40) {
                puntajeJug2 = 45;
                //lblPuntosJug2.setText(String.valueOf(puntajeJug2));
                lblPuntosJug2.setText(String.valueOf("AD"));
                return;
            } else if (puntajeJug2 == 40 && puntajeJug1 != 40) {
                resetearPuntajes();
                juegosSet1Jug2 += 1;
                ganadorSetX(String.valueOf(juegosSet1Jug1), String.valueOf(juegosSet1Jug2));
                lblSetUnoJug2.setText(String.valueOf(juegosSet1Jug2));
                cambiarBanderaSaque();
                return;
            } else if (puntajeJug2 == 30) {
                puntajeJug2 += 10;
                lblPuntosJug2.setText(String.valueOf(puntajeJug2));
                return;
            } else if (puntajeJug2 < 30) {
                puntajeJug2 += 15;
                lblPuntosJug2.setText(String.valueOf(puntajeJug2));
                return;
            }
        }

        if (numero >= porcentajeJug2) {
            lblGanadorPunto.setText(jugador1);
            //logica jugador 1
            if (puntajeJug2 == 45) {
                puntajeJug2 = 40;
                lblPuntosJug2.setText(String.valueOf(puntajeJug2));
            } else if (puntajeJug1 == 45) {
                resetearPuntajes();
                juegosSet1Jug1 += 1;
                ganadorSetX(String.valueOf(juegosSet1Jug1), String.valueOf(juegosSet1Jug2));
                lblSetUnoJug1.setText(String.valueOf(juegosSet1Jug1));
                cambiarBanderaSaque();
            } else if (puntajeJug1 == 40 && puntajeJug2 == 40) {
                puntajeJug1 = 45;
                lblPuntosJug1.setText(String.valueOf("AD"));
                //lblPuntosJug1.setText(String.valueOf("AD"));
            } else if (puntajeJug1 == 40 && puntajeJug2 != 40) {
                resetearPuntajes();
                juegosSet1Jug1 += 1;
                ganadorSetX(String.valueOf(juegosSet1Jug1), String.valueOf(juegosSet1Jug2));
                lblSetUnoJug1.setText(String.valueOf(juegosSet1Jug1));
                cambiarBanderaSaque();
            } else if (puntajeJug1 == 30) {
                puntajeJug1 += 10;
                lblPuntosJug1.setText(String.valueOf(puntajeJug1));
            } else if (puntajeJug1 < 30) {
                puntajeJug1 += 15;
                lblPuntosJug1.setText(String.valueOf(puntajeJug1));
            }
        }
    }

    public void segundoSet() {
        double numero = Math.floor(Math.random() * 100 + 1);
        if (numero <= porcentajeJug2) {
            lblGanadorPunto.setText(jugador2);
            if (puntajeJug1 == 45) {
                puntajeJug1 = 40;
                lblPuntosJug1.setText(String.valueOf(puntajeJug1));
            } else if (puntajeJug2 == 45) {
                resetearPuntajes();
                juegosSet2Jug2 += 1;
                ganadorSetX(String.valueOf(juegosSet2Jug1), String.valueOf(juegosSet2Jug2));
                lblSetDosJug2.setText(String.valueOf(juegosSet2Jug2));
                cambiarBanderaSaque();
                return;
            } else if (puntajeJug2 == 40 && puntajeJug1 == 40) {
                puntajeJug2 = 45;
                //lblPuntosJug2.setText(String.valueOf(puntajeJug2));
                lblPuntosJug2.setText(String.valueOf("AD"));
                return;
            } else if (puntajeJug2 == 40 && puntajeJug1 != 40) {
                resetearPuntajes();
                juegosSet2Jug2 += 1;
                ganadorSetX(String.valueOf(juegosSet2Jug1), String.valueOf(juegosSet2Jug2));
                lblSetDosJug2.setText(String.valueOf(juegosSet2Jug2));
                cambiarBanderaSaque();
                return;
            } else if (puntajeJug2 == 30) {
                puntajeJug2 += 10;
                lblPuntosJug2.setText(String.valueOf(puntajeJug2));
                return;
            } else if (puntajeJug2 < 30) {
                puntajeJug2 += 15;
                lblPuntosJug2.setText(String.valueOf(puntajeJug2));
                return;
            }
        }

        if (numero >= porcentajeJug2) {
            lblGanadorPunto.setText(jugador1);
            //logica jugador 1
            if (puntajeJug2 == 45) {
                puntajeJug2 = 40;
                lblPuntosJug2.setText(String.valueOf(puntajeJug2));
            } else if (puntajeJug1 == 45) {
                resetearPuntajes();
                juegosSet2Jug1 += 1;
                ganadorSetX(String.valueOf(juegosSet2Jug1), String.valueOf(juegosSet2Jug2));
                lblSetDosJug1.setText(String.valueOf(juegosSet2Jug1));
                cambiarBanderaSaque();
            } else if (puntajeJug1 == 40 && puntajeJug2 == 40) {
                puntajeJug1 = 45;
                //lblPuntosJug1.setText(String.valueOf(puntajeJug1));
                lblPuntosJug1.setText(String.valueOf("AD"));
            } else if (puntajeJug1 == 40 && puntajeJug2 != 40) {
                resetearPuntajes();
                juegosSet2Jug1 += 1;
                ganadorSetX(String.valueOf(juegosSet2Jug1), String.valueOf(juegosSet2Jug2));
                lblSetDosJug1.setText(String.valueOf(juegosSet2Jug1));
                cambiarBanderaSaque();
            } else if (puntajeJug1 == 30) {
                puntajeJug1 += 10;
                lblPuntosJug1.setText(String.valueOf(puntajeJug1));
            } else if (puntajeJug1 < 30) {
                puntajeJug1 += 15;
                lblPuntosJug1.setText(String.valueOf(puntajeJug1));
            }
        }
    }

    public void tercerSet() {
        double numero = Math.floor(Math.random() * 100 + 1);
        if (numero <= porcentajeJug2) {
            lblGanadorPunto.setText(jugador2);
            if (puntajeJug1 == 45) {
                puntajeJug1 = 40;
                lblPuntosJug1.setText(String.valueOf(puntajeJug1));
            } else if (puntajeJug2 == 45) {
                resetearPuntajes();
                juegosSet3Jug2 += 1;
                ganadorSetX(String.valueOf(juegosSet3Jug1), String.valueOf(juegosSet3Jug2));
                lblSetTresJug2.setText(String.valueOf(juegosSet3Jug2));
                cambiarBanderaSaque();
                return;
            } else if (puntajeJug2 == 40 && puntajeJug1 == 40) {
                puntajeJug2 = 45;
                //lblPuntosJug2.setText(String.valueOf(puntajeJug2));
                lblPuntosJug2.setText(String.valueOf("AD"));
                return;
            } else if (puntajeJug2 == 40 && puntajeJug1 != 40) {
                resetearPuntajes();
                juegosSet3Jug2 += 1;
                ganadorSetX(String.valueOf(juegosSet3Jug1), String.valueOf(juegosSet3Jug2));
                lblSetTresJug2.setText(String.valueOf(juegosSet3Jug2));
                cambiarBanderaSaque();
                return;
            } else if (puntajeJug2 == 30) {
                puntajeJug2 += 10;
                lblPuntosJug2.setText(String.valueOf(puntajeJug2));
                return;
            } else if (puntajeJug2 < 30) {
                puntajeJug2 += 15;
                lblPuntosJug2.setText(String.valueOf(puntajeJug2));
                return;
            }
        }

        if (numero >= porcentajeJug2) {
            lblGanadorPunto.setText(jugador1);
            //logica jugador 1
            if (puntajeJug2 == 45) {
                puntajeJug2 = 40;
                lblPuntosJug2.setText(String.valueOf(puntajeJug2));
            } else if (puntajeJug1 == 45) {
                resetearPuntajes();
                juegosSet3Jug1 += 1;
                ganadorSetX(String.valueOf(juegosSet3Jug1), String.valueOf(juegosSet3Jug2));
                lblSetTresJug1.setText(String.valueOf(juegosSet3Jug1));
                cambiarBanderaSaque();
            } else if (puntajeJug1 == 40 && puntajeJug2 == 40) {
                puntajeJug1 = 45;
                //lblPuntosJug1.setText(String.valueOf(puntajeJug1));
                lblPuntosJug1.setText(String.valueOf("AD"));
            } else if (puntajeJug1 == 40 && puntajeJug2 != 40) {
                resetearPuntajes();
                juegosSet3Jug1 += 1;
                ganadorSetX(String.valueOf(juegosSet3Jug1), String.valueOf(juegosSet3Jug2));
                lblSetTresJug1.setText(String.valueOf(juegosSet3Jug1));
                cambiarBanderaSaque();
            } else if (puntajeJug1 == 30) {
                puntajeJug1 += 10;
                lblPuntosJug1.setText(String.valueOf(puntajeJug1));
            } else if (puntajeJug1 < 30) {
                puntajeJug1 += 15;
                lblPuntosJug1.setText(String.valueOf(puntajeJug1));
            }
        }
    }

    public void cuartoSet() {
        double numero = Math.floor(Math.random() * 100 + 1);
        if (numero <= porcentajeJug2) {
            lblGanadorPunto.setText(jugador2);
            if (puntajeJug1 == 45) {
                puntajeJug1 = 40;
                lblPuntosJug1.setText(String.valueOf(puntajeJug1));
            } else if (puntajeJug2 == 45) {
                resetearPuntajes();
                juegosSet4Jug2 += 1;
                ganadorSetX(String.valueOf(juegosSet4Jug1), String.valueOf(juegosSet4Jug2));
                lblSetCuatroJug2.setText(String.valueOf(juegosSet4Jug2));
                cambiarBanderaSaque();
                return;
            } else if (puntajeJug2 == 40 && puntajeJug1 == 40) {
                puntajeJug2 = 45;
                //lblPuntosJug2.setText(String.valueOf(puntajeJug2));
                lblPuntosJug2.setText(String.valueOf("AD"));
                return;
            } else if (puntajeJug2 == 40 && puntajeJug1 != 40) {
                resetearPuntajes();
                juegosSet4Jug2 += 1;
                ganadorSetX(String.valueOf(juegosSet4Jug1), String.valueOf(juegosSet4Jug2));
                lblSetCuatroJug2.setText(String.valueOf(juegosSet4Jug2));
                cambiarBanderaSaque();
                return;
            } else if (puntajeJug2 == 30) {
                puntajeJug2 += 10;
                lblPuntosJug2.setText(String.valueOf(puntajeJug2));
                return;
            } else if (puntajeJug2 < 30) {
                puntajeJug2 += 15;
                lblPuntosJug2.setText(String.valueOf(puntajeJug2));
                return;
            }
        }

        if (numero >= porcentajeJug2) {
            lblGanadorPunto.setText(jugador1);
            //logica jugador 1
            if (puntajeJug2 == 45) {
                puntajeJug2 = 40;
                lblPuntosJug2.setText(String.valueOf(puntajeJug2));
            } else if (puntajeJug1 == 45) {
                resetearPuntajes();
                juegosSet4Jug1 += 1;
                ganadorSetX(String.valueOf(juegosSet4Jug1), String.valueOf(juegosSet4Jug2));
                lblSetCuatroJug1.setText(String.valueOf(juegosSet4Jug1));
                cambiarBanderaSaque();
            } else if (puntajeJug1 == 40 && puntajeJug2 == 40) {
                puntajeJug1 = 45;
                //lblPuntosJug1.setText(String.valueOf(puntajeJug1));
                lblPuntosJug1.setText(String.valueOf("AD"));
            } else if (puntajeJug1 == 40 && puntajeJug2 != 40) {
                resetearPuntajes();
                juegosSet4Jug1 += 1;
                ganadorSetX(String.valueOf(juegosSet4Jug1), String.valueOf(juegosSet4Jug2));
                lblSetCuatroJug1.setText(String.valueOf(juegosSet4Jug1));
                cambiarBanderaSaque();
            } else if (puntajeJug1 == 30) {
                puntajeJug1 += 10;
                lblPuntosJug1.setText(String.valueOf(puntajeJug1));
            } else if (puntajeJug1 < 30) {
                puntajeJug1 += 15;
                lblPuntosJug1.setText(String.valueOf(puntajeJug1));
            }
        }
    }

    public void quintoSet() {
        double numero = Math.floor(Math.random() * 100 + 1);
        if (numero <= porcentajeJug2) {
            lblGanadorPunto.setText(jugador2);
            if (puntajeJug1 == 45) {
                puntajeJug1 = 40;
                lblPuntosJug1.setText(String.valueOf(puntajeJug1));
            } else if (puntajeJug2 == 45) {
                resetearPuntajes();
                juegosSet5Jug2 += 1;
                ganadorSetX(String.valueOf(juegosSet5Jug1), String.valueOf(juegosSet5Jug2));
                lblSetCincoJug2.setText(String.valueOf(juegosSet5Jug2));
                cambiarBanderaSaque();
                return;
            } else if (puntajeJug2 == 40 && puntajeJug1 == 40) {
                puntajeJug2 = 45;
                //lblPuntosJug2.setText(String.valueOf(puntajeJug2));
                lblPuntosJug2.setText(String.valueOf("AD"));
                return;
            } else if (puntajeJug2 == 40 && puntajeJug1 != 40) {
                resetearPuntajes();
                juegosSet5Jug2 += 1;
                ganadorSetX(String.valueOf(juegosSet5Jug1), String.valueOf(juegosSet5Jug2));
                lblSetCincoJug2.setText(String.valueOf(juegosSet5Jug2));
                cambiarBanderaSaque();
                return;
            } else if (puntajeJug2 == 30) {
                puntajeJug2 += 10;
                lblPuntosJug2.setText(String.valueOf(puntajeJug2));
                return;
            } else if (puntajeJug2 < 30) {
                puntajeJug2 += 15;
                lblPuntosJug2.setText(String.valueOf(puntajeJug2));
                return;
            }
        }

        if (numero >= porcentajeJug2) {
            lblGanadorPunto.setText(jugador1);
            //logica jugador 1
            if (puntajeJug2 == 45) {
                puntajeJug2 = 40;
                lblPuntosJug2.setText(String.valueOf(puntajeJug2));
            } else if (puntajeJug1 == 45) {
                resetearPuntajes();
                juegosSet5Jug1 += 1;
                ganadorSetX(String.valueOf(juegosSet5Jug1), String.valueOf(juegosSet5Jug2));
                lblSetCincoJug1.setText(String.valueOf(juegosSet5Jug1));
                cambiarBanderaSaque();
            } else if (puntajeJug1 == 40 && puntajeJug2 == 40) {
                puntajeJug1 = 45;
                //lblPuntosJug1.setText(String.valueOf(puntajeJug1));
                lblPuntosJug1.setText(String.valueOf("AD"));
            } else if (puntajeJug1 == 40 && puntajeJug2 != 40) {
                resetearPuntajes();
                juegosSet5Jug1 += 1;
                ganadorSetX(String.valueOf(juegosSet5Jug1), String.valueOf(juegosSet5Jug2));
                lblSetCincoJug1.setText(String.valueOf(juegosSet5Jug1));
                cambiarBanderaSaque();
            } else if (puntajeJug1 == 30) {
                puntajeJug1 += 10;
                lblPuntosJug1.setText(String.valueOf(puntajeJug1));
            } else if (puntajeJug1 < 30) {
                puntajeJug1 += 15;
                lblPuntosJug1.setText(String.valueOf(puntajeJug1));
            }
        }
    }

    public void ganadorSetX(String juegosJug1, String juegosJug2) {
        if (Integer.parseInt(juegosJug1) == 6 && Integer.parseInt(juegosJug2) < 5) {
            ganadorSet(jugador1);
        } else if (Integer.parseInt(juegosJug2) == 6 && Integer.parseInt(juegosJug1) < 5) {
            ganadorSet(jugador2);
        } else if (Integer.parseInt(juegosJug1) == 7) {
            ganadorSet(jugador1);
        } else if (Integer.parseInt(juegosJug2) == 7) {
            ganadorSet(jugador2);
        }
    }

    public void ganadorSet(String jugador) {
        JOptionPane.showMessageDialog(this, jugador+" ganó el set!", "Ganador del set",JOptionPane.INFORMATION_MESSAGE);
        if (jugador == jugador1) {
            setsJug1++;
            contador++;
        } else if (jugador == jugador2) {
            setsJug2++;
            contador++;
        }
        cambiarBandera();
        txtSetsJug1.setText(String.valueOf(setsJug1));
        txtSetsJug2.setText(String.valueOf(setsJug2));
    }

    public void cambiarBandera() {
        if (cantidadSets == 3 && (setsJug1 == 2 || setsJug2 == 2)) {
            bandera = false;
        } else if ((setsJug1 + setsJug2) == cantidadSets) {
            bandera = false;
        }

        if (cantidadSets == 5 && (setsJug1 == 3 || setsJug2 == 3)) {
            bandera = false;
        } else if ((setsJug1 + setsJug2) == cantidadSets) {
            bandera = false;
        }
    }

    public void ganador() {
        if (cantidadSets == 3) {
            if (setsJug1 == 2) {
                int respuesta = JOptionPane.showConfirmDialog(this, jugador1 + " gano el torneo.\n   Quieres revancha?",
                        "Felicitaciones!", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
                if (respuesta == JOptionPane.YES_OPTION) {
                    revancha();
                }else {this.dispose();}
            } else if (setsJug2 == 2) {
                int respuesta = JOptionPane.showConfirmDialog(this, jugador2 + " gano el torneo.\n   Quieres revancha?",
                        "Felicitaciones!", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
                if (respuesta == JOptionPane.YES_OPTION) {
                    revancha();
                }else {this.dispose();}
            }
        } else {
            if (setsJug1 == 3) {
                int respuesta = JOptionPane.showConfirmDialog(this, jugador1 + " gano el torneo.\n   Quieres revancha?",
                        "Felicitaciones!", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
                if (respuesta == JOptionPane.YES_OPTION) {
                    revancha();
                }else {this.dispose();}
            } else if (setsJug2 == 3) {
                int respuesta = JOptionPane.showConfirmDialog(this, jugador2 + " gano el torneo.\n   Quieres revancha?",
                        "Felicitaciones!", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
                if (respuesta == JOptionPane.YES_OPTION) {
                    revancha();
                }else {this.dispose();}
            }
        }
    }

    public void quienSirve() {
        if (banderaSaque) {
            lblSirveJug1.setText("sirviendo");
            lblSirveJug2.setText("");
        } else {
            lblSirveJug1.setText("");
            lblSirveJug2.setText("sirviendo");
        }
    }

    public void cambiarBanderaSaque() {
        if (banderaSaque == true) {
            banderaSaque = false;
            lblSirveJug1.setText("");
            lblSirveJug2.setText("sirviendo");
        } else if (banderaSaque == false) {
            banderaSaque = true;
            lblSirveJug1.setText("sirviendo");
            lblSirveJug2.setText("");
        }
    }

    public void resetearPuntajes() {
        puntajeJug2 = 0;
        lblPuntosJug2.setText(String.valueOf(puntajeJug2));
        puntajeJug1 = 0;
        lblPuntosJug1.setText(String.valueOf(puntajeJug1));
    }

    public void revancha() {
        this.dispose();
        new Partida(controlador).setVisible(true);        
    }
 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnJugarRonda;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblGanador;
    private javax.swing.JLabel lblGanadorPunto;
    private javax.swing.JLabel lblNombreJug1;
    private javax.swing.JLabel lblNombreJug2;
    private javax.swing.JLabel lblPuntosJug1;
    private javax.swing.JLabel lblPuntosJug2;
    private javax.swing.JLabel lblSetCincoJug1;
    private javax.swing.JLabel lblSetCincoJug2;
    private javax.swing.JLabel lblSetCuatroJug1;
    private javax.swing.JLabel lblSetCuatroJug2;
    private javax.swing.JLabel lblSetDosJug1;
    private javax.swing.JLabel lblSetDosJug2;
    private javax.swing.JLabel lblSetTresJug1;
    private javax.swing.JLabel lblSetTresJug2;
    private javax.swing.JLabel lblSetUnoJug1;
    private javax.swing.JLabel lblSetUnoJug2;
    private javax.swing.JLabel lblSets;
    private javax.swing.JLabel lblSirveJug1;
    private javax.swing.JLabel lblSirveJug2;
    private javax.swing.JLabel lblTorneo;
    private javax.swing.JTable tblJugadores;
    private javax.swing.JTextField txtSetsJug1;
    private javax.swing.JTextField txtSetsJug2;
    // End of variables declaration//GEN-END:variables
}
