/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.MemberController;
import entity.Members;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.util.List;
import javax.swing.JComponent;
import javax.swing.KeyStroke;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Reshan Pubudu
 */
public class ViewMembers extends javax.swing.JFrame {

    MemberController memberController;

    /**
     * Creates new form ViewData
     */
    public ViewMembers() {
        initComponents();
        this.setTitle("SAC-Old Boy Association");
        memberController = new MemberController();
        viewMembers();
        
        regNoTxt.setText("Ctrl+R");
        regNoTxt.setForeground(Color.lightGray);
        nameTxt.setText("Ctrl+N");
        nameTxt.setForeground(Color.lightGray);
        addtessTxt.setText("Ctrl+D");
        addtessTxt.setForeground(Color.lightGray);
        

        this.getRootPane().registerKeyboardAction((e) -> {
            if (regNoTxt.getText()=="Ctrl+R") {
//                regNoTxt.setText("");
//                regNoTxt.requestFocus();
//                regNoTxt.setForeground(Color.black);
//                nameTxt.setText("Crtl+N");
//                nameTxt.setForeground(Color.lightGray);
//                addtessTxt.setText("Ctrl+D");
//                addtessTxt.setForeground(Color.lightGray);
//                serchTxt.setText("Crtl+S");
//                serchTxt.setForeground(Color.lightGray);
            }

//                    regNoTxt.requestFocus();
//                nameTxt.setText("");
////                nameTxt.setForeground(Color.lightGray);
//                addtessTxt.setText("");
////                addtessTxt.setForeground(Color.lightGray);
//                serchTxt.setText("");
////                serchTxt.setForeground(Color.lightGray);

        }, KeyStroke.getKeyStroke(KeyEvent.VK_R, KeyEvent.CTRL_MASK), JComponent.WHEN_IN_FOCUSED_WINDOW);
        this.getRootPane().registerKeyboardAction((e) -> {
//            if (nameTxt.equals("Ctrl+N")) {
//                nameTxt.removeAll();
//            } else if (!nameTxt.getText().isEmpty()) {
//                nameTxt.selectAll();
//            } else {
//                nameTxt.requestFocus();
//                regNoTxt.setText("Ctrl+R");
//                regNoTxt.setForeground(Color.lightGray);
//                addtessTxt.setText("Ctrl+D");
//                addtessTxt.setForeground(Color.lightGray);
//                serchTxt.setText("Ctrl+S");
//                serchTxt.setForeground(Color.lightGray);
//            }


                nameTxt.requestFocus();
                regNoTxt.setText("");
//                regNoTxt.setForeground(Color.lightGray);
                addtessTxt.setText("");
//                addtessTxt.setForeground(Color.lightGray);
                serchTxt.setText("");
//                serchTxt.setForeground(Color.lightGray);
            
            
        }, KeyStroke.getKeyStroke(KeyEvent.VK_N, KeyEvent.CTRL_MASK), JComponent.WHEN_IN_FOCUSED_WINDOW);
        this.getRootPane().registerKeyboardAction((e) -> {
//            if (addtessTxt.equals("Ctrl+D")) {
//                addtessTxt.removeAll();
//            } else if (!addtessTxt.getText().isEmpty()) {
//                addtessTxt.selectAll();
//            } else {
//                addtessTxt.requestFocus();
//                regNoTxt.setText("Ctrl+R");
//                regNoTxt.setForeground(Color.lightGray);
//                nameTxt.setText("Ctrl+N");
//                nameTxt.setForeground(Color.lightGray);
//                serchTxt.setText("Ctrl+S");
//                serchTxt.setForeground(Color.lightGray);
//            }


                addtessTxt.requestFocus();
                regNoTxt.setText("");
//                regNoTxt.setForeground(Color.lightGray);
                nameTxt.setText("");
//                nameTxt.setForeground(Color.lightGray);
                serchTxt.setText("");
//                serchTxt.setForeground(Color.lightGray);

        }, KeyStroke.getKeyStroke(KeyEvent.VK_D, KeyEvent.CTRL_MASK), JComponent.WHEN_IN_FOCUSED_WINDOW);
        this.getRootPane().registerKeyboardAction((e) -> {
//            if (serchTxt.equals("Ctrl+S")) {
//                serchTxt.removeAll(); serchTxt.requestFocus();
//            } else if (!serchTxt.getText().isEmpty()) {
//                serchTxt.selectAll();
//            } else {
//                serchTxt.requestFocus();
//                regNoTxt.setText("Ctrl+R");
//                regNoTxt.setForeground(Color.lightGray);
//                nameTxt.setText("Ctrl+N");
//                nameTxt.setForeground(Color.lightGray);
//                addtessTxt.setText("Ctrl+D");
//                addtessTxt.setForeground(Color.lightGray);
//            }
            
            
                serchTxt.requestFocus();
                regNoTxt.setText("");
//                regNoTxt.setForeground(Color.lightGray);
                nameTxt.setText("");
//                nameTxt.setForeground(Color.lightGray);
                addtessTxt.setText("");
//                addtessTxt.setForeground(Color.lightGray);
        }, KeyStroke.getKeyStroke(KeyEvent.VK_S, KeyEvent.CTRL_MASK), JComponent.WHEN_IN_FOCUSED_WINDOW);
        this.getRootPane().registerKeyboardAction((e) -> {
            serchTxt.setText("");
            regNoTxt.setText("");
            nameTxt.setText("");
            
            viewMembers();
        
        }, KeyStroke.getKeyStroke(KeyEvent.VK_L, KeyEvent.CTRL_MASK), JComponent.WHEN_IN_FOCUSED_WINDOW);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        memberTbl = new javax.swing.JTable();
        homeBtn = new javax.swing.JButton();
        serchTxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        refreshBtn = new javax.swing.JButton();
        homeBtn1 = new javax.swing.JButton();
        regNoTxt = new javax.swing.JTextField();
        nameTxt = new javax.swing.JTextField();
        addtessTxt = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Old Boy Association-Members");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1356, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
        );

