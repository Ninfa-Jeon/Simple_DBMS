import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import javax.swing.BorderFactory;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;

public class myform extends javax.swing.JFrame {
public static String Cname="";
public static int cnt=0;
public static Border border = BorderFactory.createLineBorder(Color.WHITE, 1);
public static String set,where;
private static String dbURL = "jdbc:derby://localhost:1527/E_Com;create=true;user=Urvashi;password=urvashi";
Connection con;
    
    public myform() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        connect = new javax.swing.JButton();
        contents = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        conClose = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        tname = new javax.swing.JLabel();
        refresh = new javax.swing.JButton();
        insert = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        addNext = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        godelete = new javax.swing.JButton();
        updatebtn = new javax.swing.JButton();
        goupdate = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("DB Connectivity");
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(51, 51, 0));

        jPanel1.setBackground(new java.awt.Color(51, 0, 51));
        jPanel1.setForeground(new java.awt.Color(240, 240, 240));

        connect.setBackground(new java.awt.Color(51, 0, 51));
        connect.setForeground(new java.awt.Color(240, 240, 240));
        connect.setText("Connect to DB");
        connect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                connectActionPerformed(evt);
            }
        });

        contents.setBackground(new java.awt.Color(51, 51, 0));
        contents.setFont(new java.awt.Font("Tahoma", 2, 13)); // NOI18N
        contents.setForeground(new java.awt.Color(240, 240, 240));
        contents.setText("Contents");
        contents.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contentsActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(51, 51, 0));
        jLabel1.setForeground(new java.awt.Color(240, 240, 240));

        jTable1.setBackground(new java.awt.Color(51, 51, 0));
        jTable1.setForeground(new java.awt.Color(240, 240, 240));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTable1);

        conClose.setBackground(new java.awt.Color(51, 0, 51));
        conClose.setForeground(new java.awt.Color(240, 240, 240));
        conClose.setText("Close Connection");
        conClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                conCloseActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(51, 0, 51));
        jLabel2.setForeground(new java.awt.Color(240, 240, 240));

        tname.setBackground(new java.awt.Color(51, 0, 51));
        tname.setForeground(new java.awt.Color(240, 240, 240));
        tname.setText("Enter table name:");

        refresh.setBackground(new java.awt.Color(51, 51, 0));
        refresh.setFont(new java.awt.Font("Tahoma", 2, 13)); // NOI18N
        refresh.setForeground(new java.awt.Color(240, 240, 240));
        refresh.setText("Refresh");
        refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshActionPerformed(evt);
            }
        });

        insert.setBackground(new java.awt.Color(51, 51, 0));
        insert.setFont(new java.awt.Font("Tahoma", 2, 13)); // NOI18N
        insert.setForeground(new java.awt.Color(240, 240, 240));
        insert.setText("Insert");
        insert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertActionPerformed(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(51, 0, 51));
        jLabel4.setForeground(new java.awt.Color(240, 240, 240));

        jTextField2.setBackground(new java.awt.Color(51, 0, 51));
        jTextField2.setForeground(new java.awt.Color(240, 240, 240));
        jTextField2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        addNext.setBackground(new java.awt.Color(51, 0, 51));
        addNext.setForeground(new java.awt.Color(240, 240, 240));
        addNext.setText("addNext");
        addNext.setVisible(false);
        addNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addNextActionPerformed(evt);
            }
        });

        delete.setBackground(new java.awt.Color(51, 51, 0));
        delete.setFont(new java.awt.Font("Tahoma", 2, 13)); // NOI18N
        delete.setForeground(new java.awt.Color(240, 240, 240));
        delete.setText("Delete");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        godelete.setVisible(false);
        godelete.setBackground(new java.awt.Color(51, 0, 51));
        godelete.setForeground(new java.awt.Color(240, 240, 240));
        godelete.setText("Go");
        godelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                godeleteActionPerformed(evt);
            }
        });

        updatebtn.setBackground(new java.awt.Color(51, 51, 0));
        updatebtn.setFont(new java.awt.Font("Tahoma", 2, 13)); // NOI18N
        updatebtn.setForeground(new java.awt.Color(240, 240, 240));
        updatebtn.setText("Update");
        updatebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatebtnActionPerformed(evt);
            }
        });

        goupdate.setBackground(new java.awt.Color(51, 0, 51));
        goupdate.setForeground(new java.awt.Color(240, 240, 240));
        goupdate.setText("Condition");
        goupdate.setVisible(false);
        goupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goupdateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addComponent(connect)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(118, 118, 118))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(tname)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 692, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(63, 63, 63))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(conClose)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(52, 52, 52)))
                .addGap(69, 69, 69))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(219, 219, 219)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(contents)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(insert)
                        .addGap(57, 57, 57)
                        .addComponent(delete)
                        .addGap(45, 45, 45)
                        .addComponent(updatebtn)
                        .addGap(51, 51, 51)
                        .addComponent(refresh)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(godelete)
                        .addGap(32, 32, 32)
                        .addComponent(addNext)
                        .addGap(18, 18, 18)
                        .addComponent(goupdate)
                        .addGap(87, 87, 87))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 595, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(190, 190, 190))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(connect)
                    .addComponent(jLabel1))
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tname)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(contents)
                            .addComponent(refresh)
                            .addComponent(insert)
                            .addComponent(delete)
                            .addComponent(updatebtn))
                        .addGap(86, 86, 86))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(godelete)
                        .addComponent(addNext)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(goupdate)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(conClose)
                    .addComponent(jLabel2))
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void contentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contentsActionPerformed
        tableupdate();
    }//GEN-LAST:event_contentsActionPerformed

    public void tableupdate(){
        DefaultTableModel model = new DefaultTableModel();
            jTable1.setModel(model);
          try {
            String tname = jTextField1.getText();
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM "+tname);
            jLabel2.setText("");
            DefaultTableModel tmodel = (DefaultTableModel)jTable1.getModel();
            ResultSetMetaData rsmd = rs.getMetaData();
            int columnsNumber = rsmd.getColumnCount();
            boolean flag=true;
            while(rs.next()){
                Vector<String> row = new Vector();
                for (int i = 1; i <= columnsNumber;i++){
                    if(flag){
                        tmodel.addColumn(rsmd.getColumnName(i));
                    }
                    String columnValue = rs.getString(i);
                    row.add(columnValue);
                }
                flag=false;
                tmodel.addRow(row);
            }                
            jTable1.setModel(tmodel);
        }
        catch (SQLException ex) {
            jLabel2.setText("Table does not exist.");
        }
        catch(Exception e){
            jLabel2.setText("Something went wrong!");
        }
    }
    
    private void connectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_connectActionPerformed
        try{
            Class.forName("org.apache.derby.jdbc.ClientDriver").newInstance();
            con = DriverManager.getConnection(dbURL); 
            jLabel1.setText("Connected");
            jLabel2.setText("");
        }
        catch (Exception e){ 
            jLabel1.setText("Unable to connect");
        } 
 
    }//GEN-LAST:event_connectActionPerformed

    private void conCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_conCloseActionPerformed
        try {
        // TODO add your handling code here:
            con.close();
            DefaultTableModel model = new DefaultTableModel();
            jTable1.setModel(model);
            jTextField1.setText("");
            jLabel2.setText("Connection closed successfully");
            jLabel1.setText("");
            addNext.setVisible(false);                
            godelete.setVisible(false);
            goupdate.setVisible(false);
            jLabel4.setText("");
            jTextField2.setVisible(false);
        } catch (Exception ex) {
            jLabel2.setText("Connection failed to close");
        }
    }//GEN-LAST:event_conCloseActionPerformed

    private void refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = new DefaultTableModel();
        jTable1.setModel(model);
        jTextField1.setText("");
        jLabel4.setText("");
        jTextField2.setVisible(false);
        addNext.setText("");                
        godelete.setVisible(false);
        goupdate.setVisible(false);
        addNext.setVisible(false);
    }//GEN-LAST:event_refreshActionPerformed

    private void insertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertActionPerformed
        jTextField2.setBorder(border);
        jTextField2.setVisible(true);
        addNext.setVisible(true); 
        goupdate.setVisible(false);
        godelete.setVisible(false);
        addNext.setText("Next");
        cnt = 0;
        jTextField2.setText("");
        Cname = "";
        jLabel4.setText("Enter "+ jTable1.getColumnName(cnt)+": ");                 
    }//GEN-LAST:event_insertActionPerformed

    private void addNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addNextActionPerformed
    try {
        // TODO add your handling code here:
        
        String tname = jTextField1.getText();
        int colNumber = jTable1.getColumnCount();
        Statement stmt = con.createStatement();
  
        String m="";
      
        if(cnt<colNumber-1){
            jLabel4.setText("Enter "+ jTable1.getColumnName(cnt+1)+": ");
            m= jTextField2.getText();
            boolean numeric = true;
            try {
                Double num = Double.parseDouble(m);
            }catch (NumberFormatException e){
                numeric = false;
            } 
            if(numeric == false ){
                m = "'"+m+"'"; 
            }
            Cname=Cname + m+",";
            jTextField2.setText("");
            if(cnt==colNumber-2)
                addNext.setText("Go");
        }
        else{
            jLabel4.setText("Enter "+ jTable1.getColumnName(cnt)+": ");
            m = jTextField2.getText();
            boolean numeric = true;
            try {
                Double num = Double.parseDouble(m);
            } catch (NumberFormatException e) {
                numeric = false;
            } 
            if(numeric==false){
                m = "'"+m+"'"; 
            }
            Cname = Cname + m;
            stmt.executeUpdate("insert into "+tname+" values("+Cname+")");
            tableupdate();
        }
        cnt++;     
    } catch (Exception ex) {
        jLabel2.setText("Error while inserting values");
    }
        
    }//GEN-LAST:event_addNextActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        // TODO add your handling code here:                                               
        jTextField2.setBorder(border);
        jTextField2.setVisible(true);
        addNext.setVisible(false);
        goupdate.setVisible(false);
        godelete.setVisible(true);
        cnt = 0;
        jTextField2.setText("");
        jLabel4.setText("Enter condition: "); 
    }//GEN-LAST:event_deleteActionPerformed

    private void godeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_godeleteActionPerformed
    try {
        // TODO add your handling code here:
        String tname = jTextField1.getText();
        Statement stmt = con.createStatement();
        stmt.executeUpdate("DELETE FROM "+tname+" where "+ jTextField2.getText());
        tableupdate();
    } catch (Exception ex) {
        jLabel2.setText("Error while deleting");
    }
    }//GEN-LAST:event_godeleteActionPerformed

    private void updatebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatebtnActionPerformed
        jTextField2.setBorder(border);
        jTextField2.setVisible(true);
        goupdate.setVisible(true);
        addNext.setVisible(false);
        godelete.setVisible(false);
        jTextField2.setText("");
        cnt = 0;
        jLabel4.setText("Set:  ");
    }//GEN-LAST:event_updatebtnActionPerformed

    private void goupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goupdateActionPerformed
    try {
            String tname = jTextField1.getText();
            Statement stmt = con.createStatement();
            if(cnt<1){
                set = jTextField2.getText();
                jTextField2.setText("");
                jLabel4.setText("Enter condition: ");
                goupdate.setText("Done");
            }
            else{
                where = jTextField2.getText();
                stmt.executeUpdate("UPDATE "+tname+" SET "+ set+" WHERE "+where);
                tableupdate(); 
            }
            cnt++;  
    } catch (Exception ex) {
        jLabel2.setText("Error while updating");
        ex.printStackTrace();
    }
    }//GEN-LAST:event_goupdateActionPerformed

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
            java.util.logging.Logger.getLogger(myform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(myform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(myform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(myform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new myform().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addNext;
    private javax.swing.JButton conClose;
    private javax.swing.JButton connect;
    private javax.swing.JButton contents;
    private javax.swing.JButton delete;
    private javax.swing.JButton godelete;
    private javax.swing.JButton goupdate;
    private javax.swing.JButton insert;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JButton refresh;
    private javax.swing.JLabel tname;
    private javax.swing.JButton updatebtn;
    // End of variables declaration//GEN-END:variables
}
