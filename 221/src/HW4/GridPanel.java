package HW4;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

/**
 * CSCI 221 Spring 2020
 * @author HW4 - GridPanel class
 * @since 30 Sept. 2014
 * 
 * Class that inherits from JPanel with overridden
 * paintComponent method to draw gridlines
 * 
 * DO NOT MODIFY THIS CLASS
 *
 */
@SuppressWarnings("serial")
public class GridPanel extends JPanel {
	
	// private instance variables
	private int strokeWidth = 1;
	
	private ArrayList<Lines1> lines = new ArrayList<Lines1>();
	
	/**
	 * 
	 */
	public GridPanel() {
		
		super();
		setBackground( Color.BLACK );
		
	} // end constructor
	
	/**
	 * 
	 * @param strokeWidth
	 */
	public void setStroke( int strokeWidth ) {
		
		if ( strokeWidth > 1 ) {
		
			this.strokeWidth = strokeWidth;
			
		}
		
	} // end setStroke() method
	
	/**
	 * 
	 */
	public void clear() {
		
		lines.clear();
		
	} // end clear()
	
	/**
	 * 
	 */
	public void draw() {
		
		repaint();
		revalidate();
		
	} // end draw() method
	
	/**
	 * 
	 * @param line
	 */
	public void addLine( Lines1 line ) {
		
		if ( !lines.contains( line ) ) {
			
			lines.add( line );
			
		} 
		
	} // end addLine() method
	
	/**
	 * 
	 * @param g
	 */
	public void paintComponent( Graphics g ) {
		
		super.paintComponent( g );
		
		Graphics2D g2 = (Graphics2D)g;
		
		g2.setPaint( Color.GREEN );
		g2.setStroke( new BasicStroke( strokeWidth  ) );
		
		for ( int i=0; i<lines.size(); i++ ) {
			
			Lines1 line = lines.get( i );
			
			if ( line.isValid() ) {
			
				g2.drawLine( line.getStart().getX(), line.getStart().getY(), 
						 	 line.getEnd().getX(), line.getEnd().getY() );
			
			}
			
		}
		
	} // end paintComponent() method

} // end GridPanel class definition
