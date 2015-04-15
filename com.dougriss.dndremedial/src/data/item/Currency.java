package src.data.item;

/**
 * Created by dougriss on 4/11/15.
 * structure for creating currencies to use
 * for example, say you want a 6 tier currency system - here you go.
 */
public class Currency {
    //for instance, copper would be 1; silver would be 10; gold would be 100;
    private int value;
    private String name;

    public static int convertToCurrency(int valueInInitialCurrency, Currency initialCurrency, Currency targetCurrency){
        int baseCurrency = valueInInitialCurrency * initialCurrency.getValue();
        return targetCurrency.getValue() * baseCurrency;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
