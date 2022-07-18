package formularios;

import modelos.Usuario;

public class Inicio extends javax.swing.JFrame {

    private static Login login;
    private static Test test;
    private Usuario usuario;
    private static Resultado resultado;
    public Inicio() {
        initComponents();
        setLocationRelativeTo(null);
    }
    public Inicio(Usuario _usuario) {
        initComponents();
        setLocationRelativeTo(null);
        this.usuario=_usuario;
        darPrivilegiosSegunNivel(usuario);
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        btnRealista = new javax.swing.JButton();
        btnInvestigador = new javax.swing.JButton();
        btnEmprendedor = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        btnArtístico = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuPerfil = new javax.swing.JMenu();
        itemEditarPerfil = new javax.swing.JMenuItem();
        menuResultados = new javax.swing.JMenu();
        itemResultados = new javax.swing.JMenuItem();
        menuAyuda = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        menuSalir = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        menuUsuarios = new javax.swing.JMenu();
        itemAdministrarUsuarios = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Convencional ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnRealista.setText("Realista");
        btnRealista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRealistaActionPerformed(evt);
            }
        });

        btnInvestigador.setText("Investigador");
        btnInvestigador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInvestigadorActionPerformed(evt);
            }
        });

        btnEmprendedor.setText("Emprendedor");
        btnEmprendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmprendedorActionPerformed(evt);
            }
        });

        jButton5.setText("Social ");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        btnArtístico.setText("Artístico");
        btnArtístico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnArtísticoActionPerformed(evt);
            }
        });

        jLabel1.setText("Inicio");

        menuPerfil.setText("Perfil");

        itemEditarPerfil.setText("Editar");
        menuPerfil.add(itemEditarPerfil);

        jMenuBar1.add(menuPerfil);

        menuResultados.setText("Resultados");

        itemResultados.setText("Resultados");
        itemResultados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemResultadosActionPerformed(evt);
            }
        });
        menuResultados.add(itemResultados);

        jMenuBar1.add(menuResultados);

        menuAyuda.setText("Ayuda");

        jMenuItem2.setText("Acerca de ");
        menuAyuda.add(jMenuItem2);

        jMenuBar1.add(menuAyuda);

        menuSalir.setText("Salir");

        jMenuItem1.setText("Cerrar sesión");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        menuSalir.add(jMenuItem1);

        jMenuBar1.add(menuSalir);

        menuUsuarios.setText("Usuarios");

        itemAdministrarUsuarios.setText("Administrar");
        menuUsuarios.add(itemAdministrarUsuarios);

        jMenuBar1.add(menuUsuarios);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(291, 291, 291)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRealista, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnInvestigador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 163, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnEmprendedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnArtístico, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(147, 147, 147))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnEmprendedor)
                        .addGap(28, 28, 28)
                        .addComponent(jButton5)
                        .addGap(33, 33, 33)
                        .addComponent(btnArtístico))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(35, 35, 35)
                        .addComponent(jButton1)
                        .addGap(28, 28, 28)
                        .addComponent(btnRealista)
                        .addGap(33, 33, 33)
                        .addComponent(btnInvestigador)))
                .addContainerGap(94, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
private void darPrivilegiosSegunNivel(Usuario usuario)
{
    if(usuario.getNivel()==2)
    {
        menuUsuarios.setVisible(false);
    }else if(usuario.getNivel() ==3)
    {
        menuUsuarios.setVisible(false);
    }
}
    private void btnRealistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRealistaActionPerformed

                this.dispose();
                test=new Test(usuario);
                test.setVisible(true);
    }//GEN-LAST:event_btnRealistaActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed

         this.dispose();
         login=new Login();
         login.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

                this.dispose();
                test=new Test(usuario);
                test.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnInvestigadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInvestigadorActionPerformed

                this.dispose();
                test=new Test(usuario);
                test.setVisible(true);
    }//GEN-LAST:event_btnInvestigadorActionPerformed

    private void btnEmprendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmprendedorActionPerformed

                this.dispose();
                test=new Test(usuario);
                test.setVisible(true);
    }//GEN-LAST:event_btnEmprendedorActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
                this.dispose();
                test=new Test(usuario);
                test.setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void btnArtísticoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnArtísticoActionPerformed

                this.dispose();
                test=new Test(usuario);
                test.setVisible(true);
    }//GEN-LAST:event_btnArtísticoActionPerformed

    private void itemResultadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemResultadosActionPerformed
        this.dispose();
        resultado=new Resultado(usuario);
        resultado.setVisible(true);
    }//GEN-LAST:event_itemResultadosActionPerformed

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
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnArtístico;
    private javax.swing.JButton btnEmprendedor;
    private javax.swing.JButton btnInvestigador;
    private javax.swing.JButton btnRealista;
    private javax.swing.JMenuItem itemAdministrarUsuarios;
    private javax.swing.JMenuItem itemEditarPerfil;
    private javax.swing.JMenuItem itemResultados;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenu menuAyuda;
    private javax.swing.JMenu menuPerfil;
    private javax.swing.JMenu menuResultados;
    private javax.swing.JMenu menuSalir;
    private javax.swing.JMenu menuUsuarios;
    // End of variables declaration//GEN-END:variables
}
