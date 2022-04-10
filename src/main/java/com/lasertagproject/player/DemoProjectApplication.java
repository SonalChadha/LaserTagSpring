package com.lasertagproject.player;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

import com.lasertagproject.player.model.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoProjectApplication implements ApplicationRunner {
	@Autowired
	Message messg;
	public static void main(String[] args) throws IOException {
		SpringApplication.run(DemoProjectApplication.class, args);
	}

	@Override
	public void run(ApplicationArguments args) throws IOException {
		// Step 1 : Create a socket to listen at port 7501
		DatagramSocket ds = new DatagramSocket(7501);
		byte[] receive = new byte[65535];

		DatagramPacket DpReceive = null;
		while (true)
		{

			// Step 2 : create a DatgramPacket to receive the data.
			DpReceive = new DatagramPacket(receive, receive.length);
			// Step 3 : receive the data in byte buffer.
			ds.receive(DpReceive);

			//System.out.println(messg.getMessage());
			System.out.println("Client:-" + data(receive));

			// Exit the server if the client sends "exit"
			if (data(receive).toString().equals("exit"))
			{
				System.out.println("Client sent bye.....EXITING");
				break;
			}
			messg.setMessage("" + data(receive));
			System.out.println("messg AFTER receiving from client: " + messg.getMessage());
			// Clear the buffer after every message.
			receive = new byte[65535];
		}
	}
	 //A utility method to convert the byte array
	// data into a string representation.
	public static StringBuilder data(byte[] a)
	{
		if (a == null)
			return null;
		StringBuilder ret = new StringBuilder();
		int i = 0;
		while (a[i] != 0)
		{
			ret.append((char) a[i]);
			i++;
		}
		return ret;
	}
}
