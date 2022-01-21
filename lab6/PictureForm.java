import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class PictureForm {
    private JPanel mainPanel;
    private JSpinner aRadiusSpinner;
    private JSpinner bRadiusSpinner;
    private JSpinner cRadiusSpinner;
    private JLabel aRadius;
    private JLabel bRadius;
    private JLabel cRadius;
    private CanvasPanel canvasPanel;
    private JRadioButton colorButton;

    public PictureForm() {
        aRadiusSpinner.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                int r = (int)aRadiusSpinner.getValue();
                canvasPanel.setARadius(r);
            }
        });
        bRadiusSpinner.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                int r = (int)bRadiusSpinner.getValue();
                canvasPanel.setBRadius(r);
            }
        });
        cRadiusSpinner.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                int r = (int)cRadiusSpinner.getValue();
                canvasPanel.setCRadius(r);
            }
        });
        colorButton.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                canvasPanel.setDifColor();
            }
        });
        aRadiusSpinner.setValue(20);
        bRadiusSpinner.setValue(20);
        cRadiusSpinner.setValue(20);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Три окружности");
        frame.setContentPane(new PictureForm().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
