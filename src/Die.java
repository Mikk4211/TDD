import java.util.Random;

public class Die {
    private final int minValue = 1;     // Final = konstant. Laveste værdi for terning er 1.
    private int maxValue = 6;           // Ikke final - antallet af sider kan ændres.
    private int faceValue = minValue;

    public void roll() {
        int sideCount = (getMaxValue()-getMinValue()+1);
        faceValue = ((int) (mathRandom()*sideCount))+minValue;  // hele random delen omdækkes af paranteser, sammen med
                                                                // casting, så man er sikker på, at det er det der bliver typecasted.
    }

    protected double mathRandom(){                              // At få en metode til at returnere math.random gør, at vi kan teste
        return Math.random();                                   // meget mere af den end vi ellers kunne.
    }

    public int getFaceValue() {
        return faceValue;
    }

    public int getMinValue() {
        return minValue;
    }

    public int getMaxValue() {
        return maxValue;
    }
}
