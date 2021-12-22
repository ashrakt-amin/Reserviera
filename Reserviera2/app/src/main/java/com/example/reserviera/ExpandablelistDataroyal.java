package com.example.reserviera;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class ExpandablelistDataroyal {
   public static HashMap<String, List<String>> getData()
   {

       HashMap<String, List<String>> expandableListDetail = new HashMap<String, List<String>>();


       List<String> Offer_30000LE= new ArrayList<String>();
      Offer_30000LE.add( "200 chair" );
       Offer_30000LE.add( "2 piece of Tart" );
      Offer_30000LE.add( "200 bottles of water\n" );
      Offer_30000LE.add( "200 bottles of Soft drinks\n" );
      Offer_30000LE.add( " 200 piece of Gateau\n" );
       Offer_30000LE.add( "photogrpher\n" );


       List<String> Offer_25000LE= new ArrayList<String>();
      Offer_25000LE.add( "300 chair" );
      Offer_25000LE.add( "2 piece of Tart" );
       Offer_25000LE.add( "300 bottles of water\n" );
      Offer_25000LE.add( "300 bottles of Soft drinks\n" );
       Offer_25000LE.add( " 300 piece of Gateau\n" );
       Offer_30000LE.add( "photogrpher\n" );
       Offer_30000LE.add( "drummer\n" );





       expandableListDetail.put( " Offer 10000LE :",Offer_30000LE);
       expandableListDetail.put( " Offer 15000LE :", Offer_25000LE);

       return expandableListDetail;
}}
