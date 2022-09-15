/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;
//import com.sun.tools.javac.util.Convert;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import control.PenDriveController;
import model.PenDrive;
/**
 *
 * @author aluno
 */
public class FrmPenDrive extends javax.swing.JFrame {
    protected PenDriveController pdControle;
    /**
     * Creates new form FrmPenDrive
     */
    public FrmPenDrive() {
        pdControle = new PenDriveController();
        initComponents();
        try {
            atualizaGrid();
        } catch (SQLException ex) {
            Logger.getLogger(FrmPenDrive.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.

* regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bngOpcao = new javax.swing.ButtonGroup();
        txtArmazenamento = new javax.swing.JTextField();
        txtMarca = new javax.swing.JTextField();
        txtPreco = new javax.swing.JTextField();
        txtGarantia = new javax.swing.JTextField();
        lblArmazenamento = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblPreco = new javax.swing.JLabel();
        lblGarantia = new javax.swing.JLabel();
        lblCodigo = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        lblMarca = new javax.swing.JLabel();
        btnCadastrar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAcessoSQL = new javax.swing.JTable();
        txtAcao = new javax.swing.JTextField();
        rdArmazenamento = new javax.swing.JRadioButton();
        rdMarca = new javax.swing.JRadioButton();
        rdCodigo = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtArmazenamento.setName("txtArmazenamento"); // NOI18N

        txtMarca.setName("txtMarca"); // NOI18N

        txtPreco.setName("txtPreco"); // NOI18N

        txtGarantia.setName("txtGarantia"); // NOI18N

        lblArmazenamento.setText("Armazenamento");
        lblArmazenamento.setName("lblArmazenamento"); // NOI18N

        lblPreco.setText("Preco");
        lblPreco.setName("lblPreco"); // NOI18N

        lblGarantia.setText("Garantia");
        lblGarantia.setName("lblGarantia"); // NOI18N

        lblCodigo.setText("Codigo");
        lblCodigo.setName("lblCodigo"); // NOI18N

        txtCodigo.setName("txtCodigo"); // NOI18N

        lblMarca.setText("Marca");
        lblMarca.setName("lblMarca"); // NOI18N

        btnCadastrar.setText("Cadastrar");
        btnCadastrar.setName("btnCadastrar"); // NOI18N
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        btnBuscar.setText("Buscar");
        btnBuscar.setName("btnBuscar"); // NOI18N
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnExcluir.setText("Excluir");
        btnExcluir.setName("btnExcluir"); // NOI18N
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        tblAcessoSQL.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Armazenamento", "Marca", "Preco", "Garantia", "Codigo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Double.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblAcessoSQL);

        txtAcao.setName("txtAcao"); // NOI18N
        txtAcao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAcaoActionPerformed(evt);
            }
        });

        bngOpcao.add(rdArmazenamento);
        rdArmazenamento.setText("Armazenamento");
        rdArmazenamento.setName("rdArmazenamento"); // NOI18N

        bngOpcao.add(rdMarca);
        rdMarca.setText("Marca");
        rdMarca.setName("rdMarca"); // NOI18N

        bngOpcao.add(rdCodigo);
        rdCodigo.setSelected(true);
        rdCodigo.setText("Codigo");
        rdCodigo.setName("rdCodigo"); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtAcao, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnBuscar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                        .addComponent(btnExcluir))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblCodigo)
                                    .addComponent(lblArmazenamento)
                                    .addComponent(jLabel2)
                                    .addComponent(lblPreco)
                                    .addComponent(lblGarantia)
                                    .addComponent(lblMarca))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtArmazenamento, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                                    .addComponent(txtMarca)
                                    .addComponent(txtPreco)
                                    .addComponent(txtGarantia)
                                    .addComponent(txtCodigo)))
                            .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rdArmazenamento)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rdMarca)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rdCodigo)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(277, 277, 277))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtArmazenamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblArmazenamento))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblMarca))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPreco))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtGarantia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblGarantia))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCodigo)
                            .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btnCadastrar)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtAcao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnExcluir)
                            .addComponent(btnBuscar))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rdArmazenamento)
                            .addComponent(rdMarca)
                            .addComponent(rdCodigo)))
                    .addComponent(jLabel2))
                .addGap(69, 103, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void atualizaGrid() throws SQLException{
        ArrayList<PenDrive> listaPD = pdControle.mostrar("", 4);
        DefaultTableModel dados = new DefaultTableModel ();
        dados.setNumRows(0);
        dados.addColumn("Armazenamento");
        dados.addColumn("Marca");
        dados.addColumn("Preco");
        dados.addColumn("Garantia");
        dados.addColumn("Codigo");
        //percorre Array
        for (PenDrive p: listaPD){
            dados.addRow(new Object[]{p.getArmazenamento(),p.getMarca(), p.getPreco(), p.getGarantia(), p.getCodigo()});
    }
        tblAcessoSQL.setModel(dados);
    }
    
    public void limpaCampos(){
        this.txtArmazenamento.setText("");
        this.txtCodigo.setText("");
        this.txtGarantia.setText("");
        this.txtMarca.setText("");
        this.txtPreco.setText("");
        this.txtAcao.setText("");
        this.txtArmazenamento.requestFocus();
        /*this.rdCodigo.;*/
    }
    
    public int defineBoolean(){
        int tipo = 1;
        if(rdCodigo.isSelected()){
             tipo = 1;
        }else if(rdArmazenamento.isSelected()){
             tipo = 2;
        }else if (rdMarca.isSelected()){
             tipo = 3;
        }
        return tipo;
    }
    
    private void txtAcaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAcaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAcaoActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        int armazenamento = Integer.parseInt(this.txtArmazenamento.getText());
        String marca = this.txtMarca.getText();
        double preco = Double.parseDouble(this.txtPreco.getText());
        int garantia = Integer.parseInt(this.txtGarantia.getText());
        String codigo = this.txtCodigo.getText();
        
        try{
            pdControle.cadastar(armazenamento, marca, preco, garantia, codigo);
            JOptionPane.showMessageDialog(null, "Inserção realizada com sucesso!");
            atualizaGrid();
            limpaCampos();
        }catch (SQLException ex){
            Logger.getLogger(FrmPenDrive.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Falha no cadastro!");
        }
        
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        ArrayList<PenDrive> listaPD;
        int tipo = defineBoolean();
        String desejado = this.txtAcao.getText();
        
        try{
            listaPD = pdControle.mostrar(desejado, tipo);
            DefaultTableModel dados = (DefaultTableModel) tblAcessoSQL.getModel();
            dados.setNumRows(0);
            for(PenDrive p: listaPD){
                dados.addRow(new Object[]{p.getArmazenamento(),p.getMarca(), p.getPreco(), p.getGarantia(), p.getCodigo()});
            }
            JOptionPane.showMessageDialog(null, "Registro encontrado com sucesso!");
        } catch (SQLException ex) {
            Logger.getLogger(FrmPenDrive.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Não foi possivel encontrar este codigo, tente novamente!");
        }
        /*try {
            atualizaGrid();
        } catch (SQLException ex) {
            Logger.getLogger(FrmPenDrive.class.getName()).log(Level.SEVERE, null, ex);
        }*/
            limpaCampos();
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        String desejado = this.txtAcao.getText();
        
        try{
            pdControle.excluir(desejado);
            DefaultTableModel dados = (DefaultTableModel) tblAcessoSQL.getModel();
            dados.setNumRows(0);
            
        } catch (SQLException ex) {
            Logger.getLogger(FrmPenDrive.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Não foi possivel encontrar este codigo, tente novamente!");
        }
        
        try {
            atualizaGrid();
        } catch (SQLException ex) {
            Logger.getLogger(FrmPenDrive.class.getName()).log(Level.SEVERE, null, ex);
        }
        limpaCampos();
    }//GEN-LAST:event_btnExcluirActionPerformed

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
            java.util.logging.Logger.getLogger(FrmPenDrive.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPenDrive.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPenDrive.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPenDrive.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPenDrive().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    protected javax.swing.ButtonGroup bngOpcao;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblArmazenamento;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblGarantia;
    private javax.swing.JLabel lblMarca;
    private javax.swing.JLabel lblPreco;
    protected javax.swing.JRadioButton rdArmazenamento;
    protected javax.swing.JRadioButton rdCodigo;
    protected javax.swing.JRadioButton rdMarca;
    private javax.swing.JTable tblAcessoSQL;
    private javax.swing.JTextField txtAcao;
    private javax.swing.JTextField txtArmazenamento;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtGarantia;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtPreco;
    // End of variables declaration//GEN-END:variables
}
