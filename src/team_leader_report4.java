
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.MessageFormat;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import project.InsertUpdateDelete;
import project.Select;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ahmadullah
 */
public class team_leader_report4 extends javax.swing.JFrame {
public void Referesh() {  
    jTextField1.setText("");  
  //  jTextField2.setText("");  
   // jTextField3.setText("");  
}
    /**
     * Creates new form team_leader_report4
     */
    public team_leader_report4() {
        initComponents();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTextField01 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jLabel25 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTextArea07 = new javax.swing.JTextArea();
        jLabel26 = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTextArea08 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel27 = new javax.swing.JLabel();
        jTextField05 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton9 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/close.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1291, 38, 40, 30));

        jLabel2.setFont(new java.awt.Font("Traditional Arabic", 1, 18)); // NOI18N
        jLabel2.setText("نام سر تیم  ");
        jLabel2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 0, 0, new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 110, 60, 30));

        jTextField01.setFont(new java.awt.Font("Traditional Arabic", 1, 16)); // NOI18N
        getContentPane().add(jTextField01, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 110, 100, 30));

        jButton4.setFont(new java.awt.Font("Traditional Arabic", 1, 14)); // NOI18N
        jButton4.setText("Search");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 110, 80, 30));

        jLabel25.setFont(new java.awt.Font("Traditional Arabic", 1, 18)); // NOI18N
        jLabel25.setText("بخش صدقات  ");
        jLabel25.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 0, 0, new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 230, 80, 30));

        jTextArea07.setColumns(20);
        jTextArea07.setFont(new java.awt.Font("Traditional Arabic", 1, 16)); // NOI18N
        jTextArea07.setRows(5);
        jScrollPane7.setViewportView(jTextArea07);

        getContentPane().add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 190, 340, 90));

        jLabel26.setFont(new java.awt.Font("Traditional Arabic", 1, 18)); // NOI18N
        jLabel26.setText("پلان سرتیم   ");
        jLabel26.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 0, 0, new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 350, 70, 30));

        jTextArea08.setColumns(20);
        jTextArea08.setFont(new java.awt.Font("Traditional Arabic", 1, 16)); // NOI18N
        jTextArea08.setRows(5);
        jScrollPane8.setViewportView(jTextArea08);

        getContentPane().add(jScrollPane8, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 320, 340, 90));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "نام سرتیم", "صدقات", "پلان سرتیم"
            }
        ));
        jTable1.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jTable1ComponentShown(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-2, 510, 1370, 260));

        jLabel27.setFont(new java.awt.Font("Traditional Arabic", 1, 18)); // NOI18N
        jLabel27.setText("بدیل - سر تیم  ");
        jLabel27.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 0, 0, new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 110, 90, 30));

        jTextField05.setFont(new java.awt.Font("Traditional Arabic", 1, 16)); // NOI18N
        getContentPane().add(jTextField05, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 110, 160, 30));

        jButton1.setFont(new java.awt.Font("Traditional Arabic", 1, 24)); // NOI18N
        jButton1.setText("ذخیره");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 350, 70, 30));

        jButton6.setFont(new java.awt.Font("Traditional Arabic", 1, 18)); // NOI18N
        jButton6.setText("بازگشت");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 470, 80, 30));

        jButton8.setFont(new java.awt.Font("Traditional Arabic", 1, 14)); // NOI18N
        jButton8.setText("Print");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 350, 70, 30));

        jButton7.setFont(new java.awt.Font("Traditional Arabic", 1, 18)); // NOI18N
        jButton7.setText("حذف");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 460, -1, 30));

        jTextField1.setFont(new java.awt.Font("Traditional Arabic", 1, 18)); // NOI18N
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 463, 94, 30));

        jLabel1.setFont(new java.awt.Font("Traditional Arabic", 1, 14)); // NOI18N
        jLabel1.setText("ID ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 463, -1, 30));

        jButton9.setFont(new java.awt.Font("Traditional Arabic", 1, 18)); // NOI18N
        jButton9.setText("ایجاد تغییر");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 460, -1, 30));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/report1234.jpg"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        int check=0;
        String team_leader_name=jTextField01.getText();
        if(team_leader_name.equals(""))
        {
            check=1;
            JOptionPane.showMessageDialog(null,"team_leader_name Field Is Required");
        }

        else
        {
            ResultSet rs=Select.getData("select *from team_leader_registration where team_leader_name='"+team_leader_name+"'");
            try
            {
                if(rs.next())
                {
                    check=1;
                    
                    jTextField05.setText(rs.getString(6));
                    
                    jTextField05.setEditable(false);
                    

                }
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, e);
            }
        }
        if(check==0)
        JOptionPane.showMessageDialog(null,"Incorrect team_leader_name!");

    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTable1ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jTable1ComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable1ComponentShown

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int id=0;
        String team_leader_name=jTextField01.getText();
        
        String team_leader_sadaqat=jTextArea07.getText();
        String team_leader_plans=jTextArea08.getText();

        String Query="select id from team_leader_report4";
        try
        {
            ResultSet rs=Select.getData(Query);

            while(rs.next())
            id=rs.getInt(1);
            id=id+1;
            if(team_leader_name.equals("") || team_leader_sadaqat.equals("") || team_leader_plans.equals(""))
            JOptionPane.showMessageDialog(null,"Every field is Required");

            else
            {

              Query="insert into team_leader_report4 values('"+id+"','"+team_leader_name+"','"+team_leader_sadaqat+"','"+team_leader_plans+"')";
                

                InsertUpdateDelete.setData(Query,"Registered Successfully");
                setVisible(false);
                new team_leader_report4().setVisible(true);
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
        ResultSet rs=Select.getData("select *from team_leader_report4");
        DefaultTableModel model=(DefaultTableModel)jTable1.getModel();
        try
        {
            while(rs.next())
            {
                
            model.addRow(new Object[]{rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4)});
            
            }
            rs.close();
        }
        
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_formComponentShown

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new team_leader_report3().setVisible(true);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        MessageFormat header= new MessageFormat("I am header");
        MessageFormat footer= new MessageFormat("page(0, number, integer)");

        try
        {
            jTable1.print(JTable.PrintMode.NORMAL, header,footer);
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }

    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        try {
            Class.forName("com.mysql.jdbc.Driver");
            // establish connection
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/dawat", "root", "123456");
            Statement statement = con.createStatement();
            statement.executeUpdate("DELETE FROM team_leader_report4 WHERE id=" + jTextField1.getText() + "");
            JOptionPane.showMessageDialog(null, "Record deleted...");
            statement.close();
            con.close();
            Referesh(); //Calling Referesh() method
            setVisible(false);
            new team_leader_report4().setVisible(true);
        } catch (SQLException | ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        try {
            Class.forName("com.mysql.jdbc.Driver");
            // establish connection
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/dawat", "root", "123456");
            Statement stmt = con.createStatement();
            stmt.execute("UPDATE team_leader_report4 SET team_leader_sadaqat='" +jTextArea07.getText()+ "',team_leader_plans='" +jTextArea08.getText()+ "' WHERE id='" + jTextField1.getText() + "'");
            JOptionPane.showMessageDialog(null, "Record is updated...");
            stmt.close();
            con.close();
            Referesh(); //Calling Referesh() method
            setVisible(false);
            new team_leader_report4().setVisible(true);
        } catch (SQLException | ClassNotFoundException se) {
            JOptionPane.showMessageDialog(null, se);
        }
    }//GEN-LAST:event_jButton9ActionPerformed

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
            java.util.logging.Logger.getLogger(team_leader_report4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(team_leader_report4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(team_leader_report4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(team_leader_report4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new team_leader_report4().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea07;
    private javax.swing.JTextArea jTextArea08;
    private javax.swing.JTextField jTextField01;
    private javax.swing.JTextField jTextField05;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
