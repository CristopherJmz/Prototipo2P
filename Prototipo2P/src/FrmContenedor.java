/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author CRISTOPHER
 */
public class FrmContenedor extends javax.swing.JFrame {

    /**
     * Creates new form DMI
     */
    public FrmContenedor() {
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

        DP_Workbench = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu9 = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();
        Marca = new javax.swing.JMenuItem();
        linea = new javax.swing.JMenuItem();
        bodega = new javax.swing.JMenuItem();
        proveedores = new javax.swing.JMenuItem();
        vendedores = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout DP_WorkbenchLayout = new javax.swing.GroupLayout(DP_Workbench);
        DP_Workbench.setLayout(DP_WorkbenchLayout);
        DP_WorkbenchLayout.setHorizontalGroup(
            DP_WorkbenchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 708, Short.MAX_VALUE)
        );
        DP_WorkbenchLayout.setVerticalGroup(
            DP_WorkbenchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 487, Short.MAX_VALUE)
        );

        jMenu9.setText("Archivo");
        jMenuBar1.add(jMenu9);

        jMenu1.setText("Catalogos");

        Marca.setText("Marcas");
        Marca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MarcaActionPerformed(evt);
            }
        });
        jMenu1.add(Marca);

        linea.setText("Lineas");
        linea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lineaActionPerformed(evt);
            }
        });
        jMenu1.add(linea);

        bodega.setText("Bodega");
        bodega.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bodegaActionPerformed(evt);
            }
        });
        jMenu1.add(bodega);

        proveedores.setText("Proveedores");
        proveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proveedoresActionPerformed(evt);
            }
        });
        jMenu1.add(proveedores);

        vendedores.setText("Vendedores");
        vendedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vendedoresActionPerformed(evt);
            }
        });
        jMenu1.add(vendedores);

        jMenuBar1.add(jMenu1);

        jMenu3.setText("Procesos");
        jMenuBar1.add(jMenu3);

        jMenu4.setText("Informes");
        jMenuBar1.add(jMenu4);

        jMenu5.setText("Herramientas");
        jMenuBar1.add(jMenu5);

        jMenu6.setText("Ayuda");
        jMenuBar1.add(jMenu6);

        jMenu2.setText("Salir");

        jMenuItem1.setText("salir");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(DP_Workbench, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DP_Workbench)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
//salir del sistema :)
      System.exit(0);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void MarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MarcaActionPerformed
        // TODO add your handling code here:
         FrmMarcas frmM = new FrmMarcas();
        frmM.setVisible(true);
        DP_Workbench.add(frmM);
    }//GEN-LAST:event_MarcaActionPerformed

    private void bodegaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bodegaActionPerformed
        // TODO add your handling code here:
         FrmBodega frmb = new FrmBodega();
        frmb.setVisible(true);
        DP_Workbench.add(frmb);
    }//GEN-LAST:event_bodegaActionPerformed

    private void lineaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lineaActionPerformed
        // TODO add your handling code here:
         FrmLineas frml = new FrmLineas();
        frml.setVisible(true);
        DP_Workbench.add(frml);
    }//GEN-LAST:event_lineaActionPerformed

    private void proveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proveedoresActionPerformed
        // TODO add your handling code here:
         FrmProveedore frmp = new FrmProveedore();
        frmp.setVisible(true);
        DP_Workbench.add(frmp);
    }//GEN-LAST:event_proveedoresActionPerformed

    private void vendedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vendedoresActionPerformed
        // TODO add your handling code here:
         FrmVendedores frmv = new FrmVendedores();
        frmv.setVisible(true);
        DP_Workbench.add(frmv);
    }//GEN-LAST:event_vendedoresActionPerformed

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
            java.util.logging.Logger.getLogger(FrmContenedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmContenedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmContenedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmContenedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmContenedor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane DP_Workbench;
    private javax.swing.JMenuItem Marca;
    private javax.swing.JMenuItem bodega;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem linea;
    private javax.swing.JMenuItem proveedores;
    private javax.swing.JMenuItem vendedores;
    // End of variables declaration//GEN-END:variables
}
