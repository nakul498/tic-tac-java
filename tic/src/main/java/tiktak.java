
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author nakul
 */
public class tiktak extends javax.swing.JFrame {
    int a=0,b=0,st1=0,st2=0,st3=0,st4=0,st5=0,st6=0,st7=0,st8=0,st9=0,win=0,flag=0;
    Icon circle = new ImageIcon("C:\\Users\\nakul\\OneDrive\\Documents\\NetBeansProjects\\tic\\src\\main\\java\\circle.png");
    Icon cross = new ImageIcon("C:\\Users\\nakul\\OneDrive\\Documents\\NetBeansProjects\\tic\\src\\main\\java\\cross.png");
    public tiktak() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        b1 = new javax.swing.JButton();
        b2 = new javax.swing.JButton();
        b3 = new javax.swing.JButton();
        b4 = new javax.swing.JButton();
        b5 = new javax.swing.JButton();
        b6 = new javax.swing.JButton();
        b7 = new javax.swing.JButton();
        b8 = new javax.swing.JButton();
        b9 = new javax.swing.JButton();
        next = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        b1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b1MouseClicked(evt);
            }
        });
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });

        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });

        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });

        b4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b4MouseClicked(evt);
            }
        });
        b4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b4ActionPerformed(evt);
            }
        });

        b5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b5ActionPerformed(evt);
            }
        });

        b6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b6ActionPerformed(evt);
            }
        });

        b7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b7ActionPerformed(evt);
            }
        });

        b8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b8ActionPerformed(evt);
            }
        });

        b9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(b7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(b8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(b4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(b5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(b2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(b3, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                    .addComponent(b6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(b9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(21, 21, 21))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(b3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(b2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(b4, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                    .addComponent(b5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(b6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(b7, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
                    .addComponent(b8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(b9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        next.setText("next");
        next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(next, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(next)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
        if(st1==0&&win==0){
            flag++;
            if(a>=b){
                b1.setIcon(cross);
                b++;
                st1=1; 
            if(st2==1&&st3==1)
                win=1;
            else if(st4==1&&st7==1)
                win=1;
            else if(st5==1&&st9==1)
                win=1;
            }   
            else{
                b1.setIcon(circle);
                a++;
                st1=2;
                if(st2==2&&st3==2)
                    win=2;
                else if(st4==2&&st7==2)
                    win=2;
                else if(st5==2&&st9==2)
                    win=2;
            }   
            if(win==1)
               JOptionPane.showMessageDialog(null, "Player 1 Win");
            else if(win==2)
               JOptionPane.showMessageDialog(null, "Player 2 Win");
            else if(flag==9)
            JOptionPane.showMessageDialog(null, "Its a Draw");
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_b1ActionPerformed

    private void b4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b4ActionPerformed
        if(st4==0&&win==0){
            flag++;
            if(a>=b){
                b4.setIcon(cross);
                b++;
                st4=1;
                if(st1==1&&st7==1)
                    win=1;
                else if(st5==1&&st6==1)
                    win=1;
            }   
            else{
                b4.setIcon(circle);
                a++;
                st4=2;   
                if(st1==2&&st7==2)
                    win=2;
                else if(st5==2&&st6==2)
                    win=2;
            } 
            if(win==1)
                JOptionPane.showMessageDialog(null, "Player 1 Win");
            else if(win==2)
                JOptionPane.showMessageDialog(null, "Player 2 Win");
            else if(flag==9)
            JOptionPane.showMessageDialog(null, "Its a Draw");
        }
    // TODO add your handling code here:
    }//GEN-LAST:event_b4ActionPerformed

    private void b7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b7ActionPerformed
        if(st7==0&&win==0){
            flag++;
            if(a>=b){
                b7.setIcon(cross);
                b++;
                st7=1; 
                if(st8==1&&st9==1)
                    win=1;
                else if(st1==1&&st4==1)
                    win=1;
                else if(st5==1&&st3==1)
                    win=1;
            }   
            else{
                b7.setIcon(circle);
                a++;
                st7=2;
                if(st8==2&&st9==2)
                    win=2;
                else if(st1==2&&st4==2)
                    win=2;
                else if(st5==2&&st3==2)
                    win=2;
            }     
            if(win==1)
                JOptionPane.showMessageDialog(null, "Player 1 Win");
            else if(win==2)
                JOptionPane.showMessageDialog(null, "Player 2 Win");
            else if(flag==9)
            JOptionPane.showMessageDialog(null, "Its a Draw");
        
        }// TODO add your handling code here:
    }//GEN-LAST:event_b7ActionPerformed

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
        if(st2==0&&win==0){
            flag++;
            if(a>=b){
                b2.setIcon(cross);
                b++;
                st2=1;
                if(st5==1&&st8==1)
                    win=1;
                else if(st1==1&&st3==1)
                    win=1;
            }   
            else{
                b2.setIcon(circle);
                a++;
                st2=2;
                if(st5==2&&st8==2)
                    win=2;
                else if(st1==2&&st3==2)
                     win=2;
            }    
        if(win==1)
           JOptionPane.showMessageDialog(null, "Player 1 Win");
        else if(win==2)
           JOptionPane.showMessageDialog(null, "Player 2 Win");
        else if(flag==9)
            JOptionPane.showMessageDialog(null, "Its a Draw");
    }
    }//GEN-LAST:event_b2ActionPerformed

    private void b9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b9ActionPerformed
        if(st9==0&&win==0){
            flag++;
            if(a>=b){
                b9.setIcon(cross);
                b++;
                st9=1;
                if(st3==1&&st6==1)
                    win=1;
                else if(st7==1&&st8==1)
                    win=1;
                else if(st1==1&&st5==1)
                    win=1;
            }   
            else{
                b9.setIcon(circle);
                a++;
                st9=2;
                if(st3==2&&st6==2)
                    win=2;
                else if(st7==2&&st8==2)
                    win=2;
                else if(st1==2&&st5==2)
                    win=2;
            }        
            if(win==1)
                JOptionPane.showMessageDialog(null, "Player 1 Win");
            else if(win==2)
                JOptionPane.showMessageDialog(null, "Player 2 Win");
            else if(flag==9)
            JOptionPane.showMessageDialog(null, "Its a Draw");
        }
    // TODO add your handling code here:
    }//GEN-LAST:event_b9ActionPerformed

    private void b4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b4MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_b4MouseClicked

    private void b1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b1MouseClicked

    // TODO add your handling code here:
    }//GEN-LAST:event_b1MouseClicked

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3ActionPerformed
        if(st3==0&&win==0){
            flag++;
            if(a>=b){
                b3.setIcon(cross);
                b++;
                st3=1;
                if(st5==1&&st7==1)
                    win=1;
                else if(st6==1&&st9==1)
                    win=1;
                else if(st1==1&&st2==1)
                    win=1;
            }   
            else{
                b3.setIcon(circle);
                a++;
                st3=2;
                if(st5==2&&st7==2)
                    win=2;
                else if(st6==2&&st9==2)
                    win=2;
                else if(st1==2&&st2==2)
                    win=2;
            }   
            if(win==1)
                JOptionPane.showMessageDialog(null, "Player 1 Win");
            else if(win==2)
                JOptionPane.showMessageDialog(null, "Player 2 Win");
            else if(flag==9)
            JOptionPane.showMessageDialog(null, "Its a Draw");
        }
    // TODO add your handling code here:
    }//GEN-LAST:event_b3ActionPerformed

    private void b5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b5ActionPerformed
        if(st5==0&&win==0){
            flag++;
            if(a>=b){
                b5.setIcon(cross);
                b++;
                st5=1;
                if(st4==1&&st6==1)
                    win=1;
                else if(st3==1&&st7==1)
                    win=1;
                else if(st1==1&&st9==1)
                    win=1;
                else if(st2==1&&st8==1)
                    win=1;
            }   
            else{
                b5.setIcon(circle);
                a++;
                st5=2;
                if(st4==2&&st6==2)
                    win=2;
                else if(st3==2&&st7==2)
                    win=2;
                else if(st1==2&&st9==2)
                    win=2;
                else if(st2==2&&st8==2)
                    win=2;
            }
            if(win==1)
                JOptionPane.showMessageDialog(null, "Player 1 Win");
            else if(win==2)
                JOptionPane.showMessageDialog(null, "Player 2 Win");
            else if(flag==9)
            JOptionPane.showMessageDialog(null, "Its a Draw");
        }
// TODO add your handling code here:
    }//GEN-LAST:event_b5ActionPerformed

    private void b6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b6ActionPerformed
        if(st6==0&&win==0){
            flag++;
            if(a>=b){
                b6.setIcon(cross);
                b++;
                st6=1;
                if(st3==1&&st9==1)
                    win=1;
                else if(st4==1&&st5==1)
                    win=1;
            }   
            else{
                b6.setIcon(circle);
                a++;
                st6=2;
                if(st3==2&&st9==2)
                    win=2;
                else if(st4==2&&st5==2)
                    win=2;
            }   
            if(win==1)
               JOptionPane.showMessageDialog(null, "Player 1 Win");
            else if(win==2)
                JOptionPane.showMessageDialog(null, "Player 2 Win");
            else if(flag==9)
            JOptionPane.showMessageDialog(null, "Its a Draw");
        }
    // TODO add your handling code here:
    }//GEN-LAST:event_b6ActionPerformed

    private void b8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b8ActionPerformed
        if(st8==0&&win==0){
            flag++;
            if(a>=b){
            b8.setIcon(cross);
            b++;
            st8=1;
            if(st7==1&&st9==1)
                win=1;
            else if(st2==1&&st5==1)
                win=1;
        }   
        else{
            b8.setIcon(circle);
            a++;
            st8=2;
            if(st7==2&&st9==2)
                win=2;
            else if(st2==2&&st5==2)
                win=2;
        }    
        if(win==1)
            JOptionPane.showMessageDialog(null, "Player 1 Win");
        else if(win==2)
            JOptionPane.showMessageDialog(null, "Player 2 Win");
        else if(flag==9)
            JOptionPane.showMessageDialog(null, "Its a Draw");
        }
    // TODO add your handling code here:
    }//GEN-LAST:event_b8ActionPerformed

    private void nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextActionPerformed
        tab1 gg=new tab1();
        gg.show();
        dispose();  
            // TODO add your handling code here:
    }//GEN-LAST:event_nextActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        Icon circle = new ImageIcon("C:\\Users\\nakul\\OneDrive\\Documents\\NetBeansProjects\\tic\\src\\main\\java\\circle.png");

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(tiktak.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tiktak.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tiktak.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tiktak.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tiktak().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b1;
    private javax.swing.JButton b2;
    private javax.swing.JButton b3;
    private javax.swing.JButton b4;
    private javax.swing.JButton b5;
    private javax.swing.JButton b6;
    private javax.swing.JButton b7;
    private javax.swing.JButton b8;
    private javax.swing.JButton b9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton next;
    // End of variables declaration//GEN-END:variables
}
