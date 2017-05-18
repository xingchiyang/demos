package com.yb.test.io;

import java.io.*;

/**
 * 管道流
 */
class Producer extends Thread {
	private PipedOutputStream pos;

	public Producer(PipedOutputStream pos) {
		this.pos = pos;
	}

	public void run() {
		try {
			pos.write("Hello,welcome you!".getBytes());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

class Consumer extends Thread {
	private PipedInputStream pis;

	public Consumer(PipedInputStream pis) {
		this.pis = pis;
	}

	public void run() {
		try {
			byte[] buf = new byte[100];
			int len = pis.read(buf);
			System.out.println(new String(buf, 0, len));
			pis.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

public class Test {
	public static void main(String args[]) {
		PipedOutputStream pos = new PipedOutputStream();
		PipedInputStream pis = new PipedInputStream();
		try {
			pos.connect(pis);
			new Producer(pos).start();
			new Consumer(pis).start();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
