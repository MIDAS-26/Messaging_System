
import java.sql.*;
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
        clr_signup = new javax.swing.JButton();
        welcome = new javax.swing.JFrame();
        jLabel5 = new javax.swing.JLabel();
        inboxbtn_welcome = new javax.swing.JButton();
        sentbtn_welcome = new javax.swing.JButton();
        writebtn_welcome = new javax.swing.JButton();
        statsbtn_welcome = new javax.swing.JButton();
        accsttngbtn_welcome = new javax.swing.JButton();
        username_welcome = new javax.swing.JLabel();
        Logout3_welcome = new javax.swing.JButton();
        inbox = new javax.swing.JFrame();
        replybtn_inbox = new javax.swing.JButton();
        Deletebtn_inbox = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        msgtextarea_inbox = new javax.swing.JTextArea();
        Logout8_inbox = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane9 = new javax.swing.JScrollPane();
        msgidlist_inbox = new javax.swing.JList();
        jScrollPane4 = new javax.swing.JScrollPane();
        msglist_inbox = new javax.swing.JList();
        Close_sent1 = new javax.swing.JButton();
        write = new javax.swing.JFrame();
        jScrollPane3 = new javax.swing.JScrollPane();
        msgarea_write = new javax.swing.JTextArea();
        fromlabel_write = new javax.swing.JLabel();
        jLabel = new javax.swing.JLabel();
        totxt_write = new javax.swing.JTextField();
        sendbtn_write = new javax.swing.JButton();
        Logout5_write = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        Close_write = new javax.swing.JButton();
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
        Close_sent = new javax.swing.JButton();
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
        Logout7_accsttng = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        nm_accsttng = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        msgcounter = new javax.swing.JDialog();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        msgsent_msgcounter = new javax.swing.JLabel();
        msgrecieved_msgcounter = new javax.swing.JLabel();
        avgsentmsgchar_msgcounter = new javax.swing.JLabel();
        avgcharmsgrecieved_msgcounter = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        close_stats = new javax.swing.JButton();
        msgdtlspg = new javax.swing.JFrame();
        jScrollPane8 = new javax.swing.JScrollPane();
        msgtbl_msgdtls = new javax.swing.JTable();
        show_msgdtls = new javax.swing.JButton();
        msgid_txt_msgdtls = new javax.swing.JTextField();
        search_msgdtls = new javax.swing.JButton();
        sortby_msgdtls = new javax.swing.JComboBox();
        jLabel22 = new javax.swing.JLabel();
        startpagebtn = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();

        login.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        login.setBounds(new java.awt.Rectangle(440, 210, 500, 250));
        login.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        login.getContentPane().add(usrnmtxt_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, 255, 29));

        usrpass_login.setToolTipText("Click here to login");
        usrpass_login.setEchoChar('*');
        login.getContentPane().add(usrpass_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, 255, 30));

        loginbtn_login.setBackground(new java.awt.Color(153, 153, 0));
        loginbtn_login.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        loginbtn_login.setText("Log In");
        loginbtn_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginbtn_loginActionPerformed(evt);
            }
        });
        login.getContentPane().add(loginbtn_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(271, 150, 140, 50));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Username");
        login.getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 86, 33));

        newuserbtn_login.setBackground(new java.awt.Color(153, 153, 0));
        newuserbtn_login.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        newuserbtn_login.setText("New User");
        newuserbtn_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newuserbtn_loginActionPerformed(evt);
            }
        });
        login.getContentPane().add(newuserbtn_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, 150, 50));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Password");
        login.getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 86, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 153, 255));
        jLabel4.setText("Please Enter Your Username and Password");
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        login.getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 11, 540, 31));

        signup.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        signup.setBounds(new java.awt.Rectangle(440, 100, 500, 500));

        createuserbtn_signup.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        createuserbtn_signup.setText("Create User");
        createuserbtn_signup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createuserbtn_signupActionPerformed(evt);
            }
        });

        usridlbl_signup.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        usridlbl_signup.setText("User id");

        jLabel6.setBackground(new java.awt.Color(204, 153, 255));
        jLabel6.setFont(new java.awt.Font("Monotype Corsiva", 1, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 51, 0));
        jLabel6.setText("New User");

        inputusermail_signup.setEditable(false);

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel15.setText("User Name");

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel18.setText("Name");

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel16.setText("Email (for official use only)");
        jLabel16.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                jLabel16ComponentAdded(evt);
            }
        });

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
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19)
                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE))
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
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                        .addComponent(jLabel18)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel16)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(inputusrname_signup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
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

        clr_signup.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        clr_signup.setText("Clear");
        clr_signup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clr_signupActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout signupLayout = new javax.swing.GroupLayout(signup.getContentPane());
        signup.getContentPane().setLayout(signupLayout);
        signupLayout.setHorizontalGroup(
            signupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(signupLayout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(usridlbl_signup, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                .addGap(224, 224, 224))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, signupLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, signupLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(createuserbtn_signup, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(clr_signup, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
            .addGroup(signupLayout.createSequentialGroup()
                .addGap(121, 121, 121)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        signupLayout.setVerticalGroup(
            signupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(signupLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(usridlbl_signup, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(31, 31, 31)
                .addGroup(signupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(createuserbtn_signup, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(clr_signup, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37))
        );

        welcome.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        welcome.setBackground(new java.awt.Color(51, 51, 255));
        welcome.setBounds(new java.awt.Rectangle(440, 100, 620, 370));
        welcome.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                welcomeComponentAdded(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Monotype Corsiva", 3, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 51, 51));
        jLabel5.setText("Welcome!");

        inboxbtn_welcome.setBackground(new java.awt.Color(51, 102, 255));
        inboxbtn_welcome.setFont(new java.awt.Font("Monotype Corsiva", 1, 24)); // NOI18N
        inboxbtn_welcome.setText("Inbox");
        inboxbtn_welcome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inboxbtn_welcomeActionPerformed(evt);
            }
        });

        sentbtn_welcome.setBackground(new java.awt.Color(51, 102, 255));
        sentbtn_welcome.setFont(new java.awt.Font("Monotype Corsiva", 1, 24)); // NOI18N
        sentbtn_welcome.setText("Sent");
        sentbtn_welcome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sentbtn_welcomeActionPerformed(evt);
            }
        });

        writebtn_welcome.setBackground(new java.awt.Color(51, 102, 255));
        writebtn_welcome.setFont(new java.awt.Font("Monotype Corsiva", 1, 24)); // NOI18N
        writebtn_welcome.setText("Write");
        writebtn_welcome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                writebtn_welcomeActionPerformed(evt);
            }
        });

        statsbtn_welcome.setBackground(new java.awt.Color(51, 102, 255));
        statsbtn_welcome.setFont(new java.awt.Font("Monotype Corsiva", 1, 24)); // NOI18N
        statsbtn_welcome.setText("Message Counter");
        statsbtn_welcome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statsbtn_welcomeActionPerformed(evt);
            }
        });

        accsttngbtn_welcome.setBackground(new java.awt.Color(51, 102, 255));
        accsttngbtn_welcome.setFont(new java.awt.Font("Monotype Corsiva", 1, 24)); // NOI18N
        accsttngbtn_welcome.setText("Account Setting");
        accsttngbtn_welcome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accsttngbtn_welcomeActionPerformed(evt);
            }
        });

        username_welcome.setFont(new java.awt.Font("Monotype Corsiva", 3, 36)); // NOI18N
        username_welcome.setForeground(new java.awt.Color(51, 0, 204));
        username_welcome.setText("<user name>");

        Logout3_welcome.setBackground(new java.awt.Color(51, 102, 255));
        Logout3_welcome.setFont(new java.awt.Font("Monotype Corsiva", 1, 24)); // NOI18N
        Logout3_welcome.setText("LogOut");
        Logout3_welcome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Logout3_welcomeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout welcomeLayout = new javax.swing.GroupLayout(welcome.getContentPane());
        welcome.getContentPane().setLayout(welcomeLayout);
        welcomeLayout.setHorizontalGroup(
            welcomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(welcomeLayout.createSequentialGroup()
                .addGroup(welcomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(welcomeLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(welcomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(sentbtn_welcome, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(writebtn_welcome, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(welcomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(statsbtn_welcome, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(inboxbtn_welcome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(welcomeLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(username_welcome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(10, 10, 10)
                        .addComponent(accsttngbtn_welcome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, welcomeLayout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(145, 145, 145)
                        .addComponent(Logout3_welcome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        welcomeLayout.setVerticalGroup(
            welcomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(welcomeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(welcomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(welcomeLayout.createSequentialGroup()
                        .addComponent(Logout3_welcome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(74, 74, 74))
                    .addGroup(welcomeLayout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(welcomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(accsttngbtn_welcome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, welcomeLayout.createSequentialGroup()
                        .addComponent(username_welcome, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)))
                .addGap(36, 36, 36)
                .addGroup(welcomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(writebtn_welcome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(inboxbtn_welcome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(welcomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sentbtn_welcome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(statsbtn_welcome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        inbox.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        inbox.setBackground(new java.awt.Color(0, 0, 0));
        inbox.setBounds(new java.awt.Rectangle(440, 100, 500, 500));
        inbox.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        replybtn_inbox.setBackground(new java.awt.Color(153, 153, 255));
        replybtn_inbox.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        replybtn_inbox.setText("Reply");
        replybtn_inbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                replybtn_inboxActionPerformed(evt);
            }
        });
        inbox.getContentPane().add(replybtn_inbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, -1, -1));

        Deletebtn_inbox.setBackground(new java.awt.Color(153, 153, 255));
        Deletebtn_inbox.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        Deletebtn_inbox.setText("Delete");
        Deletebtn_inbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Deletebtn_inboxActionPerformed(evt);
            }
        });
        inbox.getContentPane().add(Deletebtn_inbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 320, -1, -1));

        msgtextarea_inbox.setEditable(false);
        msgtextarea_inbox.setColumns(20);
        msgtextarea_inbox.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        msgtextarea_inbox.setForeground(new java.awt.Color(0, 51, 204));
        msgtextarea_inbox.setLineWrap(true);
        msgtextarea_inbox.setRows(5);
        msgtextarea_inbox.setTabSize(5);
        msgtextarea_inbox.setWrapStyleWord(true);
        jScrollPane5.setViewportView(msgtextarea_inbox);

        inbox.getContentPane().add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(123, 80, 350, 230));

        Logout8_inbox.setBackground(new java.awt.Color(153, 153, 255));
        Logout8_inbox.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        Logout8_inbox.setText("LogOut");
        Logout8_inbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Logout8_inboxActionPerformed(evt);
            }
        });
        inbox.getContentPane().add(Logout8_inbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 20, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel12.setText("Inbox");
        inbox.getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, 110, -1));

        msgidlist_inbox.setModel(new DefaultListModel());
        msgidlist_inbox.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        msgidlist_inbox.setVisibleRowCount(2);
        jScrollPane9.setViewportView(msgidlist_inbox);

        inbox.getContentPane().add(jScrollPane9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 0, 0));

        msglist_inbox.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        msglist_inbox.setForeground(new java.awt.Color(255, 51, 51));
        msglist_inbox.setModel(new DefaultListModel());
        msglist_inbox.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        msglist_inbox.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                msglist_inboxValueChanged(evt);
            }
        });
        jScrollPane4.setViewportView(msglist_inbox);

        inbox.getContentPane().add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 100, 230));

        Close_sent1.setBackground(new java.awt.Color(153, 153, 255));
        Close_sent1.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        Close_sent1.setText("Close");
        Close_sent1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Close_sent1ActionPerformed(evt);
            }
        });
        inbox.getContentPane().add(Close_sent1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 320, -1, -1));

        write.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        write.setBounds(new java.awt.Rectangle(440, 100, 500, 500));
        write.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        msgarea_write.setColumns(20);
        msgarea_write.setFont(new java.awt.Font("MV Boli", 2, 18)); // NOI18N
        msgarea_write.setLineWrap(true);
        msgarea_write.setRows(3);
        msgarea_write.setWrapStyleWord(true);
        jScrollPane3.setViewportView(msgarea_write);

        write.getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 420, 159));

        fromlabel_write.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        fromlabel_write.setText("Sender: ");
        write.getContentPane().add(fromlabel_write, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 66, 394, 29));

        jLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel.setText("To (email):");
        write.getContentPane().add(jLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 113, -1, 24));
        write.getContentPane().add(totxt_write, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 108, 277, 30));

        sendbtn_write.setBackground(new java.awt.Color(0, 153, 153));
        sendbtn_write.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        sendbtn_write.setText("Send");
        sendbtn_write.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendbtn_writeActionPerformed(evt);
            }
        });
        write.getContentPane().add(sendbtn_write, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 330, -1, -1));

        Logout5_write.setBackground(new java.awt.Color(0, 153, 153));
        Logout5_write.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        Logout5_write.setText("LogOut");
        Logout5_write.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Logout5_writeActionPerformed(evt);
            }
        });
        write.getContentPane().add(Logout5_write, new org.netbeans.lib.awtextra.AbsoluteConstraints(308, 11, -1, -1));

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel21.setText("Write Message");
        write.getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 280, 48));

        Close_write.setBackground(new java.awt.Color(0, 153, 153));
        Close_write.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        Close_write.setText("Close");
        Close_write.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Close_writeActionPerformed(evt);
            }
        });
        write.getContentPane().add(Close_write, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, -1, -1));

        sent.setBounds(new java.awt.Rectangle(440, 100, 500, 500));

        sentmsglist_sent.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        sentmsglist_sent.setForeground(new java.awt.Color(0, 0, 204));
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
        sentmsgarea_sent.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        sentmsgarea_sent.setForeground(new java.awt.Color(255, 0, 0));
        sentmsgarea_sent.setLineWrap(true);
        sentmsgarea_sent.setRows(3);
        sentmsgarea_sent.setWrapStyleWord(true);
        jScrollPane7.setViewportView(sentmsgarea_sent);

        delsentmsg_sent.setBackground(new java.awt.Color(51, 102, 255));
        delsentmsg_sent.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        delsentmsg_sent.setText("Delete");
        delsentmsg_sent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delsentmsg_sentActionPerformed(evt);
            }
        });

        Logout6_sent.setBackground(new java.awt.Color(51, 102, 255));
        Logout6_sent.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        Logout6_sent.setText("LogOut");
        Logout6_sent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Logout6_sentActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel10.setText("Sent Messages ");

        Close_sent.setBackground(new java.awt.Color(51, 102, 255));
        Close_sent.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        Close_sent.setText("Close");
        Close_sent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Close_sentActionPerformed(evt);
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
                        .addGroup(sentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(sentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sentLayout.createSequentialGroup()
                                .addComponent(Close_sent)
                                .addGap(85, 85, 85)
                                .addComponent(delsentmsg_sent)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        sentLayout.setVerticalGroup(
            sentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, sentLayout.createSequentialGroup()
                .addGroup(sentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(sentLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Logout6_sent))
                    .addGroup(sentLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel10)
                        .addGap(0, 13, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(sentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 253, Short.MAX_VALUE)
                    .addComponent(jScrollPane7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(sentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(delsentmsg_sent)
                    .addComponent(Close_sent))
                .addGap(9, 9, 9)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
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

        Updatel_accsttng.setBackground(new java.awt.Color(0, 153, 153));
        Updatel_accsttng.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
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

        Logout7_accsttng.setBackground(new java.awt.Color(0, 153, 153));
        Logout7_accsttng.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        Logout7_accsttng.setText("LogOut");
        Logout7_accsttng.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Logout7_accsttngActionPerformed(evt);
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
                        .addComponent(Logout7_accsttng)
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
                .addContainerGap(44, Short.MAX_VALUE))
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
                    .addComponent(Logout7_accsttng)
                    .addComponent(Updatel_accsttng))
                .addGap(31, 31, 31)
                .addComponent(jLabel20)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        msgcounter.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        msgcounter.setBackground(new java.awt.Color(0, 255, 102));
        msgcounter.setBounds(new java.awt.Rectangle(440, 100, 500, 400));
        msgcounter.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI Semilight", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 51));
        jLabel1.setText("Total messages sent ");
        msgcounter.getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 82, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI Semilight", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 51, 51));
        jLabel7.setText("Total messages recieved ");
        msgcounter.getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 141, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI Semilight", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 51, 51));
        jLabel8.setText("Avg char  in the message sent");
        msgcounter.getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 191, 354, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI Semilight", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 51, 51));
        jLabel9.setText("Avg char  in the message recieved");
        msgcounter.getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 390, -1));

        msgsent_msgcounter.setFont(new java.awt.Font("Segoe UI Semibold", 0, 15)); // NOI18N
        msgsent_msgcounter.setForeground(new java.awt.Color(51, 51, 255));
        msgcounter.getContentPane().add(msgsent_msgcounter, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 90, 40, 25));

        msgrecieved_msgcounter.setFont(new java.awt.Font("Segoe UI Semibold", 0, 15)); // NOI18N
        msgrecieved_msgcounter.setForeground(new java.awt.Color(51, 51, 255));
        msgcounter.getContentPane().add(msgrecieved_msgcounter, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 150, 40, 25));

        avgsentmsgchar_msgcounter.setFont(new java.awt.Font("Segoe UI Semibold", 0, 15)); // NOI18N
        avgsentmsgchar_msgcounter.setForeground(new java.awt.Color(51, 51, 255));
        msgcounter.getContentPane().add(avgsentmsgchar_msgcounter, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 200, 40, 25));

        avgcharmsgrecieved_msgcounter.setFont(new java.awt.Font("Segoe UI Semibold", 0, 15)); // NOI18N
        avgcharmsgrecieved_msgcounter.setForeground(new java.awt.Color(51, 51, 255));
        msgcounter.getContentPane().add(avgcharmsgrecieved_msgcounter, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 250, 40, 25));

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 2, 48)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 102, 102));
        jLabel11.setText("Message Counter");
        msgcounter.getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 11, 380, -1));

        close_stats.setBackground(new java.awt.Color(0, 153, 153));
        close_stats.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        close_stats.setText("Close");
        close_stats.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                close_statsActionPerformed(evt);
            }
        });
        msgcounter.getContentPane().add(close_stats, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 300, -1, -1));

        msgdtlspg.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        msgdtlspg.setBounds(new java.awt.Rectangle(50, 100, 1500, 800));
        msgdtlspg.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        msgdtlspg.setFont(new java.awt.Font("Andalus", 2, 20)); // NOI18N
        msgdtlspg.setMinimumSize(new java.awt.Dimension(1000, 600));

        jScrollPane8.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane8.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        msgtbl_msgdtls.setBackground(new java.awt.Color(255, 153, 153));
        msgtbl_msgdtls.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        msgtbl_msgdtls.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        msgtbl_msgdtls.setForeground(new java.awt.Color(0, 102, 51));
        msgtbl_msgdtls.setModel(new javax.swing.table.DefaultTableModel(
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
        msgtbl_msgdtls.setToolTipText("Message Details");
        msgtbl_msgdtls.setAlignmentX(1.0F);
        msgtbl_msgdtls.setAlignmentY(1.0F);
        msgtbl_msgdtls.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        msgtbl_msgdtls.setGridColor(new java.awt.Color(0, 102, 204));
        msgtbl_msgdtls.setMaximumSize(new java.awt.Dimension(2147483647, 2147483647));
        msgtbl_msgdtls.setMinimumSize(new java.awt.Dimension(800, 500));
        msgtbl_msgdtls.setOpaque(false);
        msgtbl_msgdtls.setRowHeight(22);
        msgtbl_msgdtls.setSelectionBackground(new java.awt.Color(255, 0, 51));
        msgtbl_msgdtls.setSelectionForeground(new java.awt.Color(0, 0, 255));
        msgtbl_msgdtls.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        msgtbl_msgdtls.getTableHeader().setReorderingAllowed(false);
        jScrollPane8.setViewportView(msgtbl_msgdtls);
        if (msgtbl_msgdtls.getColumnModel().getColumnCount() > 0) {
            msgtbl_msgdtls.getColumnModel().getColumn(0).setMaxWidth(70);
            msgtbl_msgdtls.getColumnModel().getColumn(1).setMaxWidth(200);
            msgtbl_msgdtls.getColumnModel().getColumn(2).setMaxWidth(250);
            msgtbl_msgdtls.getColumnModel().getColumn(3).setMaxWidth(300);
            msgtbl_msgdtls.getColumnModel().getColumn(4).setMaxWidth(300);
            msgtbl_msgdtls.getColumnModel().getColumn(5).setMaxWidth(700);
        }

        show_msgdtls.setBackground(new java.awt.Color(0, 153, 153));
        show_msgdtls.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        show_msgdtls.setText("SHOW MESSAGE DETAIILS");
        show_msgdtls.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                show_msgdtlsActionPerformed(evt);
            }
        });

        msgid_txt_msgdtls.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N

        search_msgdtls.setBackground(new java.awt.Color(0, 153, 51));
        search_msgdtls.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        search_msgdtls.setText("Search");
        search_msgdtls.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_msgdtlsActionPerformed(evt);
            }
        });

        sortby_msgdtls.setBackground(new java.awt.Color(0, 204, 255));
        sortby_msgdtls.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        sortby_msgdtls.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Msgid", "Sender", "Reciever", "After This  Date", "Before This Date", "On This Date", " " }));

        jLabel22.setFont(new java.awt.Font("Serif", 1, 36)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 0, 0));
        jLabel22.setText("Message Details");

        javax.swing.GroupLayout msgdtlspgLayout = new javax.swing.GroupLayout(msgdtlspg.getContentPane());
        msgdtlspg.getContentPane().setLayout(msgdtlspgLayout);
        msgdtlspgLayout.setHorizontalGroup(
            msgdtlspgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(msgdtlspgLayout.createSequentialGroup()
                .addGroup(msgdtlspgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(msgdtlspgLayout.createSequentialGroup()
                        .addGap(333, 333, 333)
                        .addComponent(sortby_msgdtls, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(msgid_txt_msgdtls, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(search_msgdtls, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(msgdtlspgLayout.createSequentialGroup()
                        .addGap(367, 367, 367)
                        .addComponent(jLabel22))
                    .addGroup(msgdtlspgLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(show_msgdtls, javax.swing.GroupLayout.DEFAULT_SIZE, 1273, Short.MAX_VALUE))
                    .addGroup(msgdtlspgLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane8)))
                .addContainerGap(161, Short.MAX_VALUE))
        );
        msgdtlspgLayout.setVerticalGroup(
            msgdtlspgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(msgdtlspgLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel22)
                .addGap(5, 5, 5)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(show_msgdtls, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addGroup(msgdtlspgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(msgid_txt_msgdtls, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(search_msgdtls, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sortby_msgdtls, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(81, 81, 81))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 102, 255));
        setBounds(new java.awt.Rectangle(250, 25, 500, 500));
        setMinimumSize(new java.awt.Dimension(500, 500));
        setPreferredSize(new java.awt.Dimension(750, 1000));

        startpagebtn.setFont(new java.awt.Font("Simplified Arabic", 1, 24)); // NOI18N
        startpagebtn.setForeground(new java.awt.Color(0, 0, 255));
        startpagebtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/startlogo.JPEG"))); // NOI18N
        startpagebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startpagebtnActionPerformed(evt);
            }
        });

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/frontpage.JPG"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel13)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(242, 242, 242)
                .addComponent(startpagebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(startpagebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1510, 1510, 1510))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginbtn_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginbtn_loginActionPerformed
        

        usrnm = usrnmtxt_login.getText();
        pass = new String(usrpass_login.getPassword());
     
  if (usrnm.equals("admin") && (pass.equals("meppem")))//msgpagelogin
    {
            msgdtlspg.setVisible(true);
     } 
  else               //userpagelogin
     {
       try {
                query = "select user_id, password, email, user_name, name from userdtls where user_name =" + "'" + usrnm + "'" + ";";
                rs = sqlexecutequery(query);
                rs.next();
                String passwrd = rs.getString("password");
                 
            if (pass.equals(passwrd)) /*login successfull*/
               { 
                    usrid=rs.getInt("user_id");
                    usrnm=rs.getString("user_name");
                    mail=rs.getString("email");
                    JOptionPane.showMessageDialog(null, "Login Successful");
                    /**/
                    useridlabel_accsttng.setText("" + rs.getInt("user_id"));
                    username_welcome.setText(rs.getString("user_name"));
                    txtnml_accsttng.setText(usrnm);
                    emaillbll_accsttng.setText(rs.getString("email"));
                    nm_accsttng.setText(rs.getString("name"));
                    fromlabel_write.setText(rs.getString("email"));
                    welcome.setVisible(true);
                }
            else
            {
                JOptionPane.showMessageDialog(null,"Invalid Credentials,\n Please Login Again With Valid Credentials or Signup As A New User");
            
            
            }
              
             
             
             
       
          }
       
             catch (Exception e) 
             {
                JOptionPane.showMessageDialog(null, e.getMessage());
             }
        }
       
        login.dispose();
    }//GEN-LAST:event_loginbtn_loginActionPerformed

    private void newuserbtn_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newuserbtn_loginActionPerformed
        
        signup.setVisible(true);
      inputusermail_signup.setText("");
            inputpass_signup.setText("");
            inputusrname_signup.setText("");
            inputnametxt_signup.setText("");
            usridlbl_signup.setText("User ID");
            inputretypepass_signup.setText("");
            
            createuserbtn_signup.setEnabled(true);
        dispose();   
    }//GEN-LAST:event_newuserbtn_loginActionPerformed

    private void createuserbtn_signupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createuserbtn_signupActionPerformed
        
      usrnm = inputusrname_signup.getText();
      String  passwrd = new String(inputpass_signup.getPassword()), 
                name = inputnametxt_signup.getText(),
                email = usrnm+"@mepmail.com",
                retypepasswrd =   new String(inputretypepass_signup.getPassword());
             
             
      if(usrnm!=null && name!=null  && passwrd!=null)
      {
       int x;
        try {
            //check whether usernm already exists
            query = "select count(*) from userdtls where user_name='"+usrnm+"'";
            rs = sqlexecutequery(query);
            rs.next();
             x=rs.getInt("count(*)"); //==> if >0 not valid  
               
            if (x==0)
            { 
                if(retypepasswrd.equals(passwrd))
            {
                query = "select max(user_id)+1 from userdtls";
                rs = sqlexecutequery(query);
                rs.next();
                usrid = rs.getInt("max(user_id)+1");
                usridlbl_signup.setText("User  ID : " + usrid);
                query = "insert into userdtls values ("
                        + usrid + ","
                        + "'" + usrnm + "',"
                        + "'" + name + "',"
                        + "'" + email + "',"
                        + "'" + passwrd + "'"
                        + ");";
                sqlupdatequery(query);
                JOptionPane.showMessageDialog(null, "User Account Created successfully"
                        +'\n'+ " Please note down your mail id: "+ email); inputusermail_signup.setText(""+email);
            usridlbl_signup.setText("User id"+usrid);
           createuserbtn_signup.setEnabled(false);
          
            }
                else
                {
                     JOptionPane.showMessageDialog(null, "Your Passwords Don't Match");
                }
            }
            else
            {
                JOptionPane.showMessageDialog(null, "User name already exists");
                
            }
           
            
               
              dispose();
              
             
             


        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, e.getMessage());
        }

      }
 
    }//GEN-LAST:event_createuserbtn_signupActionPerformed

    private void startpagebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startpagebtnActionPerformed
      
        login.setVisible(true);
        dispose();   
    }//GEN-LAST:event_startpagebtnActionPerformed

    private void inboxbtn_welcomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inboxbtn_welcomeActionPerformed
       
     
        inbox.setVisible(true);
       msgtextarea_inbox.removeAll();
        int status1 = 0;
         DefaultListModel x = ( DefaultListModel) msglist_inbox.getModel();
        DefaultListModel y = (DefaultListModel) msgidlist_inbox.getModel();
              x.removeAllElements();
               y.removeAllElements();
               
           
        try {  
            
            
            query = "Select msgid, senderid , recieverid, time, msg, status , reciever , sender , sendermail "
                    + "from msgdtls where recieverid= " + usrid +
                    " AND recieverdel = 'no' "  +";";
            rs = sqlexecutequery(query);
            
            
            while (rs.next()) 
            {
                
                x.add(0,rs.getString("Sender"));
                y.add(0,rs.getInt("msgid"));
               
               
               status1= status1 + rs.getInt("status");//check status
                
            }
                msglist_inbox.setModel(x);
                 msgidlist_inbox.setModel(y); 
           //msg for new message
          
            if (status1 != 0) 
            {
                JOptionPane.showMessageDialog(null, "you have recieved " + status1 + " new messages");
            }
            
            
            
             
            
             
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
   

    }//GEN-LAST:event_inboxbtn_welcomeActionPerformed

    private void writebtn_welcomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_writebtn_welcomeActionPerformed
  
        write.setVisible(true);
        totxt_write.setText("");
           
    }//GEN-LAST:event_writebtn_welcomeActionPerformed

    private void accsttngbtn_welcomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accsttngbtn_welcomeActionPerformed
       
        accsttng.setVisible(true);
          
    }//GEN-LAST:event_accsttngbtn_welcomeActionPerformed

    private void sentbtn_welcomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sentbtn_welcomeActionPerformed
        
        
          sent.setVisible(true);
          
      
    try 
    {   
        DefaultListModel x = ( DefaultListModel) sentmsglist_sent.getModel();
         DefaultListModel y = (DefaultListModel) sentmsgidlist_sent.getModel();
          x.removeAllElements();
        y.removeAllElements();
	 query = "Select msgid, recieverid, time, msg, status , reciever , sender, recievermail, sendermail from msgdtls where sendermail = '"+ mail +"'"+
                    " and senderdel = 'no' "+";" ;
         rs = sqlexecutequery(query);
               
            while (rs.next())
            {
              
              x.add(0,rs.getString("reciever"));
                y.add(0,rs.getInt("msgid"));
             
              
	     } 
            sentmsgarea_sent.setText("");
                  sentmsglist_sent.setModel(x);
                sentmsgidlist_sent.setModel(y);
			sentmsgidlist_sent.setVisible(false);
                      
                
                      
      }
	  
	  
     catch (Exception e)
        {
             JOptionPane.showMessageDialog( null, e.getMessage());
        }
           
            
            
        
    }//GEN-LAST:event_sentbtn_welcomeActionPerformed

    private void sendbtn_writeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendbtn_writeActionPerformed
        
       String mailto, sendermail, reciever, time, msg, sender, recieveremail;
            int msgid, senderid, recieverid, status= 1; /*yet not read*/
          mailto = totxt_write.getText(); 
          sendermail = fromlabel_write.getText(); 
          senderid = usrid;/*senderid*/
          sender = usrnm;/*sender name*/ 
          msg = msgarea_write.getText();/*msg*/
          if(msg.equals("") && mailto.equals(""))
          { 
               JOptionPane.showMessageDialog(null, "Can't send a blank mail");}
          else{
              try {
      
              query = "select max(msgid) from msgdtls";
            rs = sqlexecutequery(query);
            rs.next();
            
            msgid = rs.getInt("max(msgid)") + 1;/*msgid*/
            
             
            query = "select user_id, user_name , email from userdtls where email= '" + mailto + "'";
            rs = sqlexecutequery(query);
            rs.next();
            reciever = rs.getString("user_name");/*reciever*/
            recieverid = rs.getInt("user_id");/*reciever id*/
            recieveremail = rs.getString("email");/*reciever email*/
             
            query = "select now()"; /*time*/
            rs = sqlexecutequery(query);
            rs.next();
            time = rs.getString("now()");
           
           
            /*query and update*/
            query = "insert into msgdtls values ("
                    + msgid
                    + "," + status
                    + ", '" + time + "'"
                    + "," + senderid
                    + ",'" + sender + "'"
                    + ",'" + sendermail + "'"
                    + ",'"  + recieveremail + "',"
                    + recieverid
                    + ",'" + reciever + "'"
                    + ",'" + msg + "'"
                    + ","
                    + " 'no', 'no' );";
             
            sqlupdatequery(query);
            msgarea_write.setText("");
            totxt_write.setText("");
             
            JOptionPane.showMessageDialog(null, "Message Sent Successfully");
             
          
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
                         }
          }
    }//GEN-LAST:event_sendbtn_writeActionPerformed

    private void Updatel_accsttngActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Updatel_accsttngActionPerformed
        
        
        pass = new String(oldpassl_accsttng.getPassword());
        String npass = new String(newpassl_accsttng.getPassword()), nm= nm_accsttng.getText();
      
        try {
            query = "select user_id, password, email from userdtls where user_name =" + "'" + usrnm + "'" + ";";
            rs = sqlexecutequery(query);
            rs.next();
            //check old password
            if (pass.equals(rs.getString("password"))) 
            {
               
                query = "update  userdtls set "
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
            
             
             
             
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
           
    }//GEN-LAST:event_Updatel_accsttngActionPerformed

    private void sentmsglist_sentValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_sentmsglist_sentValueChanged
        
       
     Object msg_id ;
       sentmsgidlist_sent.setSelectedIndex( sentmsglist_sent.getSelectedIndex());
      msg_id = sentmsgidlist_sent.getSelectedValue();
       String br = '\t'+"--------------------------------------------------"+'\n'+
                   '\t'+"--------------------------------------------------"+'\n';
       if(msg_id!=null){
      try {

            query = "select msgid, status ,reciever, time, sender, sendermail ,msg from msgdtls where msgid = " + msg_id + ";";
            rs = sqlexecutequery(query);
           rs.next();
        sentmsgarea_sent.setText("");
     if (rs.getInt("status") == 0) 
            {
              
                sentmsgarea_sent.setText(rs.getString("reciever") + " has read the message"+'\n'+"Sent on : " + '\n' + rs.getString("time") + '\n' +br+ "Message:" + '\n' + rs.getString("msg"));
            }
            else 
            {
         sentmsgarea_sent.setText(rs.getString("reciever") + " hasn't read the message yet"+'\n'+"Sent on : " + '\n' + rs.getString("time") + '\n'+ br + "Message:" + '\n' + rs.getString("msg"));
             
             }
             
           
        } catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, "sent msglist"+e.getMessage());
        }
       }
    }//GEN-LAST:event_sentmsglist_sentValueChanged

    private void replybtn_inboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_replybtn_inboxActionPerformed
      

        
        if (mailfrom== null) 
        {
            JOptionPane.showMessageDialog(null, "Please select a msg to reply back;");
        } else {
            totxt_write.setText(mailfrom);
            write.setVisible(true);
        }
           
    }//GEN-LAST:event_replybtn_inboxActionPerformed

    private void Deletebtn_inboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Deletebtn_inboxActionPerformed
        
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
               
                msglist_inbox.setSelectedIndex(0);
                msgidlist_inbox.setSelectedIndex(0);
                query = "update  msgdtls set recieverdel = 'yes' where msgid=" + msgid;
            
              sqlupdatequery(query);
             
             
              
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Please select a msg to Delete");
        }
   
    }//GEN-LAST:event_Deletebtn_inboxActionPerformed

    private void show_msgdtlsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_show_msgdtlsActionPerformed
        
        String status; 
        DefaultTableModel dtm = (DefaultTableModel) msgtbl_msgdtls.getModel();
        while(dtm.getRowCount()>0) {
            dtm.removeRow(0);
        }
       try {
            query = "select msgid, status, time, sender, sendermail, reciever, msg,recievermail from msgdtls ;";
            rs = sqlexecutequery(query);
            while (rs.next()) 
            {
      
              if(rs.getInt("status") == 1) 
              {
                    status = "Not Read";
               } 
                else {
                    status = "Read";
                }
          
             dtm.addRow(new Object[] {rs.getInt("msgid"), status, rs.getString("time"), rs.getString("sendermail"), rs.getString("recievermail"), rs.getString("msg")});
            }
        } 
       catch (Exception e) 
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
       
    }//GEN-LAST:event_show_msgdtlsActionPerformed

    private void delsentmsg_sentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delsentmsg_sentActionPerformed
        DefaultListModel dlm1 =(DefaultListModel)sentmsglist_sent.getModel();
        DefaultListModel dlm2 =(DefaultListModel)sentmsgidlist_sent.getModel();
       Object msgid  = sentmsgidlist_sent.getSelectedValue();
       
    
        if (msgid !=null) 
        {
            
            if (JOptionPane.showConfirmDialog(null, "Are you sure to Delete") == JOptionPane.YES_OPTION)
            {   
                dlm1.remove(sentmsglist_sent.getSelectedIndex());
                dlm2.remove(sentmsgidlist_sent.getSelectedIndex());
                sentmsgarea_sent.setText("");
                
              
                sentmsglist_sent.setSelectedIndex(-1);
                sentmsgidlist_sent.setSelectedIndex(-1); 
                sentmsglist_sent.setModel(dlm1);
                 sentmsgidlist_sent.setModel(dlm2);
                 
                query = "update msgdtls set senderdel = 'yes' where msgid=" + msgid;
                   
            sqlupdatequery(query);
                    
               }
        
            }
        else
        {
            JOptionPane.showMessageDialog(null, "Please select a msg to delete");

        }
   
    }//GEN-LAST:event_delsentmsg_sentActionPerformed

    private void Logout3_welcomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Logout3_welcomeActionPerformed
    logout();
    }//GEN-LAST:event_Logout3_welcomeActionPerformed

    private void Logout5_writeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Logout5_writeActionPerformed
    logout();
    }//GEN-LAST:event_Logout5_writeActionPerformed

    private void Logout8_inboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Logout8_inboxActionPerformed
    logout();
    }//GEN-LAST:event_Logout8_inboxActionPerformed

    private void Logout7_accsttngActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Logout7_accsttngActionPerformed
    logout();
    }//GEN-LAST:event_Logout7_accsttngActionPerformed

    private void Logout6_sentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Logout6_sentActionPerformed
    logout();
    }//GEN-LAST:event_Logout6_sentActionPerformed

    private void statsbtn_welcomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statsbtn_welcomeActionPerformed
    msgcounter.setVisible(true);
        int  avgcharsent ,avgcharrecieved;
         try {
            
          query="select count(*), sum(length(msg)) from msgdtls where senderid = "+ usrid+ ";";
          rs= sqlexecutequery( query);rs.next();
       //max msg send
        msgsent_msgcounter.setText(""+rs.getInt("count(*)"));
       //avg char in msg sent
        if(rs.getInt("count(*)")!=0)
        {
        avgcharsent= rs.getInt("sum(length(msg))") / rs.getInt("count(*)");
        
        }
        else {
                 avgcharsent=0;
             }
        avgsentmsgchar_msgcounter.setText(""+avgcharsent);
       
        query="select count(*), sum(length(msg))  from msgdtls where recieverid= "+ usrid+";";
        rs= sqlexecutequery( query);rs.next();
        //max msg recieved
        msgrecieved_msgcounter.setText(""+rs.getInt("count(*)"));
       //avg char in msg recieved
        if(rs.getInt("count(*)")!=0)
        {
        avgcharrecieved=rs.getInt("sum(length(msg))") /rs.getInt("count(*)");
       
        }
        else {
                 avgcharrecieved=0;
             }
        avgcharmsgrecieved_msgcounter.setText(""+avgcharrecieved);
         
             
             
        
        } 
         catch (Exception e) 
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
            
    }//GEN-LAST:event_statsbtn_welcomeActionPerformed

    private void Close_sentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Close_sentActionPerformed
    sent.dispose();
        
         
    }//GEN-LAST:event_Close_sentActionPerformed

    private void close_statsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_close_statsActionPerformed
     msgcounter.dispose();
    }//GEN-LAST:event_close_statsActionPerformed

    private void msglist_inboxValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_msglist_inboxValueChanged
    Object msg_id ;
        msgidlist_inbox.setSelectedIndex(  msglist_inbox.getSelectedIndex());
         msg_id = msgidlist_inbox.getSelectedValue();
      msgtextarea_inbox.setText("");
      String br = '\t'+"--------------------------------------------------"+'\n'+
                   '\t'+"--------------------------------------------------"+'\n';
 if( msg_id!=null){
        try {

            query = "select msgid, status , time, sender, sendermail ,msg from msgdtls where msgid = " + msg_id + ";";
            rs = sqlexecutequery(query);
           rs.next();
            
            msgtextarea_inbox.setText("Sent by:"+ rs.getString("sender")+'\n' +
                "Email:"+rs.getString("sendermail")+'\n'+
                "Time:"+rs.getString("time")+'\n'+br+
                "Message: " +'\n'+ rs.getString("msg") );

            mailfrom=rs.getString("sendermail");
            query = "update msgdtls set status = 0 where msgid = " + msg_id + ";";//status=0 ==> read
            sqlupdatequery(query);

        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        }
    }//GEN-LAST:event_msglist_inboxValueChanged

    private void Close_sent1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Close_sent1ActionPerformed
       inbox.dispose();
    }//GEN-LAST:event_Close_sent1ActionPerformed

    private void clr_signupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clr_signupActionPerformed
        // TODO add your handling code here:
        createuserbtn_signup.setEnabled(true);
        inputpass_signup.setText("");
            inputusrname_signup.setText("");
            inputnametxt_signup.setText("");
            usridlbl_signup.setText("User ID");
            inputretypepass_signup.setText("");
            inputusermail_signup.setText("");
    }//GEN-LAST:event_clr_signupActionPerformed

    private void search_msgdtlsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_msgdtlsActionPerformed
     int opt = sortby_msgdtls.getSelectedIndex();
       String val,status;
       int val1 ;
       DefaultTableModel dtm = (DefaultTableModel) msgtbl_msgdtls.getModel();
     while(dtm.getRowCount()>0) {
            dtm.removeRow(0);
        }
           switch(opt)
           {
            case 0: val1 =Integer.parseInt(msgid_txt_msgdtls.getText());
                  query="select msgid, status, time, sender, sendermail, reciever,msg,recievermail from msgdtls where msgid="+val1+";" ;
                  break;
            case 1 : val=msgid_txt_msgdtls.getText();
                    query ="select msgid, status, time, sender, sendermail, reciever,msg,recievermail from msgdtls where sender ='"+val+"';";
                   break;
            case 2 : val=msgid_txt_msgdtls.getText();
                    query= "select msgid, status, time, sender, sendermail, reciever,msg,recievermail from msgdtls where reciever ='"+val+"';";
                     break;
            case 3 : val=msgid_txt_msgdtls.getText();
                    query= "select msgid, status, time, sender, sendermail, reciever,msg,recievermail from msgdtls where time >'"+val+"';";
                     break;
            case 4 :  val=msgid_txt_msgdtls.getText();
                     query= "select msgid, status, time, sender, sendermail, reciever,msg,recievermail from msgdtls where time <'"+val+"';";
                     break;
            case 5 : val=msgid_txt_msgdtls.getText();
                      query= "select msgid, status, time, sender, sendermail, reciever,msg,recievermail from msgdtls where time='"+val+"';";
                     break;
            default : query= "select msgid, status, time, sender, sendermail, reciever,msg,recievermail from msgdtls;";
            }
        try {
         
            rs = sqlexecutequery(query);
          while (rs.next()) 
            {
                 if (rs.getInt("status") == 1) {
                    status = "Not Read";
                } else {
                    status = "Read";
                }
                Object myrow[] = {rs.getInt("msgid"), status, rs.getString("time"), rs.getString("sendermail"), rs.getString("recievermail"), rs.getString("msg")};
                dtm.addRow(myrow);
                msgtbl_msgdtls.setModel(dtm);
                            }
        } 
        
        catch (Exception e) 
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
               
           

       
    }//GEN-LAST:event_search_msgdtlsActionPerformed

    private void Close_writeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Close_writeActionPerformed
        write.dispose();
    }//GEN-LAST:event_Close_writeActionPerformed

    private void jLabel16ComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_jLabel16ComponentAdded
       
    }//GEN-LAST:event_jLabel16ComponentAdded

    private void welcomeComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_welcomeComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_welcomeComponentAdded

    /*METHODS*/
    /*method to execute query*/
    private ResultSet sqlexecutequery(String query) {
        try {

            Class.forName("com.mysql.jdbc.Driver");
        con = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/mprdb", "root", "toor");
         stmt = con.createStatement();
         rs = stmt.executeQuery(query);
         
        } 
        catch (Exception e)
        { 
         
            JOptionPane.showMessageDialog(null, e.getMessage());
           
        }
      return rs;  
    }
