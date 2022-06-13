/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package salonso1602.obligatorio2_equipo3;

import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 *
 * @author Néstor
 */
public class Programa extends javax.swing.JFrame {
    
    private static int nroCPUs;
    private static int quantum;
    private static Planificador planificador;
    /**
     * Creates new form Ejecutable
     * @param NumCPUS
     * @param Quantum
     */
    public Programa(int NumCPUS, int Quantum) {
        quantum = Quantum;
        nroCPUs = NumCPUS;
        planificador = new Planificador(nroCPUs,quantum);
        initComponents();
        //Display_Todo.setVisible(false);
        
    }
    public static int id = 0;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Agregar_Frame = new javax.swing.JFrame();
        Volver_Agregar = new javax.swing.JButton();
        Label_Nombre_Proceso = new javax.swing.JLabel();
        Label_Tiempo_Total = new javax.swing.JLabel();
        Label_Periodo_ES = new javax.swing.JLabel();
        Label_Tiempo_ES = new javax.swing.JLabel();
        Label_Procesos_Creados = new javax.swing.JLabel();
        Tiempo_Dentro_ES = new javax.swing.JTextField();
        Cant_Procesos_Creados = new javax.swing.JTextField();
        Nombre_Proceso = new javax.swing.JTextField();
        Periodo_ES = new javax.swing.JTextField();
        Tiempo_Ejecucion = new javax.swing.JTextField();
        Crear_Procesos = new javax.swing.JButton();
        Label_Nombre_Proceso1 = new javax.swing.JLabel();
        Prioridad_Proceso = new javax.swing.JTextField();
        Es_Usuario = new javax.swing.JRadioButton();
        Es_SO = new javax.swing.JRadioButton();
        Bloquear_Frame = new javax.swing.JFrame();
        Volver_Bloquear = new javax.swing.JButton();
        Modificar_Frame = new javax.swing.JFrame();
        Volver_Modificar = new javax.swing.JButton();
        GrupoBotonesSOoUser = new javax.swing.ButtonGroup();
        Display_Frame = new javax.swing.JFrame();
        Volver_Display = new javax.swing.JButton();
        botStop = new javax.swing.JButton();
        botStart = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaColas = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        listaProcs = new javax.swing.JList<>();
        getProcData = new javax.swing.JButton();
        getFullCola = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        dispProcCPU = new javax.swing.JLabel();
        Agregar_Proceso = new javax.swing.JButton();
        Bloquear_Proceso = new javax.swing.JButton();
        Modificar_Proceso = new javax.swing.JButton();
        Display_Todo = new javax.swing.JButton();

        Agregar_Frame.setTitle("Agregar Proceso");
        Agregar_Frame.setName("Agregar_Frame"); // NOI18N
        Agregar_Frame.setPreferredSize(new java.awt.Dimension(600, 400));
        Agregar_Frame.setSize(new java.awt.Dimension(600, 400));

