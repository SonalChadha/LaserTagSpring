package com.lasertagproject.player;

import lombok.*;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;
import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Component
public class Message {
    private String senderName;
    private String receiverName;
    private String message;
    private String date;
    private Status status;

//    public Message() throws IOException {
//        // Step 1 : Create a socket to listen at port 7500
//        DatagramSocket ds = new DatagramSocket(7500);
//        byte[] receive = new byte[65535];
//
//        DatagramPacket DpReceive = null;
//        while (true)
//        {
//            // Step 2 : create a DatgramPacket to receive the data.
//            DpReceive = new DatagramPacket(receive, receive.length);
//
//            // Step 3 : revieve the data in byte buffer.
//            ds.receive(DpReceive);
//
//            System.out.println("Client:-" + data(receive));
//            message = "" + data(receive);
//            // Exit the server if the client sends "exit"
//            if (data(receive).toString().equals("exit"))
//            {
//                System.out.println("Client sent bye.....EXITING");
//                break;
//            }
//
//            // Clear the buffer after every message.
//            receive = new byte[65535];
//        }
//    }
//
//    //A utility method to convert the byte array
//    // data into a string representation.
//    public StringBuilder data(byte[] a)
//    {
//        if (a == null)
//            return null;
//        StringBuilder ret = new StringBuilder();
//        int i = 0;
//        while (a[i] != 0)
//        {
//            ret.append((char) a[i]);
//            i++;
//        }
//        return ret;
//    }
}
