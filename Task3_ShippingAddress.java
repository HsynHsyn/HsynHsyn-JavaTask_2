/*
1. Create a class named ShippingAddress.java
2. Declare the following variables:
1. name
2. buildingNumber
3. streetName
4. city
5. state
6. zipCode

3. Use concatenation to print the full shipping address
Ex:
Your Shipping address is:
Aaron Kissinger
13621A Legacy Circle
Fairfax, VA 22030
 */

package Muhtar_SDET.DAY04_Primitive_Castings_Concatenation;

public class Task3_ShippingAddress {
    public static void main(String[] args) {

        String name = "Aaron Kissinger",
                streetName= " Alegacy Circle",
                state = "VA",
                city= "Fairfax";
        int     zipCode= 22030,
                buildingNumber= 13624;
        System.out.println(" Your Shipping address is: \n\t" + name + "\n\t" + buildingNumber  + streetName + "\n\t" +city + "," + state + zipCode  );


    }
}
