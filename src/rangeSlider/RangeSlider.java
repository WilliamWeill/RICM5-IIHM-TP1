package rangeSlider;

import java.util.List;

import javax.swing.event.ChangeListener;

public class RangeSlider implements _RangeSlider {

	private int maximum;
	private int minimum;
	private int sliderMin;
	private int sliderMax;
	private boolean adjusting;
	private List<ChangeListener> listenerList;
	
	@Override
	public void addChangeListener(ChangeListener x) {
		listenerList.add(x);
		
	}

	@Override
	public int getExtent() {
		return sliderMax - sliderMin;
	}

	@Override
	public int getMaximum() {
		return maximum;
	}

	@Override
	public int getMinimum() {
		return minimum;
	}

	@Override
	public boolean getValueIsAdjusting() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void removeChangeListener(ChangeListener x) {
		listenerList.remove(x);
		
	}

	@Override
	public void setSliderMin(int newValue) {
		this.sliderMin = newValue;
		
	}

	@Override
	public void setSliderMax(int newValue) {
		this.sliderMax = newValue;
		
	}

	@Override
	public void setRangeProperties(int sliderMin, int sliderMax, int min, int max, boolean adjusting) {
		this.sliderMin = sliderMin;
		this.sliderMax = sliderMax;
		this.minimum = min;
		this.maximum = max;
		this.adjusting = adjusting;
		
	}

	@Override
	public void setValueIsAdjusting(boolean b) {
		this.adjusting = b;
		
	}

}
