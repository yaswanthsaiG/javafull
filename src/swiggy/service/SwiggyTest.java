package swiggy.service;

import swiggy.model.Menu;
import swiggy.model.Restaurant;



    public class SwiggyTest {

        public static void main(String[] args){
            Restaurant r = new Restaurant();
            Menu m = new Menu();

            r.name = "Ganesh Biryani Point";
            r.flatNo = "111";
            r.areaName = "Mallapur";
            r.city = "Hyderabad";
            r.pincode = 500244;

            m.name = "Biryani";
            m.price = 250.0;
            m.status = true;

            r.menu = m;

            System.out.println("Restaurant Name: " + r.name);
            System.out.println("Address: " + r.flatNo + ", " + r.areaName + ", " + r.city + " - " + r.pincode);
            System.out.println("Menu Item: " + r.menu.name);
            System.out.println("Price: $" + r.menu.price);
            System.out.println("Available: " + (r.menu.status ? "Yes" : "No"));

            // Generate and print OTP using OTP class
            String otp = OTP.generateOTP();
            System.out.println("Your OTP is: " + otp);
        }
    }