import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import Login.loginverifier;
public class Main extends UIManager{
    static Border emptyBorder = BorderFactory.createEmptyBorder();
    static JPanel emptyPanel = new JPanel();
    static loginverifier xd = new loginverifier();
    public static boolean Login(){
        put("Button.select", Color.decode("#020c4d"));
        JFrame login_window = new JFrame("Login Window");
        JPanel logpan = new JPanel();
        JPanel lbl = new JPanel();
        lbl.setBackground(Color.decode("#020c4d"));
        lbl.setLayout(new FlowLayout(FlowLayout.CENTER));
        JPanel inp1 = new JPanel();
        inp1.setBackground(Color.decode("#020c4d"));
        JPanel inp2 = new JPanel();
        inp2.setBackground(Color.decode("#020c4d"));
        inp1.setLayout(new GridLayout(0,3));
        inp2.setLayout(new GridLayout(0,3));
        JPanel nxt = new JPanel();
        nxt.setBackground(Color.decode("#020c4d")); // 69ccf0 is light blue
        JLabel i = new JLabel("Laundromat Login Page");
        i.setForeground(Color.white);
        JTextField Usr = new JTextField("Username?");
        //Usr.setBorder(emptyBorder);
        Usr.setEditable(false);
        Usr.setForeground(Color.decode("#020c4d"));
        JPasswordField Pw = new JPasswordField();
        Pw.setEditable(false);
        //Pw.setBorder(emptyBorder);
        Usr.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if(Usr.getText().equalsIgnoreCase("Username?")){
                    Usr.setText("");
                }
                Usr.setEditable(true);
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
        Pw.setForeground(Color.decode("#020c4d"));
        Pw.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Pw.setEditable(true);
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
        JButton Log = new JButton(new ImageIcon("C:/Users/Harshiv/IdeaProjects/Laundry Machine App/src/Assets/icons/arrow-24-32.png"));
        Log.setBorder(emptyBorder);
        Log.setBackground(Color.decode("#020c4d"));
        Log.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                String usr = Usr.getText();// username
                char[] pw = Pw.getPassword();
                String x = new String(pw); // password
                System.out.println(usr);
                System.out.println(x);
                boolean sd = xd.verify(usr,x);

                if (sd == false){
                    loginerror();
                }

                else{
                    int tokns = Integer.parseInt(xd.gettokens(usr));
                    session(usr, tokns,null,null, null);
                    login_window.dispose();
                }
            }

            @Override
            public void mousePressed(MouseEvent e) {
                Log.setIcon(new ImageIcon("C:/Users/Harshiv/IdeaProjects/Laundry Machine App/src/Assets/icons/arrow-24-32g.png"));
                Log.setBackground(Color.decode("#020c4d"));
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                Log.setIcon(new ImageIcon("C:/Users/Harshiv/IdeaProjects/Laundry Machine App/src/Assets/icons/arrow-24-32.png"));
                Log.setBackground(Color.decode("#020c4d"));
            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
        logpan.setLayout(new GridLayout(4,1));
        lbl.add(i);
        logpan.add(lbl);
        inp1.add(new JLabel(new ImageIcon("C:/Users/Harshiv/IdeaProjects/Laundry Machine App/src/Assets/icons/guest-32.png")));
        inp1.add(Usr);
        inp2.add(new JLabel(new ImageIcon("C:/Users/Harshiv/IdeaProjects/Laundry Machine App/src/Assets/icons/lock-32.png")));
        inp2.add(Pw);
        logpan.add(inp1);
        logpan.add(inp2);
        nxt.add(Log);
        logpan.add(nxt);
        logpan.setBackground(Color.white);
        logpan.setBounds(70,70,70,70);
        login_window.add(logpan);
        login_window.setLayout(new GridLayout(1,1));
        login_window.getContentPane().setBackground(Color.cyan);
        login_window.setVisible(true);
        login_window.setResizable(false);
        login_window.setBounds(200,200,400,250);
        return true;
    }
    public static void helps(){
        put("Button.select", Color.decode("#020c4d"));
        JFrame ssa = new JFrame();
        JLabel k = new JLabel("Any issue? Please report it to us, in your own words.");
        JPanel x = new JPanel();
        x.setBackground(Color.decode("#020c4d"));
        x.setLayout(new FlowLayout(FlowLayout.CENTER));
        JButton a = new JButton(new ImageIcon("C:/Users/Harshiv/IdeaProjects/Laundry Machine App/src/Assets/icons/arrow-24-32.png"));
        a.setBorder(emptyBorder);
        a.setBackground(Color.decode("#020c4d"));
        a.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                JPanel p = new JPanel();
                put("Button.select", null);
                JOptionPane.showMessageDialog(p, "Admin has been informed of the issue(s) mentioned.");
                ssa.dispose();
            }

