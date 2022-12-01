package working_panes;

import authentication.Login;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import static java.time.Clock.system;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import static javax.swing.text.html.FormView.RESET;
import net.proteanit.sql.DbUtils;

public class main extends javax.swing.JFrame {

    public main() {
        initComponents();
        showTableData();
        showTableData1();
        showdate();
        showtime();
        count();
    }

    void showdate(){
        Date d = new Date();
        SimpleDateFormat s = new SimpleDateFormat("dd-MM-yyyy");
        
        date.setText(s.format(d));
    }   
    void showtime(){
        new Timer(0, new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                    Date d = new Date();
                    SimpleDateFormat s = new SimpleDateFormat("hh:mm:ss");
                    time.setText(s.format(d));
            }
            
        }).start();
    }
    
    void count(){
     try
        {
            conn = DriverManager.getConnection("jdbc:mysql://sql12.freemysqlhosting.net:3306/sql12394361","sql12394361","pqjhjvMYY7");
            String sql = "SELECT count(id) FROM parking";
            st = conn.prepareStatement(sql);
            rs = st.executeQuery();
            if(rs.next()){
                String count = rs.getString("count(id)");
                status.setText(count);
            }
            st.executeUpdate();
        }
        catch(Exception ex)
        {
            System.out.println("Error: "+ex);
        }
    }
    
    
    Connection conn;
    PreparedStatement st;
    ResultSet rs;
    
    
    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        pane1 = new javax.swing.JPanel();
        pane4 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        status = new javax.swing.JLabel();
        jButton9 = new javax.swing.JButton();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel7 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        vehno1 = new javax.swing.JTextField();
        vehtype1 = new javax.swing.JTextField();
        company1 = new javax.swing.JTextField();
        vehname1 = new javax.swing.JTextField();
        driver = new javax.swing.JTextField();
        load = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table1 = new javax.swing.JTable();
        date = new javax.swing.JLabel();
        time = new javax.swing.JLabel();
        pane2 = new javax.swing.JPanel();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        jPanel6 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        num = new javax.swing.JTextField();
        comp = new javax.swing.JTextField();
        name = new javax.swing.JTextField();
        phone = new javax.swing.JTextField();
        lic = new javax.swing.JTextField();
        aadhar = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        type = new javax.swing.JComboBox<>();
        jPanel9 = new javax.swing.JPanel();
        name1 = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        phone1 = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        license1 = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        aadhar1 = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        num1 = new javax.swing.JTextField();
        type1 = new javax.swing.JTextField();
        comp1 = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        name2 = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        phone2 = new javax.swing.JTextField();
        type2 = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        comp2 = new javax.swing.JTextField();
        lic2 = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        aadhar2 = new javax.swing.JTextField();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        num2 = new javax.swing.JTextField();
        jPanel11 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tab = new javax.swing.JTable();
        jLabel44 = new javax.swing.JLabel();
        pane3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(400, 120));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));
        jPanel1.setAutoscrolls(true);
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("X");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel1MouseEntered(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(1108, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1150, 40));

        jPanel2.setBackground(new java.awt.Color(102, 153, 255));

        jLabel2.setFont(new java.awt.Font("Palatino Linotype", 1, 24)); // NOI18N
        jLabel2.setText("Parking Monitor");

        jLabel3.setFont(new java.awt.Font("Palatino Linotype", 1, 18)); // NOI18N
        jLabel3.setText("DashBoard");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Palatino Linotype", 1, 18)); // NOI18N
        jLabel4.setText("Manage Vehicles");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Palatino Linotype", 1, 18)); // NOI18N
        jLabel5.setText("Manage Parking");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(255, 102, 102));
        jButton1.setFont(new java.awt.Font("Palatino Linotype", 1, 18)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logout.png"))); // NOI18N
        jButton1.setText("Logout");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Palatino Linotype", 1, 18)); // NOI18N
        jLabel6.setText("About Developer");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Palatino Linotype", 1, 18)); // NOI18N
        jLabel7.setText("About SoftcoreProduction");
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(61, 61, 61)
                                .addComponent(jLabel2))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)))))
                        .addGap(0, 37, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(43, 43, 43)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 382, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 310, 720));

        pane1.setBackground(new java.awt.Color(153, 51, 255));

        pane4.setBackground(new java.awt.Color(153, 153, 255));

        jLabel8.setFont(new java.awt.Font("Palatino Linotype", 1, 24)); // NOI18N
        jLabel8.setText("Parking Status :- ");

        jLabel13.setFont(new java.awt.Font("Palatino Linotype", 1, 24)); // NOI18N
        jLabel13.setText("Random Parked :-");

        jTabbedPane1.setBackground(new java.awt.Color(153, 204, 255));

        jPanel4.setBackground(new java.awt.Color(153, 255, 255));

        jLabel9.setFont(new java.awt.Font("Palatino Linotype", 0, 18)); // NOI18N
        jLabel9.setText("Total Parking Capacity :-");

        jLabel10.setFont(new java.awt.Font("Palatino Linotype", 0, 18)); // NOI18N
        jLabel10.setText("200");

        jLabel11.setFont(new java.awt.Font("Palatino Linotype", 0, 18)); // NOI18N
        jLabel11.setText("Total Parked Vehicles :-");

        status.setFont(new java.awt.Font("Palatino Linotype", 0, 18)); // NOI18N
        status.setText("jLabel6");
        status.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                statusAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        jButton9.setBackground(new java.awt.Color(255, 204, 102));
        jButton9.setFont(new java.awt.Font("Palatino Linotype", 0, 13)); // NOI18N
        jButton9.setText("Check Status");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(status)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton9))
                    .addComponent(jLabel10))
                .addContainerGap(347, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(status)
                    .addComponent(jButton9))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Total Capacity", jPanel4);

        jPanel7.setBackground(new java.awt.Color(153, 255, 255));

        jLabel14.setFont(new java.awt.Font("Palatino Linotype", 0, 18)); // NOI18N
        jLabel14.setText("Vehicle No. :-");

        jLabel15.setFont(new java.awt.Font("Palatino Linotype", 0, 18)); // NOI18N
        jLabel15.setText("Vehicle Type :-");

        jLabel16.setFont(new java.awt.Font("Palatino Linotype", 0, 18)); // NOI18N
        jLabel16.setText("Vehicle company :-");

        jLabel17.setFont(new java.awt.Font("Palatino Linotype", 0, 18)); // NOI18N
        jLabel17.setText("Vehicle Name :-");

        jLabel18.setFont(new java.awt.Font("Palatino Linotype", 0, 18)); // NOI18N
        jLabel18.setText("Vehicle Driver :-");

        jLabel19.setFont(new java.awt.Font("Palatino Linotype", 0, 18)); // NOI18N
        jLabel19.setText("Vehicle Load :-");

        vehno1.setFont(new java.awt.Font("Palatino Linotype", 0, 18)); // NOI18N

        vehtype1.setFont(new java.awt.Font("Palatino Linotype", 0, 18)); // NOI18N

        company1.setFont(new java.awt.Font("Palatino Linotype", 0, 18)); // NOI18N

        vehname1.setFont(new java.awt.Font("Palatino Linotype", 0, 18)); // NOI18N

        driver.setFont(new java.awt.Font("Palatino Linotype", 0, 18)); // NOI18N

        load.setFont(new java.awt.Font("Palatino Linotype", 0, 18)); // NOI18N

        jButton2.setBackground(new java.awt.Color(51, 255, 51));
        jButton2.setText("Park");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel12.setText("Verify");
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });

        jButton8.setBackground(new java.awt.Color(255, 51, 51));
        jButton8.setText("Move ");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16)
                    .addComponent(jLabel15)
                    .addComponent(jLabel14)
                    .addComponent(jLabel19)
                    .addComponent(jLabel17)
                    .addComponent(jLabel18))
                .addGap(68, 68, 68)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(company1, javax.swing.GroupLayout.DEFAULT_SIZE, 331, Short.MAX_VALUE)
                            .addComponent(vehtype1)
                            .addComponent(vehno1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel12))
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(vehname1, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(driver, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(load, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(150, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(vehno1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel12)))
                .addGap(21, 21, 21)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(vehtype1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(company1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(vehname1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(driver, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(load, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(49, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Park Vehicle", jPanel7);

        table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(table1);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 758, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 432, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("Parked Vehicle", jPanel8);

        date.setFont(new java.awt.Font("Palatino Linotype", 1, 16)); // NOI18N
        date.setText("jLabel45");

        time.setFont(new java.awt.Font("Palatino Linotype", 1, 16)); // NOI18N
        time.setText("jLabel46");

        javax.swing.GroupLayout pane4Layout = new javax.swing.GroupLayout(pane4);
        pane4.setLayout(pane4Layout);
        pane4Layout.setHorizontalGroup(
            pane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pane4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(date)
                .addGap(18, 18, 18)
                .addComponent(time)
                .addGap(58, 58, 58))
            .addGroup(pane4Layout.createSequentialGroup()
                .addGroup(pane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 761, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pane4Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel13))
                        .addGroup(pane4Layout.createSequentialGroup()
                            .addGap(28, 28, 28)
                            .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 763, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(44, Short.MAX_VALUE))
            .addGroup(pane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pane4Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel8)
                    .addContainerGap(636, Short.MAX_VALUE)))
        );
        pane4Layout.setVerticalGroup(
            pane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pane4Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(pane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(date)
                    .addComponent(time))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 462, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(pane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pane4Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel8)
                    .addContainerGap(681, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout pane1Layout = new javax.swing.GroupLayout(pane1);
        pane1.setLayout(pane1Layout);
        pane1Layout.setHorizontalGroup(
            pane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pane1Layout.createSequentialGroup()
                .addComponent(pane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 5, Short.MAX_VALUE))
        );
        pane1Layout.setVerticalGroup(
            pane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pane1Layout.createSequentialGroup()
                .addComponent(pane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 83, Short.MAX_VALUE))
        );

        pane2.setBackground(new java.awt.Color(255, 51, 51));

        jPanel6.setBackground(new java.awt.Color(153, 204, 255));

        jLabel20.setFont(new java.awt.Font("Palatino Linotype", 0, 18)); // NOI18N
        jLabel20.setText("Vehicle No. :");

        jLabel21.setFont(new java.awt.Font("Palatino Linotype", 0, 18)); // NOI18N
        jLabel21.setText("Vehicle Type :");

        jLabel22.setFont(new java.awt.Font("Palatino Linotype", 0, 18)); // NOI18N
        jLabel22.setText("Vehicle Company :");

        jLabel23.setFont(new java.awt.Font("Palatino Linotype", 0, 18)); // NOI18N
        jLabel23.setText("Vehicle Name :");

        jLabel24.setFont(new java.awt.Font("Palatino Linotype", 0, 18)); // NOI18N
        jLabel24.setText("Phone No. :");

        jLabel25.setFont(new java.awt.Font("Palatino Linotype", 0, 18)); // NOI18N
        jLabel25.setText("Licence No. :");

        jLabel26.setFont(new java.awt.Font("Palatino Linotype", 0, 18)); // NOI18N
        jLabel26.setText("Aadhar No. :");

        num.setFont(new java.awt.Font("Palatino Linotype", 0, 18)); // NOI18N

        comp.setFont(new java.awt.Font("Palatino Linotype", 0, 18)); // NOI18N

        name.setFont(new java.awt.Font("Palatino Linotype", 0, 18)); // NOI18N

        phone.setFont(new java.awt.Font("Palatino Linotype", 0, 18)); // NOI18N

        lic.setFont(new java.awt.Font("Palatino Linotype", 0, 18)); // NOI18N

        aadhar.setFont(new java.awt.Font("Palatino Linotype", 0, 18)); // NOI18N
        aadhar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aadharActionPerformed(evt);
            }
        });

        jLabel27.setFont(new java.awt.Font("Palatino Linotype", 1, 24)); // NOI18N
        jLabel27.setText("Add Vehicle Details :");

        jButton3.setBackground(new java.awt.Color(102, 255, 102));
        jButton3.setFont(new java.awt.Font("Palatino Linotype", 1, 18)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add-tab-24.png"))); // NOI18N
        jButton3.setText("ADD VEHICLE");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        type.setFont(new java.awt.Font("Palatino Linotype", 0, 18)); // NOI18N
        type.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Type...", "Car", "Bike ", "Taxi", "Van", "Jeep", " ", " " }));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel22)
                            .addComponent(jLabel20, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel21, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel23, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel24, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel25, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel26, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(82, 82, 82)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(num)
                            .addComponent(comp)
                            .addComponent(name)
                            .addComponent(phone)
                            .addComponent(lic)
                            .addComponent(aadhar)
                            .addComponent(type, 0, 475, Short.MAX_VALUE)))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel27)))
                .addContainerGap(62, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel27)
                .addGap(46, 46, 46)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(num, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(type, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(comp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(phone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(lic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(aadhar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(161, Short.MAX_VALUE))
        );

        jTabbedPane3.addTab("Add Vehicles", jPanel6);

        jPanel9.setBackground(new java.awt.Color(255, 153, 153));

        name1.setFont(new java.awt.Font("Palatino Linotype", 0, 18)); // NOI18N

        jLabel28.setFont(new java.awt.Font("Palatino Linotype", 0, 18)); // NOI18N
        jLabel28.setText("Vehicle Type :");

        phone1.setFont(new java.awt.Font("Palatino Linotype", 0, 18)); // NOI18N

        jLabel29.setFont(new java.awt.Font("Palatino Linotype", 0, 18)); // NOI18N
        jLabel29.setText("Vehicle Company :");

        license1.setFont(new java.awt.Font("Palatino Linotype", 0, 18)); // NOI18N

        jLabel30.setFont(new java.awt.Font("Palatino Linotype", 0, 18)); // NOI18N
        jLabel30.setText("Vehicle Name :");

        aadhar1.setFont(new java.awt.Font("Palatino Linotype", 0, 18)); // NOI18N
        aadhar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aadhar1ActionPerformed(evt);
            }
        });

        jLabel31.setFont(new java.awt.Font("Palatino Linotype", 0, 18)); // NOI18N
        jLabel31.setText("Phone No. :");

        jLabel32.setFont(new java.awt.Font("Palatino Linotype", 0, 18)); // NOI18N
        jLabel32.setText("Licence No. :");

        jLabel33.setFont(new java.awt.Font("Palatino Linotype", 1, 24)); // NOI18N
        jLabel33.setText("Update Vehicle Details :");

        jLabel34.setFont(new java.awt.Font("Palatino Linotype", 0, 18)); // NOI18N
        jLabel34.setText("Aadhar No. :");

        jButton4.setBackground(new java.awt.Color(255, 204, 51));
        jButton4.setFont(new java.awt.Font("Palatino Linotype", 1, 18)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/update.jpg"))); // NOI18N
        jButton4.setText("UPDATE VEHICLE");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        num1.setFont(new java.awt.Font("Palatino Linotype", 0, 18)); // NOI18N

        type1.setFont(new java.awt.Font("Palatino Linotype", 0, 18)); // NOI18N

        comp1.setFont(new java.awt.Font("Palatino Linotype", 0, 18)); // NOI18N

        jLabel35.setFont(new java.awt.Font("Palatino Linotype", 0, 18)); // NOI18N
        jLabel35.setText("Vehicle No. :");

        jButton5.setBackground(new java.awt.Color(51, 51, 255));
        jButton5.setFont(new java.awt.Font("Palatino Linotype", 1, 18)); // NOI18N
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/search-24.png"))); // NOI18N
        jButton5.setText("SEARCH VEHICLE");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel29)
                            .addComponent(jLabel35, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel28, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel30, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel31, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel32, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel34, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(82, 82, 82)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(num1)
                            .addComponent(type1)
                            .addComponent(comp1)
                            .addComponent(name1)
                            .addComponent(phone1)
                            .addComponent(license1)
                            .addComponent(aadhar1, javax.swing.GroupLayout.PREFERRED_SIZE, 475, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel33)))
                .addContainerGap(62, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4)
                .addGap(39, 39, 39))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel33)
                .addGap(46, 46, 46)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel35)
                    .addComponent(num1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(type1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29)
                    .addComponent(comp1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
                    .addComponent(name1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31)
                    .addComponent(phone1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel32)
                    .addComponent(license1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel34)
                    .addComponent(aadhar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane3.addTab("Update Details", jPanel9);

        jPanel10.setBackground(new java.awt.Color(255, 255, 153));

        name2.setFont(new java.awt.Font("Palatino Linotype", 0, 18)); // NOI18N
        name2.setEnabled(false);

        jLabel36.setFont(new java.awt.Font("Palatino Linotype", 0, 18)); // NOI18N
        jLabel36.setText("Vehicle Type :");

        phone2.setFont(new java.awt.Font("Palatino Linotype", 0, 18)); // NOI18N
        phone2.setEnabled(false);

        type2.setFont(new java.awt.Font("Palatino Linotype", 0, 18)); // NOI18N
        type2.setEnabled(false);

        jLabel37.setFont(new java.awt.Font("Palatino Linotype", 0, 18)); // NOI18N
        jLabel37.setText("Vehicle Company :");

        comp2.setFont(new java.awt.Font("Palatino Linotype", 0, 18)); // NOI18N
        comp2.setEnabled(false);

        lic2.setFont(new java.awt.Font("Palatino Linotype", 0, 18)); // NOI18N
        lic2.setEnabled(false);

        jLabel38.setFont(new java.awt.Font("Palatino Linotype", 0, 18)); // NOI18N
        jLabel38.setText("Vehicle No. :");

        jLabel39.setFont(new java.awt.Font("Palatino Linotype", 0, 18)); // NOI18N
        jLabel39.setText("Vehicle Name :");

        jButton6.setBackground(new java.awt.Color(51, 51, 255));
        jButton6.setFont(new java.awt.Font("Palatino Linotype", 1, 18)); // NOI18N
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/search-24.png"))); // NOI18N
        jButton6.setText("SEARCH VEHICLE");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        aadhar2.setFont(new java.awt.Font("Palatino Linotype", 0, 18)); // NOI18N
        aadhar2.setEnabled(false);
        aadhar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aadhar2ActionPerformed(evt);
            }
        });

        jLabel40.setFont(new java.awt.Font("Palatino Linotype", 0, 18)); // NOI18N
        jLabel40.setText("Phone No. :");

        jLabel41.setFont(new java.awt.Font("Palatino Linotype", 0, 18)); // NOI18N
        jLabel41.setText("Licence No. :");

        jLabel42.setFont(new java.awt.Font("Palatino Linotype", 1, 24)); // NOI18N
        jLabel42.setText("Delete Vehicle Details :");

        jLabel43.setFont(new java.awt.Font("Palatino Linotype", 0, 18)); // NOI18N
        jLabel43.setText("Aadhar No. :");

        jButton7.setBackground(new java.awt.Color(255, 51, 51));
        jButton7.setFont(new java.awt.Font("Palatino Linotype", 1, 18)); // NOI18N
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/delete.png"))); // NOI18N
        jButton7.setText("DELETE VEHICLE");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        num2.setFont(new java.awt.Font("Palatino Linotype", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel37)
                            .addComponent(jLabel38, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel36, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel39, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel40, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel41, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel43, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(82, 82, 82)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(num2)
                            .addComponent(type2)
                            .addComponent(comp2)
                            .addComponent(name2)
                            .addComponent(phone2)
                            .addComponent(lic2)
                            .addComponent(aadhar2, javax.swing.GroupLayout.PREFERRED_SIZE, 475, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel42)))
                .addContainerGap(62, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel42)
                .addGap(46, 46, 46)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel38)
                    .addComponent(num2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel36)
                    .addComponent(type2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel37)
                    .addComponent(comp2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel39)
                    .addComponent(name2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel40)
                    .addComponent(phone2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel41)
                    .addComponent(lic2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel43)
                    .addComponent(aadhar2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane3.addTab("Delete Vehicles", jPanel10);

        jPanel11.setBackground(new java.awt.Color(153, 255, 153));

        tab.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tab);

        jLabel44.setFont(new java.awt.Font("Palatino Linotype", 1, 24)); // NOI18N
        jLabel44.setText("All Vehicles :");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 835, Short.MAX_VALUE)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel44)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel44)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 727, Short.MAX_VALUE))
        );

        jTabbedPane3.addTab("All Vehicles", jPanel11);

        javax.swing.GroupLayout pane2Layout = new javax.swing.GroupLayout(pane2);
        pane2.setLayout(pane2Layout);
        pane2Layout.setHorizontalGroup(
            pane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane3)
        );
        pane2Layout.setVerticalGroup(
            pane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane3)
        );

        javax.swing.GroupLayout pane3Layout = new javax.swing.GroupLayout(pane3);
        pane3.setLayout(pane3Layout);
        pane3Layout.setHorizontalGroup(
            pane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 840, Short.MAX_VALUE)
        );
        pane3Layout.setVerticalGroup(
            pane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 810, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(pane2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(pane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(pane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(pane2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(pane3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 40, 840, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
            pane1.setVisible(false);
            pane2.setVisible(true);
            pane3.setVisible(false);
           
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
            pane1.setVisible(true);
            pane2.setVisible(false);
            pane3.setVisible(false);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
            pane1.setVisible(false);
            pane2.setVisible(false);
            pane3.setVisible(true);
    }//GEN-LAST:event_jLabel5MouseClicked

    private void aadharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aadharActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_aadharActionPerformed

    private void aadhar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aadhar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_aadhar1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        try {
           
            comp1.setText("");
            name1.setText("");
            phone1.setText("");
            license1.setText("");
            aadhar1.setText("");
            
            main.func f = new main.func();
            ResultSet rs = null;
            String id =num1.getText();
            String com = "company";
            String nam = "name";
            String pho = "phone_no";
            String lice = "license";
            String aad = "aadhar_no";
            
            
            rs = f.find(num1.getText());
            
            if(rs.next())
            {
                type1.setText(rs.getString("type"));
                comp1.setText(rs.getString("company"));
                name1.setText(rs.getString("name"));
                phone1.setText(rs.getString("phone_no"));
                license1.setText(rs.getString("license"));
                aadhar1.setText(rs.getString("aadhar_no"));
    }                                        
        }
        catch (SQLException ex) {
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
        }
        if(comp1.getText().isEmpty())
           {
               JOptionPane.showMessageDialog(this,"No data found");
                          num1.setText("");

           }
    }//GEN-LAST:event_jButton5ActionPerformed

    public class func{
        Connection conn = null;
        ResultSet rs= null;
        PreparedStatement st = null;
        public ResultSet find(String s)
        {
       
          
            try {
                Class.forName("com.mysql.jdbc.Driver");
                conn = DriverManager.getConnection("jdbc:mysql://sql12.freemysqlhosting.net:3306/sql12394361","sql12394361","pqjhjvMYY7");
                st = conn.prepareStatement("select type,company,name,phone_no,license,aadhar_no from vehicle where num =?");
                st.setString(1, s);
                rs = st.executeQuery();
                
                return rs;
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
            }
            return rs;
        }
        
         }
    
    public class func1{
        Connection conn = null;
        ResultSet rs= null;
        PreparedStatement st = null;
        public ResultSet find(String s)
        {
       
          
            try {
                Class.forName("com.mysql.jdbc.Driver");
                conn = DriverManager.getConnection("jdbc:mysql://sql12.freemysqlhosting.net:3306/sql12394361","sql12394361","pqjhjvMYY7");
                st = conn.prepareStatement("select vehicle_type,vehicle_name,company,driver, vehicle_load from parking where vehicle_no = ?");
                st.setString(1, s);
                rs = st.executeQuery();
                
                return rs;
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
            }
            return rs;
        }
        
         }
    
    public void showTableData()
    {
        try
        {
            conn = DriverManager.getConnection("jdbc:mysql://sql12.freemysqlhosting.net:3306/sql12394361","sql12394361","pqjhjvMYY7");
            String sql = "SELECT * FROM vehicle";
            st = conn.prepareStatement(sql);
            rs = st.executeQuery();
           tab.setModel(DbUtils.resultSetToTableModel(rs));
            st.executeUpdate();
        }
        catch(Exception ex)
        {
            System.out.println("Error: "+ex);
        }
            

    }
    
    public void showTableData1()
    {
        try
        {
            conn = DriverManager.getConnection("jdbc:mysql://sql12.freemysqlhosting.net:3306/sql12394361","sql12394361","pqjhjvMYY7");
            String sql = "SELECT * FROM parking";
            st = conn.prepareStatement(sql);
            rs = st.executeQuery();
           table1.setModel(DbUtils.resultSetToTableModel(rs));
            st.executeUpdate();
        }
        catch(Exception ex)
        {
            System.out.println("Error: "+ex);
        }
            

    }
    
    
    
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed

        try {
           
            comp1.setText("");
            name1.setText("");
            phone1.setText("");
            license1.setText("");
            aadhar1.setText("");
            
            main.func f = new main.func();
            ResultSet rs = null;
            String id =num2.getText();
            String com = "company";
            String nam = "name";
            String pho = "phone_no";
            String lice = "license";
            String aad = "aadhar_no";
            
            
            rs = f.find(num2.getText());
            
            if(rs.next())
            {
                type2.setText(rs.getString("type"));
                comp2.setText(rs.getString("company"));
                name2.setText(rs.getString("name"));
                phone2.setText(rs.getString("phone_no"));
                lic2.setText(rs.getString("license"));
                aadhar2.setText(rs.getString("aadhar_no"));
    }                                        
        }
        catch (SQLException ex) {
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
        }
        if(comp2.getText().isEmpty())
           {
               JOptionPane.showMessageDialog(this,"No data found");
                          num2.setText("");

           }

    }//GEN-LAST:event_jButton6ActionPerformed

    private void aadhar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aadhar2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_aadhar2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       
        try {
            // TODO add your handling code here:
            
           
            String tit = type1.getText();
            String aut = comp1.getText();
            String pub = name1.getText();
            String yea = phone1.getText();
            String edi = license1.getText();
            String sub = aadhar1.getText();
            
            String id = num1.getText();
            
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://sql12.freemysqlhosting.net:3306/sql12394361","sql12394361","pqjhjvMYY7");
            st = conn.prepareStatement("UPDATE vehicle SET type=?,company=?,name=?,phone_no=?,license=?,aadhar_no=? WHERE num = ?");

            st.setString(7, id);
            st.setString(1, tit);
            st.setString(2, aut);
            st.setString(3, pub);
            st.setString(4, yea);
            st.setString(5, edi);
            st.setString(6, sub);
            st.executeUpdate();
            
            JOptionPane.showMessageDialog(this,"Details has been Updated Successfully");
            num1.setText("");
            type1.setText("");
            comp1.setText("");
            name1.setText("");
            phone1.setText("");
            license1.setText("");
            aadhar1.setText("");
            num1.requestFocus();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
        }
        showTableData();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        
        if(num.getText().length() == 0)
        {
            JOptionPane.showMessageDialog(this,"Field Must not leave Blank");
        }
         else if(comp.getText().length() == 0)
        {
            JOptionPane.showMessageDialog(this,"Field Must not leave Blank");
        }
         else if(name.getText().length() == 0)
        {
            JOptionPane.showMessageDialog(this,"Field Must not leave Blank");
        }
         else if(phone.getText().length() == 0)
        {
            JOptionPane.showMessageDialog(this,"Field Must not leave Blank");
        }
         else if(lic.getText().length() == 0)
        {
            JOptionPane.showMessageDialog(this,"Field Must not leave Blank");
        }
         else if(aadhar.getText().length() == 0)
        {
            JOptionPane.showMessageDialog(this,"Field Must not leave Blank");
        }
         else{
           
            try {
                String id = num.getText();
                String tit = type.getSelectedItem().toString();
                String aut = comp.getText();
                String pub = name.getText();
                String yea = phone.getText();
                String edi = lic.getText();
                String sub = aadhar.getText();
                
                Class.forName("com.mysql.jdbc.Driver");
                conn = DriverManager.getConnection("jdbc:mysql://sql12.freemysqlhosting.net:3306/sql12394361","sql12394361","pqjhjvMYY7");
                st = conn.prepareStatement("insert into vehicle(num,type,company,name,phone_no,license,aadhar_no)values(?,?,?,?,?,?,?)");
                
                
                st.setString(1, id);
                st.setString(2, tit);
                st.setString(3, aut);
                st.setString(4, pub);
                st.setString(5, yea);
                st.setString(6, edi);
                st.setString(7, sub);
                st.executeUpdate();
                
                JOptionPane.showMessageDialog(this,"Vehicle has been Sucessfully Added");
                
                
                num.setText("");
                type.resetKeyboardActions();
                comp.setText("");
                name.setText("");
                phone.setText("");
                lic.setText("");
                aadhar.setText("");
                num.requestFocus();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
            }
         }
        showTableData();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
       JDialog.setDefaultLookAndFeelDecorated(true);
    int response = JOptionPane.showConfirmDialog(null, "Do you want to Exit?", "Confirm",
        JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
    if (response == JOptionPane.NO_OPTION) {
      main d = new main();
        this.hide();
        d.setVisible(true);
    } else if (response == JOptionPane.YES_OPTION) {
      System.exit(0);
    } else if (response == JOptionPane.CLOSED_OPTION) {
       main d = new main();
        this.hide();
        d.setVisible(true);
    }
        

    }//GEN-LAST:event_jLabel1MouseClicked

    
    
    
    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed

        try {
            // TODO add your handling code here:
            
            String id = num2.getText();
            
            Class.forName("com.mysql.jdbc.Driver");
                conn = DriverManager.getConnection("jdbc:mysql://sql12.freemysqlhosting.net:3306/sql12394361","sql12394361","pqjhjvMYY7");
            st = conn.prepareStatement("delete from vehicle where num = ?");
            
            JOptionPane.showMessageDialog(this,"Vehicle has been Deleted Successfully");
          
            st.setString(1, id);
            st.executeUpdate();
            
            num2.setText("");
            type2.setText("");
            comp2.setText("");
            name2.setText("");
            phone2.setText("");
            lic2.setText("");
            aadhar2.setText("");
            num2.requestFocus();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
        }
            showTableData();
            
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked

        try {
            Desktop d = Desktop.getDesktop();
            d.browse(new URI("http://softcoreproduction.com"));
        } catch (URISyntaxException ex) {
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked

        about_developer d = new about_developer();
        this.hide();
        d.setVisible(true);
        
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel1MouseEntered

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        // TODO add your handling code here:
        
        try {
           
            comp1.setText("");
            name1.setText("");
            
            
            main.func1 f = new main.func1();
            ResultSet rs = null;
            String id =vehno1.getText();
            String com = "company";
            String nam = "name";
            String driv = "driver";
            String loa = "vehicle_load";
            
            
            
            rs = f.find(vehno1.getText());
            
            if(rs.next())
            {
                vehtype1.setText(rs.getString("vehicle_type"));
                company1.setText(rs.getString("company"));
                vehname1.setText(rs.getString("vehicle_name"));
                driver.setText(rs.getString("driver"));
                load.setText(rs.getString("vehicle_load"));
    }                                        
        }
        catch (SQLException ex) {
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
        }
        if(vehtype1.getText().isEmpty())
           {
               JOptionPane.showMessageDialog(this,"No data found");
                          vehno1.setText("");

           }
        
    }//GEN-LAST:event_jLabel12MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
        if(vehno1.getText().length() == 0)
        {
            JOptionPane.showMessageDialog(this,"Field Must not leave Blank");
        }
         else if(vehtype1.getText().length() == 0)
        {
            JOptionPane.showMessageDialog(this,"Field Must not leave Blank");
        }
         else if(vehname1.getText().length() == 0)
        {
            JOptionPane.showMessageDialog(this,"Field Must not leave Blank");
        }
         else if(driver.getText().length() == 0)
        {
            JOptionPane.showMessageDialog(this,"Field Must not leave Blank");
        }
         else if(load.getText().length() == 0)
        {
            JOptionPane.showMessageDialog(this,"Field Must not leave Blank");
        }
        
         else{
           
            try {
                String id = vehno1.getText();
                String tit = vehtype1.getText();
                String aut = company1.getText();
                String pub = vehname1.getText();
                String yea = driver.getText();
                String edi = load.getText();
                String sub = date.getText();
                String tim = time.getText();
                
                Class.forName("com.mysql.jdbc.Driver");
                conn = DriverManager.getConnection("jdbc:mysql://sql12.freemysqlhosting.net:3306/sql12394361","sql12394361","pqjhjvMYY7");
                st = conn.prepareStatement("insert into parking(`vehicle_no`, `vehicle_type`, `company`, `vehicle_name`, `driver`, `vehicle_load`, `time`, `date`)values(?,?,?,?,?,?,?,?)");
                
                
                st.setString(1, id);
                st.setString(2, tit);
                st.setString(3, aut);
                st.setString(4, pub);
                st.setString(5, yea);
                st.setString(6, edi);
                st.setString(7, sub);
                st.setString(8, tim);
                st.executeUpdate();
                
                JOptionPane.showMessageDialog(this,"Vehicle has been Sucessfully Parked");
                
                
                vehno1.setText("");
                vehtype1.setText("");
                company1.setText("");
                vehname1.setText("");
                driver.setText("");
                load.setText("");
                vehno1.requestFocus();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
            }
         }
        showTableData1();
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        Login d = new Login();
        this.hide();
        d.setVisible(true);
        

    }//GEN-LAST:event_jButton1ActionPerformed

    private void statusAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_statusAncestorAdded
            
    }//GEN-LAST:event_statusAncestorAdded

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        count();
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:
            
            String id = vehno1.getText();
            
            Class.forName("com.mysql.jdbc.Driver");
                conn = DriverManager.getConnection("jdbc:mysql://sql12.freemysqlhosting.net:3306/sql12394361","sql12394361","pqjhjvMYY7");
            st = conn.prepareStatement("delete from parking where vehicle_no = ?");
            
            JOptionPane.showMessageDialog(this,"Vehicle has been Deleted Successfully");
          
            st.setString(1, id);
            st.executeUpdate();
            
            vehno1.setText("");
            vehname1.setText("");
            vehtype1.setText("");
            company1.setText("");
            driver.setText("");
            load.setText("");
            vehno1.requestFocus();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
        }
        showTableData1();
        
    }//GEN-LAST:event_jButton8ActionPerformed

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
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField aadhar;
    private javax.swing.JTextField aadhar1;
    private javax.swing.JTextField aadhar2;
    private javax.swing.JTextField comp;
    private javax.swing.JTextField comp1;
    private javax.swing.JTextField comp2;
    private javax.swing.JTextField company1;
    private javax.swing.JLabel date;
    private javax.swing.JTextField driver;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JTextField lic;
    private javax.swing.JTextField lic2;
    private javax.swing.JTextField license1;
    private javax.swing.JTextField load;
    private javax.swing.JTextField name;
    private javax.swing.JTextField name1;
    private javax.swing.JTextField name2;
    private javax.swing.JTextField num;
    private javax.swing.JTextField num1;
    private javax.swing.JTextField num2;
    private javax.swing.JPanel pane1;
    private javax.swing.JPanel pane2;
    private javax.swing.JPanel pane3;
    private javax.swing.JPanel pane4;
    private javax.swing.JTextField phone;
    private javax.swing.JTextField phone1;
    private javax.swing.JTextField phone2;
    private javax.swing.JLabel status;
    private javax.swing.JTable tab;
    private javax.swing.JTable table1;
    private javax.swing.JLabel time;
    private javax.swing.JComboBox<String> type;
    private javax.swing.JTextField type1;
    private javax.swing.JTextField type2;
    private javax.swing.JTextField vehname1;
    private javax.swing.JTextField vehno1;
    private javax.swing.JTextField vehtype1;
    // End of variables declaration//GEN-END:variables
}
