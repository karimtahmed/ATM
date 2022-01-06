package parallel;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

public class client2 extends javax.swing.JFrame {


    static DataOutputStream dout;
    static DataInputStream din;
    static Socket s;
    BufferedReader withdraw1 = new BufferedReader(new InputStreamReader(System.in)); 

    public client2() {
        
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        screen = new javax.swing.JTextArea();
        input = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        checkbalance = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        screen1 = new javax.swing.JTextArea();
        input12 = new javax.swing.JTextField();
        withdraw = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        deposit = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        transaction = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        checkbalance1 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();

        screen.setColumns(20);
        screen.setRows(5);
        jScrollPane1.setViewportView(screen);

        jLabel6.setText("Deposit");

        checkbalance.setText("Check Balance");
        checkbalance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkbalanceActionPerformed(evt);
            }
        });

        jLabel8.setText("Transaction ");

        jLabel10.setText("Check Balance");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("client 2");

        jLabel1.setText("Username:");

        jLabel2.setText("Password:");

        jButton1.setText("Login");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel4.setText("choose the operation you want to perform");

        screen1.setColumns(20);
        screen1.setRows(5);
        jScrollPane2.setViewportView(screen1);

        withdraw.setText("withdraw");
        withdraw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                withdrawActionPerformed(evt);
            }
        });

        jLabel5.setText("Withdraw");

        deposit.setText("Deposit");
        deposit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                depositActionPerformed(evt);
            }
        });

        jLabel7.setText("Deposit");

        transaction.setText("Transaction");
        transaction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transactionActionPerformed(evt);
            }
        });

        jLabel9.setText("Transaction ");

        checkbalance1.setText("check balance");
        checkbalance1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkbalance1ActionPerformed(evt);
            }
        });

        jLabel11.setText("check balance");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(232, 232, 232)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(49, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(4, 4, 4)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addComponent(jLabel9))
                                        .addGap(64, 64, 64))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(43, 43, 43)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(deposit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(withdraw, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(transaction, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(checkbalance1, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)))
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(124, 124, 124)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(input12, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addComponent(jButton1)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(230, 230, 230))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(withdraw)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(deposit)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(checkbalance1)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(transaction))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(input12, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1))
                        .addGap(27, 27, 27))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    // login button 
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            dout.writeUTF(jTextField1.getText());
        } catch (IOException ex) {
            Logger.getLogger(client2.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            dout.writeUTF(jTextField2.getText());
        } catch (IOException ex) {
            Logger.getLogger(client2.class.getName()).log(Level.SEVERE, null, ex);
        }
              
    }//GEN-LAST:event_jButton1ActionPerformed

    // Withdraw Button
    private void withdrawActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_withdrawActionPerformed
 
//          screen1.setText("Enter money to be withdrawn:");
//          String sentencetoclient4 = withdraw1.readLine();
//            try {            
//            dout.writeUTF(input12.getText());
//            } catch (IOException ex) {
//            Logger.getLogger(client11.class.getName()).log(Level.SEVERE, null, ex);
//        }
//          String sentencefromserver2 = din.readUTF();   
//          screen1.setText("Server:" + sentencefromserver2);
          
          
    }//GEN-LAST:event_withdrawActionPerformed
    // Deposit Button 
    private void depositActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_depositActionPerformed

//          screen1.setText("Enter money to be deposited:");
//          String sentencetoclient4= withdraw1.readLine(); 
//          outToServer.writeUTF(sentencetoclient4);
//          String sentencefromserver3 = in.readUTF(); 
//          System.out.println("Server:" + sentencefromserver3);
    }//GEN-LAST:event_depositActionPerformed

    private void checkbalanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkbalanceActionPerformed
    
    }//GEN-LAST:event_checkbalanceActionPerformed
    // Check Balance Button
    private void checkbalance1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkbalance1ActionPerformed
//       screen.setText("Balance : "+balance);
    }//GEN-LAST:event_checkbalance1ActionPerformed
    // Transaction button
    private void transactionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transactionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_transactionActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws IOException{
  
        java.awt.EventQueue.invokeLater(new Runnable() {
        public void run() {
        new client2().setVisible(true);
        jLabel4.setVisible(false);
        screen1.setVisible(false);
        jLabel5.setVisible(false);
        jLabel7.setVisible(false);
        jLabel11.setVisible(false);
        jLabel9.setVisible(false);
        withdraw.setVisible(false);
        deposit.setVisible(false);
        checkbalance1.setVisible(false);
        transaction.setVisible(false);
        input12.setVisible(false); 
            }
        });
            // Create A Socket Object That Holds Network Port Number Network In This Case Is Localhost As Its Running On Your Local Device
            
           s = new Socket("localhost", 9992); // example if its another on computer 192.168.1.5
        
            //  Create DataOutputStream Object To Change The Output Data To Form Of Streams With Passing The Socket Object
            
        dout = new DataOutputStream(s.getOutputStream());
        din = new DataInputStream(s.getInputStream()); 
                
        //Buffer Object Is Used To Hold The Data Output From The Client Side
        
        while(true)
        {               
            String fromServer="";
            fromServer=din.readUTF();
            jLabel3.setText(fromServer);
            if("Login client1".equals(fromServer))
            {
               jTextField1.setVisible(false);
               jTextField2.setVisible(false);
               jButton1.setVisible(false);
               jLabel1.setVisible(false);
               jLabel2.setVisible(false);
               jLabel3.setVisible(false);
               jLabel4.setVisible(true);
               screen1.setVisible(true);
               jLabel5.setVisible(true);
               jLabel7.setVisible(true);
               jLabel11.setVisible(true);
               jLabel9.setVisible(true);
               withdraw.setVisible(true);
               deposit.setVisible(true);
               checkbalance1.setVisible(true);
               transaction.setVisible(true);
               input12.setVisible(true);
            }
            screen1.setText("Server:" + fromServer);

     
          if(jTextField1.getText().equalsIgnoreCase("exist"))
          {
              break;
          }
        }
        s.close();
    
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton checkbalance;
    private static javax.swing.JButton checkbalance1;
    private static javax.swing.JButton deposit;
    private javax.swing.JTextField input;
    private static javax.swing.JTextField input12;
    private static javax.swing.JButton jButton1;
    private static javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private static javax.swing.JLabel jLabel11;
    private static javax.swing.JLabel jLabel2;
    private static javax.swing.JLabel jLabel3;
    private static javax.swing.JLabel jLabel4;
    private static javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private static javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private static javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private static javax.swing.JTextField jTextField1;
    private static javax.swing.JTextField jTextField2;
    private javax.swing.JTextArea screen;
    private static javax.swing.JTextArea screen1;
    private static javax.swing.JButton transaction;
    private static javax.swing.JButton withdraw;
    // End of variables declaration//GEN-END:variables
}
