/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dta;

import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.text.DecimalFormat;


public class Spage extends javax.swing.JFrame {

    /**
     * Creates new form Spage
     */
    public Spage() {
        initComponents();
        loctn.setText(Mainpage.loc);
        dest.setText(Mainpage.des);
     
        
        try{     
         
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
 
            Connection con = DriverManager.getConnection("jdbc:odbc:datafile");
     
             Statement st=con.createStatement();
             bname=Mainpage.s3;
             st.executeQuery("SELECT * FROM bus where id='"+bname+"' ");
             ResultSet rset = st.getResultSet();
             
            while(rset.next())
            {
             
                bname=rset.getString("bus");
               
                eight.setText(bname);
            
            }

}
     catch(Exception e){           
           System.out.println(e); 
           
                    
    }
        //try for getting price
        try{     
         
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
 
            Connection con = DriverManager.getConnection("jdbc:odbc:datafile");
     
             Statement st=con.createStatement();
             String id="101";
             st.executeQuery("SELECT * FROM bus where id='"+id+"' ");
             ResultSet rset = st.getResultSet();
             
            while(rset.next())
            {
             
                price=rset.getString("price");
                
            }

}
     catch(Exception e){           
           System.out.println(e); 
           
                    
    }
        
       
        //try for setting price
        try{     
         
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
 
            Connection con = DriverManager.getConnection("jdbc:odbc:datafile");
     
             Statement st=con.createStatement();
             bname=Mainpage.s3;
             st.executeQuery("SELECT * FROM bus where id='"+bname+"' ");
             ResultSet rset = st.getResultSet();
             
            while(rset.next())
            {
                fareRate=Double.parseDouble(price);
                km=rset.getString("km");
                two.setText(km+"km");
                Double km1=Double.parseDouble(km);
                double fare1=km1*fareRate;
                
               
                
                Double wt=km1*12.3;
                wt=wt/60;
                DecimalFormat df = new DecimalFormat("#.##");
            
                df.format(wt);
               
                df.format(fare1);
                
                four.setText(df.format(wt)+" hour");
                six.setText(df.format(fare1)+" Tk");
            }

}
     catch(Exception e){           
           System.out.println(e); 
           
                    
    }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    String bname;
    String km;
    static double fareRate;
    String price;
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        one = new javax.swing.JLabel();
        three = new javax.swing.JLabel();
        five = new javax.swing.JLabel();
        ATM = new javax.swing.JButton();
        hospital = new javax.swing.JButton();
        pcst = new javax.swing.JButton();
        seven = new javax.swing.JLabel();
        bloodbank = new javax.swing.JButton();
        sprshp = new javax.swing.JButton();
        MP = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        two = new javax.swing.JLabel();
        four = new javax.swing.JLabel();
        six = new javax.swing.JLabel();
        eight = new javax.swing.JLabel();
        speak = new javax.swing.JButton();
        loctn = new javax.swing.JLabel();
        dest = new javax.swing.JLabel();
        Date = new javax.swing.JLabel();
        Time = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1069, 630));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                Date_Time(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), "Details", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Algerian", 0, 36))); // NOI18N

        jLabel1.setFont(new java.awt.Font("BankGothic Lt BT", 1, 18)); // NOI18N
        jLabel1.setText("Location :");

        jLabel2.setFont(new java.awt.Font("BankGothic Lt BT", 1, 18)); // NOI18N
        jLabel2.setText("Destination :");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "BUS Informations", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Algerian", 0, 24))); // NOI18N

        one.setFont(new java.awt.Font("BankGothic Lt BT", 1, 18)); // NOI18N
        one.setText("Distance");

        three.setFont(new java.awt.Font("BankGothic Lt BT", 1, 18)); // NOI18N
        three.setText("Walking Time");

        five.setFont(new java.awt.Font("BankGothic Lt BT", 1, 18)); // NOI18N
        five.setText("Bus Travel Fare");

        ATM.setBackground(new java.awt.Color(0, 0, 0));
        ATM.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        ATM.setForeground(new java.awt.Color(51, 204, 255));
        ATM.setText("ATM Booth");
        ATM.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ATM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ATMActionPerformed(evt);
            }
        });

        hospital.setBackground(new java.awt.Color(0, 0, 0));
        hospital.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        hospital.setForeground(new java.awt.Color(51, 204, 255));
        hospital.setText("Hospital");
        hospital.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        hospital.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hospitalActionPerformed(evt);
            }
        });

        pcst.setBackground(new java.awt.Color(0, 0, 0));
        pcst.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        pcst.setForeground(new java.awt.Color(51, 204, 255));
        pcst.setText("Police Station");
        pcst.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pcst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pcstActionPerformed(evt);
            }
        });

        seven.setFont(new java.awt.Font("BankGothic Lt BT", 1, 18)); // NOI18N
        seven.setText("Bus Name");

        bloodbank.setBackground(new java.awt.Color(0, 0, 0));
        bloodbank.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        bloodbank.setForeground(new java.awt.Color(51, 204, 255));
        bloodbank.setText("Blood Bank");
        bloodbank.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bloodbank.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bloodbankActionPerformed(evt);
            }
        });

        sprshp.setBackground(new java.awt.Color(0, 0, 0));
        sprshp.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        sprshp.setForeground(new java.awt.Color(51, 204, 255));
        sprshp.setText("Super Shops");
        sprshp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sprshp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sprshpActionPerformed(evt);
            }
        });

        MP.setBackground(new java.awt.Color(221, 215, 215));
        MP.setFont(new java.awt.Font("Calibri", 1, 22)); // NOI18N
        MP.setForeground(new java.awt.Color(7, 7, 7));
        MP.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        MP.setLabel("Main Page");
        MP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MPActionPerformed(evt);
            }
        });

        exit.setBackground(new java.awt.Color(222, 208, 208));
        exit.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        exit.setForeground(new java.awt.Color(255, 0, 0));
        exit.setText("Exit");
        exit.setBorder(null);
        exit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel7.setText("  Near Destination");

        speak.setFont(new java.awt.Font("BankGothic Lt BT", 1, 11)); // NOI18N
        speak.setText("Speak");
        speak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                speakActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(one, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(three, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(five, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(seven, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(60, 60, 60)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(two, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                                .addComponent(four, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(eight, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                                .addComponent(six, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addComponent(speak, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 387, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(ATM, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(hospital, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pcst, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                        .addComponent(bloodbank, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(sprshp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(33, 33, 33))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(239, 239, 239)
                .addComponent(MP, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(377, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(two, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(one, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                    .addComponent(ATM))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(three, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(four, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(six, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                            .addComponent(five, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(eight, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(seven, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(102, 102, 102)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(MP, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(93, 93, 93))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(hospital, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(pcst, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(bloodbank, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sprshp, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(speak, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(156, 156, 156))))
        );

        loctn.setFont(new java.awt.Font("BankGothic Lt BT", 1, 18)); // NOI18N

        dest.setFont(new java.awt.Font("BankGothic Lt BT", 1, 18)); // NOI18N

        Date.setFont(new java.awt.Font("BankGothic Lt BT", 1, 18)); // NOI18N
        Date.setText("Date");

        Time.setFont(new java.awt.Font("BankGothic Lt BT", 1, 18)); // NOI18N
        Time.setText("Time");

        jLabel3.setFont(new java.awt.Font("BankGothic Lt BT", 1, 18)); // NOI18N
        jLabel3.setText("TIME :");

        jLabel4.setFont(new java.awt.Font("BankGothic Lt BT", 1, 18)); // NOI18N
        jLabel4.setText(" DATE :");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(loctn, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(dest, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Time)
                            .addComponent(Date))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(Time)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(dest, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Date)
                            .addComponent(jLabel4)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(loctn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 40, Short.MAX_VALUE)))
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void speakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_speakActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_speakActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_exitActionPerformed

    private void MPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MPActionPerformed
        // TODO add your handling code here:
        Front mp=new Front();
        mp.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_MPActionPerformed

    private void sprshpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sprshpActionPerformed
        // TODO add your handling code here:
        Test ob1= new Test();
        Mainpage.check="shop";
        ob1.setVisible(true);
        //this.setVisible(false);
        /********************/
        String s1=Mainpage.des;
        String s2=Mainpage.check;
        String prnt=" ";
        try{

            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");

            Connection con = DriverManager.getConnection("jdbc:odbc:datafile");

            Statement st=con.createStatement();
            //String name=(String) locbox.getSelectedItem();
            st.executeQuery("SELECT * FROM code where name='"+s1+"' ");
            ResultSet rset = st.getResultSet();

            while(rset.next())
            {

                prnt=rset.getString(s2);

            }

        }
        catch(Exception e){
            System.out.println(e);

        }

        ob1.t1.setText(prnt);
        /********************/
    }//GEN-LAST:event_sprshpActionPerformed

    private void bloodbankActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bloodbankActionPerformed
        // TODO add your handling code here:
        Test ob1= new Test();
        Mainpage.check="blood";
        ob1.setVisible(true);
        //this.setVisible(false);
        /********************/
        String s1=Mainpage.des;
        String s2=Mainpage.check;
        String prnt=" ";
        try{

            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");

            Connection con = DriverManager.getConnection("jdbc:odbc:datafile");

            Statement st=con.createStatement();
            //String name=(String) locbox.getSelectedItem();
            st.executeQuery("SELECT * FROM code where name='"+s1+"' ");
            ResultSet rset = st.getResultSet();

            while(rset.next())
            {

                prnt=rset.getString(s2);

            }

        }
        catch(Exception e){
            System.out.println(e);

        }

        ob1.t1.setText(prnt);
    }//GEN-LAST:event_bloodbankActionPerformed

    private void pcstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pcstActionPerformed
        // TODO add your handling code here:
        Test ob1= new Test();
        Mainpage.check="police";
        ob1.setVisible(true);
        //this.setVisible(false);
        /******************/
        String s1=Mainpage.des;
        String s2=Mainpage.check;
        String prnt=" ";
        try{

            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");

            Connection con = DriverManager.getConnection("jdbc:odbc:datafile");

            Statement st=con.createStatement();
            //String name=(String) locbox.getSelectedItem();
            st.executeQuery("SELECT * FROM code where name='"+s1+"' ");
            ResultSet rset = st.getResultSet();

            while(rset.next())
            {

                prnt=rset.getString(s2);

            }

        }
        catch(Exception e){
            System.out.println(e);

        }

        ob1.t1.setText(prnt);
        /*****************/

    }//GEN-LAST:event_pcstActionPerformed

    private void hospitalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hospitalActionPerformed
        // TODO add your handling code here:
        Test ob1= new Test();
        Mainpage.check="hospital";
        ob1.setVisible(true);
        //this.setVisible(false);
        /*      */
        String s1=Mainpage.des;
        String s2=Mainpage.check;
        String prnt=" ";
        try{

            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");

            Connection con = DriverManager.getConnection("jdbc:odbc:datafile");

            Statement st=con.createStatement();
            //String name=(String) locbox.getSelectedItem();
            st.executeQuery("SELECT * FROM code where name='"+s1+"' ");
            ResultSet rset = st.getResultSet();

            while(rset.next())
            {

                prnt=rset.getString(s2);

            }

        }
        catch(Exception e){
            System.out.println(e);

        }

        ob1.t1.setText(prnt);

        /*      */
    }//GEN-LAST:event_hospitalActionPerformed

    private void ATMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ATMActionPerformed
        // TODO add your handling code here:
        Atmbooths ob1= new Atmbooths();
        Mainpage.check="atmcity";
        Mainpage.check1="atmbrac";
        Mainpage.check2="atmdutch";
        ob1.setVisible(true);
        //this.setVisible(false);
        /*********************/
        String s1=Mainpage.des;
        String s2=Mainpage.check;
        String s3=Mainpage.check1;
        String s4=Mainpage.check2;

        try{

            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");

            Connection con = DriverManager.getConnection("jdbc:odbc:datafile");

            Statement st=con.createStatement();
            //String name=(String) locbox.getSelectedItem();
            st.executeQuery("SELECT * FROM code where name='"+s1+"' ");
            ResultSet rset = st.getResultSet();

            while(rset.next())
            {

                s1=rset.getString(s2);

            }

        }
        catch(Exception e){
            System.out.println(e);

        }

        ob1.city.setText(s1);

        s1=Mainpage.des;
        try{

            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");

            Connection con = DriverManager.getConnection("jdbc:odbc:datafile");

            Statement st=con.createStatement();
            //String name=(String) locbox.getSelectedItem();
            st.executeQuery("SELECT * FROM code where name='"+s1+"' ");
            ResultSet rset = st.getResultSet();

            while(rset.next())
            {

                s1=rset.getString(s3);

            }

        }
        catch(Exception e){
            System.out.println(e);

        }

        ob1.brac.setText(s1);

        s1=Mainpage.des;
        try{

            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");

            Connection con = DriverManager.getConnection("jdbc:odbc:datafile");

            Statement st=con.createStatement();
            //String name=(String) locbox.getSelectedItem();
            st.executeQuery("SELECT * FROM code where name='"+s1+"' ");
            ResultSet rset = st.getResultSet();

            while(rset.next())
            {

                s1=rset.getString(s4);

            }

        }
        catch(Exception e){
            System.out.println(e);

        }

        ob1.dutch.setText(s1);
        /*********************/
    }//GEN-LAST:event_ATMActionPerformed

    private void Date_Time(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_Date_Time
        Calendar cal=new GregorianCalendar();
        int month=cal.get(Calendar.MONTH);
        int year=cal.get(Calendar.YEAR);
        int date=cal.get(Calendar.DATE);
        Date.setText(date+"/"+month+"/"+year);
        
      
        int min=cal.get(Calendar.MINUTE);
        int hour=cal.get(Calendar.HOUR);
        Time.setText(hour+":"+min);
       
    }//GEN-LAST:event_Date_Time

    private static String VOICENAME="kevin16";
    
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
            java.util.logging.Logger.getLogger(Spage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Spage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Spage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Spage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Spage().setVisible(true);
                
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ATM;
    private javax.swing.JLabel Date;
    private javax.swing.JButton MP;
    private javax.swing.JLabel Time;
    private javax.swing.JButton bloodbank;
    private javax.swing.JLabel dest;
    private javax.swing.JLabel eight;
    private javax.swing.JButton exit;
    private javax.swing.JLabel five;
    private javax.swing.JLabel four;
    private javax.swing.JButton hospital;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel loctn;
    private javax.swing.JLabel one;
    private javax.swing.JButton pcst;
    private javax.swing.JLabel seven;
    private javax.swing.JLabel six;
    private javax.swing.JButton speak;
    private javax.swing.JButton sprshp;
    private javax.swing.JLabel three;
    private javax.swing.JLabel two;
    // End of variables declaration//GEN-END:variables
}