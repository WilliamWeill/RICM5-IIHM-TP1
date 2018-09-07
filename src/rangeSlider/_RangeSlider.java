package rangeSlider;

import javax.swing.event.ChangeListener;

public interface _RangeSlider {

	/**
	 * Adds a ChangeListener to the model's listener list 
	 * @param x
	 */
	public void addChangeListener(ChangeListener x);
	
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
	
	public void removeChangeListener(ChangeListener x);
	
	public void setSliderMin(int newValue);
	
	public void setSliderMax(int newValue);
	
	public void setRangeProperties(int sliderMin, int sliderMax, int min, int max, boolean adjusting);
	
	public void setValueIsAdjusting(boolean b);
	
	
	
	
	
}
