
import java.awt.*;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


class RetrievePasswordFrame  extends JFrame {

    public static void main(String[] args) {
        new RetrievePasswordFrame();
    }
    public RetrievePasswordFrame() {
        CreateFrame();
    }


    //创建界面
    private void CreateFrame() {
        //设置背景
        VerificationCode vcode=new VerificationCode();
        ImageIcon img = new ImageIcon("Image/20131016221201_YZrfQ.gif");//背景图片
        JLabel imgLabel = new JLabel(img);//将背景图放在标签里。
        this.getLayeredPane().add(imgLabel, new Integer(Integer.MIN_VALUE));//将背景标签添加到jfram的LayeredPane面板里。
        imgLabel.setBounds(0, 0, img.getIconWidth(), img.getIconHeight());//设置背景标签的位置
        Container cp = this.getContentPane();
        cp.setLayout(new BorderLayout());
        ((JPanel) cp).setOpaque(false); //将内容面板设为透明。显示LayeredPane面板中的背景。

        //边框设置
        TextBorderUtlis Border = new TextBorderUtlis(new Color(192,192,192),1,true);

        JLabel a = new JLabel("账 号:");
        JLabel b = new JLabel("密 码:");
        JLabel Confirmationcode = new JLabel("确认密码:");
        JLabel h = new JLabel("验证码:  ");

        JTextField c = new JTextField(17);//用户名框
        JPasswordField d = new JPasswordField(17);//密码框
        JPasswordField inputConfirmationcode = new JPasswordField(17);
        JTextField k = new JTextField(4);//验证码框
        c.setBorder(Border);
        d.setBorder(Border);
        k.setBorder(Border);

        //设置标签字体大小
        a.setFont(new java.awt.Font("黑体", 6, 18));
        b.setFont(new java.awt.Font("黑体", 6, 18));
        Confirmationcode.setFont(new java.awt.Font("黑体", 6, 18));
        h.setFont(new java.awt.Font("黑体", 6, 18));

        c.setOpaque(false);
        d.setOpaque(false);
        inputConfirmationcode.setOpaque(false);
        k.setOpaque(false);

        d.setEchoChar('*');//将输入密码框中的密码以*显示出来
        JButton btnregister = new JButton("确 认");
        btnregister.setBorder(Border);
        btnregister.setBackground(new Color(07, 175, 211));//设置登录按钮字体颜色

        JButton cancel = new JButton("取 消");
        cancel.setBorder(Border);
        cancel.setBackground(new Color(07, 175, 211));//设置登录按钮字体颜色
        //设置字体颜色
        btnregister.setForeground(Color.white);
        cancel.setForeground(Color.white);
        //设置字体样式
        btnregister.setFont(new java.awt.Font("黑体", 6, 18));
        cancel.setFont(new java.awt.Font("黑体", 6, 18));
        Container m = getContentPane();//获取一个容器
        getContentPane().setBackground(Color.WHITE);//设置窗体填充色
//         将用户名、密码的Jlabel和用户名JTextField文本框、密码JPasswordField密码框以及确定JButton、快速注册JButton添加到container容器里面                         //
        m.add(a);
        m.add(b);
        m.add(Confirmationcode);
        m.add(c);
        m.add(d);
        m.add(btnregister);
        m.add(cancel);
        m.add(inputConfirmationcode);
        m.add(h);
        m.add(k);
        m.add(vcode);
        m.setLayout(null);
//         a、b、c、d、e、f显示在container容器中的位置坐标
        a.setBounds(50, 60, 70, 16);
        b.setBounds(50, 100, 70, 16);
        Confirmationcode.setBounds(50, 140, 90, 16);
        c.setBounds(130, 60, 200, 30);
        d.setBounds(130, 100, 200, 30);
        h.setBounds(50, 182, 90, 16);
        inputConfirmationcode.setBounds(130, 140, 200, 30);
        k.setBounds(130, 180, 200, 30);
        btnregister.setBounds(50, 250, 150, 30);//110,100,180,32
        cancel.setBounds(250, 250, 150, 30);

        this.setTitle("找回密码页面");
        this.setBackground(Color.RED);//设置背景颜色
        vcode.setBounds(345, 175, 160, 18);
        this.setIconImage(new ImageIcon("Image/9861n.jpg").getImage());
        this.setSize(450, 350);// 居中显示
        this.setLocationRelativeTo(null);
        // 窗体大小不能改变
        this.setResizable(false);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
