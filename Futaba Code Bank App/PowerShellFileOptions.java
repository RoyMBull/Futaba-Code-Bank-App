package application;

import java.awt.FlowLayout;
import java.io.BufferedReader;
import java.io.FileReader;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class PowerShellFileOptions {
	public static void IntrotoPowerShell() //throws Exception
	{	
		//This is used to help locate the file path after opening a file. Uncomment to utilize this method
		//FileChooser introfile = new FileChooser();
		//File selectedFile = introfile.showOpenDialog(null);
		//String filename = selectedFile.getAbsolutePath();
		//System.out.println(filename);
		
		try {
			
			BufferedReader file = new BufferedReader(new FileReader("C:\\Users\\Futaba_Webs\\Documents\\RBGuiAddOnContent\\PowerShell\\IntroToPowerShell.txt"));
			final JFrame frame = new JFrame("IntrotoPowerShell");  
			  
	        // Display the window.  
	        frame.setSize(500, 500);  
	        frame.setVisible(true);  
	         
	        // set flow layout for the frame  
	        frame.getContentPane().setLayout(new FlowLayout());  
	  
	        JTextArea textArea = new JTextArea(50, 100);  
	        textArea.read(file, null);
			file.close();
			textArea.requestFocus();
	        JScrollPane scrollableTextArea = new JScrollPane(textArea);  
	  
	        scrollableTextArea.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);  
	        scrollableTextArea.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);  
	  
	        frame.getContentPane().add(scrollableTextArea);
	        			
		}
		
				
		catch(Exception e)
		{
			System.out.println("ERROR");
		}
		
	}
	
	public static void WindowsCMDBasicCommands() //throws Exception
	{	
		//This is used to help locate the file path after opening a file. Uncomment to utilize this method
		//FileChooser introfile = new FileChooser();
		//File selectedFile = introfile.showOpenDialog(null);
		//String filename = selectedFile.getAbsolutePath();
		//System.out.println(filename);
		
		try {
			
			BufferedReader file = new BufferedReader(new FileReader("C:\\Users\\Futaba_Webs\\Documents\\RBGuiAddOnContent\\PowerShell\\WindowsCMDBasicCommands.txt"));
			final JFrame frame = new JFrame("WindowsCMDBasicCommands");  
			  
	        // Display the window.  
	        frame.setSize(500, 500);  
	        frame.setVisible(true);  
	         
	        // set flow layout for the frame  
	        frame.getContentPane().setLayout(new FlowLayout());  
	  
	        JTextArea textArea = new JTextArea(50, 100);  
	        textArea.read(file, null);
			file.close();
			textArea.requestFocus();
	        JScrollPane scrollableTextArea = new JScrollPane(textArea);  
	  
	        scrollableTextArea.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);  
	        scrollableTextArea.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);  
	  
	        frame.getContentPane().add(scrollableTextArea);
	        			
		}
		
				
		catch(Exception e)
		{
			System.out.println("ERROR");
		}
		
	}
	
	
}
