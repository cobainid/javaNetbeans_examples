
package calculatorgui;

import javax.swing.JOptionPane;


public class Calculator extends javax.swing.JFrame {
    
    float tmpNum;
    String operator = "";
    float secondNum;
    float resultNum;


    public Calculator() {
        initComponents();
        this.setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        box = new javax.swing.JPanel();
        boxArea = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        actionClear = new javax.swing.JButton();
        actionDel = new javax.swing.JButton();
        actionPlus = new javax.swing.JButton();
        sevenNum = new javax.swing.JButton();
        eightNum = new javax.swing.JButton();
        nineNum = new javax.swing.JButton();
        actionMin = new javax.swing.JButton();
        fourNum = new javax.swing.JButton();
        fiveNum = new javax.swing.JButton();
        sixNum = new javax.swing.JButton();
        actionMultiple = new javax.swing.JButton();
        oneNum = new javax.swing.JButton();
        twoNum = new javax.swing.JButton();
        threeNum = new javax.swing.JButton();
        actionDiv = new javax.swing.JButton();
        dots = new javax.swing.JButton();
        zeroNum = new javax.swing.JButton();
        equalButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculator Java");
        setBackground(new java.awt.Color(140, 196, 211));

        jPanel2.setBackground(new java.awt.Color(140, 196, 211));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        box.setBorder(null);
        box.setPreferredSize(new java.awt.Dimension(275, 50));

        boxArea.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        javax.swing.GroupLayout boxLayout = new javax.swing.GroupLayout(box);
        box.setLayout(boxLayout);
        boxLayout.setHorizontalGroup(
            boxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, boxLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(boxArea, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)
                .addContainerGap())
        );
        boxLayout.setVerticalGroup(
            boxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, boxLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(boxArea, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.add(box, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 280, 50));

        jPanel1.setBackground(new java.awt.Color(140, 196, 211));
        jPanel1.setPreferredSize(new java.awt.Dimension(60, 45));
        java.awt.FlowLayout flowLayout1 = new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 0, 0);
        flowLayout1.setAlignOnBaseline(true);
        jPanel1.setLayout(flowLayout1);

