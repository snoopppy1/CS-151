
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class tester {

    static JButton greenBtn;
	static JButton redBtn;
	static JButton blueBtn;
    static Circle sample;

    static ActionListener actionListener = new ActionListener() {

    public void actionPerformed(ActionEvent e) {
                    if (e.getSource() == greenBtn) {
                            sample.green();
                    } else if (e.getSource() == redBtn) {
                            sample.red();
                    } else if (e.getSource() == blueBtn) {
                            sample.blue();
                    }
            }
    };

    public static void main(String[] args) {
    	 // create main frame
        JFrame frame = new JFrame("Color Changer");
        Container content = frame.getContentPane();

        // set layout on content pane
        content.setLayout(new BorderLayout());

        // create draw area
        sample = new Circle();

        // add to content pane
        content.add(sample, BorderLayout.CENTER);

        // create controls to apply colors and call clear feature
        JPanel controls = new JPanel();
        greenBtn = new JButton("Repaint Green");
        greenBtn.addActionListener(actionListener);
        redBtn = new JButton("Repaint Red");
        redBtn.addActionListener(actionListener);
        blueBtn = new JButton("Repaint Blue");
        blueBtn.addActionListener(actionListener);

        controls.add(greenBtn);
        controls.add(redBtn);
        controls.add(blueBtn);

        // add to content pane
        content.add(controls, BorderLayout.SOUTH);

        frame.setSize(500, 200);

        // can close frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // show the swing paint result
        frame.setVisible(true);
    }



}