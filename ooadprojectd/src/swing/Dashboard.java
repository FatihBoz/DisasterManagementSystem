/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package swing;

import classes.FoodCalculator;
import classes.User;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JInternalFrame;
import javax.swing.SwingUtilities;
import javax.swing.*;
import java.awt.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import swing.FindFacility;



/**
 *
 * @author Toshiba
 */
public class Dashboard extends javax.swing.JFrame {
    private javax.swing.JDesktopPane desktopPane;

    /**
     * Creates new form Dashboard
     */
    private javax.swing.JButton uploadPhotoButton;

    private String loggedInUsername;  // Giriş yapan kullanıcı adı

    public Dashboard(String username) {
        this.loggedInUsername = username;  // Giriş yapan kullanıcı adını al
        initComponents();
        showDateandTime();
    }
    public Dashboard() {
        this("defaultUser"); // Varsayılan bir kullanıcı adı ile parametreli constructor'ı çağırın
    }
    
    public void showDateandTime(){
        Thread clock = new Thread(){
            public void run(){
                try {
                    for(;;){
                    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("EEEE, MMM dd, yyyy HH:mm:ss");
                    LocalDateTime now = LocalDateTime.now();
                    dateandTime.setText(dtf.format(now));
                    sleep(1000);}
                } catch (InterruptedException ex) {
                    Logger.getLogger(Dashboard.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        };
        clock.start();
        
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        dateandTime = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        dateandTime.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        dateandTime.setText("date and time");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(310, 310, 310)
                .addComponent(dateandTime)
                .addContainerGap(386, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(dateandTime)
                .addContainerGap(558, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 0, 810, 610));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Feedback");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 560, -1, -1));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Welcome");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 100, 40));

        jPanel4.setBackground(new java.awt.Color(51, 51, 51));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 153, 153));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/male_user_50px.png"))); // NOI18N
        jLabel4.setText(" Profile");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, 60));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 160, 60));

        jPanel5.setBackground(new java.awt.Color(51, 51, 51));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 13)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 153, 153));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/search_26px.png"))); // NOI18N
        jLabel5.setText(" Find Facility");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        jPanel5.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, -1, 60));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 160, 60));

        jPanel6.setBackground(new java.awt.Color(51, 51, 51));
        jPanel6.setMinimumSize(new java.awt.Dimension(124, 60));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 13)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 153, 153));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/shopping_cart_24px.png"))); // NOI18N
        jLabel6.setText("Calculate Food");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        jPanel6.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, -1, 60));

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 160, -1));

        jPanel7.setBackground(new java.awt.Color(51, 51, 51));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 13)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 153, 153));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/add_user_group_woman_man_24px.png"))); // NOI18N
        jLabel7.setText("Contact List");
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        jPanel7.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, -1, 60));

        jPanel1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 160, 60));

        jPanel8.setBackground(new java.awt.Color(51, 51, 51));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 13)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(153, 153, 153));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/group_message_26px_1.png"))); // NOI18N
        jLabel8.setText("Report Incident");
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        jPanel8.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, -1, 60));

        jPanel1.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 160, 60));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 611, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        // TODO add your handling code here:
        User loggedInUser = loadUserData(loggedInUsername);
    if (loggedInUser != null) {
        showUserProfile(loggedInUser);
    } else {
        JOptionPane.showMessageDialog(this, "User data not found!", "Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        // TODO add your handling code here:
         jPanel2.removeAll();
    jPanel2.revalidate();
    jPanel2.repaint();

    // Create and add the FindFacility component
    FindFacility f = new FindFacility();
    f.setVisible(true);

    jPanel2.setLayout(new BorderLayout()); // Set the layout
    jPanel2.add(f, BorderLayout.CENTER); // Add the component
    jPanel2.revalidate(); // Revalidate to apply the changes
    jPanel2.repaint(); // Repaint to refresh the display
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        // TODO add your handling code here:
        FoodCalculator foodcalculator=new FoodCalculator();
        SwingUtilities.invokeLater(new Runnable(){
            public void run() {
                foodcalculator.Start();
                // TODO Auto-generated method stub

            }

        });
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        // TODO add your handling code here:
             jPanel2.removeAll();
    jPanel2.revalidate();
    jPanel2.repaint();

    // Create and add the FindFacility component
    ReportIncident f = new ReportIncident();
    f.setVisible(true);

    jPanel2.setLayout(new BorderLayout()); // Set the layout
    jPanel2.add(f, BorderLayout.CENTER); // Add the component
    jPanel2.revalidate(); // Revalidate to apply the changes
    jPanel2.repaint(); // Repaint to refresh the display
    }//GEN-LAST:event_jLabel8MouseClicked
private User loadUserData(String username) {
    String filePath = "src\\user.txt"; // Dosya yolu
    try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
        String line;
        while ((line = br.readLine()) != null) {
            String[] userDetails = line.split(",");
            if (userDetails.length == 8 && userDetails[0].equals(username)) { // Dosya formatına ve kullanıcı adına göre düzenleme
                return new User(userDetails[0], userDetails[1], userDetails[2], userDetails[3], userDetails[4], userDetails[5], userDetails[6], userDetails[7]);
            }
        }
    } catch (IOException e) {
        e.printStackTrace();
    }
    return null;
}



    
private void showUserProfile(User user) {
        jPanel2.removeAll(); // Clear old contents

        JPanel contentPanel = new JPanel();
        GroupLayout layout = new GroupLayout(contentPanel);
        contentPanel.setLayout(layout);
        layout.setAutoCreateGaps(true);
        layout.setAutoCreateContainerGaps(true);

        // Show user photo
        String photoPath = "src\\user_photos\\" + user.getUsername() + ".jpg";
        String defaultPhotoPath = "src\\user_photos\\default.jpg";
        java.io.File photoFile = new java.io.File(photoPath);
        java.io.File defaultPhotoFile = new java.io.File(defaultPhotoPath);
        JLabel photoLabel = new JLabel();
        if (photoFile.exists()) {
            ImageIcon photoIcon = new ImageIcon(new ImageIcon(photoPath).getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT));
            photoLabel.setIcon(photoIcon);
        } else if (defaultPhotoFile.exists()) {
            ImageIcon defaultPhotoIcon = new ImageIcon(new ImageIcon(defaultPhotoPath).getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT));
            photoLabel.setIcon(defaultPhotoIcon);
        } else {
            photoLabel.setText("No Photo");
        }

        // Photo update button
        JButton updatePhotoButton = new JButton("Upload Photo");
        updatePhotoButton.setFont(new Font("Arial", Font.BOLD, 16));
        updatePhotoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JFileChooser fileChooser = new JFileChooser();
                fileChooser.setFileFilter(new javax.swing.filechooser.FileNameExtensionFilter("Image files", "jpg", "png", "jpeg"));
                int returnValue = fileChooser.showOpenDialog(jPanel2);
                if (returnValue == JFileChooser.APPROVE_OPTION) {
                    java.io.File file = fileChooser.getSelectedFile();
                    String newFilePath = "src\\user_photos\\" + user.getUsername() + ".jpg"; // Kullanıcı adıyla bağdaştırılmış dosya adı
                    try {
                        java.nio.file.Files.copy(file.toPath(), java.nio.file.Paths.get(newFilePath), java.nio.file.StandardCopyOption.REPLACE_EXISTING);
                        JOptionPane.showMessageDialog(jPanel2, "Photo uploaded successfully!");
                        // Update and show the photo again
                        ImageIcon updatedPhotoIcon = new ImageIcon(new ImageIcon(newFilePath).getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT));
                        photoLabel.setIcon(updatedPhotoIcon);
                        jPanel2.revalidate();
                        jPanel2.repaint();
                    } catch (IOException e) {
                        e.printStackTrace();
                        JOptionPane.showMessageDialog(jPanel2, "Failed to upload photo!", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
        });

        // Info update button
        JButton updateInfoButton = new JButton("Update Info");
        updateInfoButton.setFont(new Font("Arial", Font.BOLD, 16));
        updateInfoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JPanel updatePanel = new JPanel(new GridLayout(7, 2, 10, 10));
                JTextField nameField = new JTextField(user.getName());
                JTextField surnameField = new JTextField(user.getSurname());
                JTextField bloodTypeField = new JTextField(user.getBloodType());
                JTextField emailField = new JTextField(user.getEmailAdress());
                JTextField phoneField = new JTextField(user.getPhoneNumber());
                JTextField addressField = new JTextField(user.getAdress());

                updatePanel.add(new JLabel("Name:"));
                updatePanel.add(nameField);
                updatePanel.add(new JLabel("Surname:"));
                updatePanel.add(surnameField);
                updatePanel.add(new JLabel("Blood Type:"));
                updatePanel.add(bloodTypeField);
                updatePanel.add(new JLabel("Email Address:"));
                updatePanel.add(emailField);
                updatePanel.add(new JLabel("Phone Number:"));
                updatePanel.add(phoneField);
                updatePanel.add(new JLabel("Address:"));
                updatePanel.add(addressField);

                int result = JOptionPane.showConfirmDialog(null, updatePanel, "Update Info", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);

                if (result == JOptionPane.OK_OPTION) {
                    user.setName(nameField.getText());
                    user.setSurname(surnameField.getText());
                    user.setBloodType(bloodTypeField.getText());
                    user.setEmailAdress(emailField.getText());
                    user.setPhoneNumber(phoneField.getText());
                    user.setAdress(addressField.getText());

                    // Update user.txt file
                    updateUserFile(user);
                    
                    // Update and show the info again
                    showUserProfile(user);
                    jPanel2.revalidate();
                    jPanel2.repaint();
                }
            }
        });

        // Change password button
        JButton changePasswordButton = new JButton("Change Password");
        changePasswordButton.setFont(new Font("Arial", Font.BOLD, 16));
        changePasswordButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JPanel passwordPanel = new JPanel(new GridLayout(4, 2, 10, 10));
                JPasswordField oldPasswordField = new JPasswordField();
                JPasswordField newPasswordField = new JPasswordField();
                JPasswordField confirmNewPasswordField = new JPasswordField();

                passwordPanel.add(new JLabel("Old Password:"));
                passwordPanel.add(oldPasswordField);
                passwordPanel.add(new JLabel("New Password:"));
                passwordPanel.add(newPasswordField);
                passwordPanel.add(new JLabel("Confirm New Password:"));
                passwordPanel.add(confirmNewPasswordField);

                int result = JOptionPane.showConfirmDialog(null, passwordPanel, "Change Password", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);

                if (result == JOptionPane.OK_OPTION) {
                    String oldPassword = new String(oldPasswordField.getPassword());
                    String newPassword = new String(newPasswordField.getPassword());
                    String confirmNewPassword = new String(confirmNewPasswordField.getPassword());

                    if (oldPassword.equals(user.getPassword())) {
                        if (newPassword.equals(confirmNewPassword)) {
                            user.setPassword(newPassword);
                            updateUserFile(user);
                            JOptionPane.showMessageDialog(jPanel2, "Password updated successfully!");
                        } else {
                            JOptionPane.showMessageDialog(jPanel2, "New passwords do not match!", "Error", JOptionPane.ERROR_MESSAGE);
                        }
                    } else {
                        JOptionPane.showMessageDialog(jPanel2, "Old password is incorrect!", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
        });

        JLabel usernameLabel = new JLabel("Username: " + user.getUsername());
        JLabel nameLabel = new JLabel("Name: " + user.getName());
        JLabel surnameLabel = new JLabel("Surname: " + user.getSurname());
        JLabel bloodTypeLabel = new JLabel("Blood Type: " + user.getBloodType());
        JLabel emailLabel = new JLabel("Email Address: " + user.getEmailAdress());
        JLabel phoneLabel = new JLabel("Phone Number: " + user.getPhoneNumber());
        JLabel addressLabel = new JLabel("Address: " + user.getAdress());

        Font font = new Font("Arial", Font.BOLD, 18);
        Color color = new Color(33, 37, 41); // Koyu gri renk

        usernameLabel.setFont(font);
        usernameLabel.setForeground(color);
        nameLabel.setFont(font);
        nameLabel.setForeground(color);
        surnameLabel.setFont(font);
        surnameLabel.setForeground(color);
        bloodTypeLabel.setFont(font);
        bloodTypeLabel.setForeground(color);
        emailLabel.setFont(font);
        emailLabel.setForeground(color);
        phoneLabel.setFont(font);
        phoneLabel.setForeground(color);
        addressLabel.setFont(font);
        addressLabel.setForeground(color);

        layout.setHorizontalGroup(
            layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.CENTER)
                    .addComponent(photoLabel)
                    .addComponent(updatePhotoButton))
                .addGap(30)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(usernameLabel)
                    .addComponent(nameLabel)
                    .addComponent(surnameLabel)
                    .addComponent(bloodTypeLabel)
                    .addComponent(emailLabel)
                    .addComponent(phoneLabel)
                    .addComponent(addressLabel)
                    .addComponent(updateInfoButton)
                    .addComponent(changePasswordButton))
        );

        layout.setVerticalGroup(
            layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(photoLabel)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(usernameLabel)
                        .addComponent(nameLabel)
                        .addComponent(surnameLabel)
                        .addComponent(bloodTypeLabel)
                        .addComponent(emailLabel)
                        .addComponent(phoneLabel)
                        .addComponent(addressLabel)
                        .addComponent(updateInfoButton)
                        .addComponent(changePasswordButton)))
                .addComponent(updatePhotoButton)
        );

        // İçeriği ortalamak için ana panel
        jPanel2.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.CENTER;
        jPanel2.add(contentPanel, gbc);

        jPanel2.revalidate(); // Yeniden boyutlandırma ve düzenleme
        jPanel2.repaint(); // Yeniden çizim
    }





    private void updateUserFile(User updatedUser) {
    String filePath = "src\\user.txt";
    java.io.File inputFile = new java.io.File(filePath);
    java.io.File tempFile = new java.io.File("src\\temp_user.txt");

    try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
         BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile))) {

        String currentLine;
        while ((currentLine = reader.readLine()) != null) {
            String[] userDetails = currentLine.split(",");
            if (userDetails.length == 8 && userDetails[0].equals(updatedUser.getUsername())) {
                writer.write(updatedUser.getUsername() + "," + updatedUser.getName() + "," + updatedUser.getSurname() + ","
                        + updatedUser.getBloodType() + "," + updatedUser.getEmailAdress() + ","
                        + updatedUser.getPassword() + "," + updatedUser.getPhoneNumber() + "," + updatedUser.getAdress());
                writer.newLine();
            } else {
                writer.write(currentLine);
                writer.newLine();
            }
        }
    } catch (IOException e) {
        e.printStackTrace();
    }

    if (!inputFile.delete()) {
        System.out.println("Could not delete original file");
    }
    if (!tempFile.renameTo(inputFile)) {
        System.out.println("Could not rename temporary file");
    }
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
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel dateandTime;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    // End of variables declaration//GEN-END:variables
}
