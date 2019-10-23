/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal;

import Administrar.*;
import Control.*;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author josephjoestar
 */
public class DarDeAltaGrupo extends javax.swing.JFrame {

    /**
     * Creates new form AdminsitrarDirectores
     */
    public DarDeAltaGrupo() {
        initComponents();
        this.setLocationRelativeTo(null);
        agregar();
        
        validar val = new validar();
        LAB_nom.setText(val.tipoUsuario());
        if(SharedData.getTipoUsuario().equals("Profesor")){
            BTN_maestros.setEnabled(false);
            BTN_carreras.setEnabled(false);
            BTN_planes.setEnabled(false);
            BTN_aulas.setEnabled(false);
            BTN_horario.setEnabled(false);
        }
    }

    void agregar() {
        cb_planes.removeAllItems();
        try {
            connection conn = new connection();
            ResultSet rs = conn.conectar("SELECT clv_plan FROM plan_estudios WHERE idcarrera = '" + SharedData.getCarrera() + "'");
            while (rs.next()) {
                String clave = rs.getString("clv_plan");
                cb_planes.addItem(clave);
            }
        } catch (Exception e) {

        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        clvgrpotxt = new javax.swing.JTextField();
        cuatritxt = new javax.swing.JTextField();
        btn_guardar = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cb_planes = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        LAB_nom = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        BTN_menu = new javax.swing.JButton();
        BTN_disponibilidad = new javax.swing.JButton();
        BTN_maestros = new javax.swing.JButton();
        BTN_materias = new javax.swing.JButton();
        BTN_carreras = new javax.swing.JButton();
        BTN_planes = new javax.swing.JButton();
        BTN_aulas = new javax.swing.JButton();
        BTN_grupo = new javax.swing.JButton();
        BTN_horario = new javax.swing.JButton();
        BTN_puntos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1280, 720));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(254, 254, 254));
        jPanel3.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setText("Clave Grupo:");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(93, 95, -1, -1));

        jLabel6.setText("Cuatrimestre :");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(93, 150, -1, -1));

        clvgrpotxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clvgrpotxtActionPerformed(evt);
            }
        });
        clvgrpotxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                clvgrpotxtKeyTyped(evt);
            }
        });
        jPanel3.add(clvgrpotxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(249, 90, 218, -1));

        cuatritxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cuatritxtActionPerformed(evt);
            }
        });
        cuatritxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cuatritxtKeyTyped(evt);
            }
        });
        jPanel3.add(cuatritxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 150, 218, -1));

        btn_guardar.setText("Guardar");
        btn_guardar.setToolTipText("");
        btn_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardarActionPerformed(evt);
            }
        });
        jPanel3.add(btn_guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 240, 105, -1));

        jLabel10.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel10.setText("Dar de alta grupo");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        jLabel7.setText("Plan Estudio: ");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, -1, -1));

        cb_planes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ITI-08234 Matutino", "ITI-08224 Matutino", "ITI-08223 Vespertino", "Sin Grupo ", " " }));
        cb_planes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_planesActionPerformed(evt);
            }
        });
        jPanel3.add(cb_planes, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 190, 210, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, 1070, 610));

        jPanel2.setBackground(new java.awt.Color(162, 3, 136));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LAB_nom.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        LAB_nom.setForeground(new java.awt.Color(254, 254, 254));
        LAB_nom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/g12280.png"))); // NOI18N
        LAB_nom.setText("Director General: Fulanito de Tal");
        jPanel2.add(LAB_nom, new org.netbeans.lib.awtextra.AbsoluteConstraints(208, 46, 461, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/white_logo.png"))); // NOI18N
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 0, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1290, 110));

        jPanel1.setBackground(new java.awt.Color(56, 56, 56));
        jPanel1.setMaximumSize(new java.awt.Dimension(210, 610));
        jPanel1.setMinimumSize(new java.awt.Dimension(210, 610));
        jPanel1.setPreferredSize(new java.awt.Dimension(210, 610));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setForeground(new java.awt.Color(254, 254, 254));
        jLabel4.setText("____________________________________");
        jLabel4.setPreferredSize(new java.awt.Dimension(210, 17));
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 230, -1));

        BTN_menu.setBackground(new java.awt.Color(30, 30, 30));
        BTN_menu.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        BTN_menu.setForeground(new java.awt.Color(254, 254, 254));
        BTN_menu.setText("MENÚ");
        BTN_menu.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        BTN_menu.setBorderPainted(false);
        BTN_menu.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BTN_menu.setFocusPainted(false);
        BTN_menu.setMaximumSize(new java.awt.Dimension(210, 60));
        BTN_menu.setMinimumSize(new java.awt.Dimension(210, 60));
        BTN_menu.setPreferredSize(new java.awt.Dimension(210, 60));
        BTN_menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_menuActionPerformed(evt);
            }
        });
        jPanel1.add(BTN_menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 210, 90));

        BTN_disponibilidad.setBackground(new java.awt.Color(30, 30, 30));
        BTN_disponibilidad.setForeground(new java.awt.Color(254, 254, 254));
        BTN_disponibilidad.setText("Disponibilidad");
        BTN_disponibilidad.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        BTN_disponibilidad.setBorderPainted(false);
        BTN_disponibilidad.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BTN_disponibilidad.setFocusPainted(false);
        BTN_disponibilidad.setMaximumSize(new java.awt.Dimension(210, 60));
        BTN_disponibilidad.setMinimumSize(new java.awt.Dimension(210, 60));
        BTN_disponibilidad.setPreferredSize(new java.awt.Dimension(210, 60));
        BTN_disponibilidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_disponibilidadActionPerformed(evt);
            }
        });
        jPanel1.add(BTN_disponibilidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 210, 50));

        BTN_maestros.setBackground(new java.awt.Color(30, 30, 30));
        BTN_maestros.setForeground(new java.awt.Color(254, 254, 254));
        BTN_maestros.setText("Maestros");
        BTN_maestros.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        BTN_maestros.setBorderPainted(false);
        BTN_maestros.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BTN_maestros.setFocusPainted(false);
        BTN_maestros.setMaximumSize(new java.awt.Dimension(210, 60));
        BTN_maestros.setMinimumSize(new java.awt.Dimension(210, 60));
        BTN_maestros.setPreferredSize(new java.awt.Dimension(210, 60));
        BTN_maestros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_maestrosActionPerformed(evt);
            }
        });
        jPanel1.add(BTN_maestros, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 210, 50));

        BTN_materias.setBackground(new java.awt.Color(30, 30, 30));
        BTN_materias.setForeground(new java.awt.Color(254, 254, 254));
        BTN_materias.setText("Materias");
        BTN_materias.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        BTN_materias.setBorderPainted(false);
        BTN_materias.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BTN_materias.setFocusPainted(false);
        BTN_materias.setMaximumSize(new java.awt.Dimension(210, 60));
        BTN_materias.setMinimumSize(new java.awt.Dimension(210, 60));
        BTN_materias.setPreferredSize(new java.awt.Dimension(210, 60));
        BTN_materias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_materiasActionPerformed(evt);
            }
        });
        jPanel1.add(BTN_materias, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 210, 50));

        BTN_carreras.setBackground(new java.awt.Color(30, 30, 30));
        BTN_carreras.setForeground(new java.awt.Color(254, 254, 254));
        BTN_carreras.setText("Carreras");
        BTN_carreras.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        BTN_carreras.setBorderPainted(false);
        BTN_carreras.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BTN_carreras.setFocusPainted(false);
        BTN_carreras.setMaximumSize(new java.awt.Dimension(210, 60));
        BTN_carreras.setMinimumSize(new java.awt.Dimension(210, 60));
        BTN_carreras.setPreferredSize(new java.awt.Dimension(210, 60));
        BTN_carreras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_carrerasActionPerformed(evt);
            }
        });
        jPanel1.add(BTN_carreras, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 210, 50));

        BTN_planes.setBackground(new java.awt.Color(30, 30, 30));
        BTN_planes.setForeground(new java.awt.Color(254, 254, 254));
        BTN_planes.setText("Planes de Estudio");
        BTN_planes.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        BTN_planes.setBorderPainted(false);
        BTN_planes.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BTN_planes.setFocusPainted(false);
        BTN_planes.setMaximumSize(new java.awt.Dimension(210, 60));
        BTN_planes.setMinimumSize(new java.awt.Dimension(210, 60));
        BTN_planes.setPreferredSize(new java.awt.Dimension(210, 60));
        BTN_planes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_planesActionPerformed(evt);
            }
        });
        jPanel1.add(BTN_planes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 210, 50));

        BTN_aulas.setBackground(new java.awt.Color(30, 30, 30));
        BTN_aulas.setForeground(new java.awt.Color(254, 254, 254));
        BTN_aulas.setText("Aulas");
        BTN_aulas.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        BTN_aulas.setBorderPainted(false);
        BTN_aulas.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BTN_aulas.setFocusPainted(false);
        BTN_aulas.setMaximumSize(new java.awt.Dimension(210, 60));
        BTN_aulas.setMinimumSize(new java.awt.Dimension(210, 60));
        BTN_aulas.setPreferredSize(new java.awt.Dimension(210, 60));
        BTN_aulas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_aulasActionPerformed(evt);
            }
        });
        jPanel1.add(BTN_aulas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, 210, 50));

        BTN_grupo.setBackground(new java.awt.Color(30, 30, 30));
        BTN_grupo.setForeground(new java.awt.Color(254, 254, 254));
        BTN_grupo.setText("Grupos");
        BTN_grupo.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        BTN_grupo.setBorderPainted(false);
        BTN_grupo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BTN_grupo.setFocusPainted(false);
        BTN_grupo.setMaximumSize(new java.awt.Dimension(210, 60));
        BTN_grupo.setMinimumSize(new java.awt.Dimension(210, 60));
        BTN_grupo.setPreferredSize(new java.awt.Dimension(210, 60));
        BTN_grupo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_grupoActionPerformed(evt);
            }
        });
        jPanel1.add(BTN_grupo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 390, 210, 50));

        BTN_horario.setBackground(new java.awt.Color(30, 30, 30));
        BTN_horario.setForeground(new java.awt.Color(254, 254, 254));
        BTN_horario.setText("Horarios");
        BTN_horario.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        BTN_horario.setBorderPainted(false);
        BTN_horario.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BTN_horario.setFocusPainted(false);
        BTN_horario.setMaximumSize(new java.awt.Dimension(210, 60));
        BTN_horario.setMinimumSize(new java.awt.Dimension(210, 60));
        BTN_horario.setPreferredSize(new java.awt.Dimension(210, 60));
        BTN_horario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_horarioActionPerformed(evt);
            }
        });
        jPanel1.add(BTN_horario, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 440, 210, 50));

        BTN_puntos.setBackground(new java.awt.Color(30, 30, 30));
        BTN_puntos.setForeground(new java.awt.Color(254, 254, 254));
        BTN_puntos.setText("Puntos Confianza");
        BTN_puntos.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        BTN_puntos.setBorderPainted(false);
        BTN_puntos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BTN_puntos.setFocusPainted(false);
        BTN_puntos.setMaximumSize(new java.awt.Dimension(210, 60));
        BTN_puntos.setMinimumSize(new java.awt.Dimension(210, 60));
        BTN_puntos.setPreferredSize(new java.awt.Dimension(210, 60));
        BTN_puntos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_puntosActionPerformed(evt);
            }
        });
        jPanel1.add(BTN_puntos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 490, 210, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 210, 610));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cuatritxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cuatritxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cuatritxtActionPerformed

    private void clvgrpotxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clvgrpotxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_clvgrpotxtActionPerformed

    private void btn_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarActionPerformed
        
        if(this.clvgrpotxt.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Asegurese de ingresar una clave de grupo.");
        }else if(this.cuatritxt.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Asegurese de ingresar el cuatrimestre al que pertenece el grupo.");
        }else if(Integer.parseInt(cuatritxt.getText()) <= 10 && Integer.parseInt(cuatritxt.getText()) > 0) {
        
        try {
            connection conn = new connection();
            String query = "INSERT INTO grupos values ('"+this.clvgrpotxt.getText()+"','"+this.cuatritxt.getText()+"','"+cb_planes.getSelectedItem()+"')";
            conn.insert(query);
            JOptionPane.showMessageDialog(null, "Grupo Agregado.");
        } catch (Exception ex) {
        }
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_guardarActionPerformed

    private void cb_planesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_planesActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_cb_planesActionPerformed

    private void clvgrpotxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_clvgrpotxtKeyTyped

        if (clvgrpotxt.getText().length() >= 40) 
            evt.consume();        
    }//GEN-LAST:event_clvgrpotxtKeyTyped
    validar val = new validar();
    private void cuatritxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cuatritxtKeyTyped
        
        val.validarNum(evt);
        if (cuatritxt.getText().length() >= 2) 
            evt.consume();         // TODO add your handling code here:
    }//GEN-LAST:event_cuatritxtKeyTyped

    private void BTN_menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_menuActionPerformed
        // TODO add your handling code here:
        Menu abrir = new Menu();
        abrir.setVisible(true);
        abrir.setLocationRelativeTo(null);
        abrir.setResizable(false);
        this.dispose();
    }//GEN-LAST:event_BTN_menuActionPerformed

    private void BTN_disponibilidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_disponibilidadActionPerformed
        // TODO add your handling code here:
        AdministrarDisponibilidad abrir = new AdministrarDisponibilidad();
        abrir.setVisible(true);
        abrir.setLocationRelativeTo(null);
        abrir.setResizable(false);
        this.dispose();
    }//GEN-LAST:event_BTN_disponibilidadActionPerformed

    private void BTN_maestrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_maestrosActionPerformed
        // TODO add your handling code here:
        AdministrarProfesores abrir = new AdministrarProfesores();
        abrir.setVisible(true);
        abrir.setLocationRelativeTo(null);
        abrir.setResizable(false);
        this.dispose();
    }//GEN-LAST:event_BTN_maestrosActionPerformed

    private void BTN_materiasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_materiasActionPerformed
        // TODO add your handling code here:
        AdministrarMaterias abrir = new AdministrarMaterias();
        abrir.setVisible(true);
        abrir.setLocationRelativeTo(null);
        abrir.setResizable(false);
        this.dispose();
    }//GEN-LAST:event_BTN_materiasActionPerformed

    private void BTN_carrerasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_carrerasActionPerformed
        // TODO add your handling code here:
        AdministrarCarreras abrir = new AdministrarCarreras();
        abrir.setVisible(true);
        abrir.setLocationRelativeTo(null);
        abrir.setResizable(false);
        this.dispose();
    }//GEN-LAST:event_BTN_carrerasActionPerformed

    private void BTN_planesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_planesActionPerformed
        // TODO add your handling code here:
        AdministrarPlanes abrir = new AdministrarPlanes();
        abrir.setVisible(true);
        abrir.setLocationRelativeTo(null);
        abrir.setResizable(false);
        this.dispose();
    }//GEN-LAST:event_BTN_planesActionPerformed

    private void BTN_aulasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_aulasActionPerformed
        // TODO add your handling code here:
        AdministrarAula abrir = new AdministrarAula();
        abrir.setVisible(true);
        abrir.setLocationRelativeTo(null);
        abrir.setResizable(false);
        this.dispose();
    }//GEN-LAST:event_BTN_aulasActionPerformed

    private void BTN_grupoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_grupoActionPerformed
        // TODO add your handling code here:
        AdministrarGrupos abrir = new AdministrarGrupos();
        abrir.setVisible(true);
        abrir.setLocationRelativeTo(null);
        abrir.setResizable(false);
        this.dispose();
    }//GEN-LAST:event_BTN_grupoActionPerformed

    private void BTN_horarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_horarioActionPerformed
        // TODO add your handling code here:
        AdministrarHorarios abrir = new AdministrarHorarios();
        abrir.setVisible(true);
        abrir.setLocationRelativeTo(null);
        abrir.setResizable(false);
        this.dispose();
    }//GEN-LAST:event_BTN_horarioActionPerformed

    private void BTN_puntosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_puntosActionPerformed
        // TODO add your handling code here:
        AdministrarPuntosConfianza abrir = new AdministrarPuntosConfianza();
        abrir.setVisible(true);
        abrir.setLocationRelativeTo(null);
        abrir.setResizable(false);
        this.dispose();
    }//GEN-LAST:event_BTN_puntosActionPerformed

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
            java.util.logging.Logger.getLogger(DarDeAltaGrupo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DarDeAltaGrupo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DarDeAltaGrupo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DarDeAltaGrupo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DarDeAltaGrupo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTN_aulas;
    private javax.swing.JButton BTN_carreras;
    private javax.swing.JButton BTN_disponibilidad;
    private javax.swing.JButton BTN_grupo;
    private javax.swing.JButton BTN_horario;
    private javax.swing.JButton BTN_maestros;
    private javax.swing.JButton BTN_materias;
    private javax.swing.JButton BTN_menu;
    private javax.swing.JButton BTN_planes;
    private javax.swing.JButton BTN_puntos;
    private javax.swing.JLabel LAB_nom;
    private javax.swing.JButton btn_guardar;
    private javax.swing.JComboBox<String> cb_planes;
    private javax.swing.JTextField clvgrpotxt;
    private javax.swing.JTextField cuatritxt;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