            @Override
            public void mousePressed(MouseEvent e) {
                a.setIcon(new ImageIcon("C:/Users/Harshiv/IdeaProjects/Laundry Machine App/src/Assets/icons/arrow-24-32g.png"));
                a.setBackground(Color.decode("#020c4d"));
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                a.setIcon(new ImageIcon("C:/Users/Harshiv/IdeaProjects/Laundry Machine App/src/Assets/icons/arrow-24-32.png"));
                a.setBackground(Color.decode("#020c4d"));
            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
        x.add(a);
        k.setForeground(Color.white);
        JTextArea ss = new JTextArea("Type in your complaint");
        ss.setBackground(Color.lightGray);
        ss.setForeground(Color.black);
        ss.setEditable(false);
        ssa.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                ss.setEditable(false);
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
        ss.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                String w = ss.getText();
                if(w.equalsIgnoreCase("Type in your complaint")){
                    ss.setText(" ");
                }
                ss.setEditable(true);
            }

            @Override
            public void mousePressed(MouseEvent e) {
                ss.setBackground(Color.cyan);
                ss.setForeground(Color.white);
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                ss.setBackground(Color.lightGray);
                ss.setForeground(Color.black);
            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
        ssa.add(k);
        ssa.add(ss);
        ssa.add(x);
        ssa.setBounds(0,0,500,500);
        ssa.getContentPane().setBackground(Color.decode("#020c4d"));
        ssa.setLayout(new GridLayout(0,1));
        ssa.setResizable(false);
        ssa.setVisible(true);

    }
    public static void session(String user, int tokens, String mods, String currentMachine, String tempss){
        put("Button.select", null);
        JFrame session = new JFrame("Laundromat");
        JPanel window1 = new JPanel();// main window
        window1.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                session.invalidate();
                session.validate();
                session.repaint();
            }

