import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChatFrame extends JFrame {

    public static void main(String[] args) {
        new ChatFrame();}
    public  ChatFrame(){
        createframe();
    }

    private void createframe(){
        JFrame frame = new JFrame();
        frame.setLayout(null);
        frame.setSize(600,800);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //边框设置
        TextBorderUtlis Border = new TextBorderUtlis(new Color(192,192,192),1,true);

        //查询面板
        JPanel toolpane = new JPanel();
        toolpane.setSize(500,50);
        toolpane.setBounds(60,20,500,45);
        frame.add(toolpane,"North");
        toolpane.setOpaque(false);

        JTextField searchfield = new JTextField(20);
        searchfield.setBorder(Border);
        searchfield.setBounds(200,40,400,30);
        searchfield.setFont(new Font("方正舒体",Font.BOLD,20));
        searchfield.setForeground(Color.LIGHT_GRAY);
        toolpane.add(searchfield,"Center");

        JButton searchbtn = new JButton("查找");
        searchbtn.setBorder(Border);
        searchbtn.setBounds(300,40,20,45);
        searchbtn.setFont(new Font("方正舒体",Font.BOLD,20));
        searchbtn.setContentAreaFilled(false);
        searchbtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("查找："+ searchfield.getText());
            }
        });
        toolpane.add(searchbtn);

        //分割线
        JSeparator sep = new JSeparator(SwingConstants.CENTER);
        sep.setPreferredSize(new Dimension(frame.getWidth(),68));
        sep.setBackground(Color.BLACK);

        //选项卡面板
        JPanel allpane = new JPanel();
        JPanel fieldpane = new JPanel();
        JPanel photopane = new JPanel();
        JPanel linepane = new JPanel();
        allpane.setOpaque(false);
        fieldpane.setOpaque(false);
        photopane.setOpaque(false);
        linepane.setOpaque(false);

        JTabbedPane tabbedPane = new JTabbedPane();
        tabbedPane.setBounds(42,70,500,655);
        tabbedPane.addTab(" 全部 ",allpane);
        tabbedPane.addTab(" 文件 ",fieldpane);
        tabbedPane.addTab(" 图片 ",photopane);
        tabbedPane.addTab(" 链接 ",linepane);

        Font font = new Font("方正舒体",Font.BOLD,20);
        tabbedPane.setFont(font);
        tabbedPane.setPreferredSize(new Dimension(430,340));
        tabbedPane.setTabLayoutPolicy(JTabbedPane.CENTER);
        tabbedPane.setUI(new MyTabbedPaneUI());
        tabbedPane.setOpaque(false);

//        //选项对应的快捷键
        tabbedPane.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                System.out.println("当前选中的选项卡："+tabbedPane.getSelectedIndex());
            }
        });
        //默认选中的选项卡
        tabbedPane.setSelectedIndex(1);
        frame.add(tabbedPane);

        frame.setIconImage(new ImageIcon("Image/9861n.jpg").getImage());
        // 设置背景
        JLabel lblBackground = new JLabel(); // 创建一个标签组件对象
        ImageIcon icon = new ImageIcon("Image/timg.jfif"); // 创建背景图片对象
        lblBackground.setIcon(icon); // 设置标签组件要显示的图标
        lblBackground.setBounds(0, 0, icon.getIconWidth(), icon.getIconHeight()); // 设置组件的显示位置及大小
        frame.getContentPane().add(lblBackground); // 将组件添加到面板中
        frame.setVisible(true);
    }
}
