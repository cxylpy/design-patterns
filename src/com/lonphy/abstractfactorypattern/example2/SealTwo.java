package com.lonphy.abstractfactorypattern.example2;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;

public class SealTwo implements Seal{
	private BufferedImage image;
	Graphics2D g;
	
	public SealTwo() {
		super();
		image = new BufferedImage(100,100,BufferedImage.TYPE_INT_RGB);
		g = image.createGraphics();
		g.setColor(Color.white);
		Rectangle2D rect = new Rectangle2D.Double(0, 0, 100, 100);
		g.fill(rect);
		g.setColor(Color.red);
		BasicStroke bs = new BasicStroke(3f, BasicStroke.CAP_SQUARE, BasicStroke.JOIN_ROUND);
		rect = new Rectangle2D.Double(5,6,80,80);
		g.setStroke(bs);
		g.draw(rect);
		g.setFont(new Font("宋体",Font.BOLD,14));
		g.drawString("建设银行", 16, 50);
	}

	@Override
	public Image getImage() {
		return image;
	}

}
