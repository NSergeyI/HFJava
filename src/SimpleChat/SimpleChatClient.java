package SimpleChat;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class SimpleChatClient {
    JTextArea incoming;
    JTextField outgoing;
    BufferedReader reader;
    PrintWriter writer;
    Socket sock;

    public static void main(String[] args) {
        new SimpleChatClient().go();
    }
    public void go(){
        JFrame frame = new JFrame("Simple Chat Client");
        JPanel panel = new JPanel();
        incoming = new JTextArea(15,20);
        incoming.setLineWrap(true);
        incoming.setEditable(false);
        JScrollPane qScroller = new JScrollPane(incoming);
        qScroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        qScroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        outgoing = new JTextField(20);
        JButton button = new JButton("Send");
        button.addActionListener(new SendButtonListener());
        panel.add(qScroller);
        panel.add(outgoing);
        panel.add(button);
        frame.getContentPane().add(BorderLayout.CENTER,panel);
        setUpNetworking();

        Thread readerThread = new Thread(new IncomingReader());
        readerThread.start();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,500);
        frame.setVisible(true);

    }
    private void setUpNetworking(){
        try{
            sock = new Socket("127.0.0.1",5000);
            InputStreamReader streamReader = new InputStreamReader(sock.getInputStream());
            reader = new BufferedReader(streamReader);
            writer = new PrintWriter(sock.getOutputStream());
            System.out.println("Соединение установлено");
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    public class SendButtonListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            try{
                writer.println(outgoing.getText());
                writer.flush();
            } catch (Exception ex){
                ex.printStackTrace();
            }
            outgoing.setText("");
            outgoing.requestFocus();
        }
    }

    private class IncomingReader implements Runnable {
        @Override
        public void run() {
            String message;
            try{
                while ((message = reader.readLine())!=null){
                    System.out.println("read "+message);
                    incoming.append(message+"\n");
                }
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
