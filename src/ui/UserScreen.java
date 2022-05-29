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
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mehme
 */
public class UserScreen extends javax.swing.JFrame {
    String mail;
    Connection conn;
    /**
     * Creates new form UserScreen
     */
    public UserScreen(String mail) {
        initComponents();
        
        this.mail = mail;
        populateStudentTable();
        populateCourseTable();
        changeFacultyLabel();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        student_table = new javax.swing.JTable();
        class_search = new javax.swing.JButton();
        degree_progress = new javax.swing.JButton();
        past_courses = new javax.swing.JButton();
        your_instructors = new javax.swing.JButton();
        enroll_courses = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        course_table = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        faculty_label = new javax.swing.JLabel();
        imail_label = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        student_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "SID", "NAME", "SURNAME", "GRADE", "GPA", "MAJOR"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        student_table.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(student_table);
        if (student_table.getColumnModel().getColumnCount() > 0) {
            student_table.getColumnModel().getColumn(0).setResizable(false);
            student_table.getColumnModel().getColumn(1).setResizable(false);
            student_table.getColumnModel().getColumn(2).setResizable(false);
            student_table.getColumnModel().getColumn(3).setResizable(false);
            student_table.getColumnModel().getColumn(4).setResizable(false);
            student_table.getColumnModel().getColumn(5).setResizable(false);
        }

        class_search.setText("Class Search");
        class_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                class_searchActionPerformed(evt);
            }
        });

        degree_progress.setText("Degree Progress");
        degree_progress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                degree_progressActionPerformed(evt);
            }
        });

        past_courses.setText("Past Courses");
        past_courses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                past_coursesActionPerformed(evt);
            }
        });

        your_instructors.setText("Your Instructors");
        your_instructors.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                your_instructorsActionPerformed(evt);
            }
        });

        enroll_courses.setText("Course Add/Drop");
        enroll_courses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enroll_coursesActionPerformed(evt);
            }
        });

        exit.setText("Exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        course_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Code", "Date", "Duration", "Hour", "Credit"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
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
        jScrollPane2.setViewportView(course_table);
        if (course_table.getColumnModel().getColumnCount() > 0) {
            course_table.getColumnModel().getColumn(0).setResizable(false);
            course_table.getColumnModel().getColumn(1).setResizable(false);
            course_table.getColumnModel().getColumn(2).setResizable(false);
            course_table.getColumnModel().getColumn(3).setResizable(false);
            course_table.getColumnModel().getColumn(4).setResizable(false);
        }

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Your Courses");

        faculty_label.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        faculty_label.setText("Head");

        imail_label.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        imail_label.setText("jLabel2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(class_search, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(degree_progress, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(past_courses, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(enroll_courses, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(your_instructors, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(exit)
                .addGap(16, 16, 16))
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(imail_label, javax.swing.GroupLayout.PREFERRED_SIZE, 641, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(faculty_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane2)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 874, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(past_courses)
                    .addComponent(your_instructors)
                    .addComponent(enroll_courses)
                    .addComponent(degree_progress)
                    .addComponent(exit)
                    .addComponent(class_search))
                .addGap(12, 12, 12)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(faculty_label, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(imail_label, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void class_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_class_searchActionPerformed
        // TODO add your handling code here:
        ClassSearch classSearch = new ClassSearch(mail);
        dispose();
    }//GEN-LAST:event_class_searchActionPerformed

    private void your_instructorsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_your_instructorsActionPerformed
        // TODO add your handling code here:
        YourInstructors yourInstructors = new YourInstructors(mail);
        yourInstructors.setVisible(true);
        dispose();
    }//GEN-LAST:event_your_instructorsActionPerformed

    private void enroll_coursesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enroll_coursesActionPerformed
        // TODO add your handling code here:
        CourseAddDrop courseAddDrop = new CourseAddDrop(mail);
        courseAddDrop.setVisible(true);
        dispose();
    }//GEN-LAST:event_enroll_coursesActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_exitActionPerformed

    private void past_coursesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_past_coursesActionPerformed
        // TODO add your handling code here:
        PastCourses pastCourses = new PastCourses(mail);
        pastCourses.setVisible(true);
        dispose();
    }//GEN-LAST:event_past_coursesActionPerformed

    private void degree_progressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_degree_progressActionPerformed
        // TODO add your handling code here:
        String result = "";
        try{  
            Class.forName("com.mysql.cj.jdbc.Driver");  
            conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/du","root","1905");  
            Statement stmt=conn.createStatement();
            String query = "select sum(credit) "
                            +"from student,enrolled,course "
                            + "where sid = ssid and ccode = code and letter is not null and email = " + "'"+mail+"'";
            ResultSet rs=stmt.executeQuery(query);
            if(rs.next()){
                if(150-rs.getInt(1)<150){
                    result = "Sum of your credit is "+rs.getString(1) +"\n" +"You need " +(150 - rs.getInt(1))+ " credits more :)"; 
                }else{
                    result = "You can graduate any time";
                }
            }
            conn.close();  
        }catch(Exception e){ System.out.println(e);}
        JOptionPane.showMessageDialog(null, result);
    }//GEN-LAST:event_degree_progressActionPerformed

    /**
     * @param args the command line arguments
     */
    private void populateStudentTable(){
        try{  
            Class.forName("com.mysql.cj.jdbc.Driver");  
            conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/du","root","1905");  
            Statement stmt=conn.createStatement();
            String query = "select sid,name,surname,grade,gpa,major from student where email = " + "'"+mail+"'";
            ResultSet rs=stmt.executeQuery(query); 
            if(rs.next()){
                String columns[] = {"SID","NAME","SURNAME","GRADE","GPA","MAJOR"};
                String data[][] = {{rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6)}};
                DefaultTableModel model = new DefaultTableModel(data,columns);
                student_table.setModel(model);
            }else{
               
            }
                  
            conn.close();  
        }catch(Exception e){ System.out.println(e);} 
        
    }
    
    private void populateCourseTable(){
        try{  
            Class.forName("com.mysql.cj.jdbc.Driver");  
            conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/du","root","1905");  
            Statement stmt=conn.createStatement();
            String query = "select code,day,duration,time,credit "
                            +"from course,student,enrolled "
                            + "where ccode = code and ssid = sid and Letter is NULL and email = " + "'"+mail+"'";
            ResultSet rs=stmt.executeQuery(query); 
            String columns[] = {"Code","Date","Duration","Hour","Credit"};
            ArrayList<String[]> list = new ArrayList<>();
            while(rs.next()){
                String data[] = {rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5)};
                list.add(data);
            }
            String result[][] = new String[list.size()][5];
            for(int i=0;i<list.size();i++){
                result[i] = list.get(i);
            }
            DefaultTableModel model = new DefaultTableModel(result,columns);
            course_table.setModel(model);   
            conn.close();  
        }catch(Exception e){ System.out.println(e);} 
        
    }
    
    private void changeFacultyLabel() {
        try{  
            Class.forName("com.mysql.cj.jdbc.Driver");  
            conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/du","root","1905");  
            Statement stmt=conn.createStatement();
            String query = "select FName,iname,isurname,mail "
                            +"from student,faculty,instructor "
                            + "where fiid = iid and sfid = fid and email = " + "'"+mail+"'";
            ResultSet rs=stmt.executeQuery(query); 
            String result = "";
            String mail = "";
            if(rs.next()){
                result = "Coordinator of "+rs.getString(1)+" is "+rs.getString(2).replace("\"", "")+" "+rs.getString(3).replace("\"", "")+"." ;
                mail = "You can contact via "+rs.getString(4).replace("\"", "");
            }
            imail_label.setText(mail);
            faculty_label.setText(result);
            conn.close();  
        }catch(Exception e){ System.out.println(e);}
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton class_search;
    private javax.swing.JTable course_table;
    private javax.swing.JButton degree_progress;
    private javax.swing.JButton enroll_courses;
    private javax.swing.JButton exit;
    private javax.swing.JLabel faculty_label;
    private javax.swing.JLabel imail_label;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton past_courses;
    private javax.swing.JTable student_table;
    private javax.swing.JButton your_instructors;
    // End of variables declaration//GEN-END:variables

    
}
