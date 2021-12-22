package com.example.reserviera;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class ExpandablelistDatadiamond {
   public static HashMap<String, List<String>> getData()
   {

       HashMap<String, List<String>> expandableListDetail = new HashMap<String, List<String>>();


       List<String> Offer_30000LE= new ArrayList<String>();
      Offer_30000LE.add( "600 chair" );
       Offer_30000LE.add( "6 piece of Tart" );
      Offer_30000LE.add( "500 bottles of water\n" );
      Offer_30000LE.add( "600 bottles of Soft drinks\n" );
      Offer_30000LE.add( " 600 piece of Gateau\n" );
      Offer_30000LE.add( "Wedding procession\n" );
       Offer_30000LE.add( "photogrpher\n" );
       Offer_30000LE.add( "dancer\n" );
       Offer_30000LE.add( "drummer\n" );
       Offer_30000LE.add( "open buffet\n" );




       List<String> Offer_25000LE= new ArrayList<String>();
      Offer_25000LE.add( "300 chair" );
      Offer_25000LE.add( "3 piece of Tart" );
       Offer_25000LE.add( "200 bottles of water\n" );
      Offer_25000LE.add( "300 bottles of Soft drinks\n" );
       Offer_25000LE.add( " 300 piece of Gateau\n" );



       expandableListDetail.put( " Offer 45000LE :",Offer_30000LE);
       expandableListDetail.put( " Offer 30000LE :", Offer_25000LE);

       return expandableListDetail;
}}