        actionClear.setBackground(new java.awt.Color(140, 196, 211));
        actionClear.setForeground(new java.awt.Color(1, 1, 1));
        actionClear.setText("c");
        actionClear.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(254, 254, 254), 1, true));
        actionClear.setFocusPainted(false);
        actionClear.setPreferredSize(new java.awt.Dimension(70, 50));
        actionClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actionClearActionPerformed(evt);
            }
        });
        jPanel1.add(actionClear);

        actionDel.setBackground(new java.awt.Color(140, 196, 211));
        actionDel.setForeground(new java.awt.Color(1, 1, 1));
        actionDel.setText("d");
        actionDel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(254, 254, 254), 1, true));
        actionDel.setFocusPainted(false);
        actionDel.setPreferredSize(new java.awt.Dimension(140, 50));
        actionDel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actionDelActionPerformed(evt);
            }
        });
        jPanel1.add(actionDel);

        actionPlus.setBackground(new java.awt.Color(140, 196, 211));
        actionPlus.setForeground(new java.awt.Color(1, 1, 1));
        actionPlus.setText("+");
        actionPlus.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(254, 254, 254), 1, true));
        actionPlus.setFocusPainted(false);
        actionPlus.setPreferredSize(new java.awt.Dimension(70, 50));
        actionPlus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actionPlusActionPerformed(evt);
            }
        });
        jPanel1.add(actionPlus);

        sevenNum.setBackground(new java.awt.Color(140, 196, 211));
        sevenNum.setForeground(new java.awt.Color(1, 1, 1));
        sevenNum.setText("7");
        sevenNum.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(254, 254, 254), 1, true));
        sevenNum.setFocusPainted(false);
        sevenNum.setPreferredSize(new java.awt.Dimension(70, 50));
        sevenNum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sevenNumActionPerformed(evt);
            }
        });
        jPanel1.add(sevenNum);

        eightNum.setBackground(new java.awt.Color(140, 196, 211));
        eightNum.setForeground(new java.awt.Color(1, 1, 1));
        eightNum.setText("8");
        eightNum.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(254, 254, 254), 1, true));
        eightNum.setFocusPainted(false);
        eightNum.setPreferredSize(new java.awt.Dimension(70, 50));
        eightNum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eightNumActionPerformed(evt);
            }
        });
        jPanel1.add(eightNum);

        nineNum.setBackground(new java.awt.Color(140, 196, 211));
        nineNum.setForeground(new java.awt.Color(1, 1, 1));
        nineNum.setText("9");
        nineNum.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(254, 254, 254), 1, true));
        nineNum.setFocusPainted(false);
        nineNum.setPreferredSize(new java.awt.Dimension(70, 50));
        nineNum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nineNumActionPerformed(evt);
            }
        });
        jPanel1.add(nineNum);

        actionMin.setBackground(new java.awt.Color(140, 196, 211));
        actionMin.setForeground(new java.awt.Color(1, 1, 1));
        actionMin.setText("-");
        actionMin.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(254, 254, 254), 1, true));
        actionMin.setFocusPainted(false);
        actionMin.setPreferredSize(new java.awt.Dimension(70, 50));
        actionMin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actionMinActionPerformed(evt);
            }
        });
        jPanel1.add(actionMin);

        fourNum.setBackground(new java.awt.Color(140, 196, 211));
        fourNum.setForeground(new java.awt.Color(1, 1, 1));
        fourNum.setText("4");
        fourNum.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(254, 254, 254), 1, true));
        fourNum.setFocusPainted(false);
        fourNum.setPreferredSize(new java.awt.Dimension(70, 50));
        fourNum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fourNumActionPerformed(evt);
            }
        });
        jPanel1.add(fourNum);

        fiveNum.setBackground(new java.awt.Color(140, 196, 211));
        fiveNum.setForeground(new java.awt.Color(1, 1, 1));
        fiveNum.setText("5");
        fiveNum.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(254, 254, 254), 1, true));
        fiveNum.setFocusPainted(false);
        fiveNum.setPreferredSize(new java.awt.Dimension(70, 50));
        fiveNum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fiveNumActionPerformed(evt);
            }
        });
        jPanel1.add(fiveNum);

        sixNum.setBackground(new java.awt.Color(140, 196, 211));
        sixNum.setForeground(new java.awt.Color(1, 1, 1));
        sixNum.setText("6");
        sixNum.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(254, 254, 254), 1, true));
        sixNum.setFocusPainted(false);
        sixNum.setPreferredSize(new java.awt.Dimension(70, 50));
        sixNum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sixNumActionPerformed(evt);
            }
        });
        jPanel1.add(sixNum);

        actionMultiple.setBackground(new java.awt.Color(140, 196, 211));
        actionMultiple.setForeground(new java.awt.Color(1, 1, 1));
        actionMultiple.setText("*");
        actionMultiple.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(254, 254, 254), 1, true));
        actionMultiple.setFocusPainted(false);
        actionMultiple.setPreferredSize(new java.awt.Dimension(70, 50));
        actionMultiple.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actionMultipleActionPerformed(evt);
            }
        });
        jPanel1.add(actionMultiple);

        oneNum.setBackground(new java.awt.Color(140, 196, 211));
        oneNum.setForeground(new java.awt.Color(1, 1, 1));
        oneNum.setText("1");
        oneNum.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(254, 254, 254), 1, true));
        oneNum.setFocusPainted(false);
        oneNum.setPreferredSize(new java.awt.Dimension(70, 50));
        oneNum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oneNumActionPerformed(evt);
            }
        });
        jPanel1.add(oneNum);

        twoNum.setBackground(new java.awt.Color(140, 196, 211));
        twoNum.setForeground(new java.awt.Color(1, 1, 1));
        twoNum.setText("2");
        twoNum.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(254, 254, 254), 1, true));
        twoNum.setFocusPainted(false);
        twoNum.setPreferredSize(new java.awt.Dimension(70, 50));
        twoNum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                twoNumActionPerformed(evt);
            }
        });
        jPanel1.add(twoNum);

        threeNum.setBackground(new java.awt.Color(140, 196, 211));
        threeNum.setForeground(new java.awt.Color(1, 1, 1));
        threeNum.setText("3");
        threeNum.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(254, 254, 254), 1, true));
        threeNum.setFocusPainted(false);
        threeNum.setPreferredSize(new java.awt.Dimension(70, 50));
        threeNum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                threeNumActionPerformed(evt);
            }
        });
        jPanel1.add(threeNum);

        actionDiv.setBackground(new java.awt.Color(140, 196, 211));
        actionDiv.setForeground(new java.awt.Color(1, 1, 1));
        actionDiv.setText("/");
        actionDiv.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(254, 254, 254), 1, true));
        actionDiv.setFocusPainted(false);
        actionDiv.setMaximumSize(new java.awt.Dimension(120, 50));
        actionDiv.setMinimumSize(new java.awt.Dimension(120, 50));
        actionDiv.setPreferredSize(new java.awt.Dimension(70, 50));
        actionDiv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actionDivActionPerformed(evt);
            }
        });
        jPanel1.add(actionDiv);

        dots.setBackground(new java.awt.Color(140, 196, 211));
        dots.setForeground(new java.awt.Color(1, 1, 1));
        dots.setText(".");
        dots.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(254, 254, 254), 1, true));
        dots.setFocusPainted(false);
        dots.setPreferredSize(new java.awt.Dimension(70, 50));
        dots.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dotsActionPerformed(evt);
            }
        });
        jPanel1.add(dots);

        zeroNum.setBackground(new java.awt.Color(140, 196, 211));
        zeroNum.setForeground(new java.awt.Color(1, 1, 1));
        zeroNum.setText("0");
        zeroNum.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(254, 254, 254), 1, true));
        zeroNum.setFocusPainted(false);
        zeroNum.setMaximumSize(new java.awt.Dimension(120, 50));
        zeroNum.setMinimumSize(new java.awt.Dimension(120, 50));
        zeroNum.setPreferredSize(new java.awt.Dimension(210, 50));
        zeroNum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zeroNumActionPerformed(evt);
            }
        });
        jPanel1.add(zeroNum);

        equalButton.setBackground(new java.awt.Color(140, 196, 211));
        equalButton.setForeground(new java.awt.Color(254, 254, 254));
        equalButton.setText("=");
        equalButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(254, 254, 254), 1, true));
        equalButton.setFocusPainted(false);
        equalButton.setMaximumSize(new java.awt.Dimension(100, 39));
        equalButton.setMinimumSize(new java.awt.Dimension(100, 39));
        equalButton.setPreferredSize(new java.awt.Dimension(280, 50));
        equalButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                equalButtonActionPerformed(evt);
            }
        });
        jPanel1.add(equalButton);

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 280, 300));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sevenNumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sevenNumActionPerformed
        boxArea.setText(boxArea.getText()+sevenNum.getText());
    }//GEN-LAST:event_sevenNumActionPerformed

    private void actionDelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actionDelActionPerformed
        if(boxArea.getText().length() == 0){
            JOptionPane.showMessageDialog(rootPane, "Error");
        } else {
            String s= String.valueOf(boxArea.getText());
            boxArea.setText(s.substring(0,s.length()-1));   
        }
    }//GEN-LAST:event_actionDelActionPerformed

    private void actionPlusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actionPlusActionPerformed
        if(!operator.equals("")){
            JOptionPane.showMessageDialog(rootPane, "Error");
        } else {
            tmpNum = Float.parseFloat(boxArea.getText());
            operator = "+";
            boxArea.setText("");
        }

    }//GEN-LAST:event_actionPlusActionPerformed

    private void equalButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_equalButtonActionPerformed
            if(operator.equals("+")){
                resultNum = tmpNum+Float.parseFloat(boxArea.getText());
                boxArea.setText(String.valueOf(resultNum));
                operator = "";
            } else if(operator.equals("-")){
                resultNum = tmpNum-Float.parseFloat(boxArea.getText());
                boxArea.setText(String.valueOf(resultNum));
                operator = "";
            } else if(operator.equals("*")){
                resultNum = tmpNum*Float.parseFloat(boxArea.getText());
                boxArea.setText(String.valueOf(resultNum));
                operator = "";
            } else if(operator.equals("/")){
                resultNum = tmpNum/Float.parseFloat(boxArea.getText());
                boxArea.setText(String.valueOf(resultNum));
                operator = "";
            }
        
    }//GEN-LAST:event_equalButtonActionPerformed

    private void actionMinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actionMinActionPerformed
        if(!operator.equals("")){
            JOptionPane.showMessageDialog(rootPane, "Error");
        } else {
            tmpNum = Float.parseFloat(boxArea.getText());
            operator = "-";
            boxArea.setText("");            
        }
    }//GEN-LAST:event_actionMinActionPerformed

    private void eightNumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eightNumActionPerformed
        boxArea.setText(boxArea.getText()+eightNum.getText());
    }//GEN-LAST:event_eightNumActionPerformed

    private void nineNumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nineNumActionPerformed
        boxArea.setText(boxArea.getText()+nineNum.getText());
    }//GEN-LAST:event_nineNumActionPerformed

    private void fourNumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fourNumActionPerformed
        boxArea.setText(boxArea.getText()+fourNum.getText());
    }//GEN-LAST:event_fourNumActionPerformed

    private void fiveNumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fiveNumActionPerformed
        boxArea.setText(boxArea.getText()+fiveNum.getText());
    }//GEN-LAST:event_fiveNumActionPerformed

    private void sixNumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sixNumActionPerformed
        boxArea.setText(boxArea.getText()+sixNum.getText());
    }//GEN-LAST:event_sixNumActionPerformed

    private void oneNumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oneNumActionPerformed
        boxArea.setText(boxArea.getText()+oneNum.getText());
    }//GEN-LAST:event_oneNumActionPerformed

    private void twoNumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_twoNumActionPerformed
        boxArea.setText(boxArea.getText()+twoNum.getText());
    }//GEN-LAST:event_twoNumActionPerformed

    private void threeNumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_threeNumActionPerformed
        boxArea.setText(boxArea.getText()+threeNum.getText());
    }//GEN-LAST:event_threeNumActionPerformed

    private void zeroNumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zeroNumActionPerformed
        boxArea.setText(boxArea.getText()+zeroNum.getText());
    }//GEN-LAST:event_zeroNumActionPerformed

    private void dotsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dotsActionPerformed
        boxArea.setText(boxArea.getText()+dots.getText());
    }//GEN-LAST:event_dotsActionPerformed

    private void actionMultipleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actionMultipleActionPerformed
        if(!operator.equals("")){
            JOptionPane.showMessageDialog(rootPane, "Error");
        } else {
            tmpNum = Float.parseFloat(boxArea.getText());
            operator = "*";
            boxArea.setText("");
        }
    }//GEN-LAST:event_actionMultipleActionPerformed

    private void actionDivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actionDivActionPerformed
        if(!operator.equals("")){
            JOptionPane.showMessageDialog(rootPane, "Error");
        } else {
            tmpNum = Float.parseFloat(boxArea.getText());
            operator = "/";
            boxArea.setText("");
        }
    }//GEN-LAST:event_actionDivActionPerformed

    private void actionClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actionClearActionPerformed
        operator = "";
        boxArea.setText("");
        tmpNum=0;
    }//GEN-LAST:event_actionClearActionPerformed

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
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton actionClear;
    private javax.swing.JButton actionDel;
    private javax.swing.JButton actionDiv;
    private javax.swing.JButton actionMin;
    private javax.swing.JButton actionMultiple;
    private javax.swing.JButton actionPlus;
    private javax.swing.JPanel box;
    private javax.swing.JLabel boxArea;
    private javax.swing.JButton dots;
    private javax.swing.JButton eightNum;
    private javax.swing.JButton equalButton;
    private javax.swing.JButton fiveNum;
    private javax.swing.JButton fourNum;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton nineNum;
    private javax.swing.JButton oneNum;
    private javax.swing.JButton sevenNum;
    private javax.swing.JButton sixNum;
    private javax.swing.JButton threeNum;
    private javax.swing.JButton twoNum;
    private javax.swing.JButton zeroNum;
    // End of variables declaration//GEN-END:variables
}