/*method to execute update*/
    private void sqlupdatequery(String query) {
        try {
           
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mprdb", "root", "toor");
            stmt = con.createStatement();
            stmt.executeUpdate(query);
                
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

    }

   
    private void logout()
    {
        //default value for variables
    
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
        welcome.dispose();
        inbox.dispose();
        write.dispose();
        sent.dispose();
        accsttng.dispose();
        msgcounter.dispose();
        signup.dispose();
       msgdtlspg.dispose();
        
       
       JOptionPane.showMessageDialog(null, "Successfully logged out");
         
     login.setVisible(true); 
      try{
              rs.close();
              stmt.close();
               con.close();
            }
            catch(Exception e)
            {
              
            }
    }
   

       
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Close_sent;
    private javax.swing.JButton Close_sent1;
    private javax.swing.JButton Close_write;
    private javax.swing.JButton Deletebtn_inbox;
    private javax.swing.JButton Logout3_welcome;
    private javax.swing.JButton Logout5_write;
    private javax.swing.JButton Logout6_sent;
    private javax.swing.JButton Logout7_accsttng;
    private javax.swing.JButton Logout8_inbox;
    private javax.swing.JButton Updatel_accsttng;
    private javax.swing.JLabel accemail;
    private javax.swing.JLabel accid;
    private javax.swing.JLabel accnm;
    private javax.swing.JLabel accpass;
    private javax.swing.JFrame accsttng;
    private javax.swing.JButton accsttngbtn_welcome;
    private javax.swing.JLabel avgcharmsgrecieved_msgcounter;
    private javax.swing.JLabel avgsentmsgchar_msgcounter;
    private javax.swing.JButton close_stats;
    private javax.swing.JButton clr_signup;
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
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JFrame login;
    private javax.swing.JButton loginbtn_login;
    private javax.swing.JTextArea msgarea_write;
    private javax.swing.JDialog msgcounter;
    private javax.swing.JFrame msgdtlspg;
    private javax.swing.JTextField msgid_txt_msgdtls;
    private javax.swing.JList msgidlist_inbox;
    private javax.swing.JList msglist_inbox;
    private javax.swing.JLabel msgrecieved_msgcounter;
    private javax.swing.JLabel msgsent_msgcounter;
    private javax.swing.JTable msgtbl_msgdtls;
    private javax.swing.JTextArea msgtextarea_inbox;
    private javax.swing.JPasswordField newpassl_accsttng;
    private javax.swing.JButton newuserbtn_login;
    private javax.swing.JTextField nm_accsttng;
    private javax.swing.JPasswordField oldpassl_accsttng;
    private javax.swing.JButton replybtn_inbox;
    private javax.swing.JButton search_msgdtls;
    private javax.swing.JButton sendbtn_write;
    private javax.swing.JFrame sent;
    private javax.swing.JButton sentbtn_welcome;
    private javax.swing.JTextArea sentmsgarea_sent;
    private javax.swing.JList sentmsgidlist_sent;
    private javax.swing.JList sentmsglist_sent;
    private javax.swing.JButton show_msgdtls;
    private javax.swing.JDialog signup;
    private javax.swing.JComboBox sortby_msgdtls;
    private javax.swing.JButton startpagebtn;
    private javax.swing.JButton statsbtn_welcome;
    private javax.swing.JTextField totxt_write;
    private javax.swing.JTextField txtnml_accsttng;
    private javax.swing.JLabel useridlabel_accsttng;
    private javax.swing.JLabel username_welcome;
    private javax.swing.JLabel usridlbl_signup;
    private javax.swing.JTextField usrnmtxt_login;
    private javax.swing.JPasswordField usrpass_login;
    private javax.swing.JFrame welcome;
    private javax.swing.JFrame write;
    private javax.swing.JButton writebtn_welcome;
    // End of variables declaration//GEN-END:variables
}
