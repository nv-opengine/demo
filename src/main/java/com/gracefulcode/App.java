package com.gracefulcode;

import com.gracefulcode.opengine.platforms.desktop.Desktop;
import com.gracefulcode.opengine.platforms.desktop.Window;
import com.gracefulcode.opengine.renderers.vulkan.Vulkan;

public class App {
	public static void main(String[] args) {
		Desktop desktop = new Desktop(new Window.Configuration("Title", 1000, 600));

		Vulkan vulkan = new Vulkan(desktop, "GOTBK", 0, 1, 0);
		Window defaultWindow = new Window();
		desktop.createWindow(defaultWindow);
		desktop.run();

		vulkan.dispose();
	}
}
