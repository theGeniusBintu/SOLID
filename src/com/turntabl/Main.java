package com.turntabl;

import com.turntabl.DIP.MyMessenger;
import com.turntabl.LSP.OnlineDelivery;
import com.turntabl.OCP.Career;
import com.turntabl.OCP.Status;
import com.turntabl.OCPExample2.ArrayUtil;
import com.turntabl.OCPExample2.AsscendingOrder;
import com.turntabl.SRP.House;
import com.turntabl.SRP.Rent;
import com.turntabl.SRPExample2.Account;

public class Main {

    public static void main(String[] args) {
	// write your code here
        /**
        SRP

        House empire = new House("Dave", "mirage", "Accra", 20);
        Rent rent = new Rent(empire);

        rent.forRent(true);

        rent.printHouse();

         **/

        /**SRPExample2
        Account account = new Account();
        account.openAccount();

         **/
        /**
         OCP
        Status status = new Status("Rockefella", "Famous");
        status.haveMoney(true);

        Career career = new Career("Software Developer", 500000);
        career.haveMoney(true);

         **/
        /** OCP Example 2
        int[] arr = {5,9,2,6,1};
        ArrayUtil.sort(arr, new AsscendingOrder());
        System.out.println("values after comparison: ");
        for (int el: arr) {
            System.out.println(el);
        }

        **/
            /** DIP
        MyMessenger messenger = new MyMessenger("TCP");
        messenger.send("Beee", "genius");
        **/

    }
}
