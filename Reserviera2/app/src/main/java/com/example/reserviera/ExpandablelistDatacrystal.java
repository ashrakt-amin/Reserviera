package com.example.reserviera;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class ExpandablelistDatacrystal {
   public static HashMap<String, List<String>> getData()
   {

       HashMap<String, List<String>> expandableListDetail = new HashMap<String, List<String>>();


       List<String> Offer_30000LE= new ArrayList<String>();
      Offer_30000LE.add( "400 chair" );
       Offer_30000LE.add( "3 piece of Tart" );
      Offer_30000LE.add( "300 bottles of water\n" );
      Offer_30000LE.add( "400 bottles of Soft drinks\n" );
      Offer_30000LE.add( " 400 piece of Gateau\n" );
      Offer_30000LE.add( "Wedding procession\n" );
       Offer_30000LE.add( "photogrpher\n" );


       List<String> Offer_25000LE= new ArrayList<String>();
      Offer_25000LE.add( "300 chair" );
      Offer_25000LE.add( "3 piece of Tart" );
       Offer_25000LE.add( "200 bottles of water\n" );
      Offer_25000LE.add( "300 bottles of Soft drinks\n" );
       Offer_25000LE.add( " 300 piece of Gateau\n" );



       expandableListDetail.put( " Offer 40000LE :",Offer_30000LE);
       expandableListDetail.put( " Offer 35000LE :", Offer_25000LE);

       return expandableListDetail;
}}
