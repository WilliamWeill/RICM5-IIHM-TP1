package rangeSlider;

import javax.swing.JSlider;


/**
 *  Cette classe implemente le RangeSLider, ce qui pourrait s'apparenter au
 *  moteur/controleur ou encore la parti backend
 * @author william
 *
 */
public class RangeSlider extends JSlider implements _RangeSlider {

    /**
     * Crée un range slider ayant pour valeurs min -> 0 et max -> 100.
     */
    public RangeSlider() {
        initSlider();
    }

    /**
     * Crée un range slider avec les valeurs min et max telles que defini en arguments.
     */
    public RangeSlider(int min, int max) {
        super(min, max);
        initSlider();
    }

    /**
     * Initialise le range slider en position horizontale
     */
    private void initSlider() {
        setOrientation(HORIZONTAL);
    }

    /**
     * Permet de crée L'UI lié au range slider 
     */
    @Override
    public void updateUI() {
        setUI(new RangeSliderUI(this));
        updateLabelUIs();
    }

    /**
     * retourne la valeur min du range slider utilisant un Jslider classique
     */
    @Override
    public int getValue() {
        return super.getValue();
    }

    /**
     * modifier la valeur min du range slider 
     * on surcharge la methode de base pour le jslider afin de l'adapter à un range slider
     */
    @Override
    public void setValue(int value) {
        int oldValue = getValue();
        if (oldValue == value) {
            return;
        }

        // On prend l'extent (valeur entre les deux curseurs) afin de calculer le nouveau
        // avec la nouvelle valeur du min
        int oldExtent = getExtent();
        int newValue = Math.min(Math.max(getMinimum(), value), oldValue + oldExtent);
        int newExtent = oldExtent + oldValue - newValue;

        // Permet de mettre à jour l'UI
        getModel().setRangeProperties(newValue, newExtent, getMinimum(), 
            getMaximum(), getValueIsAdjusting());
    }

    /**
     * retourne la valeur max du range slider
     */
    public int getUpperValue() {
        return getValue() + getExtent();
    }

    /**
     * modifie la valeur max du range slider
     */
    public void changeValue(int value) {

        int lowerValue = getValue();
        int newExtent = Math.min(Math.max(0, value - lowerValue), getMaximum() - lowerValue);
        
        setExtent(newExtent);
    }



}