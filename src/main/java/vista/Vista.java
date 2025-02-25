
package vista;

import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreeNode;
import javax.swing.tree.TreeSelectionModel;
import modelo.Archivo;
import modelo.Carpeta;

import java.util.Objects;

/**
 *
 * @author vero s
 */
public class Vista extends javax.swing.JFrame {

    /**
     * Creates new form Vista
     */
    private String archivoNombre="";
    private boolean archivoTieneHijos = false;
    private String padre="";
    private String rutaCompleta = "";
    private int path=0;
    public Vista() {
        initComponents();
        jTreeLista.setSelectionRow(1);
    }

    public void setArchivo(String nombre, boolean tieneHijos) {
        this.archivoNombre = nombre;
        this.archivoTieneHijos = tieneHijos;
    }

    public String getRutaCompleta() {
        return rutaCompleta;
    }

    public int getPath() {
        return path;
    }

    public boolean hasSelection() {
        TreeSelectionModel smd=jTreeLista.getSelectionModel();
        return smd.getSelectionCount() > 0;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botones = new javax.swing.ButtonGroup();
        jScrollPaneContenedor = new javax.swing.JScrollPane();
        jTreeLista = new javax.swing.JTree();
        jTextNombre = new javax.swing.JTextField();
        jButtonAgregar = new javax.swing.JButton();
        jButtonEliminar = new javax.swing.JButton();
        jLabelNombre = new javax.swing.JLabel();
        jRadioButtonPDF = new javax.swing.JRadioButton();
        jRadioButtonXlS = new javax.swing.JRadioButton();
        jRadioButtonDoc = new javax.swing.JRadioButton();
        jRadioButtonSubc = new javax.swing.JRadioButton();
        jButtoned = new javax.swing.JButton();
        jLabelTam = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("root");
        jTreeLista.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        jTreeLista.setSelectionRows(new int[] {0});
        jTreeLista.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTreeListaMouseClicked(evt);
            }
        });
        jScrollPaneContenedor.setViewportView(jTreeLista);

        jTextNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextNombreActionPerformed(evt);
            }
        });

        jButtonAgregar.setForeground(new java.awt.Color(0, 153, 153));
        jButtonAgregar.setText("Agregar");
        jButtonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAgregarActionPerformed(evt);
            }
        });

        jButtonEliminar.setText("Eliminar");
        jButtonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarActionPerformed(evt);
            }
        });

        jLabelNombre.setText("Nombre");

        botones.add(jRadioButtonPDF);
        jRadioButtonPDF.setText("PDF");

        botones.add(jRadioButtonXlS);
        jRadioButtonXlS.setText("XLSX");

        botones.add(jRadioButtonDoc);
        jRadioButtonDoc.setSelected(true);
        jRadioButtonDoc.setText("DOCX");

        botones.add(jRadioButtonSubc);
        jRadioButtonSubc.setText("SUBCARPETA");

        jButtoned.setText("TAMANIO DIRECTORIO");
        jButtoned.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonedActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel1.setText("Directorio / Archivo Actual");

        jLabel2.setText("...............");

        jLabel3.setText("................");

        jLabel4.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel4.setText("Tamanio del Directorio Principal");

        jLabel5.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel5.setText("TRABAJO DIRECTORIO");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPaneContenedor, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jRadioButtonPDF)
                                    .addComponent(jRadioButtonXlS)
                                    .addComponent(jRadioButtonDoc)
                                    .addComponent(jRadioButtonSubc)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabelTam, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel1))
                                    .addGap(237, 237, 237))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabelNombre)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTextNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButtonAgregar)))
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jButtonEliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtoned)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jRadioButtonPDF)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonXlS)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonDoc)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioButtonSubc)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelNombre)
                            .addComponent(jTextNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonAgregar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelTam)
                        .addGap(22, 22, 22)
                        .addComponent(jLabel1)
                        .addGap(1, 1, 1)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addGap(101, 101, 101))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPaneContenedor, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonEliminar)
                            .addComponent(jButtoned))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAgregarActionPerformed
        // TODO add your handling code here:
        TreeSelectionModel smd=jTreeLista.getSelectionModel();
        if (smd.getSelectionCount()>0){
            DefaultMutableTreeNode selectedNode= (DefaultMutableTreeNode) jTreeLista.getSelectionPath().getLastPathComponent();
            if (!selectedNode.getAllowsChildren()) {
                return;
            }
            DefaultMutableTreeNode newNode=new DefaultMutableTreeNode(archivoNombre, archivoTieneHijos);
            selectedNode.add(newNode);
            DefaultTreeModel model=(DefaultTreeModel)jTreeLista.getModel();
            model.reload();
        }
        
    }//GEN-LAST:event_jButtonAgregarActionPerformed

    private void jTreeListaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTreeListaMouseClicked
        // TODO add your handling code here:
        var lastRutaCompleta = rutaCompleta;
        TreeSelectionModel smd=jTreeLista.getSelectionModel();
        if(smd.getSelectionCount()>0){
            DefaultMutableTreeNode selectedNode= (DefaultMutableTreeNode) jTreeLista.getSelectionPath().getLastPathComponent();
       
        jLabel2.setText(selectedNode.getUserObject().toString());
        rutaCompleta="";
            TreeNode[] ruta=selectedNode.getPath();
            for (int i = 0; i < ruta.length; i++) {
            if (i > 0) {
                rutaCompleta += "/";
            }
            rutaCompleta += ruta[i].toString(); // O puedes usar otro método para obtener el nombre del nodo
            }

       System.out.println("Ruta completa del nodo: " + rutaCompleta);
       path=selectedNode.getPath().length;
        if(selectedNode!=jTreeLista.getModel().getRoot())
        {
            
            padre=selectedNode.getParent().toString();
        }
        
        
        System.out.println(selectedNode.getPath().length);
       
        }

        if (!Objects.equals(lastRutaCompleta, rutaCompleta)) {
            jLabel3.setText("");
        }
      
    }//GEN-LAST:event_jTreeListaMouseClicked

    private void jButtonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarActionPerformed
        // TODO add your handling code here:
        if (!hasSelection()) { return; }
        DefaultMutableTreeNode selectedNode= (DefaultMutableTreeNode) jTreeLista.getSelectionPath().getLastPathComponent();
        DefaultTreeModel model=(DefaultTreeModel)jTreeLista.getModel();
        if(selectedNode!=jTreeLista.getModel().getRoot())
        {
            model.removeNodeFromParent(selectedNode);
            model.reload();
        }
        jTreeLista.updateUI();

    }//GEN-LAST:event_jButtonEliminarActionPerformed

    private void jTextNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextNombreActionPerformed

    private void jButtonedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonedActionPerformed
      
    }//GEN-LAST:event_jButtonedActionPerformed

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
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vista().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.ButtonGroup botones;
    public javax.swing.JButton jButtonAgregar;
    public javax.swing.JButton jButtonEliminar;
    public javax.swing.JButton jButtoned;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    public javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    public javax.swing.JLabel jLabelNombre;
    public javax.swing.JLabel jLabelTam;
    public javax.swing.JRadioButton jRadioButtonDoc;
    public javax.swing.JRadioButton jRadioButtonPDF;
    public javax.swing.JRadioButton jRadioButtonSubc;
    public javax.swing.JRadioButton jRadioButtonXlS;
    public javax.swing.JScrollPane jScrollPaneContenedor;
    public javax.swing.JTextField jTextNombre;
    private javax.swing.JTree jTreeLista;
    // End of variables declaration//GEN-END:variables
}
