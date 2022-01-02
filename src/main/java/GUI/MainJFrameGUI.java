/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import javax.swing.JFrame;

/**
 *
 * @author Windows
 */
public class MainJFrameGUI extends javax.swing.JFrame {

    /**
     * Creates new form MainJFrameGUI
     */
    public MainJFrameGUI() {
        initComponents();
        
        setExtendedState(JFrame.MAXIMIZED_HORIZ);
        setVisible(true);
        setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bodyP = new javax.swing.JPanel();
        hadistlistP = new javax.swing.JPanel();
        btnH1 = new javax.swing.JButton();
        btnH2 = new javax.swing.JButton();
        btnH3 = new javax.swing.JButton();
        tasbihP = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        Tasbihtxt = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        hadistP = new javax.swing.JPanel();
        hadist1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        hadist2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        hadist3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bodyP.setBackground(new java.awt.Color(102, 102, 102));

        hadistlistP.setBackground(new java.awt.Color(102, 102, 102));
        hadistlistP.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));

        btnH1.setText("Hadist 1");
        btnH1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnH1ActionPerformed(evt);
            }
        });

        btnH2.setText("Hadist 2");
        btnH2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnH2ActionPerformed(evt);
            }
        });

        btnH3.setText("Hadist 3");
        btnH3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnH3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout hadistlistPLayout = new javax.swing.GroupLayout(hadistlistP);
        hadistlistP.setLayout(hadistlistPLayout);
        hadistlistPLayout.setHorizontalGroup(
            hadistlistPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(hadistlistPLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(hadistlistPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnH1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnH2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnH3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        hadistlistPLayout.setVerticalGroup(
            hadistlistPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, hadistlistPLayout.createSequentialGroup()
                .addContainerGap(177, Short.MAX_VALUE)
                .addComponent(btnH1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnH2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnH3)
                .addContainerGap())
        );

        tasbihP.setBackground(new java.awt.Color(102, 102, 102));
        tasbihP.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));

        jButton1.setText("count");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        Tasbihtxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Tasbihtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TasbihtxtActionPerformed(evt);
            }
        });

        jButton2.setText("reset");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Tasbih Counter");

        javax.swing.GroupLayout tasbihPLayout = new javax.swing.GroupLayout(tasbihP);
        tasbihP.setLayout(tasbihPLayout);
        tasbihPLayout.setHorizontalGroup(
            tasbihPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tasbihPLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tasbihPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tasbihPLayout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tasbihPLayout.createSequentialGroup()
                        .addGap(0, 2, Short.MAX_VALUE)
                        .addGroup(tasbihPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Tasbihtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        tasbihPLayout.setVerticalGroup(
            tasbihPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tasbihPLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Tasbihtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(tasbihPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton1))
                .addContainerGap())
        );

        hadistP.setBackground(new java.awt.Color(153, 0, 153));
        hadistP.setLayout(new java.awt.CardLayout());

        hadist1.setBackground(new java.awt.Color(102, 102, 102));
        hadist1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));

        jTextArea1.setBackground(new java.awt.Color(102, 102, 102));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTextArea1.setForeground(new java.awt.Color(255, 255, 255));
        jTextArea1.setRows(5);
        jTextArea1.setText("Rasulullah SAW bersabda: \"Barang siapa yang\n\nbertasbih sebanyak 33 kali,\nbertahmid sebanyak 33 kali,\ndan bertakbir sebanyak 33 kali\n\nsetelah melaksanakan sholat fardhu sehingga berjumlah 99,\n\nkemudian menggenapkannya untuk yang keseratus dengan ucapan\n\nLaa ilaha illallahu wahdsholat ahu laa syarikalahu lahul mulku\nwalahul hamdu wahuwa ‘ala kulli syai-in qodiir,\n\nmaka kesalahannya akan diampuni meskipun sebanyak buih di lautan.\"\n(HR. Muslim No. 597)");
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout hadist1Layout = new javax.swing.GroupLayout(hadist1);
        hadist1.setLayout(hadist1Layout);
        hadist1Layout.setHorizontalGroup(
            hadist1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(hadist1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 443, Short.MAX_VALUE)
                .addContainerGap())
        );
        hadist1Layout.setVerticalGroup(
            hadist1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(hadist1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 475, Short.MAX_VALUE)
                .addContainerGap())
        );

        hadistP.add(hadist1, "card2");

        hadist2.setBackground(new java.awt.Color(102, 102, 102));
        hadist2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));

        jTextArea2.setBackground(new java.awt.Color(102, 102, 102));
        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTextArea2.setForeground(new java.awt.Color(255, 255, 255));
        jTextArea2.setRows(5);
        jTextArea2.setText("Dalam sebuah hadis,\nNabi Muhammad shallallahu ‘alaihi wa sallam beristigfar\nlebih dari 70 kali setiap hari.\n\nBerdasarkan hadis riwayat Bukhori nomor 6307,\nAbu Hurairah radhiyallahu ‘anhu,\nia mendengar bahwa Nabi Muhammad\nshallallahu ‘alaihi wa sallam bersabda:\n\nوَاللَّهِ إِنِّى لأَسْتَغْفِرُ اللَّهَ وَأَتُوبُ إِلَيْهِ فِى الْيَوْمِ أَكْثَرَ مِنْ سَبْعِينَ مَرَّةً\n\nArtinya: Demi Allah, aku sungguh beristigfar pada Allah \ndan bertaubat pada-Nya\ndalam sehari lebih dari 70 kali.");
        jScrollPane2.setViewportView(jTextArea2);

        javax.swing.GroupLayout hadist2Layout = new javax.swing.GroupLayout(hadist2);
        hadist2.setLayout(hadist2Layout);
        hadist2Layout.setHorizontalGroup(
            hadist2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(hadist2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 443, Short.MAX_VALUE)
                .addContainerGap())
        );
        hadist2Layout.setVerticalGroup(
            hadist2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(hadist2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 475, Short.MAX_VALUE)
                .addContainerGap())
        );

        hadistP.add(hadist2, "card3");

        hadist3.setBackground(new java.awt.Color(102, 102, 102));
        hadist3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));

        jTextArea3.setBackground(new java.awt.Color(102, 102, 102));
        jTextArea3.setColumns(20);
        jTextArea3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTextArea3.setForeground(new java.awt.Color(255, 255, 255));
        jTextArea3.setRows(5);
        jTextArea3.setText("Barangsiapa yang bersholawat kepadaku hari Jumat sebanyak 80 kali\nniscaya Allah mengampuni dosanya selama 80 tahun.\" \n\nAda yang bertanya kepada beliau:\n\"Wahai Rasulullah, bagaimanakah cara bersholawat atasmu? \n\nBeliau menjawab:\"Ucapkanlah \n'Allahumma sholli 'ala Muhammadin \n'Abdika wa Rasulika An-Nabiyyil Ummiy,\nini dihitung sekali\"");
        jScrollPane3.setViewportView(jTextArea3);

        javax.swing.GroupLayout hadist3Layout = new javax.swing.GroupLayout(hadist3);
        hadist3.setLayout(hadist3Layout);
        hadist3Layout.setHorizontalGroup(
            hadist3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(hadist3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 443, Short.MAX_VALUE)
                .addContainerGap())
        );
        hadist3Layout.setVerticalGroup(
            hadist3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(hadist3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 475, Short.MAX_VALUE)
                .addContainerGap())
        );

        hadistP.add(hadist3, "card4");

        jLabel2.setFont(new java.awt.Font("Bell Gothic Std Black", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Hadist Ilmu & Dzikir");

        jLabel3.setFont(new java.awt.Font("Bell Gothic Std Black", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("dan Tasbih Digital");

        javax.swing.GroupLayout bodyPLayout = new javax.swing.GroupLayout(bodyP);
        bodyP.setLayout(bodyPLayout);
        bodyPLayout.setHorizontalGroup(
            bodyPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bodyPLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(hadistP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(bodyPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bodyPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(tasbihP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(hadistlistP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bodyPLayout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addGap(22, 22, 22)))
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        bodyPLayout.setVerticalGroup(
            bodyPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bodyPLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(bodyPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(hadistP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(bodyPLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(hadistlistP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tasbihP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bodyP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bodyP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private int x;
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        x++;
        Tasbihtxt.setText(Integer.toString(x));
    }//GEN-LAST:event_jButton1ActionPerformed

    private void TasbihtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TasbihtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TasbihtxtActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        x=0;
        Tasbihtxt.setText(String.valueOf(x));
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnH1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnH1ActionPerformed
        // TODO add your handling code here:
        //remove panel
        hadistP.removeAll();
        hadistP.repaint();
        hadistP.revalidate();
        //add panel
        hadistP.add(hadist1);
        hadistP.repaint();
        hadistP.revalidate();
    }//GEN-LAST:event_btnH1ActionPerformed

    private void btnH2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnH2ActionPerformed
        // TODO add your handling code here:
        //remove panel
        hadistP.removeAll();
        hadistP.repaint();
        hadistP.revalidate();
        //add panel
        hadistP.add(hadist2);
        hadistP.repaint();
        hadistP.revalidate();
    }//GEN-LAST:event_btnH2ActionPerformed

    private void btnH3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnH3ActionPerformed
        // TODO add your handling code here:
        //remove panel
        hadistP.removeAll();
        hadistP.repaint();
        hadistP.revalidate();
        //add panel
        hadistP.add(hadist3);
        hadistP.repaint();
        hadistP.revalidate();
    }//GEN-LAST:event_btnH3ActionPerformed

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
            java.util.logging.Logger.getLogger(MainJFrameGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrameGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrameGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrameGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrameGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Tasbihtxt;
    private javax.swing.JPanel bodyP;
    private javax.swing.JButton btnH1;
    private javax.swing.JButton btnH2;
    private javax.swing.JButton btnH3;
    private javax.swing.JPanel hadist1;
    private javax.swing.JPanel hadist2;
    private javax.swing.JPanel hadist3;
    private javax.swing.JPanel hadistP;
    private javax.swing.JPanel hadistlistP;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JPanel tasbihP;
    // End of variables declaration//GEN-END:variables
}
