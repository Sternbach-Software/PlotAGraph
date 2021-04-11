import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MakeGraph {
    public static void main(String[] args) throws ClassNotFoundException, UnsupportedLookAndFeelException, InstantiationException, IllegalAccessException {
        JFrame frame = new JFrame("MakeGraph");
        frame.getContentPane().setLayout(new BorderLayout());
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        String className = UIManager.getSystemLookAndFeelClassName();
        UIManager.setLookAndFeel(className);

        JPanel commandPanel = new JPanel(new FlowLayout());
        JButton openButton = new JButton("Open  Ctrl-O");
        JButton plotButton = new JButton("Draw Graph  Ctrl-P");
        JButton quitButton = new JButton("Quit  Ctrl-Q");
        quitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        commandPanel.registerKeyboardAction(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        }, KeyStroke.getKeyStroke("control Q"), JComponent.WHEN_IN_FOCUSED_WINDOW);
        commandPanel.add(openButton);
        commandPanel.add(plotButton);
        commandPanel.add(quitButton);
        frame.getContentPane().add(commandPanel, "North");

        GraphPanel graphpanel = new GraphPanel(frame);
        plotButton.addActionListener(graphpanel);
        commandPanel.registerKeyboardAction(graphpanel,
                KeyStroke.getKeyStroke("control P"),
                JComponent.WHEN_IN_FOCUSED_WINDOW);

        openButton.addActionListener(graphpanel.getDataPanel());
        commandPanel.registerKeyboardAction(graphpanel.getDataPanel(),
                KeyStroke.getKeyStroke("control O"),
                JComponent.WHEN_IN_FOCUSED_WINDOW);

        frame.setVisible(true);
        frame.pack();
    }
}



