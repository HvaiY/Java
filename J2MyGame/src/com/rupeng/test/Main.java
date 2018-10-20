package com.rupeng.test;

import com.rupeng.game.GameCore;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.event.KeyEvent;

public class Main implements Runnable
{
	public static void main(String[] args)
	{
		GameCore.start(new Main());
	}

	@Override
	public void run()
	{
		GameCore.pause(10000);
	}
}