        memberTbl.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        memberTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Reg.No", "Name", "No.", "Area", "City"
            }
        ));
        jScrollPane1.setViewportView(memberTbl);
        if (memberTbl.getColumnModel().getColumnCount() > 0) {
            memberTbl.getColumnModel().getColumn(0).setMinWidth(120);
            memberTbl.getColumnModel().getColumn(0).setMaxWidth(120);
            memberTbl.getColumnModel().getColumn(2).setMinWidth(200);
            memberTbl.getColumnModel().getColumn(2).setMaxWidth(200);
        }

        homeBtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        homeBtn.setText("Home");
        homeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeBtnActionPerformed(evt);
            }
        });

        serchTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                serchTxtKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                serchTxtKeyTyped(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/linea_23(0)_32.png"))); // NOI18N

        refreshBtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        refreshBtn.setText("Refresh");
        refreshBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshBtnActionPerformed(evt);
            }
        });

        homeBtn1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        homeBtn1.setText("Add New Member");
        homeBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeBtn1ActionPerformed(evt);
            }
        });

        regNoTxt.setToolTipText("");
        regNoTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                regNoTxtKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                regNoTxtKeyTyped(evt);
            }
        });

        nameTxt.setToolTipText("");
        nameTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                nameTxtKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nameTxtKeyTyped(evt);
            }
        });

        addtessTxt.setToolTipText("");
        addtessTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                addtessTxtKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                addtessTxtKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addComponent(regNoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(addtessTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addComponent(homeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(homeBtn1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(refreshBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 1276, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(serchTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(serchTxt))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(regNoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addtessTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 463, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(homeBtn)
                    .addComponent(refreshBtn)
                    .addComponent(homeBtn1))
                .addGap(46, 46, 46))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void homeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeBtnActionPerformed
        Main main = new Main();
        main.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_homeBtnActionPerformed

    private void serchTxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_serchTxtKeyReleased
        List<Members> memberses = memberController.anySearch(serchTxt.getText());
        DefaultTableModel dtm = (DefaultTableModel) memberTbl.getModel();
        dtm.setRowCount(0);
        for (Members memberse : memberses) {
            Object o[] = {memberse.getRegNo(), memberse.getName(), memberse.getNo(), memberse.getArea(), memberse.getCity()};
            dtm.addRow(o);
        }
    }//GEN-LAST:event_serchTxtKeyReleased

    private void serchTxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_serchTxtKeyTyped
//        regNoTxt.setText("Ctrl+R");
//        nameTxt.setText("Ctrl+N");
//        addtessTxt.setText("Ctrl+D");
        regNoTxt.setText("");
        nameTxt.setText("");
        addtessTxt.setText("");
    }//GEN-LAST:event_serchTxtKeyTyped

    private void refreshBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshBtnActionPerformed
        viewMembers();
        serchTxt.setText("Ctrl+S");
        regNoTxt.setText("Ctrl+R");
        nameTxt.setText("Ctrl+N");
        addtessTxt.setText("Ctrl+D");
    }//GEN-LAST:event_refreshBtnActionPerformed

    private void homeBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeBtn1ActionPerformed
        AddMembers addMembers = new AddMembers();
        addMembers.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_homeBtn1ActionPerformed

    private void regNoTxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_regNoTxtKeyReleased
        serchMember("regNo", regNoTxt.getText());
    }//GEN-LAST:event_regNoTxtKeyReleased

    private void nameTxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nameTxtKeyReleased
        serchMember("name", nameTxt.getText());
    }//GEN-LAST:event_nameTxtKeyReleased

    private void addtessTxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_addtessTxtKeyReleased
        serchByAddress(addtessTxt.getText());
    }//GEN-LAST:event_addtessTxtKeyReleased

    private void regNoTxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_regNoTxtKeyTyped
        nameTxt.setText("");
        addtessTxt.setText("");
        serchTxt.setText("");
    }//GEN-LAST:event_regNoTxtKeyTyped

    private void nameTxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nameTxtKeyTyped
        regNoTxt.setText("");
        addtessTxt.setText("");
        serchTxt.setText("");
    }//GEN-LAST:event_nameTxtKeyTyped

    private void addtessTxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_addtessTxtKeyTyped
        regNoTxt.setText("");
        nameTxt.setText("");
        serchTxt.setText("");
    }//GEN-LAST:event_addtessTxtKeyTyped

    private void viewMembers() {

        List<Members> memberses = memberController.viewAll();
        DefaultTableModel dtm = (DefaultTableModel) memberTbl.getModel();
        dtm.setRowCount(0);
        for (Members memberse : memberses) {
            Object o[] = {memberse.getRegNo(), memberse.getName(), memberse.getNo(), memberse.getArea(), memberse.getCity()};
            dtm.addRow(o);
//            if(memberse.getId().equals("10")){
//            memberTbl.setForeground(Color.red);
//            memberTbl.setBackground(Color.black);}
        }
        regNoTxt.setText("Ctrl+R"); regNoTxt.setForeground(Color.lightGray);
        nameTxt.setText("Ctrl+N"); nameTxt.setForeground(Color.lightGray);
        addtessTxt.setText("Ctrl+D"); addtessTxt.setForeground(Color.lightGray);

    }

    private void serchMember(String where, String regId) {
        if(regId != "Ctrl+R"||regId != "Ctrl+N"||regId != "Ctrl+D"||regId != "Ctrl+S"){
        List<Members> memberses = memberController.uniSearch(where, regId);
        DefaultTableModel dtm = (DefaultTableModel) memberTbl.getModel();
        dtm.setRowCount(0);
        for (Members memberse : memberses) {
            Object o[] = {memberse.getRegNo(), memberse.getName(), memberse.getNo(), memberse.getArea(), memberse.getCity()};
            dtm.addRow(o);
        }
        }
    }

    private void serchByAddress(String address) {
        if(address != "Ctrl+R"||address != "Ctrl+N"||address != "Ctrl+D"||address != "Ctrl+S"){
        List<Members> memberses = memberController.addressSerch(address);
        DefaultTableModel dtm = (DefaultTableModel) memberTbl.getModel();
        dtm.setRowCount(0);
        for (Members memberse : memberses) {
            Object o[] = {memberse.getRegNo(), memberse.getName(), memberse.getNo(), memberse.getArea(), memberse.getCity()};
            dtm.addRow(o);
        }
        }
    }

        private void ff(){
            regNoTxt.removeAll();
        }
    
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
            java.util.logging.Logger.getLogger(ViewMembers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewMembers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewMembers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewMembers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewMembers().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addtessTxt;
    private javax.swing.JButton homeBtn;
    private javax.swing.JButton homeBtn1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable memberTbl;
    private javax.swing.JTextField nameTxt;
    private javax.swing.JButton refreshBtn;
    private javax.swing.JTextField regNoTxt;
    private javax.swing.JTextField serchTxt;
    // End of variables declaration//GEN-END:variables
}