            @Override
            public void mouseExited(MouseEvent e) {
                session.invalidate();
                session.validate();
                session.repaint();
            }
        });
        window1.setBackground(Color.decode("#020c4d"));
        JPanel win1top = new JPanel();
        JPanel win1topq = new JPanel();
        JPanel win1mid = new JPanel();
        JPanel win1low = new JPanel();
        JLabel x = new JLabel("Hi, "+user+" !");
        x.setForeground(Color.white);
        JLabel y = new JLabel("Your current Machine: "+currentMachine);
        y.setForeground(Color.white);
        JPanel win1msgtop = new JPanel();
        win1msgtop.setBackground(Color.decode("#020c4d"));
        JLabel mode = new JLabel("Mode : " +mods);
        JLabel temps = new JLabel("Temperature : " +tempss);
        temps.setForeground(Color.white);
        mode.setForeground(Color.white);
        win1low.setBounds(0,800,800,150);
        win1top.setLayout(new FlowLayout());
        GridBagConstraints c = new GridBagConstraints();
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 1;
        c.gridy = 0;
        GridBagConstraints d = new GridBagConstraints();
        d.fill = GridBagConstraints.HORIZONTAL;
        d.gridx = 0;
        d.gridy = 0;
        win1top.setBackground(Color.decode("#020c4d"));
        JPanel win1lowp = new JPanel();
        win1lowp.add(mode);
        win1lowp.add(temps);
        win1lowp.setBackground(Color.decode("#020c4d"));
        win1lowp.setBounds(0,0,800,150);
        win1low.add(win1lowp);
        win1msgtop.add(x);
        win1msgtop.add(y);
        win1msgtop.setLayout(new GridLayout(2,1));
        win1msgtop.setBorder(emptyBorder);
        win1msgtop.setBounds(50,50,550,200);
        JPanel win1toptknpnl = new JPanel();
        JLabel tknmsg = new JLabel("Tokens : " +String.valueOf(tokens));
        tknmsg.setForeground(Color.white);
        win1toptknpnl.add(tknmsg);
        win1mid.setLayout(new GridLayout(1,0));
        JPanel win1toptknbutpnl = new JPanel();
        JButton addtkn = new JButton(new ImageIcon("C:/Users/Harshiv/IdeaProjects/Laundry Machine App/src/Assets/icons/add-32.png"));
        addtkn.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                addtkns(user);

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
        addtkn.setBackground(Color.decode("#065e00"));
        win1toptknbutpnl.add(addtkn);
        JButton helpme = new JButton(new ImageIcon("C:/Users/Harshiv/IdeaProjects/Laundry Machine App/src/Assets/icons/help-32.png"));
        helpme.setBackground(Color.decode("#d18800"));
        helpme.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                helps();
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
        win1toptknbutpnl.add(helpme);
        win1toptknpnl.setLayout(new GridLayout(0,1));
        win1toptknpnl.setBackground(Color.decode("#514269"));
        win1toptknpnl.add(win1toptknbutpnl);
        win1toptknbutpnl.setBackground(Color.decode("#514269"));
        win1topq.setBackground(Color.decode("#020c4d"));
        win1topq.setBounds(0,0,600,250);
        win1topq.add(win1msgtop);
        JPanel fwas = new JPanel();
        JTextArea u = new JTextArea("\t\t\t\t\n\t\t\t\t\n");
        u.setEditable(false);
        JButton timeleft = new JButton(new ImageIcon("C:/Users/Harshiv/IdeaProjects/Laundry Machine App/src/Assets/icons/time-5-32.png"));
        u.setForeground(Color.decode("#020c4d"));
        u.setBackground(Color.decode("#020c4d"));
        fwas.add(u);
        fwas.setBackground(Color.decode("#020c4d"));
        win1topq.add(fwas);
        win1topq.add(win1toptknpnl);
        win1top.add(win1topq);
        JButton washbutton = new JButton(new ImageIcon("C:/Users/Harshiv/IdeaProjects/Laundry Machine App/src/Assets/icons/icons8-washing-machine-100.png"));
        washbutton.setFocusPainted(false);
        washbutton.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                session.dispose();
                washmachineui(user,tokens);
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
        JButton drybutton = new JButton(new ImageIcon("C:/Users/Harshiv/IdeaProjects/Laundry Machine App/src/Assets/icons/icons8-tumble-dryer-100.png"));
        drybutton.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                session.dispose();
                drymachineui(user,tokens);
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                window1.invalidate();
                window1.validate();
                window1.repaint();
            }

            @Override
            public void mouseExited(MouseEvent e) {
                window1.invalidate();
                window1.validate();
                window1.repaint();
            }
        });
    drybutton.setFocusPainted(false);
        window1.add(win1top);
        washbutton.setBackground(Color.decode("#f7b02d"));
        drybutton.setBackground(Color.decode("#f7b02d"));
        win1mid.add(washbutton);
        win1mid.add(drybutton);
        window1.setLayout(new GridLayout(3,1));
        window1.setBackground(Color.decode("#020c4d"));
        win1mid.setBackground(Color.decode("#020c4d"));
        win1low.setBackground(Color.decode("#020c4d"));
        win1low.setLayout(new FlowLayout());
        window1.add(win1mid);
        window1.add(win1low);
        session.add(window1);
        session.getContentPane().setBackground(Color.decode("#020c4d"));
        session.setVisible(true);
        session.setBounds(0,0,800,800);
        session.setResizable(false);
    }
    public static void washmachineui(String user, int tokens){
        put("Button.select", Color.decode("#020c4d"));
        System.out.println(tokens);
        JFrame wash = new JFrame("Washing Machine");
        wash.getContentPane().setBackground(Color.decode("#020c4d"));
        wash.setBounds(0,0,300,300);
        String[] WM = {"1","2","3","4","5","6","7","8","9","10"};
        JComboBox<String> jComboBox = new JComboBox<>(WM);
        JLabel e = new JLabel("Which washing machine do you want to use?");
        e.setForeground(Color.white);
        wash.setLayout(new GridLayout(0,1));

        JPanel w = new JPanel();
        wash.add(e);
        w.add(jComboBox);
        JButton dont = new JButton(new ImageIcon("C:/Users/Harshiv/IdeaProjects/Laundry Machine App/src/Assets/icons/arrow-24-32.png"));
        dont.setFocusPainted(false);
        dont.setBackground(Color.decode("#020c4d"));
        dont.setBorder(emptyBorder);
        dont.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                String machine =         jComboBox.getItemAt(jComboBox.getSelectedIndex());
                System.out.println("Debug message: Machine chosen : "+machine);
                wash.dispose();
                System.out.println(tokens);
                washmachmode(user,tokens,machine);
            }

            @Override
            public void mousePressed(MouseEvent e) {
                dont.setIcon(new ImageIcon("C:/Users/Harshiv/IdeaProjects/Laundry Machine App/src/Assets/icons/arrow-24-32g.png"));
                dont.setBackground(Color.decode("#020c4d"));
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                dont.setIcon(new ImageIcon("C:/Users/Harshiv/IdeaProjects/Laundry Machine App/src/Assets/icons/arrow-24-32.png"));
                dont.setBackground(Color.decode("#020c4d"));
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                wash.invalidate();
                wash.validate();
                wash.repaint();
            }

            @Override
            public void mouseExited(MouseEvent e) {
                wash.invalidate();
                wash.validate();
                wash.repaint();
            }
        });
        JPanel nxt = new JPanel();
        nxt.add(dont);
        nxt.setBackground(Color.decode("#020c4d"));
        w.setBackground(Color.decode("#020c4d"));
        wash.add(w);
        wash.add(nxt);
        wash.setResizable(false);
        wash.setVisible(true);
        wash.setBackground(Color.decode("#020c4d"));

    }
    public static void washmachmode(String user, int tokens, String machine){
        put("Button.select", Color.decode("#020c4d"));
        JFrame wash = new JFrame("Washing Machine");
        wash.getContentPane().setBackground(Color.decode("#020c4d"));
        wash.setBounds(0,0,300,300);
        String[] WM = {"Hot","Warm","Cold"};
        String[] WRM = {"Normal","Perm-Press","Delicate"};
        JComboBox<String> jComboBox = new JComboBox<>(WM);
        JComboBox<String> jCombBox = new JComboBox<>(WRM);
        JLabel e = new JLabel("Mode and Temperature?");
        e.setForeground(Color.white);
        wash.setLayout(new GridLayout(0,1));
        jComboBox.getItemAt(jComboBox.getSelectedIndex());
        JPanel w = new JPanel();
        wash.add(e);
        w.add(jComboBox);
        w.add(jCombBox);
        w.setLayout(new FlowLayout(FlowLayout.CENTER));
        JButton dont = new JButton(new ImageIcon("C:/Users/Harshiv/IdeaProjects/Laundry Machine App/src/Assets/icons/power-3-32.png"));
        dont.setFocusPainted(false);
        dont.setBackground(Color.decode("#020c4d"));
        dont.setBorder(emptyBorder);
        dont.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                String temp = jComboBox.getItemAt(jComboBox.getSelectedIndex());
                String mode = jCombBox.getItemAt(jCombBox.getSelectedIndex());
                JPanel x = new JPanel();
                xd.minustoken(user);;
                wash.dispose();
                System.out.println(tokens);
                int tknw = Integer.parseInt(xd.gettokens(user));
                put("Button.select", null);
                JOptionPane.showMessageDialog(x, "Machine "+machine+" has been activated with "+temp+ " temperature and "+mode+" mode of operation");
                session(user,tknw,mode,machine,temp);
            }

            @Override
            public void mousePressed(MouseEvent e) {
                dont.setIcon(new ImageIcon("C:/Users/Harshiv/IdeaProjects/Laundry Machine App/src/Assets/icons/power-3-32 (1).png"));
                dont.setBackground(Color.decode("#020c4d"));
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                dont.setIcon(new ImageIcon("C:/Users/Harshiv/IdeaProjects/Laundry Machine App/src/Assets/icons/power-3-32.png"));
                dont.setBackground(Color.decode("#020c4d"));
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                wash.invalidate();
                wash.validate();
                wash.repaint();
            }

            @Override
            public void mouseExited(MouseEvent e) {
                wash.invalidate();
                wash.validate();
                wash.repaint();
            }
        });
        JPanel nxt = new JPanel();
        nxt.add(dont);
        nxt.setBackground(Color.decode("#020c4d"));
        w.setBackground(Color.decode("#020c4d"));
        wash.add(w);
        wash.add(nxt);
        wash.setResizable(false);
        wash.setVisible(true);
        wash.setBackground(Color.decode("#020c4d"));

    }
    public static void drymachineui(String user, int tokens){
        put("Button.select", Color.decode("#020c4d"));
        JFrame wash = new JFrame("Dryer");
        wash.getContentPane().setBackground(Color.decode("#020c4d"));
        wash.setBounds(0,0,300,300);
        String[] WM = {"11","12","13","14","15","16","17","18","19","20"};
        JComboBox<String> jComboBox = new JComboBox<>(WM);
        JLabel e = new JLabel("Which dryer do you want to use?");
        e.setForeground(Color.white);
        wash.setLayout(new GridLayout(0,1));

        JPanel w = new JPanel();
        wash.add(e);
        w.add(jComboBox);
        JButton dont = new JButton(new ImageIcon("C:/Users/Harshiv/IdeaProjects/Laundry Machine App/src/Assets/icons/arrow-24-32.png"));
        dont.setFocusPainted(false);
        dont.setBackground(Color.decode("#020c4d"));
        dont.setBorder(emptyBorder);
        dont.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                String machine =         jComboBox.getItemAt(jComboBox.getSelectedIndex());
                System.out.println("Debug message: Machine chosen : "+machine);
                wash.dispose();
                drymachmode(user,tokens,machine);
            }

            @Override
            public void mousePressed(MouseEvent e) {
                dont.setIcon(new ImageIcon("C:/Users/Harshiv/IdeaProjects/Laundry Machine App/src/Assets/icons/arrow-24-32g.png"));
                dont.setBackground(Color.decode("#020c4d"));
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                dont.setIcon(new ImageIcon("C:/Users/Harshiv/IdeaProjects/Laundry Machine App/src/Assets/icons/arrow-24-32.png"));
                dont.setBackground(Color.decode("#020c4d"));
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                wash.invalidate();
                wash.validate();
                wash.repaint();
            }

            @Override
            public void mouseExited(MouseEvent e) {
                wash.invalidate();
                wash.validate();
                wash.repaint();
            }
        });
        JPanel nxt = new JPanel();
        nxt.add(dont);
        nxt.setBackground(Color.decode("#020c4d"));
        w.setBackground(Color.decode("#020c4d"));
        wash.add(w);
        wash.add(nxt);
        wash.setResizable(false);
        wash.setVisible(true);
        wash.setBackground(Color.decode("#020c4d"));

    }
    public static void drymachmode(String user, int tokens, String machine){
        put("Button.select", Color.decode("#020c4d"));
        JFrame wash = new JFrame("Dryer");
        wash.getContentPane().setBackground(Color.decode("#020c4d"));
        wash.setBounds(0,0,300,300);
        String[] WM = {"Hot","Warm"};
        String[] WRM = {"Normal","Perm-Press","Delicate"};
        JComboBox<String> jComboBox = new JComboBox<>(WM);
        JComboBox<String> jCombBox = new JComboBox<>(WRM);
        JLabel e = new JLabel("Mode and Temperature?");
        e.setForeground(Color.white);
        wash.setLayout(new GridLayout(0,1));
        jComboBox.getItemAt(jComboBox.getSelectedIndex());
        JPanel w = new JPanel();
        wash.add(e);
        w.add(jComboBox);
        w.add(jCombBox);
        w.setLayout(new FlowLayout(FlowLayout.CENTER));
        JButton dont = new JButton(new ImageIcon("C:/Users/Harshiv/IdeaProjects/Laundry Machine App/src/Assets/icons/power-3-32.png"));
        dont.setFocusPainted(false);
        dont.setBackground(Color.decode("#020c4d"));
        dont.setBorder(emptyBorder);
        dont.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                String temp = jComboBox.getItemAt(jComboBox.getSelectedIndex());
                String mode = jCombBox.getItemAt(jCombBox.getSelectedIndex());
                JPanel x = new JPanel();
                wash.dispose();
                int tknw = Integer.parseInt(xd.gettokens(user));
                tknw = tknw - 1;
                put("Button.select", null);
                JOptionPane.showMessageDialog(x, "Machine "+machine+" has been activated with "+temp+ " temperature and "+mode+" mode of operation");
                session(user,tknw,mode,machine,temp);
            }
            @Override
            public void mousePressed(MouseEvent e) {
                dont.setIcon(new ImageIcon("C:/Users/Harshiv/IdeaProjects/Laundry Machine App/src/Assets/icons/power-3-32 (1).png"));
                dont.setBackground(Color.decode("#020c4d"));
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                dont.setIcon(new ImageIcon("C:/Users/Harshiv/IdeaProjects/Laundry Machine App/src/Assets/icons/power-3-32.png"));
                dont.setBackground(Color.decode("#020c4d"));
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                wash.invalidate();
                wash.validate();
                wash.repaint();
            }

            @Override
            public void mouseExited(MouseEvent e) {
                wash.invalidate();
                wash.validate();
                wash.repaint();
            }
        });
        JPanel nxt = new JPanel();
        nxt.add(dont);
        nxt.setBackground(Color.decode("#020c4d"));
        w.setBackground(Color.decode("#020c4d"));
        wash.add(w);
        wash.add(nxt);
        wash.setResizable(false);
        wash.setVisible(true);
        wash.setBackground(Color.decode("#020c4d"));
    }
    public static void addtkns(String user){
        put("Button.select", Color.decode("#020c4d"));
        JFrame x = new JFrame("+");
        x.setLayout(new GridLayout(0,1));
        x.getContentPane().setBackground(Color.decode("#020c4d"));
        JLabel xs = new JLabel("Type in no. of Tokens to add?");
        xs.setForeground(Color.white);
        JButton p = new JButton(new ImageIcon("C:/Users/Harshiv/IdeaProjects/Laundry Machine App/src/Assets/icons/arrow-24-32.png"));
        p.setFocusPainted(false);
        p.setBorder(emptyBorder);
        p.setBackground(Color.decode("#020c4d"));
        JLabel sa = new JLabel(new ImageIcon("C:/Users/Harshiv/IdeaProjects/Laundry Machine App/src/Assets/icons/coins-32.png"));
        JTextField s = new JTextField("No. of Tokens");
        s.setEditable(false);
        s.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                String ds = s.getText();
                if(ds.equals("No. of Tokens")){
                    s.setText("");
                }
                s.setEditable(true);
            }
            @Override
            public void mousePressed(MouseEvent e) {}
            @Override
            public void mouseReleased(MouseEvent e) {}
            @Override
            public void mouseEntered(MouseEvent e) {}
            @Override
            public void mouseExited(MouseEvent e) {}
        });
        JPanel swwq = new JPanel();
        p.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                JPanel d = new JPanel();
                x.dispose();
                String ww = s.getText();
                put("Button.select", null);

                JOptionPane.showMessageDialog(d, "Admin has been sent request for adding "+ww+" tokens");
            }

            @Override
            public void mousePressed(MouseEvent e) {
                p.setIcon(new ImageIcon("C:/Users/Harshiv/IdeaProjects/Laundry Machine App/src/Assets/icons/arrow-24-32g.png"));
                p.setBackground(Color.decode("#020c4d"));
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                p.setIcon(new ImageIcon("C:/Users/Harshiv/IdeaProjects/Laundry Machine App/src/Assets/icons/arrow-24-32g.png"));
                p.setBackground(Color.decode("#020c4d"));
            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
        swwq.setBackground(Color.decode("#020c4d"));
        swwq.add(sa);
        swwq.add(s);
        swwq.setLayout(new FlowLayout(FlowLayout.CENTER));
        x.add(xs);
        x.add(swwq);
        x.add(p);
        x.setResizable(false);
        x.setLayout(new GridLayout(0, 1));
        x.setVisible(true);
        x.setBounds(0,0,200,200);
    }
    public static void loginerror(){
        put("Button.select", null);
        JFrame x = new JFrame("Error");
        x.getContentPane().setBackground(Color.decode("#020c4d"));
        JPanel f = new JPanel();
        JPanel g = new JPanel();
        g.setBackground(Color.decode("#020c4d"));
        f.setLayout(new GridLayout(1,3));
        f.setBackground(Color.decode("#020c4d"));
        JLabel m = new JLabel(new ImageIcon("C:/Users/Harshiv/IdeaProjects/Laundry Machine App/src/Assets/icons/error-3-48.png"));
        JLabel d = new JLabel("Invalid Login credentials");

        JLabel ew = new JLabel("");
        d.setForeground(Color.white);
        f.add(m);
        f.add(d);

        JButton v = new JButton("Ok");
        v.setFocusPainted(false);
        v.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                x.dispose();
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
        g.setLayout(new FlowLayout(FlowLayout.CENTER));
        g.add(v);

        x.setLayout(new GridLayout(0,1));
        x.add(f);
        x.add(g);

        x.setVisible(true);
        x.setResizable(false);
        x.setBounds(200,200,350,160);
        //JOptionPane.showMessageDialog(x,"Invalid Login credentials, Try again");
    }
    public static void main(String[] args){
          Login();
    }
}
