/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package playlistapp;

import javax.swing.JOptionPane;

/**
 *
 * @author Matty School
 */
public class PlaylistGUI extends javax.swing.JFrame {

    private Interface1 myGenreA;
    private Interface1 myGenreB;
    Interface2 myLiked;

    /**
     * Creates new form PlaylistGUI
     */
    public PlaylistGUI() {
        myGenreA = new GenreA();
        myGenreB = new GenreB();
        myLiked = new Liked();
        initComponents();
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
        rTextArea = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        rapTextArea = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        lTextArea = new javax.swing.JTextArea();
        lTitle = new javax.swing.JLabel();
        rTitle = new javax.swing.JLabel();
        rapTitle = new javax.swing.JLabel();
        title = new javax.swing.JLabel();
        addBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        searchBtn = new javax.swing.JButton();
        songTitle = new javax.swing.JLabel();
        songTf = new javax.swing.JTextField();
        genreTitle = new javax.swing.JLabel();
        genreTf = new javax.swing.JTextField();
        moveBtn = new javax.swing.JButton();
        displayBtn = new javax.swing.JButton();
        repeatBtn = new javax.swing.JButton();
        songBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        rTextArea.setColumns(20);
        rTextArea.setRows(5);
        jScrollPane1.setViewportView(rTextArea);

        rapTextArea.setColumns(20);
        rapTextArea.setRows(5);
        jScrollPane2.setViewportView(rapTextArea);

        lTextArea.setColumns(20);
        lTextArea.setRows(5);
        jScrollPane3.setViewportView(lTextArea);

        lTitle.setText("Liked Songs");

        rTitle.setText("Rnb Music");

        rapTitle.setText("Rap Music");

        title.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        title.setText("Welcome To Your Playlist");

        addBtn.setText("Add");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });

        deleteBtn.setText("Delete");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        searchBtn.setText("Search");
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });

        songTitle.setText("Enter Song:");

        songTf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                songTfActionPerformed(evt);
            }
        });

        genreTitle.setText("Enter Genre:");

        genreTf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genreTfActionPerformed(evt);
            }
        });

        moveBtn.setText("Move");
        moveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moveBtnActionPerformed(evt);
            }
        });

        displayBtn.setText("Display");
        displayBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayBtnActionPerformed(evt);
            }
        });

        repeatBtn.setText("Repeat");
        repeatBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                repeatBtnActionPerformed(evt);
            }
        });

        songBtn.setText("No.Songs");
        songBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                songBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(songTf)
                                        .addGap(48, 48, 48))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(songTitle)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(addBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(genreTf, javax.swing.GroupLayout.Alignment.TRAILING))
                                    .addComponent(genreTitle))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(searchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(8, 8, 8))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(displayBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGap(3, 3, 3)
                        .addComponent(moveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rapTitle)
                        .addGap(115, 115, 115))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(121, 121, 121)
                                .addComponent(repeatBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(75, 75, 75)
                                .addComponent(songBtn)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(79, 79, 79))
            .addGroup(layout.createSequentialGroup()
                .addGap(196, 196, 196)
                .addComponent(title)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(rTitle)
                        .addGap(197, 197, 197))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lTitle)
                        .addGap(193, 193, 193))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(title)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(lTitle)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(songTitle)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(songTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26)
                .addComponent(rTitle)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(rapTitle)
                        .addGap(28, 28, 28)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(genreTitle)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(genreTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addBtn)
                            .addComponent(deleteBtn))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(searchBtn)
                            .addComponent(moveBtn))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(repeatBtn)
                            .addComponent(displayBtn))
                        .addGap(18, 18, 18)
                        .addComponent(songBtn)))
                .addGap(84, 84, 84))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void songTfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_songTfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_songTfActionPerformed

    private void genreTfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genreTfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_genreTfActionPerformed

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        // TODO add your handling code here:
        Song myS = new Song();

        String songName, songGenre;
        songName = songTf.getText();
        songGenre = genreTf.getText();
        myLiked.push(songName);
        lTextArea.append("A song called " + songName + " was added to liked songs\n");
    }//GEN-LAST:event_addBtnActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        // TODO add your handling code here:
        if (myLiked.isEmpty()) {
            lTextArea.append("There are no songs to be removed!\n");
        } else {
            String songRemoved = (String) myLiked.pop();
            lTextArea.append("The song " + songRemoved + " was removed!\n");
        }
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void moveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moveBtnActionPerformed
        // TODO add your handling code here:
        Song myS = new Song();

        myS.setSongName(songTf.getText());
        myS.setSongGenre(genreTf.getText());
        songTf.setText("");
        genreTf.setText("");

        if (myS.getSongGenre().equalsIgnoreCase("rap")) {
            myGenreA.enqueue(myLiked.pop());
            rapTextArea.append(songTf.getText() + ", was successfully added to the playlist rap playlist\n");
        } else if (myS.getSongGenre().equalsIgnoreCase("rnb")) {
            myGenreB.enqueue(myLiked.pop());
            rTextArea.append(songTf.getText() + ", was successfully added to the playlist rnb playlist\n");

        } else {
            lTextArea.append(" invalid input, please put either Rnb or Rap\n");
        }

    }//GEN-LAST:event_moveBtnActionPerformed

    private void displayBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayBtnActionPerformed
        // TODO add your handling code here:
        lTextArea.append(myLiked.displayStack() + "\n");
        rTextArea.append(myGenreB.displayQueue() + "\n");
        rapTextArea.append(myGenreA.displayQueue() + "\n");
    }//GEN-LAST:event_displayBtnActionPerformed

    private void repeatBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_repeatBtnActionPerformed
        // TODO add your handling code here:
        lTextArea.append(myLiked.repeat() + "\n");

    }//GEN-LAST:event_repeatBtnActionPerformed

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
        // TODO add your handling code here:
        lTextArea.append(myLiked.search() + "\n");
    }//GEN-LAST:event_searchBtnActionPerformed

    private void songBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_songBtnActionPerformed
        // TODO add your handling code here:
        lTextArea.append("There are " + myLiked.size() + " songs in the Liked songs playlist\n");
        rTextArea.append("There are " + myGenreB.size() + " songs in the Rnb playlist\n");
        rapTextArea.append("There are " + myGenreA.size() + " songs in the Rap playlist\n");
    }//GEN-LAST:event_songBtnActionPerformed

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
            java.util.logging.Logger.getLogger(PlaylistGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PlaylistGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PlaylistGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PlaylistGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PlaylistGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JButton displayBtn;
    private javax.swing.JTextField genreTf;
    private javax.swing.JLabel genreTitle;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea lTextArea;
    private javax.swing.JLabel lTitle;
    private javax.swing.JButton moveBtn;
    private javax.swing.JTextArea rTextArea;
    private javax.swing.JLabel rTitle;
    private javax.swing.JTextArea rapTextArea;
    private javax.swing.JLabel rapTitle;
    private javax.swing.JButton repeatBtn;
    private javax.swing.JButton searchBtn;
    private javax.swing.JButton songBtn;
    private javax.swing.JTextField songTf;
    private javax.swing.JLabel songTitle;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
