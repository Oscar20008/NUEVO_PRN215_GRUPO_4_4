/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prn215_grupo_4_4;

import javax.swing.JOptionPane;

/**
 *
 * @author angel
 */
public class frmMenu extends javax.swing.JFrame {

    /**
     * Creates new form frmLogin
     */
    public frmMenu() {
        initComponents();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButton1 = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        lblCerrar = new javax.swing.JLabel();
        lblUsuarios1 = new javax.swing.JLabel();
        lblCategorias = new javax.swing.JLabel();
        lblFacturar = new javax.swing.JLabel();
        lblProductos = new javax.swing.JLabel();
        lblClientes = new javax.swing.JLabel();
        lblEmpleados = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        jRadioButton1.setText("jRadioButton1");

        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocation(new java.awt.Point(100, 100));
        setName("frmLogin"); // NOI18N
        setUndecorated(true);

        jPanel2.setBackground(new java.awt.Color(44, 62, 80));

        jPanel3.setBackground(new java.awt.Color(51, 110, 123));
        jPanel3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N

        lblCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Cerrar.png"))); // NOI18N
        lblCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCerrarMouseClicked(evt);
            }
        });

        lblUsuarios1.setBackground(new java.awt.Color(102, 102, 102));
        lblUsuarios1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblUsuarios1.setForeground(new java.awt.Color(255, 255, 255));
        lblUsuarios1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Usuarios.png"))); // NOI18N
        lblUsuarios1.setText("Usuarios");

        lblCategorias.setBackground(new java.awt.Color(102, 102, 102));
        lblCategorias.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblCategorias.setForeground(new java.awt.Color(255, 255, 255));
        lblCategorias.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Categorias.png"))); // NOI18N
        lblCategorias.setText("Categorias");

        lblFacturar.setBackground(new java.awt.Color(102, 102, 102));
        lblFacturar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblFacturar.setForeground(new java.awt.Color(255, 255, 255));
        lblFacturar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Facturar.png"))); // NOI18N
        lblFacturar.setText("Facturar");

        lblProductos.setBackground(new java.awt.Color(102, 102, 102));
        lblProductos.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblProductos.setForeground(new java.awt.Color(255, 255, 255));
        lblProductos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Productos.png"))); // NOI18N
        lblProductos.setText("Productos");

        lblClientes.setBackground(new java.awt.Color(102, 102, 102));
        lblClientes.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblClientes.setForeground(new java.awt.Color(255, 255, 255));
        lblClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Cliente.png"))); // NOI18N
        lblClientes.setText("Clientes");

        lblEmpleados.setBackground(new java.awt.Color(102, 102, 102));
        lblEmpleados.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblEmpleados.setForeground(new java.awt.Color(255, 255, 255));
        lblEmpleados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Empleados.png"))); // NOI18N
        lblEmpleados.setText("Empleados");
        lblEmpleados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblEmpleadosMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(lblFacturar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblClientes))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblCerrar))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblProductos)
                            .addComponent(lblUsuarios1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblCategorias)
                            .addComponent(lblEmpleados))))
                .addGap(31, 31, 31))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCerrar)
                .addGap(23, 23, 23)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUsuarios1)
                    .addComponent(lblEmpleados))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblProductos)
                    .addComponent(lblCategorias))
                .addGap(11, 11, 11)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFacturar)
                    .addComponent(lblClientes))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Logo.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(180, 180, 180))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(jLabel7)
                .addContainerGap(107, Short.MAX_VALUE))
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 734, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getAccessibleContext().setAccessibleName("frmLogin");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCerrarMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_lblCerrarMouseClicked

    private void lblEmpleadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEmpleadosMouseClicked
        // TODO add your handling code here:
        dispose();
        frmEmpleados empleados = new frmEmpleados();
        empleados.setVisible(true);
    }//GEN-LAST:event_lblEmpleadosMouseClicked

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
            java.util.logging.Logger.getLogger(frmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JLabel lblCategorias;
    private javax.swing.JLabel lblCerrar;
    private javax.swing.JLabel lblClientes;
    private javax.swing.JLabel lblEmpleados;
    private javax.swing.JLabel lblFacturar;
    private javax.swing.JLabel lblProductos;
    private javax.swing.JLabel lblUsuarios1;
    // End of variables declaration//GEN-END:variables
}
