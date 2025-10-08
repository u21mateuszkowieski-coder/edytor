import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class DesignWord extends javax.swing.JFrame {

    public DesignWord() {
        initComponents();
        setLocationRelativeTo(null);
        setSize(800, 600);
        textPane.setFont(new Font("Arial", Font.PLAIN, 18));
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {
        scrollPane = new javax.swing.JScrollPane();
        textPane = new javax.swing.JTextPane();
        panelTop = new javax.swing.JPanel();
        fontCombo = new javax.swing.JComboBox<>();
        sizeCombo = new javax.swing.JComboBox<>();
        boldBtn = new javax.swing.JButton();
        italicBtn = new javax.swing.JButton();
        colorBtn = new javax.swing.JButton();
        bgColorBtn = new javax.swing.JButton();
        wrapCheck = new javax.swing.JCheckBox();
        copyBtn = new javax.swing.JButton();
        cutBtn = new javax.swing.JButton();
        pasteBtn = new javax.swing.JButton();
        labelFontColor = new javax.swing.JLabel();
        labelBgColor = new javax.swing.JLabel();
        statusLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        scrollPane.setViewportView(textPane);

        panelTop.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        fontCombo.setModel(new javax.swing.DefaultComboBoxModel<>(
            GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames()
        ));
        panelTop.add(fontCombo);

        sizeCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new Integer[]{8,10,12,14,16,18,20,24,28,32}));
        sizeCombo.setSelectedItem(18);
        panelTop.add(sizeCombo);

        boldBtn.setText("B");
        boldBtn.setFont(new Font("Arial", Font.BOLD, 12));
        panelTop.add(boldBtn);

        italicBtn.setText("I");
        italicBtn.setFont(new Font("Arial", Font.ITALIC, 12));
        panelTop.add(italicBtn);

        labelFontColor.setText("Kolor czcionki:");
        panelTop.add(labelFontColor);

        colorBtn.setBackground(Color.BLACK);
        colorBtn.setPreferredSize(new Dimension(30, 20));
        panelTop.add(colorBtn);

        labelBgColor.setText("Kolor tła:");
        panelTop.add(labelBgColor);

        bgColorBtn.setBackground(Color.WHITE);
        bgColorBtn.setPreferredSize(new Dimension(30, 20));
        panelTop.add(bgColorBtn);

        wrapCheck.setText("Zawijaj tekst");
        wrapCheck.setSelected(true);
        panelTop.add(wrapCheck);

        copyBtn.setText("Kopiuj");
        panelTop.add(copyBtn);

        cutBtn.setText("Wytnij");
        panelTop.add(cutBtn);

        pasteBtn.setText("Wklej");
        panelTop.add(pasteBtn);

        statusLabel.setText("Znaków: 0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(panelTop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(scrollPane)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(statusLabel)
                    .addContainerGap(600, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(panelTop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(scrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 480, Short.MAX_VALUE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(statusLabel)
                    .addContainerGap())
        );

        pack();

        textPane.addKeyListener(new KeyAdapter() {
            public void keyReleased(KeyEvent evt) {
                statusLabel.setText("Znaków: " + textPane.getText().length());
            }
        });
    }

    private javax.swing.JButton bgColorBtn;
    private javax.swing.JButton boldBtn;
    private javax.swing.JButton colorBtn;
    private javax.swing.JButton copyBtn;
    private javax.swing.JButton cutBtn;
    private javax.swing.JComboBox<String> fontCombo;
    private javax.swing.JButton italicBtn;
    private javax.swing.JLabel labelFontColor;
    private javax.swing.JLabel labelBgColor;
    private javax.swing.JPanel panelTop;
    private javax.swing.JButton pasteBtn;
    private javax.swing.JScrollPane scrollPane;
    private javax.swing.JComboBox<Integer> sizeCombo;
    private javax.swing.JLabel statusLabel;
    private javax.swing.JTextPane textPane;
    private javax.swing.JCheckBox wrapCheck;
}
