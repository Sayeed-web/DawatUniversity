
import java.sql.ResultSet;
import project.InsertUpdateDelete;
import project.Select;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.MessageFormat;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author Ahmadullah
 */
public class team_leader_report1 extends javax.swing.JFrame {
public void Referesh() {  
    jTextField1.setText("");  
  //  jTextField2.setText("");  
   // jTextField3.setText("");  
}
    /**
     * Creates new form team_leader_report1
     */
    public team_leader_report1() {
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
        jLabel20 = new javax.swing.JLabel();
        jTextField02 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea01 = new javax.swing.JTextArea();
        jLabel18 = new javax.swing.JLabel();
        jTextField03 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jTextField04 = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jTextField05 = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea02 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jButton7 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
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
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1300, 30, 40, 30));

        jLabel2.setFont(new java.awt.Font("Traditional Arabic", 1, 18)); // NOI18N
        jLabel2.setText("نام سر تیم  ");
        jLabel2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 0, 0, new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 40, 60, 30));

        jTextField01.setFont(new java.awt.Font("Traditional Arabic", 1, 16)); // NOI18N
        jTextField01.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(78, 152, 103)));
        getContentPane().add(jTextField01, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 40, 100, 30));

        jButton4.setFont(new java.awt.Font("Traditional Arabic", 1, 16)); // NOI18N
        jButton4.setText("Search");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 40, 100, 30));

        jLabel20.setFont(new java.awt.Font("Traditional Arabic", 1, 18)); // NOI18N
        jLabel20.setText("   تعداد مأمورین  ");
        jLabel20.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 0, 0, new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 40, 90, 30));

        jTextField02.setFont(new java.awt.Font("Traditional Arabic", 1, 16)); // NOI18N
        jTextField02.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(78, 152, 103)));
        jTextField02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField02ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField02, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 40, 100, 30));

        jLabel16.setFont(new java.awt.Font("Traditional Arabic", 1, 18)); // NOI18N
        jLabel16.setText("گزارشات  ");
        jLabel16.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 0, 0, new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(1240, 260, -1, 30));

        jTextArea01.setColumns(20);
        jTextArea01.setFont(new java.awt.Font("Traditional Arabic", 1, 16)); // NOI18N
        jTextArea01.setRows(5);
        jTextArea01.setText("\n");
        jTextArea01.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(78, 152, 103)));
        jScrollPane3.setViewportView(jTextArea01);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 230, 450, 90));

        jLabel18.setFont(new java.awt.Font("Traditional Arabic", 1, 18)); // NOI18N
        jLabel18.setText("روز اداری تعیین شده  ");
        jLabel18.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 0, 0, new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 40, 110, 30));

        jTextField03.setFont(new java.awt.Font("Traditional Arabic", 1, 16)); // NOI18N
        jTextField03.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(78, 152, 103)));
        jTextField03.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField03ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField03, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 40, 100, 30));

        jLabel15.setFont(new java.awt.Font("Traditional Arabic", 1, 18)); // NOI18N
        jLabel15.setText("تایم اداری تعیین شده  ");
        jLabel15.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 0, 0, new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 40, 110, 30));

        jTextField04.setFont(new java.awt.Font("Traditional Arabic", 1, 16)); // NOI18N
        jTextField04.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(78, 152, 103)));
        getContentPane().add(jTextField04, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, 100, 30));

        jLabel27.setFont(new java.awt.Font("Traditional Arabic", 1, 18)); // NOI18N
        jLabel27.setText("بدیل - سر تیم  ");
        jLabel27.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 0, 0, new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(1240, 140, 90, 30));

        jTextField05.setFont(new java.awt.Font("Traditional Arabic", 1, 16)); // NOI18N
        jTextField05.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(78, 152, 103)));
        getContentPane().add(jTextField05, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 140, 160, 30));

        jLabel21.setFont(new java.awt.Font("Traditional Arabic", 1, 18)); // NOI18N
        jLabel21.setText("پلان (بدیل - سر تیم)  ");
        jLabel21.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 0, 0, new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 140, 120, 30));

        jTextArea02.setColumns(20);
        jTextArea02.setFont(new java.awt.Font("Traditional Arabic", 1, 16)); // NOI18N
        jTextArea02.setRows(5);
        jTextArea02.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(78, 152, 103)));
        jScrollPane2.setViewportView(jTextArea02);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 110, 390, 80));

        jButton1.setFont(new java.awt.Font("Traditional Arabic", 1, 18)); // NOI18N
        jButton1.setText("ذخیره");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 360, 90, 30));

        jTable1.setFont(new java.awt.Font("Traditional Arabic", 1, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "نام سرتیم", "تعداد مامورین", "گزارشات", "پلان برای بدیل"
            }
        ));
        jTable1.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jTable1ComponentShown(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setMinWidth(1);
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(1);
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(1);
            jTable1.getColumnModel().getColumn(2).setMinWidth(1);
            jTable1.getColumnModel().getColumn(2).setPreferredWidth(1);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 510, 1370, 260));

        jButton5.setFont(new java.awt.Font("Traditional Arabic", 1, 18)); // NOI18N
        jButton5.setText("مرحله بعدی");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 450, 90, 30));

        jButton6.setFont(new java.awt.Font("Traditional Arabic", 1, 18)); // NOI18N
        jButton6.setText("حذف");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 450, 70, 30));

        jTextField1.setFont(new java.awt.Font("Traditional Arabic", 1, 18)); // NOI18N
        jTextField1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(78, 152, 103)));
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 450, 94, 33));

        jButton7.setFont(new java.awt.Font("Traditional Arabic", 1, 18)); // NOI18N
        jButton7.setText("ایجاد تغییر");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 450, 80, 30));

        jLabel1.setFont(new java.awt.Font("Traditional Arabic", 1, 14)); // NOI18N
        jLabel1.setText("ID ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 460, -1, -1));

        jButton8.setFont(new java.awt.Font("Traditional Arabic", 1, 14)); // NOI18N
        jButton8.setText("Print");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 360, -1, 30));

        jButton9.setFont(new java.awt.Font("Traditional Arabic", 1, 18)); // NOI18N
        jButton9.setText("بازگشت");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1250, 450, 80, 30));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/report1234.jpg"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 770));

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
                    jTextField02.setText(rs.getString(3));
                    jTextField03.setText(rs.getString(4));
                    jTextField04.setText(rs.getString(5));
                    jTextField05.setText(rs.getString(6));
                    

                    jTextField02.setEditable(false);
                    jTextField03.setEditable(false);
                    jTextField04.setEditable(false);
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

    private void jTextField02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField02ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField02ActionPerformed

    private void jTextField03ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField03ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField03ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int id=0;
        String team_leader_name=jTextField01.getText();
        String team_leader_agents=jTextField02.getText();
        String team_leader_agents_reality=jTextArea01.getText();
        String team_leader_plan_for_manager=jTextArea02.getText();

        
        String Query="select id from team_leader_report1";
        
        try
        {
            ResultSet rs=Select.getData(Query);

            while(rs.next())
            id=rs.getInt(1);
            id=id+1;
            if(team_leader_name.equals("") || team_leader_agents.equals("") || team_leader_agents_reality.equals("") || team_leader_plan_for_manager.equals(""))
            JOptionPane.showMessageDialog(null,"Every field is Required");

            else
            {

                Query="insert into team_leader_report1 values('"+id+"','"+team_leader_name+"','"+team_leader_agents+"','"+team_leader_agents_reality+"','"+team_leader_plan_for_manager+"')";
                

                InsertUpdateDelete.setData(Query,"Registered Successfully");
                setVisible(false);
                new team_leader_report1().setVisible(true);
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTable1ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jTable1ComponentShown
    // TODO add your handling code here:
    }//GEN-LAST:event_jTable1ComponentShown

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
         ResultSet rs=Select.getData("select *from team_leader_report1");
        DefaultTableModel model=(DefaultTableModel)jTable1.getModel();
        try
        {
            while(rs.next())
            {
                
            model.addRow(new Object[]{rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5)});
            
            }
            rs.close();
        }
        
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_formComponentShown

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new team_leader_report2().setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
try {  
        Class.forName("com.mysql.jdbc.Driver");  
        // establish connection  
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost/dawat", "root", "123456");  
        Statement statement = con.createStatement();  
        statement.executeUpdate("DELETE FROM team_leader_report1 WHERE id=" + jTextField1.getText() + "");  
        JOptionPane.showMessageDialog(null, "Record deleted...");  
        statement.close();  
        con.close();  
        Referesh(); //Calling Referesh() method 
        setVisible(false);
        new team_leader_report1().setVisible(true);
    } catch (SQLException | ClassNotFoundException e) {  
        JOptionPane.showMessageDialog(null, e);  
    }  
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
         try {  
        Class.forName("com.mysql.jdbc.Driver");  
        // establish connection  
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost/dawat", "root", "123456");  
        Statement stmt = con.createStatement();  
        stmt.execute("UPDATE team_leader_report1 SET team_leader_agents_reality='" +jTextArea01.getText()+ "',team_leader_plan_for_manager='" +jTextArea02.getText()+ "' WHERE id='" + jTextField1.getText() + "'");  
        JOptionPane.showMessageDialog(null, "Record is updated...");  
        stmt.close();  
        con.close();  
        Referesh(); //Calling Referesh() method
        setVisible(false);
        new team_leader_report1().setVisible(true);
    } catch (SQLException | ClassNotFoundException se) {  
        JOptionPane.showMessageDialog(null, se);  
    }
    }//GEN-LAST:event_jButton7ActionPerformed

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

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new dashboard().setVisible(true);
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
            java.util.logging.Logger.getLogger(team_leader_report1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(team_leader_report1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(team_leader_report1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(team_leader_report1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new team_leader_report1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea01;
    private javax.swing.JTextArea jTextArea02;
    private javax.swing.JTextField jTextField01;
    private javax.swing.JTextField jTextField02;
    private javax.swing.JTextField jTextField03;
    private javax.swing.JTextField jTextField04;
    private javax.swing.JTextField jTextField05;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
