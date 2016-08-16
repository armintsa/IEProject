/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package au.edu.monash.armintsa;

import com.google.maps.GeoApiContext;

/**
 *
 * @author ahas36
 */
public class GoogleMapApi {
    private static GeoApiContext context;
    private final static String APIKey="AIzaSyB6hdTj3MDvEf2SkHA2zQbdFGgvABWqmn0";
    private GoogleMapApi(){}
    
    public static synchronized GeoApiContext getInstance(){
        if(context == null){
            context=new GeoApiContext().setApiKey(APIKey);
        }
        return context;
    }
}
