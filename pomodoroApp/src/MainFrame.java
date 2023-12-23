/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.Timer;
import java.awt.event.*;
import javax.swing.*;
/**
 *
 * @author Abdelsalam
 */

public class MainFrame extends javax.swing.JFrame {

     static int seconds = 0, minutes = 0 , milisec = 0; 
     static boolean flag = false;
    /**
     * Creates new form MainFrame
     */
         private static void centerFrameOnScreen(JFrame frame) {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (screenSize.width - frame.getWidth()) / 2;
        int y = (screenSize.height - frame.getHeight()) / 2;
        frame.setLocation(x, y);
    }
     
    public MainFrame() {
        initComponents();
        
        
        centerFrameOnScreen(this);
        Project temp = new Project();
        temp.name ="project0";
        Global.projects.add(temp);
        
        
        
    }
      private Timer timer;
  
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ourClockLabel = new javax.swing.JLabel();
        addProjectB = new javax.swing.JButton();
        itemsSelectCB = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        pauseB = new javax.swing.JButton();
        projectsB = new javax.swing.JButton();
        startB = new javax.swing.JButton();
        stopB = new javax.swing.JButton();
        pomoTimeCB = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        breakTimeCB = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        workLabel = new javax.swing.JLabel();
        stateCB = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                formFocusGained(evt);
            }
        });
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });

        ourClockLabel.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        ourClockLabel.setForeground(new java.awt.Color(102, 102, 255));
        ourClockLabel.setText(" 30:00 ");
        ourClockLabel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        addProjectB.setBackground(new java.awt.Color(51, 102, 255));
        addProjectB.setForeground(new java.awt.Color(255, 255, 255));
        addProjectB.setText("Add Project");
        addProjectB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addProjectBActionPerformed(evt);
            }
        });

        itemsSelectCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemsSelectCBActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Simplified Arabic", 2, 14)); // NOI18N
        jLabel3.setText("Select the project :");

        pauseB.setBackground(new java.awt.Color(51, 102, 255));
        pauseB.setForeground(new java.awt.Color(255, 255, 255));
        pauseB.setText("Pasue");
        pauseB.setToolTipText("");
        pauseB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pauseBActionPerformed(evt);
            }
        });

        projectsB.setBackground(new java.awt.Color(51, 102, 255));
        projectsB.setForeground(new java.awt.Color(255, 255, 255));
        projectsB.setText("Projects");
        projectsB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                projectsBActionPerformed(evt);
            }
        });

        startB.setBackground(new java.awt.Color(51, 102, 255));
        startB.setForeground(new java.awt.Color(255, 255, 255));
        startB.setText("Start");
        startB.setToolTipText("");
        startB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startBActionPerformed(evt);
            }
        });

        stopB.setBackground(new java.awt.Color(51, 102, 255));
        stopB.setForeground(new java.awt.Color(255, 255, 255));
        stopB.setText("Stop");
        stopB.setToolTipText("");
        stopB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stopBActionPerformed(evt);
            }
        });

        pomoTimeCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "30", "5", "10", "15", "20", "25", "30", "35", "40", "45", "50", "55", "60", " " }));
        pomoTimeCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pomoTimeCBActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Simplified Arabic", 2, 14)); // NOI18N
        jLabel4.setText("Select the Pomodoro Time :");

        breakTimeCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "5", "10", "15", "20", "25", "30", "35", "40", "45", "50", "55", "60" }));

        jLabel5.setFont(new java.awt.Font("Simplified Arabic", 2, 14)); // NOI18N
        jLabel5.setText("Select the Break Time :");

        jPanel1.setBackground(new java.awt.Color(51, 102, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Pomodoro Technique Maker");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(167, 167, 167)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 449, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        workLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        workLabel.setForeground(new java.awt.Color(51, 51, 255));
        workLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        workLabel.setText("work!!");

        stateCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "pomodoro", "break" }));
        stateCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stateCBActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Simplified Arabic", 2, 14)); // NOI18N
        jLabel6.setText("Select the state:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(pomoTimeCB, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(breakTimeCB, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(itemsSelectCB, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(stateCB, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(40, 40, 40))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(startB, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pauseB, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(stopB, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(addProjectB, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(107, 107, 107)
                        .addComponent(projectsB, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(334, 334, 334)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(workLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(ourClockLabel))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(ourClockLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(workLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(itemsSelectCB, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(pomoTimeCB, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(breakTimeCB, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(stateCB, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pauseB, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(startB, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(stopB, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addProjectB, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(projectsB, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
  
    private void addProjectBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addProjectBActionPerformed
          projectsFrame form2 = new projectsFrame(); 
          
          AddFrame formadd1 = new AddFrame();
                form2.setVisible(false);
                formadd1.setVisible(true); 
                loadProjectNames();
        // TODO add your handling code here:
    }//GEN-LAST:event_addProjectBActionPerformed

    private void pauseBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pauseBActionPerformed
       if(flag == false) {JOptionPane.showMessageDialog(null, "Press Start first");return;}
        if(seconds != 0||  minutes != 0 || milisec != 0){
         pauseB.setVisible(false);
        }        
        timer.stop();
        flag = false;
        startB.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_pauseBActionPerformed
       public  void loadProjectNames() {
        int temp = itemsSelectCB.getSelectedIndex();
        if(Global.projects.size() -1 < temp ) temp = -1;
        itemsSelectCB.removeAllItems(); // Clear existing items

        // Iterate through projects and add project names to the combo box
        for (Project project : Global.projects) {
            itemsSelectCB.addItem(project.name);
        }
      
        itemsSelectCB.setSelectedIndex(temp);
    }

    private void projectsBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_projectsBActionPerformed
              projectsFrame form2 = new projectsFrame(); 
              
              form2.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_projectsBActionPerformed
      
    private void startBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startBActionPerformed
        if(itemsSelectCB.getSelectedIndex() == -1){
     
         JOptionPane.showMessageDialog(null, "Press Select a project");
        return ;
        
    }
      pomoTimeCB.setEnabled(false);
    breakTimeCB.setEnabled(false);
    itemsSelectCB.setEnabled(false);
    stateCB.setEnabled(false);
    startB.setVisible(false);
    pauseB.setVisible(true);

    int delay = 1000;  // Delay in milliseconds (1000ms = 1 second)
    timer = new Timer(delay, new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            // Code to be executed at each timer tick
            if (flag == true) {
                try {

                    if (seconds >= 60) {
                     if (Global.workflag) {
                            String selectedItem = itemsSelectCB.getSelectedItem().toString();
                            for (Project project : Global.projects) {
                                if (selectedItem.equals(project.name)) {
                                    project.addToPomo(1);
                                }
                            }
                        } else {
                            String selectedItem = itemsSelectCB.getSelectedItem().toString();
                            for (Project project : Global.projects) {
                                if (selectedItem.equals(project.name)) {
                                    project.addToBreak(1);
                                }
                            }
                        }

                        minutes++;
                        seconds = 0;
                    
                    }
                    seconds++;

                    SwingUtilities.invokeLater(() -> {
                        String seconds_string = String.format("%02d", seconds);
                        String minutes_string = String.format("%02d", minutes);
                        String Zero = "0";
                        if (seconds_string.length() == 1) {
                            seconds_string = Zero.concat(seconds_string);
                        }
                        if (minutes_string.length() == 1) {
                            minutes_string = Zero.concat(minutes_string);
                        }
                        String all = String.format(" %s:%s ", minutes_string, seconds_string);
                        ourClockLabel.setText(all);

                        String s1;
                        if (Global.workflag) {
                            s1 = pomoTimeCB.getSelectedItem().toString();
                        } else {
                            s1 = breakTimeCB.getSelectedItem().toString();
                        }

                        if (minutes == Integer.parseInt(s1)) {
                            stopB.doClick();  // Stop the Timer
                            JOptionPane.showMessageDialog(null, String.format("Finshed %s", stateCB.getSelectedItem()));
                            if (Global.workflag) {
                                workLabel.setText("break yeessss");
                                stateCB.setEnabled(true);
                                stateCB.setSelectedIndex(1);
                                stateCB.setEnabled(false);
                            } else {
                                workLabel.setText("work!!");
                                stateCB.setEnabled(true);
                                stateCB.setSelectedIndex(0);
                                stateCB.setEnabled(false);
                            }
                            Global.workflag = !Global.workflag;
                        }
                    });
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            } else {
                timer.stop();  // Stop the Timer
            }
        }
    });

    flag = true;
    timer.start(); // TODO add your handling code here:
    }//GEN-LAST:event_startBActionPerformed

    private void stopBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stopBActionPerformed
          timer.stop();
           flag = false;
                   pomoTimeCB.setEnabled(true);
        breakTimeCB.setEnabled(true);
        itemsSelectCB.setEnabled(true);
           seconds =0; milisec = 0; minutes = 0;
           ourClockLabel.setText(" 00:00 "); 
           startB.setVisible(true);
           stateCB.setEnabled(true);
           
        // TODO add your handling code here:
    }//GEN-LAST:event_stopBActionPerformed

    private void pomoTimeCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pomoTimeCBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pomoTimeCBActionPerformed

    private void itemsSelectCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemsSelectCBActionPerformed
      // TODO add your handling code here:
    }//GEN-LAST:event_itemsSelectCBActionPerformed

    private void formFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusGained
              loadProjectNames();        // TODO add your handling code here:
    }//GEN-LAST:event_formFocusGained

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
 Global.loadProjectsFromFile();
        loadProjectNames();        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowGainedFocus

    private void stateCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stateCBActionPerformed
                           if (stateCB.getSelectedItem() == "break") {
                            Global.workflag = false;
                            workLabel.setText("break yeessss");
                        } else {
                            Global.workflag = true;
                                                        workLabel.setText("work!!");

                        }
        // TODO add your handling code here:
    }//GEN-LAST:event_stateCBActionPerformed
  
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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

          try {
        UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
    } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
        java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addProjectB;
    private javax.swing.JComboBox<String> breakTimeCB;
    private javax.swing.JComboBox<String> itemsSelectCB;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    public static javax.swing.JLabel ourClockLabel;
    private javax.swing.JButton pauseB;
    private javax.swing.JComboBox<String> pomoTimeCB;
    private javax.swing.JButton projectsB;
    private javax.swing.JButton startB;
    private javax.swing.JComboBox<String> stateCB;
    private javax.swing.JButton stopB;
    private javax.swing.JLabel workLabel;
    // End of variables declaration//GEN-END:variables
}