        Volver_Agregar.setText("Volver");
        Volver_Agregar.setActionCommand("");
        Volver_Agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Volver_AgregarActionPerformed(evt);
            }
        });

        Label_Nombre_Proceso.setText("Nombre del Proceso creado:");

        Label_Tiempo_Total.setText("Tiempo total de ejecución:");

        Label_Periodo_ES.setText("¿Cada cuánto tiempo realiza una E/S?");

        Label_Tiempo_ES.setText("Tiempo realizando la E/S:");

        Label_Procesos_Creados.setText("Cantidad de procesos a crearse:");

        Crear_Procesos.setText("Crear");
        Crear_Procesos.setActionCommand("");
        Crear_Procesos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Crear_ProcesosActionPerformed(evt);
            }
        });

        Label_Nombre_Proceso1.setText("Prioridad del Proceso:");

        GrupoBotonesSOoUser.add(Es_Usuario);
        Es_Usuario.setText("Usuario");

        GrupoBotonesSOoUser.add(Es_SO);
        Es_SO.setText("SO");

        javax.swing.GroupLayout Agregar_FrameLayout = new javax.swing.GroupLayout(Agregar_Frame.getContentPane());
        Agregar_Frame.getContentPane().setLayout(Agregar_FrameLayout);
        Agregar_FrameLayout.setHorizontalGroup(
            Agregar_FrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Agregar_FrameLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Agregar_FrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Agregar_FrameLayout.createSequentialGroup()
                        .addComponent(Label_Periodo_ES)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 207, Short.MAX_VALUE)
                        .addComponent(Periodo_ES, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Agregar_FrameLayout.createSequentialGroup()
                        .addGroup(Agregar_FrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Label_Tiempo_Total, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Label_Nombre_Proceso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(Agregar_FrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Nombre_Proceso, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                            .addComponent(Tiempo_Ejecucion)))
                    .addComponent(Volver_Agregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Crear_Procesos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Agregar_FrameLayout.createSequentialGroup()
                        .addGroup(Agregar_FrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Label_Tiempo_ES, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Label_Procesos_Creados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Label_Nombre_Proceso1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(Agregar_FrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Cant_Procesos_Creados, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                            .addComponent(Tiempo_Dentro_ES)
                            .addComponent(Prioridad_Proceso, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(Agregar_FrameLayout.createSequentialGroup()
                        .addGroup(Agregar_FrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Es_Usuario)
                            .addComponent(Es_SO))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        Agregar_FrameLayout.setVerticalGroup(
            Agregar_FrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Agregar_FrameLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Agregar_FrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Label_Nombre_Proceso)
                    .addComponent(Nombre_Proceso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Agregar_FrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Label_Tiempo_Total, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Tiempo_Ejecucion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Agregar_FrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Label_Periodo_ES, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Periodo_ES, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Agregar_FrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Label_Tiempo_ES, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Tiempo_Dentro_ES, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Agregar_FrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Label_Nombre_Proceso1)
                    .addComponent(Prioridad_Proceso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(Es_SO)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Es_Usuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Agregar_FrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Cant_Procesos_Creados, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Label_Procesos_Creados))
                .addGap(12, 12, 12)
                .addComponent(Crear_Procesos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Volver_Agregar)
                .addGap(21, 21, 21))
        );

        Bloquear_Frame.setTitle("Bloquear Proceso");
        Bloquear_Frame.setName("Bloquear_Frame"); // NOI18N
        Bloquear_Frame.setSize(new java.awt.Dimension(400, 300));

        Volver_Bloquear.setText("Volver");
        Volver_Bloquear.setActionCommand("");
        Volver_Bloquear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Volver_BloquearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Bloquear_FrameLayout = new javax.swing.GroupLayout(Bloquear_Frame.getContentPane());
        Bloquear_Frame.getContentPane().setLayout(Bloquear_FrameLayout);
        Bloquear_FrameLayout.setHorizontalGroup(
            Bloquear_FrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Bloquear_FrameLayout.createSequentialGroup()
                .addContainerGap(310, Short.MAX_VALUE)
                .addComponent(Volver_Bloquear)
                .addGap(15, 15, 15))
        );
        Bloquear_FrameLayout.setVerticalGroup(
            Bloquear_FrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Bloquear_FrameLayout.createSequentialGroup()
                .addContainerGap(264, Short.MAX_VALUE)
                .addComponent(Volver_Bloquear)
                .addGap(14, 14, 14))
        );

        Modificar_Frame.setTitle("Modificar Proceso");
        Modificar_Frame.setName("Modificar_Frame"); // NOI18N
        Modificar_Frame.setSize(new java.awt.Dimension(400, 300));

        Volver_Modificar.setText("Volver");
        Volver_Modificar.setActionCommand("");
        Volver_Modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Volver_ModificarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Modificar_FrameLayout = new javax.swing.GroupLayout(Modificar_Frame.getContentPane());
        Modificar_Frame.getContentPane().setLayout(Modificar_FrameLayout);
        Modificar_FrameLayout.setHorizontalGroup(
            Modificar_FrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Modificar_FrameLayout.createSequentialGroup()
                .addContainerGap(310, Short.MAX_VALUE)
                .addComponent(Volver_Modificar)
                .addGap(15, 15, 15))
        );
        Modificar_FrameLayout.setVerticalGroup(
            Modificar_FrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Modificar_FrameLayout.createSequentialGroup()
                .addContainerGap(264, Short.MAX_VALUE)
                .addComponent(Volver_Modificar)
                .addGap(14, 14, 14))
        );

        Display_Frame.setTitle("Bloquear Proceso");
        Display_Frame.setName("Bloquear_Frame"); // NOI18N
        Display_Frame.setSize(new java.awt.Dimension(400, 300));

        Volver_Display.setText("Volver");
        Volver_Display.setActionCommand("");
        Volver_Display.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Volver_DisplayActionPerformed(evt);
            }
        });

        botStop.setText("Pausar");

        botStart.setText("Iniciar");

        jScrollPane1.setViewportView(listaColas);

        jLabel1.setText("Colas de Prioridad");

        jLabel2.setText("Procesos en Cola");

        jScrollPane2.setViewportView(listaProcs);

        getProcData.setText("Ver Datos");
        getProcData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getProcDataActionPerformed(evt);
            }
        });

        getFullCola.setText("Cola de Listos");
        getFullCola.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getFullColaActionPerformed(evt);
            }
        });

        jLabel3.setText("Proceso en CPU/s");

        javax.swing.GroupLayout Display_FrameLayout = new javax.swing.GroupLayout(Display_Frame.getContentPane());
        Display_Frame.getContentPane().setLayout(Display_FrameLayout);
        Display_FrameLayout.setHorizontalGroup(
            Display_FrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Display_FrameLayout.createSequentialGroup()
                .addGroup(Display_FrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(Display_FrameLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(Display_FrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Display_FrameLayout.createSequentialGroup()
                                .addGroup(Display_FrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addGroup(Display_FrameLayout.createSequentialGroup()
                                        .addGap(19, 19, 19)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(27, 27, 27)
                                .addGroup(Display_FrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                    .addComponent(jLabel2))
                                .addGap(18, 18, 18)
                                .addGroup(Display_FrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(getFullCola)
                                    .addGroup(Display_FrameLayout.createSequentialGroup()
                                        .addGap(11, 11, 11)
                                        .addComponent(getProcData))))
                            .addGroup(Display_FrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addComponent(dispProcCPU, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(Display_FrameLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(botStop)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botStart)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Volver_Display)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        Display_FrameLayout.setVerticalGroup(
            Display_FrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Display_FrameLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(Display_FrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Display_FrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(Display_FrameLayout.createSequentialGroup()
                        .addGroup(Display_FrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3))
                    .addGroup(Display_FrameLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(getProcData)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(getFullCola)
                        .addGap(46, 46, 46)))
                .addComponent(dispProcCPU, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Display_FrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botStop)
                    .addComponent(botStart)
                    .addComponent(Volver_Display))
                .addGap(14, 14, 14))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Obligatorio SO Equipo 6");
        setName("Ejecutable"); // NOI18N
        setSize(new java.awt.Dimension(400, 300));

        Agregar_Proceso.setText("Agregar");
        Agregar_Proceso.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Agregar_Proceso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Agregar_ProcesoActionPerformed(evt);
            }
        });

        Bloquear_Proceso.setText("Bloquear");
        Bloquear_Proceso.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Bloquear_Proceso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bloquear_ProcesoActionPerformed(evt);
            }
        });

        Modificar_Proceso.setText("Modificar");
        Modificar_Proceso.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Modificar_Proceso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Modificar_ProcesoActionPerformed(evt);
            }
        });

        Display_Todo.setText("Display");
        Display_Todo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Display_Todo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Display_TodoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(Display_Todo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Modificar_Proceso, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Agregar_Proceso, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Bloquear_Proceso, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(313, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(Agregar_Proceso)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Bloquear_Proceso)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Modificar_Proceso)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Display_Todo)
                .addContainerGap(161, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Agregar_ProcesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Agregar_ProcesoActionPerformed
        Agregar_Frame.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_Agregar_ProcesoActionPerformed

    private void Bloquear_ProcesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bloquear_ProcesoActionPerformed
        Bloquear_Frame.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_Bloquear_ProcesoActionPerformed

    private void Modificar_ProcesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Modificar_ProcesoActionPerformed
        Modificar_Frame.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_Modificar_ProcesoActionPerformed

    private void Volver_AgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Volver_AgregarActionPerformed
        this.setVisible(true);
        Agregar_Frame.setVisible(false);
    }//GEN-LAST:event_Volver_AgregarActionPerformed

    private void Volver_BloquearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Volver_BloquearActionPerformed
        this.setVisible(true);
        Bloquear_Frame.setVisible(false);
    }//GEN-LAST:event_Volver_BloquearActionPerformed

    private void Volver_ModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Volver_ModificarActionPerformed
        this.setVisible(true);
        Modificar_Frame.setVisible(false);
    }//GEN-LAST:event_Volver_ModificarActionPerformed

    private void Crear_ProcesosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Crear_ProcesosActionPerformed
        if(Integer.parseInt(Cant_Procesos_Creados.getText())<=0)
        {
            JOptionPane.showMessageDialog(null, "La cantidad de procesos a crearse debe ser mayor o igual a 1", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else
        {
            for(int i = 0; i <= Integer.parseInt(Cant_Procesos_Creados.getText()); i++)
            {
                boolean SO;
                if(GrupoBotonesSOoUser.isSelected(Es_SO.getModel()))
                {
                    SO = true;
                }
                else
                {
                   SO = false;
                }
                Proceso nuevoProceso = new Proceso(Nombre_Proceso.getText(),Integer.parseInt(Prioridad_Proceso.getText()),Integer.parseInt(Tiempo_Ejecucion.getText()),Integer.parseInt(Periodo_ES.getText()),Integer.parseInt(Tiempo_Dentro_ES.getText()),String.valueOf(id),SO);
                id++;
                planificador.agregarProcesoAListos(nuevoProceso);
            }
            JOptionPane.showMessageDialog(null, "Se crearon los procesos con éxito", "Creación Exitosa", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_Crear_ProcesosActionPerformed

    private void Display_TodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Display_TodoActionPerformed
        this.setVisible(false);
        Display_Frame.setVisible(true);
        
        listaColas.setModel(new DefaultComboBoxModel<String>(planificador.printListaPrioridades()));
        
        listaColas.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting()){
                String selected = listaColas.getSelectedValue().toString();
                
                listaProcs.setModel(new DefaultComboBoxModel<String>(planificador.printProcEnCola(selected)));
                }
            }
        });
    }//GEN-LAST:event_Display_TodoActionPerformed

    private void Volver_DisplayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Volver_DisplayActionPerformed
        this.setVisible(true);
        Display_Frame.setVisible(false);
    }//GEN-LAST:event_Volver_DisplayActionPerformed

    private void getProcDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getProcDataActionPerformed
        if (listaProcs != null && listaColas != null){
            String id = listaProcs.getSelectedValue().split(":")[1];
            Proceso proc = planificador.getProcEnCola(Integer.parseInt(listaColas.getSelectedValue()), id);
            JOptionPane.showMessageDialog(null, proc.getData(), proc.getNombre(), JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_getProcDataActionPerformed

    private void getFullColaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getFullColaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_getFullColaActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Programa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Programa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Programa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Programa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Programa(nroCPUs,quantum).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFrame Agregar_Frame;
    private javax.swing.JButton Agregar_Proceso;
    private javax.swing.JFrame Bloquear_Frame;
    private javax.swing.JButton Bloquear_Proceso;
    private javax.swing.JTextField Cant_Procesos_Creados;
    private javax.swing.JButton Crear_Procesos;
    private javax.swing.JFrame Display_Frame;
    private javax.swing.JButton Display_Todo;
    private javax.swing.JRadioButton Es_SO;
    private javax.swing.JRadioButton Es_Usuario;
    private javax.swing.ButtonGroup GrupoBotonesSOoUser;
    private javax.swing.JLabel Label_Nombre_Proceso;
    private javax.swing.JLabel Label_Nombre_Proceso1;
    private javax.swing.JLabel Label_Periodo_ES;
    private javax.swing.JLabel Label_Procesos_Creados;
    private javax.swing.JLabel Label_Tiempo_ES;
    private javax.swing.JLabel Label_Tiempo_Total;
    private javax.swing.JFrame Modificar_Frame;
    private javax.swing.JButton Modificar_Proceso;
    private javax.swing.JTextField Nombre_Proceso;
    private javax.swing.JTextField Periodo_ES;
    private javax.swing.JTextField Prioridad_Proceso;
    private javax.swing.JTextField Tiempo_Dentro_ES;
    private javax.swing.JTextField Tiempo_Ejecucion;
    private javax.swing.JButton Volver_Agregar;
    private javax.swing.JButton Volver_Bloquear;
    private javax.swing.JButton Volver_Display;
    private javax.swing.JButton Volver_Modificar;
    private javax.swing.JButton botStart;
    private javax.swing.JButton botStop;
    private javax.swing.JLabel dispProcCPU;
    private javax.swing.JButton getFullCola;
    private javax.swing.JButton getProcData;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<String> listaColas;
    private javax.swing.JList<String> listaProcs;
    // End of variables declaration//GEN-END:variables
}
