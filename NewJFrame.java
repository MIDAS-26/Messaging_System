
import java.sql.*;
import javax.swing.ImageIcon;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author com
 */
public class NewJFrame extends javax.swing.JFrame {

    Connection con = null;
    Statement stmt = null;
    ResultSet rs = null;
    String query, mailfrom = null , usrnm, pass, mail;
    int usrid=0;
  
        

    public NewJFrame() {
        initComponents();


    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        login = new javax.swing.JFrame();
        usrnmtxt_login = new javax.swing.JTextField();
        usrpass_login = new javax.swing.JPasswordField();
        loginbtn_login = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        newuserbtn_login = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        signup = new javax.swing.JDialog();
        createuserbtn_signup = new javax.swing.JButton();
        usridlbl_signup = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        inputretypepass_signup = new javax.swing.JPasswordField();
        inputpass_signup = new javax.swing.JPasswordField();
        inputusermail_signup = new javax.swing.JTextField();
        inputnametxt_signup = new javax.swing.JTextField();
        inputusrname_signup = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        Welcome = new javax.swing.JFrame();
        jLabel5 = new javax.swing.JLabel();
        inboxbtn_welcome = new javax.swing.JButton();
        sentbtn_welcome = new javax.swing.JButton();
        writebtn_welcome = new javax.swing.JButton();
        statsbtn_welcome = new javax.swing.JButton();
        accsttngbtn_welcome = new javax.swing.JButton();
        username_welcome = new javax.swing.JLabel();
        Logout3_welcome = new javax.swing.JButton();
        inbox = new javax.swing.JFrame();
        jScrollPane1 = new javax.swing.JScrollPane();
        msglist_inbox = new javax.swing.JList();
        replybtn_inbox = new javax.swing.JButton();
        Deletebtn_inbox = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        msgidlist_inbox = new javax.swing.JList();
        jScrollPane5 = new javax.swing.JScrollPane();
        msgtextarea_inbox = new javax.swing.JTextArea();
        Logout8_inbox = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        write = new javax.swing.JFrame();
        jScrollPane3 = new javax.swing.JScrollPane();
        msgarea_write = new javax.swing.JTextArea();
        fromlabel_write = new javax.swing.JLabel();
        jLabel = new javax.swing.JLabel();
        totxt_write = new javax.swing.JTextField();
        sendbtn_write = new javax.swing.JButton();
        Logout5_write = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        sent = new javax.swing.JFrame();
        jScrollPane2 = new javax.swing.JScrollPane();
        sentmsglist_sent = new javax.swing.JList();
        jScrollPane6 = new javax.swing.JScrollPane();
        sentmsgidlist_sent = new javax.swing.JList();
        jScrollPane7 = new javax.swing.JScrollPane();
        sentmsgarea_sent = new javax.swing.JTextArea();
        delsentmsg_sent = new javax.swing.JButton();
        Logout6_sent = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        accsttng = new javax.swing.JFrame();
        accnm = new javax.swing.JLabel();
        accemail = new javax.swing.JLabel();
        accpass = new javax.swing.JLabel();
        accid = new javax.swing.JLabel();
        conaccpass = new javax.swing.JLabel();
        Updatel_accsttng = new javax.swing.JButton();
        txtnml_accsttng = new javax.swing.JTextField();
        useridlabel_accsttng = new javax.swing.JLabel();
        oldpassl_accsttng = new javax.swing.JPasswordField();
        newpassl_accsttng = new javax.swing.JPasswordField();
        emaillbll_accsttng = new javax.swing.JTextField();
        Logout7l_accsttng = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        nm_accsttng = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        stats = new javax.swing.JDialog();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        msgsent_stats = new javax.swing.JLabel();
        msgrecieved_stats = new javax.swing.JLabel();
        avgsentmsgchar_stats = new javax.swing.JLabel();
        avgcharmsgrecieved_stats = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        serverpage = new javax.swing.JFrame();
        jScrollPane8 = new javax.swing.JScrollPane();
        msgtbl = new javax.swing.JTable();
        show_serverpg = new javax.swing.JButton();
        abtus_dialog = new javax.swing.JDialog();
        startpagebtn = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        login.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        login.setBounds(new java.awt.Rectangle(440, 210, 500, 250));
        login.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        login.getContentPane().add(usrnmtxt_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(138, 60, 255, 29));

        usrpass_login.setToolTipText("Click here to login");
        usrpass_login.setEchoChar('#');
        login.getContentPane().add(usrpass_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(138, 104, 255, 30));

        loginbtn_login.setFont(new java.awt.Font("Traditional Arabic", 1, 18)); // NOI18N
        loginbtn_login.setText("Log In");
        loginbtn_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginbtn_loginActionPerformed(evt);
            }
        });
        login.getContentPane().add(loginbtn_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 150, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Username");
        login.getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 60, 86, 33));

        newuserbtn_login.setFont(new java.awt.Font("Traditional Arabic", 1, 18)); // NOI18N
        newuserbtn_login.setText("New User");
        newuserbtn_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newuserbtn_loginActionPerformed(evt);
            }
        });
        login.getContentPane().add(newuserbtn_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Password");
        login.getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 105, 86, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 153, 153));
        jLabel4.setText("Please Enter Your User Name and Password");
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        login.getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 11, 420, 31));

        signup.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        signup.setBounds(new java.awt.Rectangle(440, 100, 450, 450));

        createuserbtn_signup.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        createuserbtn_signup.setText("Create User");
        createuserbtn_signup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createuserbtn_signupActionPerformed(evt);
            }
        });

        usridlbl_signup.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        usridlbl_signup.setText("User id");

        jLabel6.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        jLabel6.setText("New User");

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel15.setText("User Name");

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel18.setText("Name");

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel16.setText("Email");

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel17.setText("Password");

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel19.setText("Retype Password");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19))
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(30, 30, 30)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(inputusermail_signup, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(inputnametxt_signup, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(inputusrname_signup, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(inputretypepass_signup, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(inputpass_signup, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(inputusrname_signup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                        .addComponent(jLabel18)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel16)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(inputnametxt_signup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(inputusermail_signup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(inputpass_signup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputretypepass_signup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout signupLayout = new javax.swing.GroupLayout(signup.getContentPane());
        signup.getContentPane().setLayout(signupLayout);
        signupLayout.setHorizontalGroup(
            signupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(signupLayout.createSequentialGroup()
                .addGroup(signupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(signupLayout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addGroup(signupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(signupLayout.createSequentialGroup()
                                .addComponent(createuserbtn_signup, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(25, 25, 25))
                            .addGroup(signupLayout.createSequentialGroup()
                                .addComponent(usridlbl_signup, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(201, 201, 201))
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(signupLayout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(117, 117, 117)))
                .addGap(23, 23, 23))
        );
        signupLayout.setVerticalGroup(
            signupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(signupLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(usridlbl_signup, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(31, 31, 31)
                .addComponent(createuserbtn_signup, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                .addGap(37, 37, 37))
        );

        Welcome.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        Welcome.setBackground(new java.awt.Color(51, 51, 255));
        Welcome.setBounds(new java.awt.Rectangle(440, 100, 620, 370));

        jLabel5.setFont(new java.awt.Font("MV Boli", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 51, 51));
        jLabel5.setText("Welcome!");

        inboxbtn_welcome.setBackground(new java.awt.Color(0, 0, 255));
        inboxbtn_welcome.setFont(new java.awt.Font("Ravie", 2, 24)); // NOI18N
        inboxbtn_welcome.setText("Inbox");
        inboxbtn_welcome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inboxbtn_welcomeActionPerformed(evt);
            }
        });

        sentbtn_welcome.setBackground(new java.awt.Color(0, 0, 255));
        sentbtn_welcome.setFont(new java.awt.Font("Ravie", 2, 24)); // NOI18N
        sentbtn_welcome.setText("Sent");
        sentbtn_welcome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sentbtn_welcomeActionPerformed(evt);
            }
        });

        writebtn_welcome.setBackground(new java.awt.Color(0, 0, 255));
        writebtn_welcome.setFont(new java.awt.Font("Ravie", 2, 24)); // NOI18N
        writebtn_welcome.setText("Write");
        writebtn_welcome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                writebtn_welcomeActionPerformed(evt);
            }
        });

        statsbtn_welcome.setBackground(new java.awt.Color(0, 0, 255));
        statsbtn_welcome.setFont(new java.awt.Font("Ravie", 2, 24)); // NOI18N
        statsbtn_welcome.setText("Stats");
        statsbtn_welcome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statsbtn_welcomeActionPerformed(evt);
            }
        });

        accsttngbtn_welcome.setBackground(new java.awt.Color(0, 0, 255));
        accsttngbtn_welcome.setFont(new java.awt.Font("Ravie", 2, 24)); // NOI18N
        accsttngbtn_welcome.setText("Account Setting");
        accsttngbtn_welcome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accsttngbtn_welcomeActionPerformed(evt);
            }
        });

        username_welcome.setFont(new java.awt.Font("Vijaya", 1, 24)); // NOI18N
        username_welcome.setForeground(new java.awt.Color(0, 51, 255));
        username_welcome.setText("<user name>");

        Logout3_welcome.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Logout3_welcome.setText("LogOut");
        Logout3_welcome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Logout3_welcomeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout WelcomeLayout = new javax.swing.GroupLayout(Welcome.getContentPane());
        Welcome.getContentPane().setLayout(WelcomeLayout);
        WelcomeLayout.setHorizontalGroup(
            WelcomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(WelcomeLayout.createSequentialGroup()
                .addGroup(WelcomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(WelcomeLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(WelcomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(sentbtn_welcome, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(writebtn_welcome, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(WelcomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(statsbtn_welcome, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(inboxbtn_welcome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(WelcomeLayout.createSequentialGroup()
                        .addGroup(WelcomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, WelcomeLayout.createSequentialGroup()
                                .addGap(114, 114, 114)
                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE))
                            .addGroup(WelcomeLayout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(username_welcome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(WelcomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(WelcomeLayout.createSequentialGroup()
                                .addGap(206, 206, 206)
                                .addComponent(Logout3_welcome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, WelcomeLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(accsttngbtn_welcome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        WelcomeLayout.setVerticalGroup(
            WelcomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(WelcomeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(WelcomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(WelcomeLayout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(username_welcome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(44, 44, 44))
                    .addGroup(WelcomeLayout.createSequentialGroup()
                        .addComponent(Logout3_welcome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(74, 74, 74)
                        .addComponent(accsttngbtn_welcome, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)))
                .addGap(36, 36, 36)
                .addGroup(WelcomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(writebtn_welcome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(inboxbtn_welcome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(WelcomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sentbtn_welcome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(statsbtn_welcome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        inbox.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        inbox.setBounds(new java.awt.Rectangle(440, 100, 500, 500));
        inbox.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        msglist_inbox.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(102, 102, 102), new java.awt.Color(153, 153, 153), new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204)));
        msglist_inbox.setFont(new java.awt.Font("Segoe Print", 0, 18)); // NOI18N
        msglist_inbox.setModel(new DefaultListModel());
        msglist_inbox.setSelectionMode(1);
        msglist_inbox.setToolTipText("Select a message");
        msglist_inbox.setVisibleRowCount(10);
        msglist_inbox.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                msglist_inboxValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(msglist_inbox);

        inbox.getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 120, 230));

        replybtn_inbox.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        replybtn_inbox.setText("Reply");
        replybtn_inbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                replybtn_inboxActionPerformed(evt);
            }
        });
        inbox.getContentPane().add(replybtn_inbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, -1, -1));

        Deletebtn_inbox.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        Deletebtn_inbox.setText("Delete");
        Deletebtn_inbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Deletebtn_inboxActionPerformed(evt);
            }
        });
        inbox.getContentPane().add(Deletebtn_inbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 320, -1, -1));

        msgidlist_inbox.setModel(new DefaultListModel());
        msgidlist_inbox.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane4.setViewportView(msgidlist_inbox);

        inbox.getContentPane().add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(474, 10, 0, 0));

        msgtextarea_inbox.setEditable(false);
        msgtextarea_inbox.setColumns(20);
        msgtextarea_inbox.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        msgtextarea_inbox.setLineWrap(true);
        msgtextarea_inbox.setRows(5);
        msgtextarea_inbox.setTabSize(5);
        msgtextarea_inbox.setWrapStyleWord(true);
        jScrollPane5.setViewportView(msgtextarea_inbox);

        inbox.getContentPane().add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(123, 80, 350, 230));

        Logout8_inbox.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Logout8_inbox.setText("LogOut");
        Logout8_inbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Logout8_inboxActionPerformed(evt);
            }
        });
        inbox.getContentPane().add(Logout8_inbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 10, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tempus Sans ITC", 1, 36)); // NOI18N
        jLabel12.setText("Inbox");
        inbox.getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, 160, -1));

        write.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        write.setBounds(new java.awt.Rectangle(440, 100, 500, 500));

        msgarea_write.setColumns(20);
        msgarea_write.setFont(new java.awt.Font("MV Boli", 2, 18)); // NOI18N
        msgarea_write.setLineWrap(true);
        msgarea_write.setRows(3);
        msgarea_write.setWrapStyleWord(true);
        jScrollPane3.setViewportView(msgarea_write);

        fromlabel_write.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        fromlabel_write.setText("Sender: ");

        jLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel.setText("To");

        sendbtn_write.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        sendbtn_write.setText("Send");
        sendbtn_write.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendbtn_writeActionPerformed(evt);
            }
        });

        Logout5_write.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Logout5_write.setText("LogOut");
        Logout5_write.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Logout5_writeActionPerformed(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel21.setText("Write Message");

        javax.swing.GroupLayout writeLayout = new javax.swing.GroupLayout(write.getContentPane());
        write.getContentPane().setLayout(writeLayout);
        writeLayout.setHorizontalGroup(
            writeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(writeLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(fromlabel_write, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, writeLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(writeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, writeLayout.createSequentialGroup()
                        .addComponent(sendbtn_write)
                        .addGap(113, 113, 113))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, writeLayout.createSequentialGroup()
                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Logout5_write)
                        .addGap(27, 27, 27))))
            .addGroup(writeLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(writeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(writeLayout.createSequentialGroup()
                        .addComponent(jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(totxt_write, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        writeLayout.setVerticalGroup(
            writeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, writeLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(writeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel21, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Logout5_write, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addComponent(fromlabel_write, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(writeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(totxt_write, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(sendbtn_write)
                .addContainerGap())
        );

        sent.setBounds(new java.awt.Rectangle(440, 100, 500, 500));

        sentmsglist_sent.setModel(new DefaultListModel());
        sentmsglist_sent.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        sentmsglist_sent.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                sentmsglist_sentValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(sentmsglist_sent);

        sentmsgidlist_sent.setModel(new DefaultListModel());
        sentmsgidlist_sent.setEnabled(false);
        jScrollPane6.setViewportView(sentmsgidlist_sent);

        sentmsgarea_sent.setEditable(false);
        sentmsgarea_sent.setColumns(20);
        sentmsgarea_sent.setFont(new java.awt.Font("Franklin Gothic Medium", 3, 18)); // NOI18N
        sentmsgarea_sent.setLineWrap(true);
        sentmsgarea_sent.setRows(3);
        sentmsgarea_sent.setWrapStyleWord(true);
        jScrollPane7.setViewportView(sentmsgarea_sent);

        delsentmsg_sent.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        delsentmsg_sent.setText("Delete");
        delsentmsg_sent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delsentmsg_sentActionPerformed(evt);
            }
        });

        Logout6_sent.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Logout6_sent.setText("LogOut");
        Logout6_sent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Logout6_sentActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel10.setText("Sent Messages ");

        jButton3.setText("Close");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout sentLayout = new javax.swing.GroupLayout(sent.getContentPane());
        sent.getContentPane().setLayout(sentLayout);
        sentLayout.setHorizontalGroup(
            sentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sentLayout.createSequentialGroup()
                .addGroup(sentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(sentLayout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Logout6_sent))
                    .addGroup(sentLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(sentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(sentLayout.createSequentialGroup()
                                .addComponent(jButton3)
                                .addGap(85, 85, 85)
                                .addComponent(delsentmsg_sent))
                            .addGroup(sentLayout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(14, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sentLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(96, 96, 96))
        );
        sentLayout.setVerticalGroup(
            sentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, sentLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(sentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(sentLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Logout6_sent))
                    .addGroup(sentLayout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel10)
                        .addGap(0, 13, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(sentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 253, Short.MAX_VALUE)
                    .addComponent(jScrollPane7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(sentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(delsentmsg_sent)
                    .addComponent(jButton3))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        accsttng.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        accsttng.setBounds(new java.awt.Rectangle(440, 100, 500, 500));

        accnm.setFont(new java.awt.Font("Simplified Arabic", 3, 18)); // NOI18N
        accnm.setText("User Name");

        accemail.setFont(new java.awt.Font("Simplified Arabic", 3, 18)); // NOI18N
        accemail.setText("Email");

        accpass.setFont(new java.awt.Font("Simplified Arabic", 3, 18)); // NOI18N
        accpass.setText("Old Password");

        accid.setFont(new java.awt.Font("Simplified Arabic", 3, 18)); // NOI18N
        accid.setText("User ID");

        conaccpass.setFont(new java.awt.Font("Simplified Arabic", 3, 18)); // NOI18N
        conaccpass.setText("New Password");

        Updatel_accsttng.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Updatel_accsttng.setText("Update");
        Updatel_accsttng.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Updatel_accsttngActionPerformed(evt);
            }
        });

        txtnml_accsttng.setEditable(false);
        txtnml_accsttng.setFont(new java.awt.Font("Simplified Arabic", 3, 18)); // NOI18N

        useridlabel_accsttng.setFont(new java.awt.Font("Simplified Arabic", 3, 18)); // NOI18N
        useridlabel_accsttng.setEnabled(false);

        oldpassl_accsttng.setFont(new java.awt.Font("Simplified Arabic", 3, 18)); // NOI18N

        newpassl_accsttng.setFont(new java.awt.Font("Simplified Arabic", 3, 18)); // NOI18N

        emaillbll_accsttng.setEditable(false);
        emaillbll_accsttng.setFont(new java.awt.Font("Simplified Arabic", 3, 18)); // NOI18N

        Logout7l_accsttng.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        Logout7l_accsttng.setText("LogOut");
        Logout7l_accsttng.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Logout7l_accsttngActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Simplified Arabic", 1, 18)); // NOI18N
        jLabel14.setText("Name");

        nm_accsttng.setFont(new java.awt.Font("Simplified Arabic", 1, 18)); // NOI18N

        jLabel20.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel20.setText("Here you can update your account details");

        javax.swing.GroupLayout accsttngLayout = new javax.swing.GroupLayout(accsttng.getContentPane());
        accsttng.getContentPane().setLayout(accsttngLayout);
        accsttngLayout.setHorizontalGroup(
            accsttngLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(accsttngLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(accsttngLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, accsttngLayout.createSequentialGroup()
                        .addComponent(Logout7l_accsttng)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Updatel_accsttng))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, accsttngLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(accsttngLayout.createSequentialGroup()
                            .addGroup(accsttngLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(accnm, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(accid, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel14))
                            .addGap(32, 32, 32)
                            .addGroup(accsttngLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(nm_accsttng, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                                .addComponent(txtnml_accsttng)
                                .addComponent(useridlabel_accsttng, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(accsttngLayout.createSequentialGroup()
                            .addGroup(accsttngLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(conaccpass, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(accpass, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(accemail, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(32, 32, 32)
                            .addGroup(accsttngLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(accsttngLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(oldpassl_accsttng, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                                    .addComponent(newpassl_accsttng))
                                .addComponent(emaillbll_accsttng, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        accsttngLayout.setVerticalGroup(
            accsttngLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(accsttngLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(accsttngLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(accid, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(useridlabel_accsttng, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(accsttngLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(accnm)
                    .addComponent(txtnml_accsttng, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(accsttngLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(nm_accsttng, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(accsttngLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(accemail)
                    .addComponent(emaillbll_accsttng, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(accsttngLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(oldpassl_accsttng, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(accpass))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(accsttngLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(conaccpass)
                    .addComponent(newpassl_accsttng, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(accsttngLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Logout7l_accsttng)
                    .addComponent(Updatel_accsttng))
                .addGap(31, 31, 31)
                .addComponent(jLabel20)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        stats.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        stats.setBounds(new java.awt.Rectangle(440, 100, 500, 400));

        jLabel1.setFont(new java.awt.Font("Segoe UI Semilight", 1, 15)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 51));
        jLabel1.setText("Total messages sent ");

        jLabel7.setFont(new java.awt.Font("Segoe UI Semilight", 1, 15)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 51, 51));
        jLabel7.setText("Total messages recieved ");

        jLabel8.setFont(new java.awt.Font("Segoe UI Semilight", 1, 15)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 51, 51));
        jLabel8.setText("Avg char  in the message sent");

        jLabel9.setFont(new java.awt.Font("Segoe UI Semilight", 1, 15)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 51, 51));
        jLabel9.setText("Avg char  in the message recieved");

        msgsent_stats.setFont(new java.awt.Font("Segoe UI Semibold", 0, 15)); // NOI18N
        msgsent_stats.setForeground(new java.awt.Color(51, 51, 255));

        msgrecieved_stats.setFont(new java.awt.Font("Segoe UI Semibold", 0, 15)); // NOI18N
        msgrecieved_stats.setForeground(new java.awt.Color(51, 51, 255));

        avgsentmsgchar_stats.setFont(new java.awt.Font("Segoe UI Semibold", 0, 15)); // NOI18N
        avgsentmsgchar_stats.setForeground(new java.awt.Color(51, 51, 255));

        avgcharmsgrecieved_stats.setFont(new java.awt.Font("Segoe UI Semibold", 0, 15)); // NOI18N
        avgcharmsgrecieved_stats.setForeground(new java.awt.Color(51, 51, 255));

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 2, 48)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 102, 102));
        jLabel11.setText("Your Statisitcs");

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setText("Close");

        javax.swing.GroupLayout statsLayout = new javax.swing.GroupLayout(stats.getContentPane());
        stats.getContentPane().setLayout(statsLayout);
        statsLayout.setHorizontalGroup(
            statsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(statsLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(statsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(statsLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(statsLayout.createSequentialGroup()
                        .addGroup(statsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton1)
                            .addGroup(statsLayout.createSequentialGroup()
                                .addGroup(statsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(statsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(avgsentmsgchar_stats, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(avgcharmsgrecieved_stats, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(msgsent_stats, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(msgrecieved_stats, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 69, Short.MAX_VALUE))))
        );
        statsLayout.setVerticalGroup(
            statsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(statsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(statsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(statsLayout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(77, 77, 77)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel8)
                        .addGap(20, 20, 20)
                        .addComponent(jLabel9))
                    .addGroup(statsLayout.createSequentialGroup()
                        .addComponent(msgsent_stats, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)
                        .addComponent(msgrecieved_stats, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(avgsentmsgchar_stats, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(avgcharmsgrecieved_stats, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(77, Short.MAX_VALUE))
        );

        serverpage.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        serverpage.setBounds(new java.awt.Rectangle(50, 100, 4000, 600));
        serverpage.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        serverpage.setFont(new java.awt.Font("Andalus", 2, 20)); // NOI18N
        serverpage.setMinimumSize(new java.awt.Dimension(1000, 600));

        msgtbl.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        msgtbl.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        msgtbl.setForeground(new java.awt.Color(0, 102, 51));
        msgtbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Msg ID", "Status", "Time", "Sender email", "Reciever email", "Message"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        msgtbl.setToolTipText("Message Details");
        msgtbl.setAlignmentX(1.0F);
        msgtbl.setAlignmentY(1.0F);
        msgtbl.setColumnSelectionAllowed(true);
        msgtbl.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        msgtbl.setGridColor(new java.awt.Color(0, 102, 204));
        msgtbl.setMaximumSize(new java.awt.Dimension(2147483647, 2147483647));
        msgtbl.setMinimumSize(new java.awt.Dimension(800, 500));
        msgtbl.setOpaque(false);
        msgtbl.setRowHeight(20);
        msgtbl.setSelectionBackground(new java.awt.Color(204, 204, 204));
        msgtbl.setSelectionForeground(new java.awt.Color(102, 102, 102));
        msgtbl.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        msgtbl.getTableHeader().setReorderingAllowed(false);
        jScrollPane8.setViewportView(msgtbl);
        if (msgtbl.getColumnModel().getColumnCount() > 0) {
            msgtbl.getColumnModel().getColumn(0).setMaxWidth(50);
            msgtbl.getColumnModel().getColumn(1).setMaxWidth(150);
            msgtbl.getColumnModel().getColumn(2).setMaxWidth(2000);
            msgtbl.getColumnModel().getColumn(3).setMaxWidth(2500);
            msgtbl.getColumnModel().getColumn(4).setMaxWidth(2500);
        }

        show_serverpg.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        show_serverpg.setText("**********************Show Message Details**********************");
        show_serverpg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                show_serverpgActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout serverpageLayout = new javax.swing.GroupLayout(serverpage.getContentPane());
        serverpage.getContentPane().setLayout(serverpageLayout);
        serverpageLayout.setHorizontalGroup(
            serverpageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(serverpageLayout.createSequentialGroup()
                .addGroup(serverpageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane8)
                    .addComponent(show_serverpg, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 2990, Short.MAX_VALUE))
                .addContainerGap())
        );
        serverpageLayout.setVerticalGroup(
            serverpageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(serverpageLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 339, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(show_serverpg)
                .addGap(161, 161, 161))
        );

        javax.swing.GroupLayout abtus_dialogLayout = new javax.swing.GroupLayout(abtus_dialog.getContentPane());
        abtus_dialog.getContentPane().setLayout(abtus_dialogLayout);
        abtus_dialogLayout.setHorizontalGroup(
            abtus_dialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        abtus_dialogLayout.setVerticalGroup(
            abtus_dialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 102, 255));
        setBounds(new java.awt.Rectangle(250, 25, 500, 500));
        setIconImage(new ImageIcon("D:\\Picture1.jpg").getImage());
        setMinimumSize(new java.awt.Dimension(500, 500));

        startpagebtn.setFont(new java.awt.Font("Simplified Arabic", 1, 24)); // NOI18N
        startpagebtn.setForeground(new java.awt.Color(0, 0, 255));
        startpagebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startpagebtnActionPerformed(evt);
            }
        });

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);

        jButton2.setFont(new java.awt.Font("Simplified Arabic", 1, 24)); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(startpagebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 389, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(startpagebtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginbtn_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginbtn_loginActionPerformed
        // TODO add your handling code here:

        usrnm = usrnmtxt_login.getText();
        pass = new String(usrpass_login.getPassword());
     
  if (usrnm.equals("server") && (pass.equals("kvuc")))//severpagelogin
    {
            serverpage.setVisible(true);
     } 
  else               //userpagelogin
     {
       try {
                query = "select user_id, password, email, user_name, name from verify where user_name =" + "'" + usrnm + "'" + ";";
                rs = sqlexecutequery(query);
                rs.next();
                String passwrd = rs.getString("password");
                 
            if (pass.equals(passwrd)) /*login successfull*/
               { 
                    usrid=rs.getInt("user_id");
                    usrnm=rs.getString("user_name");
                    mail=rs.getString("email");
                    JOptionPane.showMessageDialog(null, "Login Successfull");
                    /**/
                    useridlabel_accsttng.setText("" + rs.getInt("user_id"));
                    username_welcome.setText(rs.getString("user_name"));
                    txtnml_accsttng.setText(usrnm);
                    emaillbll_accsttng.setText(rs.getString("email"));
                    nm_accsttng.setText(rs.getString("name"));
                    fromlabel_write.setText(rs.getString("email"));
                    Welcome.setVisible(true);
                }
              
            rs.close();
            stmt.close();
            con.close();
       
          }
       
             catch (Exception e) 
             {
                JOptionPane.showMessageDialog(null, e.getMessage());
             }
        }
        login.dispose();
    }//GEN-LAST:event_loginbtn_loginActionPerformed

    private void newuserbtn_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newuserbtn_loginActionPerformed
        // TODO add your handling code here:
        signup.setVisible(true);
        dispose();
    }//GEN-LAST:event_newuserbtn_loginActionPerformed

    private void createuserbtn_signupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createuserbtn_signupActionPerformed
        // TODO add your handling code here:
        String email = inputusermail_signup.getText(),
                passwrd = new String(inputpass_signup.getPassword()), 
                name = inputnametxt_signup.getText(),
                retypepasswrd =   new String(inputretypepass_signup.getPassword());
             usrnm = inputusrname_signup.getText();
      if(usrnm!=null && name!=null && email!=null && passwrd!=null)
      {
        int i = 0;
        try {
            //check whether email already exists
            query = "select user_id, user_name, email from verify";
            rs = sqlexecutequery(query);
            while (rs.next())
            {
                if (email.equals(rs.getString("email"))) 
                {
                    ++i;
                    JOptionPane.showMessageDialog(null, "Enter valid Email");
                }
            }
               
            if (i == 0)
            { 
                if(retypepasswrd.equals(passwrd))
            {
                query = "select max(user_id)+1 from verify";
                rs = sqlexecutequery(query);
                rs.next();
                usrid = rs.getInt("max(user_id)+1");
                usridlbl_signup.setText("User ID :" + usrid);
                query = "insert into verify values ("
                        + usrid + ","
                        + "'" + usrnm + "',"
                        + "'" + name + "',"
                        + "'" + email + "',"
                        + "'" + passwrd + "'"
                        + ");";
                sqlupdatequery(query);
                JOptionPane.showMessageDialog(null, "User Account Created successfully" + '\n' + " Please note down your user ID: " + usrid);
            }
            else
            {
                 JOptionPane.showMessageDialog(null, "Password Don't Match");
            }
            }
             
          
            //clear all the fields
            inputusermail_signup.setText("");
            inputpass_signup.setText("");
            inputusrname_signup.setText("");
            inputnametxt_signup.setText("");
            usridlbl_signup.setText("User ID");
            inputretypepass_signup.setText("");
               
              dispose();
             con.close();
            stmt.close();
            rs.close();


        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, e.getMessage());
        }

      }

    }//GEN-LAST:event_createuserbtn_signupActionPerformed

    private void startpagebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startpagebtnActionPerformed
        // TODO add your handling code here:
        login.setVisible(true);
        dispose();
    }//GEN-LAST:event_startpagebtnActionPerformed

    private void inboxbtn_welcomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inboxbtn_welcomeActionPerformed
        // TODO add your handling code here:
      
        inbox.setVisible(true);
       
        int status1 = 0;
           DefaultListModel x = (DefaultListModel) msglist_inbox.getModel();
            DefaultListModel y = (DefaultListModel) msgidlist_inbox.getModel();
        x.removeAllElements();
        y.removeAllElements();
        try {
            
            query = "Select msgid, senderid, recieverid, time, msg, status , reciever , sender , sendermail "
                    + "from msgdtls where recieverid= " + usrid +
                    " and recieverdel = 'no' "  +";";
            rs = sqlexecutequery(query);
            
            
            if(rs.isAfterLast()){
                 rs.first();}
               if(rs.isBeforeFirst()){
                  rs.last();}
            while (rs.next()) 
            {
                
                x.insertElementAt(rs.getString("Sender"), 0);
                y.insertElementAt(rs.getInt("msgid"), 0);
               
                status1= status1 + rs.getInt("status");//check status
               
               msglist_inbox.setModel(x);
               msgidlist_inbox.setModel(y);
               
                
            }

           //msg for new message
           /****************************************/
            if (status1 != 0) 
            {
                JOptionPane.showMessageDialog(null, "you have recieved" + status1 + " new messages");
            }
            
            
            msgidlist_inbox.setVisible(false);
            con.close();
            stmt.close();
            rs.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }


    }//GEN-LAST:event_inboxbtn_welcomeActionPerformed

    private void writebtn_welcomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_writebtn_welcomeActionPerformed
        // TODO add your handling code here:
        write.setVisible(true);
        
    }//GEN-LAST:event_writebtn_welcomeActionPerformed

    private void accsttngbtn_welcomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accsttngbtn_welcomeActionPerformed
        // TODO add your handling code here:
        accsttng.setVisible(true);
       
    }//GEN-LAST:event_accsttngbtn_welcomeActionPerformed

    private void sentbtn_welcomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sentbtn_welcomeActionPerformed
        // TODO add your handling code here:
        
          sent.setVisible(true);
        DefaultListModel x = ( DefaultListModel) sentmsglist_sent.getModel();
         DefaultListModel y = (DefaultListModel) sentmsgidlist_sent.getModel();
        x.removeAllElements();
        y.removeAllElements();
         
    try 
    {
          
	 query = "Select msgid, recieverid, time, msg, status , reciever , sender, recievermail, sendermail from msgdtls "
                    + "where sendermail = '"+ mail +"'"+
                    " and senderdel = 'no' "+";" ;
            rs = sqlexecutequery(query);
            
          
               
            while (rs.next())
            {
                if(rs.isAfterLast()){
                 rs.first();}
               if(rs.isBeforeFirst()){
                  rs.last();}
                x.insertElementAt(rs.getString("reciever"),0);
                y.insertElementAt(rs.getInt("msgid"),0);
		sentmsglist_sent.setModel(x);
                sentmsgidlist_sent.setModel(y);
				
            } 
                  
			sentmsgidlist_sent.setVisible(false);
            
      }
	  
	  
     catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
           
            
           
        
    }//GEN-LAST:event_sentbtn_welcomeActionPerformed

    private void msglist_inboxValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_msglist_inboxValueChanged
        // TODO add your handling code here:

        int sel = msglist_inbox.getSelectedIndex();
        msgidlist_inbox.setSelectedIndex(sel);
        Object msgid = msgidlist_inbox.getSelectedValue();

        try {

            query = "select msgid, status , time, sender,sendermail ,msg from msgdtls where msgid = " + msgid + ";";
            rs = sqlexecutequery(query);
            rs.next();

            
            msgtextarea_inbox.setText("Sent by:"+ rs.getString("sender")+'\n' );
           msgtextarea_inbox.append("Email:"+rs.getString("sendermail")+'\n');
            msgtextarea_inbox.append("Time:"+rs.getString("time")+'\n');
            msgtextarea_inbox.append("Message: " +'\n'+ rs.getString("msg"));
            mailfrom=rs.getString("sendermail");
            query = "update msgdtls set status = 0 where msgid = " + msgid + ";";//status=0 ==> read
            sqlupdatequery(query);
             
            con.close();
            stmt.close();
            rs.close();
        } 
        catch (Exception e) {
           JOptionPane.showMessageDialog(null, e.getMessage());

        }

    }//GEN-LAST:event_msglist_inboxValueChanged

    private void sendbtn_writeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendbtn_writeActionPerformed
        // TODO add your handling code here:
        try {

            String mailto, sendermail, reciever, time, msg, sender, recieveremail;
            int msgid, senderid, recieverid, status;
            mailto = totxt_write.getText();
            sendermail = fromlabel_write.getText();
            status = 1;  /*yet not read*/
            query = "select max(msgid) from msgdtls";
            rs = sqlexecutequery(query);
            rs.next();
            
            msgid = rs.getInt("max(msgid)") + 1;/*msgid*/
            senderid = usrid;/*senderid*/
            sender = usrnm;/*sender name*/
             
            query = "select user_id, user_name , email from verify where email= '" + mailto + "'";
            rs = sqlexecutequery(query);
            rs.next();
            reciever = rs.getString("user_name");/*reciever*/
            recieverid = rs.getInt("user_id");/*reciever id*/
            recieveremail = rs.getString("email");/*reciever email*/
             
            query = "select now()"; /*time*/
            rs = sqlexecutequery(query);
            rs.next();
            time = rs.getString("now()");
            msg = msgarea_write.getText();/*msg*/
           
            /*query and update*/
            query = "insert into msgdtls values ("
                    + msgid
                    + "," + status
                    + ", '" + time + "'"
                    + "," + senderid
                    + ",'" + sender + "'"
                    + ",'" + sendermail + "'"
                    + "," + recieverid
                    + ",'" + reciever + "'"
                    + ",'" + msg + "'"
                    + ",'" + recieveremail + "',"
                    + " 'no', 'no' );";
             
            sqlupdatequery(query);
            msgarea_write.setText("");
            totxt_write.setText("");
             
            JOptionPane.showMessageDialog(null, "Message Sent Successfully");
            con.close();
            stmt.close();
            rs.close();
            
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());

        }
    }//GEN-LAST:event_sendbtn_writeActionPerformed

    private void Updatel_accsttngActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Updatel_accsttngActionPerformed
        // TODO add your handling code here:
        
        pass = new String(oldpassl_accsttng.getPassword());
        String npass = new String(newpassl_accsttng.getPassword()), nm= nm_accsttng.getText();
      
        try {
            query = "select user_id, password, email from verify where user_name =" + "'" + usrnm + "'" + ";";
            rs = sqlexecutequery(query);
            rs.next();
            //check old password
            if (pass.equals(rs.getString("password"))) 
            {
               
                query = "update  verify set "
                        + "user_name = '" + usrnm + "'"
                        + ",name = '" + nm + "'"
                        + ",password = '" + npass + "'"
                        + ", email= '" + emaillbll_accsttng.getText() + "'"
                        + " where user_id = " + usrid;
                sqlupdatequery(query);
                 
                JOptionPane.showMessageDialog(null, "Updated Successfully!");
            } 
            else {
                JOptionPane.showMessageDialog(null, "Please enter a valid password");
            }
            
            con.close();
            stmt.close();
            rs.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_Updatel_accsttngActionPerformed

    private void sentmsglist_sentValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_sentmsglist_sentValueChanged
        // TODO add your handling code here:
        int sel = sentmsglist_sent.getSelectedIndex();
        sentmsgidlist_sent.setSelectedIndex(sel);
        Object msgid = sentmsgidlist_sent.getSelectedValue();
        
        try {

            query = "select msgid, status ,reciever, time, sender, sendermail ,msg from msgdtls where msgid = " + msgid + ";";
            rs = sqlexecutequery(query);
            rs.next();
  
            if (rs.getInt("status") == 0) 
            {
                sentmsgarea_sent.setText(rs.getString("reciever") + " have read the message"+'\n');
            }
            else {
                sentmsgarea_sent.setText(rs.getString("reciever") + " haven't read the message yet"+'\n');
               } 
            sentmsgarea_sent.append("Sent on : " + '\n' + rs.getString("time") + '\n' + "Message:" + '\n' + rs.getString("msg"));

            con.close();
            stmt.close();
            rs.close();
             

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_sentmsglist_sentValueChanged

    private void replybtn_inboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_replybtn_inboxActionPerformed
        // TODO add your handling code here:

        
        if (mailfrom== null) 
        {
            JOptionPane.showMessageDialog(null, "Please select a msg to reply back;");
        } else {
            totxt_write.setText(mailfrom);
            write.setVisible(true);
        }
    }//GEN-LAST:event_replybtn_inboxActionPerformed

    private void Deletebtn_inboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Deletebtn_inboxActionPerformed
        // TODO add your handling code here:
        DefaultListModel dlm1 = (DefaultListModel) msglist_inbox.getModel();
        DefaultListModel dlm2 = (DefaultListModel) msgidlist_inbox.getModel();
        Object msgid = msgidlist_inbox.getSelectedValue();
        
        if (msgid != null)
        {       
            if (JOptionPane.showConfirmDialog(null, "Are you sure to Delete")== JOptionPane.YES_OPTION) 
            {
                dlm1.removeElementAt(msglist_inbox.getSelectedIndex());
                dlm2.removeElementAt(msgidlist_inbox.getSelectedIndex());
                
                msgtextarea_inbox.setText(""); 
              mailfrom=null;
               
                msglist_inbox.setSelectedIndex(-1);
                msgidlist_inbox.setSelectedIndex(-1);
                query = "update  msgdtls set recieverdel = 'yes' where msgid=" + msgid;
            
              sqlupdatequery(query);
              con=null;
              stmt=null;
              rs=null;
              
              
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Please select a msg to Delete");
        }

    }//GEN-LAST:event_Deletebtn_inboxActionPerformed

    private void show_serverpgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_show_serverpgActionPerformed
        // TODO add your handling code here:
        String status;
        DefaultTableModel dtm = (DefaultTableModel) msgtbl.getModel();
         for(int i=0 ;i<dtm.getRowCount();i++)
         { 
            dtm.removeRow(0);
         }
        
           
        try {
            query = "select msgid, status, time, sender, sendermail, reciever,msg,recievermail from msgdtls ";
            rs = sqlexecutequery(query);
            while (rs.next()) {

                if (rs.getInt("status") == 1) {
                    status = "Not Read";
                } else {
                    status = "Read";
                }
                Object myrow[] = {rs.getInt("msgid"), status, rs.getString("time"), rs.getString("sendermail"), rs.getString("recievermail"), rs.getString("msg")};
                dtm.addRow(myrow);
                msgtbl.setModel(dtm);
                 con.close();
            stmt.close();
            rs.close();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

    }//GEN-LAST:event_show_serverpgActionPerformed

    private void delsentmsg_sentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delsentmsg_sentActionPerformed
        // TODO add your handling code here:
           DefaultListModel dlm1 =(DefaultListModel)sentmsglist_sent.getModel();
           DefaultListModel dlm2 =(DefaultListModel)sentmsgidlist_sent.getModel();
    
        Object msgid = sentmsgidlist_sent.getSelectedValue();
        if (msgid != null) 
        {
            
            if (JOptionPane.showConfirmDialog(null, "Are you sure to Delete") == JOptionPane.YES_OPTION)
            {   
                dlm1.removeElementAt(sentmsglist_sent.getSelectedIndex());
                dlm2.removeElementAt(sentmsgidlist_sent.getSelectedIndex());
                sentmsgarea_sent.setText("");
                
              
                sentmsglist_sent.setSelectedIndex(-1);
                sentmsgidlist_sent.setSelectedIndex(-1); 
                query = "update msgdtls set senderdel = 'yes' where msgid=" + msgid;
                try
                {
                   
            sqlupdatequery(query);
                    
                }
                catch(Exception e){
                     JOptionPane.showMessageDialog(null, e.getMessage());
                }
               }
        
            }
        else
        {
            JOptionPane.showMessageDialog(null, "Please select a msg to reply back;");

        }

    }//GEN-LAST:event_delsentmsg_sentActionPerformed

    private void Logout3_welcomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Logout3_welcomeActionPerformed
        // TODO add your handling code here:
       logout();
    }//GEN-LAST:event_Logout3_welcomeActionPerformed

    private void Logout5_writeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Logout5_writeActionPerformed
        // TODO add your handling code here:
         logout();
    }//GEN-LAST:event_Logout5_writeActionPerformed

    private void Logout8_inboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Logout8_inboxActionPerformed
        // TODO add your handling code here:
        logout();
    }//GEN-LAST:event_Logout8_inboxActionPerformed

    private void Logout7l_accsttngActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Logout7l_accsttngActionPerformed
        // TODO add your handling code here:
        logout();
    }//GEN-LAST:event_Logout7l_accsttngActionPerformed

    private void Logout6_sentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Logout6_sentActionPerformed
        // TODO add your handling code here:
        logout();
    }//GEN-LAST:event_Logout6_sentActionPerformed

    private void statsbtn_welcomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statsbtn_welcomeActionPerformed
        // TODO add your handling code here:
        stats.setVisible(true);
        int  avgcharsent,avgcharrecieved ;
         try {
            
          query="select count(*), sum(length(msg)) from msgdtls where senderid = "+ usrid+ ";";
          rs= sqlexecutequery( query);rs.next();
       //max msg send
        msgsent_stats.setText(""+rs.getInt("count(*)"));
       //avg char in msg sent
        avgcharsent= rs.getInt("sum(length(msg))") / rs.getInt("count(*)");
        avgsentmsgchar_stats.setText(""+avgcharsent);
   
       
        query="select count(*), sum(length(msg))  from msgdtls where recieverid= "+ usrid+";";
        rs= sqlexecutequery( query);rs.next();
        //max msg recieved
        msgrecieved_stats.setText(""+rs.getInt("count(*)"));
       //avg char in msg recieved
        avgcharrecieved=rs.getInt("sum(length(msg))") /rs.getInt("count(*)");
       avgcharmsgrecieved_stats.setText(""+avgcharrecieved);
         
        con.close();
            stmt.close();
            rs.close();
        
        } 
         catch (Exception e) 
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_statsbtn_welcomeActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        abtus_dialog.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        sent.dispose();
        try{
            
        }
        catch (Exception e) 
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    /*METHODS*/
    /*method to execute query*/
    public ResultSet sqlexecutequery(String query) {
        try {

            Class.forName("java.sql.Driver");
        con  = DriverManager.getConnection("jdbc:mysql://localhost/pro", "root", "kvuc");
         stmt = con.createStatement();
         rs = stmt.executeQuery(query);
        } catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return rs;
    }
/*method to execute update*/
    public void sqlupdatequery(String query) {
        try {

            Class.forName("java.sql.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/pro", "root", "kvuc");
            stmt = con.createStatement();
            stmt.executeUpdate(query);


        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

    }
/*method to execute query*/
   
    public void logout()
    {
        //default value for variables
    con = null;
    stmt = null;
    rs = null;
    query= null;
    mailfrom = null ;
    usrnm= null;
    pass= null; 
    mail= null;
     usrid=0;
    
        //loginframe
        usrnmtxt_login.setText("");
        usrpass_login.setText("");
         //welcome frame
        username_welcome.setText("");
          //inbox frame
        msgtextarea_inbox.setText("");
        msglist_inbox.removeAll();
        msgidlist_inbox.removeAll();
        //writeframe
        msgarea_write.setText("");
        totxt_write.setText("");
        //sentframe
        sentmsgarea_sent.setText("");
        sentmsglist_sent.removeAll();
        sentmsgidlist_sent.removeAll();
        //accsttng frame
        oldpassl_accsttng.setText("");
        newpassl_accsttng.setText("");
         
        //dispose frames and dialogs
        Welcome.dispose();
        inbox.dispose();
        write.dispose();
        sent.dispose();
        accsttng.dispose();
        stats.dispose();
        signup.dispose();
       serverpage.dispose();
        
       
       JOptionPane.showMessageDialog(null, "Successfully logged out");
      try
      {
          con.close();
            stmt.close();
            rs.close();
      }
      catch(Exception e)
      {
          
      }     
     login.setVisible(true);
     
    }
   

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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Deletebtn_inbox;
    private javax.swing.JButton Logout3_welcome;
    private javax.swing.JButton Logout5_write;
    private javax.swing.JButton Logout6_sent;
    private javax.swing.JButton Logout7l_accsttng;
    private javax.swing.JButton Logout8_inbox;
    private javax.swing.JButton Updatel_accsttng;
    private javax.swing.JFrame Welcome;
    private javax.swing.JDialog abtus_dialog;
    private javax.swing.JLabel accemail;
    private javax.swing.JLabel accid;
    private javax.swing.JLabel accnm;
    private javax.swing.JLabel accpass;
    private javax.swing.JFrame accsttng;
    private javax.swing.JButton accsttngbtn_welcome;
    private javax.swing.JLabel avgcharmsgrecieved_stats;
    private javax.swing.JLabel avgsentmsgchar_stats;
    private javax.swing.JLabel conaccpass;
    private javax.swing.JButton createuserbtn_signup;
    private javax.swing.JButton delsentmsg_sent;
    private javax.swing.JTextField emaillbll_accsttng;
    private javax.swing.JLabel fromlabel_write;
    private javax.swing.JFrame inbox;
    private javax.swing.JButton inboxbtn_welcome;
    private javax.swing.JTextField inputnametxt_signup;
    private javax.swing.JPasswordField inputpass_signup;
    private javax.swing.JPasswordField inputretypepass_signup;
    private javax.swing.JTextField inputusermail_signup;
    private javax.swing.JTextField inputusrname_signup;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JFrame login;
    private javax.swing.JButton loginbtn_login;
    private javax.swing.JTextArea msgarea_write;
    private javax.swing.JList msgidlist_inbox;
    public javax.swing.JList msglist_inbox;
    private javax.swing.JLabel msgrecieved_stats;
    private javax.swing.JLabel msgsent_stats;
    private javax.swing.JTable msgtbl;
    private javax.swing.JTextArea msgtextarea_inbox;
    private javax.swing.JPasswordField newpassl_accsttng;
    private javax.swing.JButton newuserbtn_login;
    private javax.swing.JTextField nm_accsttng;
    private javax.swing.JPasswordField oldpassl_accsttng;
    private javax.swing.JButton replybtn_inbox;
    private javax.swing.JButton sendbtn_write;
    private javax.swing.JFrame sent;
    private javax.swing.JButton sentbtn_welcome;
    private javax.swing.JTextArea sentmsgarea_sent;
    private javax.swing.JList sentmsgidlist_sent;
    private javax.swing.JList sentmsglist_sent;
    private javax.swing.JFrame serverpage;
    private javax.swing.JButton show_serverpg;
    private javax.swing.JDialog signup;
    private javax.swing.JButton startpagebtn;
    private javax.swing.JDialog stats;
    private javax.swing.JButton statsbtn_welcome;
    private javax.swing.JTextField totxt_write;
    private javax.swing.JTextField txtnml_accsttng;
    private javax.swing.JLabel useridlabel_accsttng;
    private javax.swing.JLabel username_welcome;
    private javax.swing.JLabel usridlbl_signup;
    private javax.swing.JTextField usrnmtxt_login;
    private javax.swing.JPasswordField usrpass_login;
    private javax.swing.JFrame write;
    private javax.swing.JButton writebtn_welcome;
    // End of variables declaration//GEN-END:variables
}
