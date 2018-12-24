package lesson10.HW;

import java.util.Date;

public class ElectronicsOrder extends Order {
    int guaranteeMonths;


    public ElectronicsOrder(String itemName, Date dateCreated, String shipFromCity, String shipToCity, int basePrice, Customer customerOwned, int guaranteeMonths) {
        super(itemName, dateCreated, shipFromCity, shipToCity, basePrice, customerOwned);
        this.guaranteeMonths = guaranteeMonths;
    }



    @Override
    public void validateOrder() {
        String cityFrom = getShipFromCity();
        String cityTo = getShipToCity();
        String gender = getCustomerOwned().getGender();


        if (cityFrom == null || gender == null || cityTo == null)
            return;
        if (cityFrom == "Киев" || cityFrom == "Харьков" || cityFrom == "Одесса" || cityFrom == "Днепр") {
            if (cityTo == "Киев" || cityTo == "Харьков" || cityTo == "Одесса" || cityTo == "Днепр") {
                if (gender == "Женский") {
                    if (getBasePrice() >= 100) {

                        setDateConfirmed(new Date());
                    }
                }
            }
        }
    }
    @Override
    public void calculatePrice(){
        double priceDelivery = 0;
        if(getShipToCity()!= "Киев" && getShipToCity() != "Одесса"){
            priceDelivery = getBasePrice() * 0.15;
        }else
            priceDelivery = getBasePrice() * 0.1;


        double totalPrice = 0;
        double x = 0;// то.что осталось
        if(getBasePrice() > 1000){
            x = (getBasePrice() + priceDelivery);
            totalPrice = x - (x*0.05);
            setTotalPrice(totalPrice);
        }else
            if(getBasePrice() < 1000){
             //посчитать цену за доставку без скидки
                totalPrice = getBasePrice()+ priceDelivery;
                setTotalPrice(totalPrice);
            }

    }
}
