package Advice;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class DailyAdviceServer {
    String[] adviceList = {"Еш апельсины рябчиков жуй день твой последний приходит буржуй","Два слова : не годится",
    "Будте честны хотябы сегодня","Совет1","Совет2","Совет3","Совет4","Совет25","Совет26","Совет27","Совет28",
            "Совет29"};

    public static void main(String[] args) {
        DailyAdviceServer server = new DailyAdviceServer();
        server.go();
    }
    public void go(){
        try{
            ServerSocket serverSocket = new ServerSocket(4242);

            while(true){
                Socket socket = serverSocket.accept();
                PrintWriter writer = new PrintWriter(socket.getOutputStream());
                String advice = getAdvice();
                writer.println(advice);
                writer.close();
                System.out.println(advice);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    private String getAdvice(){
        int random = (int) (Math.random()*adviceList.length);
        return adviceList[random];
    }
}
