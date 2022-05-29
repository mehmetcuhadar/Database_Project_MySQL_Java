/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mehme
 */
public class PastCourses extends javax.swing.JFrame {
    String mail;
    Connection conn;
    /**
     * Creates new form PastCourses
     */
    public PastCourses(String mail) {
        this.mail = mail;
        initComponents();
        populatePastCourseTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        past_course_table = new javax.swing.JTable();
        back_button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setText("PAST COURSES");

        past_course_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Code", "Credit", "Letter", "Instructor"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(past_course_table);
        if (past_course_table.getColumnModel().getColumnCount() > 0) {
            past_course_table.getColumnModel().getColumn(0).setResizable(false);
            past_course_table.getColumnModel().getColumn(1).setResizable(false);
            past_course_table.getColumnModel().getColumn(2).setResizable(false);
            past_course_table.getColumnModel().getColumn(3).setResizable(false);
        }

        back_button.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        back_button.setText("BACK");
        back_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(289, 289, 289))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 751, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48))))
            .addGroup(layout.createSequentialGroup()
                .addGap(302, 302, 302)
                .addComponent(back_button, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(back_button, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void back_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_buttonActionPerformed
        // TODO add your handling code here:
        dispose();
        UserScreen userScreen = new UserScreen(mail);
        userScreen.setVisible(true);
    }//GEN-LAST:event_back_buttonActionPerformed

    /**
     * @param args the command line arguments
     */
  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back_button;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable past_course_table;
    // End of variables declaration//GEN-END:variables

    
    private void populatePastCourseTable() {
        try{  
            Class.forName("com.mysql.cj.jdbc.Driver");  
            conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/du","root","1905");  
            Statement stmt=conn.createStatement();
            String query = "select code,credit,letter,credit,iname,isurname "
                            +"from student,enrolled,course,instructor "
                            + "where sid=ssid and code=ccode and ciid = iid and letter is not null and email = " + "'"+mail+"'";
            ResultSet rs=stmt.executeQuery(query); 
            String columns[] = {"Code","Credit","Letter","Credit","Instructor"};
            ArrayList<String[]> list = new ArrayList<>();
            while(rs.next()){
                String data[] = {rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5).replace("\"", "")+" " +rs.getString(6).replace("\"","")};
                list.add(data);
            }
            String result[][] = new String[list.size()][5];
            for(int i=0;i<list.size();i++){
                result[i] = list.get(i);
            }
            DefaultTableModel model = new DefaultTableModel(result,columns);
            past_course_table.setModel(model);   
            conn.close();  
        }catch(Exception e){ System.out.println(e);} 
    }
}