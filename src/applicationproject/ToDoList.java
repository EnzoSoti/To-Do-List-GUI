
package applicationproject;

import java.awt.event.KeyEvent;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class ToDoList extends javax.swing.JFrame {
    
    // always add or import the DefaultListModel and pass the JLIST
    // Declare the list model
    private final DefaultListModel<String> listModel;
    
    public ToDoList() {
        initComponents();
        
        // Initialize the list model and set it to the JList
        // listmodel is the name of DefaultListModel
        listModel = new DefaultListModel<>();
        list.setModel(listModel);
    }
    
    private void addTask() {
        String task = txt_enterNewTask.getText().trim();
        if (!task.isEmpty()) {
            listModel.addElement("- " + task); // Add the task to the list model
            txt_enterNewTask.setText(""); // Clear the input field
        }else{
            JOptionPane.showMessageDialog(this, "Task cannot be empty", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void removeTask(){
        int selectedIndex = list.getSelectedIndex();
        if(selectedIndex != -1){
            listModel.remove(selectedIndex);
        }else{
            JOptionPane.showMessageDialog(this, "No task selected", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        list = new javax.swing.JList<>();
        txt_enterNewTask = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("To-Do List");

        list.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        list.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentRemoved(java.awt.event.ContainerEvent evt) {
                listComponentRemoved(evt);
            }
        });
        jScrollPane1.setViewportView(list);

        txt_enterNewTask.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txt_enterNewTask.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_enterNewTaskKeyPressed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(0, 255, 0));
        jButton1.setText("Add");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton1KeyPressed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 0, 0));
        jButton2.setText("Remove");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_enterNewTask, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_enterNewTask, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        addTask();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void listComponentRemoved(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_listComponentRemoved
        // TODO add your handling code here:
    }//GEN-LAST:event_listComponentRemoved

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        removeTask();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton1KeyPressed
        
    }//GEN-LAST:event_jButton1KeyPressed

    private void txt_enterNewTaskKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_enterNewTaskKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            addTask();
        }
    }//GEN-LAST:event_txt_enterNewTaskKeyPressed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new ToDoList().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> list;
    private javax.swing.JTextField txt_enterNewTask;
    // End of variables declaration//GEN-END:variables
}
