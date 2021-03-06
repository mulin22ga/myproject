package com.java2.snowing;

import javax.swing.*;
import java.awt.*;

import java.awt.Canvas;
import java.util.ArrayList;
import java.util.List;

import javax.crypto.SecretKeyFactorySpi;
import javax.swing.JFrame;

public class SnowFrame extends JFrame {
	SnowCanvas canvas = new SnowCanvas();

	public SnowFrame() {
		setSize(850, 650);
		setLocation(500, 200);
		add(canvas);

		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setVisible(true);
	}

	public class SnowCanvas extends Canvas {
		List<Snow> snows = new ArrayList<>();

		public SnowCanvas() {
			for (int i = 0; i < 100; i++) {
				Snow snow = new Snow(SnowCanvas.this);
				snows.add(snow);
				snow.start();
			}
		}

		@Override
		public void paint(Graphics g) {
			for (int i = 0; i < 100; i++) {
				Snow snow = snows.get(i);
				g.drawString("雪", snow.x, snow.y);
				// g.drawString("雪", 300, 300);
			}
		}

	}

	public static void main(String[] args) {
		new SnowFrame();

	}

}
