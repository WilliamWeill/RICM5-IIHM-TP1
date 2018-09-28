package rangeSlider;

import javax.swing.event.ChangeListener;

public interface _RangeSlider {
	
	
	
	
	/**
	 * 
	 * @return the length of the inner range that begins at the model's value
	 */
	public int getExtent();
	
	/**
	 * 
	 * @return the model's maximum
	 */
	public int getMaximum();
	
	/**
	 * 
	 * @return the model's minimum
	 */
	public int getMinimum();
	
	/**
	 * 
	 * @return true if the current changes
	 */
	public boolean getValueIsAdjusting();
	
	public void changeValue(int newValue);
	
	public int getUpperValue();
	
	
	
	
	
}
