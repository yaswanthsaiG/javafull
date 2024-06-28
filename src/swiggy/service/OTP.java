package swiggy.service;

import java.util.Random;

public class OTP {
    public static String generateOTP() {
        Random random = new Random();
        int otp = 100000 + random.nextInt(900000);  // Generates a 6-digit OTP
        return String.valueOf(otp);
    }

}
