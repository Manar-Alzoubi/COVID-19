package com.example.covid19.Web;

import com.example.covid19.Infrastructure.AllCountriesRepository;
import com.example.covid19.Infrastructure.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.io.IOException;
import java.net.URL;

@Controller
public class AllCountriesController {

    @Autowired
    AllCountriesRepository allCountriesRepository;

    @Autowired
    CountryRepository countryRepository;

//    @Autowired
//    RootCountry rootCountry;

    @GetMapping("/allCountries")
    public String getAllCountries(Model model) throws IOException {
        //  build the JAVA objects that will hold the JSON data
        URL countryUrl = new URL("https://api.covid19api.com/summary");

        // making a connection to the API
//        HttpURLConnection countryHttpURLConnection = (HttpURLConnection) countryUrl.openConnection();
//
//        // specify the method for the connection
//        countryHttpURLConnection.setRequestMethod("GET");
//
//        InputStreamReader countryInputStreamReader = new InputStreamReader(countryHttpURLConnection.getInputStream());
//        BufferedReader countryBufferedReader = new BufferedReader(countryInputStreamReader);
//        String countryData = countryBufferedReader.readLine();
//        System.out.println("*********************************************");
////        System.out.println(countryData);
//        Gson gson = new Gson();
//        Country[] country = gson.fromJson(countryData,Country[].class);
//        System.out.println("read ************************************");





//        String country = String.valueOf(countryData.);
//        String confirmed = allCountries.;
//        String country = allCountries.country;
//        String country = allCountries.country;
//        String country = allCountries.country;
//        model.addAttribute("country", country);

//        System.out.println("*************************************************************");
//        System.out.println(("country :"+country));

        return "allCountries";
    }
}
