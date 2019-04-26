
package MemoryGame;

import javax.swing.Timer;

public class NumberGuesser extends javax.swing.JFrame  {
    
    Memory game1 = new Memory(0,false,0,0,1);
    String scoreSaver= "";
    String finalNum= "";
    GameOver goToEnd= new GameOver();
    
    public NumberGuesser() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        newNumber = new javax.swing.JButton();
        numToGuess = new javax.swing.JLabel();
        txtBox = new javax.swing.JTextField();
        goButton = new javax.swing.JButton();
        statusLabel = new javax.swing.JLabel();
        scoreLabel = new javax.swing.JLabel();
        quitButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 250, 240));
        setForeground(java.awt.Color.orange);

        newNumber.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        newNumber.setText("Get New Number");
        newNumber.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        newNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newNumberActionPerformed(evt);
            }
        });

        numToGuess.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        numToGuess.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        numToGuess.setText(".");

        txtBox.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        txtBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBoxActionPerformed(evt);
            }
        });

        goButton.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        goButton.setText("GO");
        goButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        goButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goButtonActionPerformed(evt);
            }
        });

        statusLabel.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        statusLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        statusLabel.setText(".");
        statusLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        scoreLabel.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        scoreLabel.setText("Score: 0");

        quitButton.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        quitButton.setText("QUIT");
        quitButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        quitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quitButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(numToGuess, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(newNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtBox, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(statusLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(129, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addComponent(goButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(quitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(scoreLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(37, 37, 37))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(scoreLabel)
                .addGap(33, 33, 33)
                .addComponent(newNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(numToGuess, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtBox, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(statusLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(goButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(quitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(52, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBoxActionPerformed

    private void newNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newNumberActionPerformed
        goButton.setEnabled(true);
        statusLabel.setText(null);
        game1.currentNum= game1.numGenerator(game1.level);
        numToGuess.setText(Integer.toString(game1.currentNum));
        Timer timer = new Timer(1000, e -> numToGuess.setText(null));
        timer.setRepeats(false);
        timer.start();
        newNumber.setEnabled(false);
    }//GEN-LAST:event_newNumberActionPerformed

    private void goButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goButtonActionPerformed
        try{
            game1.scoreAdder= game1.check(Integer.parseInt(txtBox.getText()),game1.currentNum);
            if(game1.scoreAdder== true){
                statusLabel.setText("Correct!");
                game1.score +=1;
                scoreLabel.setText("Score: "+Integer.toString(game1.score));
                game1.level +=1;
                newNumber.setEnabled(true);
                goButton.setEnabled(false);
            }else {
                statusLabel.setText("Incorrect");
                scoreLabel.setText("Final Score: "+Integer.toString(game1.score));
                goButton.setEnabled(false);
                scoreSaver= Integer.toString(game1.score);
                finalNum= Integer.toString(game1.currentNum);
                setVisible(false);
                dispose();
                goToEnd.setVisible(true);
            }
        } catch (Exception e){
            statusLabel.setText("Invalid entry. Enter an integer to guess");
        }
       txtBox.setText(null);
    }//GEN-LAST:event_goButtonActionPerformed

    private void quitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quitButtonActionPerformed
        setVisible(false);
        dispose();
        goToEnd.setVisible(true);
    }//GEN-LAST:event_quitButtonActionPerformed

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
            java.util.logging.Logger.getLogger(NumberGuesser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NumberGuesser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NumberGuesser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NumberGuesser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NumberGuesser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton goButton;
    private javax.swing.JButton newNumber;
    private javax.swing.JLabel numToGuess;
    private javax.swing.JButton quitButton;
    private javax.swing.JLabel scoreLabel;
    private javax.swing.JLabel statusLabel;
    private javax.swing.JTextField txtBox;
    // End of variables declaration//GEN-END:variables
}
