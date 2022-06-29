package day31_Constructors;

import java.util.ArrayList;
import java.util.Arrays;

public class MyOffers {
    public static void main(String[] args) {
        Offer offer1=new Offer();
        offer1.setInfo("VA","Amazon Inc", "SDET",11000,true,true,true,true);
        Offer offer2=new Offer();
        offer2.setInfo("CA","Sony INC","QA",120000,true,false,false,true);
        Offer offer3=new Offer();
        offer3.setInfo("FL","APPLE INC","QE",125000,true,true,true,true);


        System.out.println(offer1);
        System.out.println(offer2);
        System.out.println(offer3);

        Offer[] myOffers={offer1,offer2,offer3};
        ArrayList<Offer>fullTimeOffers=new ArrayList<>(Arrays.asList(myOffers));
        fullTimeOffers.removeIf(p -> !p.isFullTime);//removes if the offer NOT fulltime
        System.out.println(fullTimeOffers.size());
        ArrayList<Offer>localOffers=new ArrayList<>(Arrays.asList(myOffers));
        localOffers.removeIf(p-> !(p.location.equals("VA")||p.location.equals("CA")));// REMOVES THE OFFER IF THE OFFER IS NOT FROM LOCAL AREA
        System.out.println(localOffers.size());

        for (Offer localOffer : localOffers) {
            System.out.println(localOffer.companyName+" : "+ localOffer.salary);
            
        }





    }
}
