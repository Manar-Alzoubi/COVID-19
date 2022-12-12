package com.example.covid19.Web;

import com.example.covid19.Domain.WorldTotal;
import com.example.covid19.Infrastructure.AllCountriesRepository;
import com.google.gson.Gson;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

@Controller
public class HomeController {

    @Autowired
    AllCountriesRepository allCountriesRepository;

    @GetMapping("/")
    String readDataFromApi(Model model) throws IOException, ParseException {

        //  build the JAVA objects that will hold the JSON data
        URL totalUrl = new URL("https://api.covid19api.com/world/total");

        // making a connection to the API
        HttpURLConnection totalHttpURLConnection = (HttpURLConnection) totalUrl.openConnection();

        // specify the method for the connection
        totalHttpURLConnection.setRequestMethod("GET");

        InputStreamReader totalInputStreamReader = new InputStreamReader(totalHttpURLConnection.getInputStream());
        BufferedReader totalBufferedReader = new BufferedReader(totalInputStreamReader);
        String totalData = totalBufferedReader.readLine();

        Gson gson = new Gson();
        WorldTotal worldtotal = gson.fromJson(totalData, WorldTotal.class);

        // view statistics on cards
        model.addAttribute("confirmed", worldtotal.TotalConfirmed);
        model.addAttribute("deaths", worldtotal.TotalDeaths);
        model.addAttribute("recovered", worldtotal.TotalRecovered);

        ///////////////////////   prepare for search  //////////////////////////////////////////

        // read the countrie's names fron API to put them on the select for search

//        System.out.println("///////////////////// start search ");
//        //  build the JAVA objects that will hold the JSON data
//        URL countryUrl = new URL("https://api.covid19api.com/countries");
//        System.out.println("///////////////////// api declared ");
//        // making a connection to the API
//        HttpURLConnection countryHttpURLConnection = (HttpURLConnection) countryUrl.openConnection();
//        System.out.println("///////////////////// connection done ");
//        // specify the method for the connection
//        countryHttpURLConnection.setRequestMethod("GET");
//        System.out.println("///////////////////// get ////////////// ");
//        InputStreamReader countryInputStreamReader = new InputStreamReader(countryHttpURLConnection.getInputStream());
//        BufferedReader countryBufferedReader = new BufferedReader(countryInputStreamReader);
//        String countryData = countryBufferedReader.readLine();
//        System.out.println("**************************************************************");
////        System.out.println(countryData);
//        Gson gson1 = new Gson();
//        System.out.println("///////////////////// Gson object declared  ");
//
//        RootCountry[] countryResult = gson.fromJson(countryData, RootCountry[].class);
//        System.out.println("************************    from jason to country data");
////
//////        AllCountries allCountries = gson1.fromJson(countryData, AllCountries.class);
////        System.out.println("///////////////////// from jason to country data ");
////        System.out.println("*************************************************************************************************");
////        System.out.println(countryData);





            URL url = new URL("https://api.covid19api.com/countries");

            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.connect();

            //Getting the response code
            int responsecode = conn.getResponseCode();

            if (responsecode != 200) {
                throw new RuntimeException("HttpResponseCode: " + responsecode);
            } else {

                String inline = "";
                Scanner scanner = new Scanner(url.openStream());

                //Write all the JSON data into a string using a scanner
                while (scanner.hasNext()) {
                    inline += scanner.nextLine();
                }

                //Close the scanner
                scanner.close();
                System.out.println("********************************************************");

                //Using the JSON simple library parse the string into a json object
                JSONParser parse = new JSONParser();
                System.out.println("jason parser objec t decleared ");
//                JSONObject data_obj = (JSONObject) parse.parse(inline);
//                System.out.println("data objec t decleared ");
//                System.out.println(data_obj);
//                //Get the required object from the above created object
////                JSONObject obj = (JSONObject) data_obj.get("Country");
//
//                //Get the required data using its key
////                System.out.println(obj.get("Country"));
//
//                JSONArray arr = (JSONArray) data_obj.get("Countries");
//
//                for (int i = 0; i < arr.size(); i++) {
//                    System.out.println(arr.get(i));
//                    JSONObject new_obj = (JSONObject) arr.get(i);
//
//                    if (new_obj.get("Slug").equals("albania")) {
//                        System.out.println("Total Recovered: " + new_obj.get("TotalRecovered"));
//                        break;
//                    }
//                }
//            }


    }




        return "home";
    }


//    @GetMapping("/search")
//    String SearchCountry()
//    {
//        return "home";
//    }

}
