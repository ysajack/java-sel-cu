package utils;

/*Aurguments say:
  The static block is called once when the JVM initializes and loads the class.
  The constructor is called every time the object is created.
  Therefore, either have a static block then have the class load,
  or have constructor and instantiate the object once.
  In example below, using constructor*/

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.*;
import java.util.HashMap;

public class Reader {
    static String jsonFile = "src/test/resources/aboutData.json";
    String textFile = "src/test/resources/aboutData.txt";
    static JSONArray arr;

    //Using constructor to parse the json file once when an object is created
    public Reader(){
        arr = parse(jsonFile);
    }

    //read text file
    private static StringBuilder readTextFile(String path) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(path));
        StringBuilder sb = new StringBuilder();
        String line;
        while ((line=br.readLine())!=null){
            sb.append(line);
            sb.append("\n");
        }
        br.close();
        return sb;
    }

    //store value read from text file in hashmap for accessing by key
    public String getAboutSectionText(String section)  {
        HashMap<String,String> hm = new HashMap<>();
        String[] str = new String[0];
        try {
            str = readTextFile(textFile).toString().split("\n\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
        hm.put("appBuilt",str[0]);
        hm.put("techniques",str[1]);
        hm.put("application",str[2]);
        return hm.get(section);
    }

    private static JSONArray parse(String path) {
        JSONParser ps = new JSONParser();
        FileReader rd;
        try {
            rd = new FileReader(path);
            return (JSONArray) ps.parse(rd);
        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }
        return null;
    }

    //read Json file
    private StringBuilder readJsonFile(String key) throws IOException, ParseException {
        StringBuilder sb = new StringBuilder();
        // JSONArray arr = parse(jsonFile); //if get the jsonArray via the method as opposed to the static block
        for(Object obj : arr){
            JSONObject el = (JSONObject) obj;
            JSONArray a = (JSONArray) el.get(key);
            for(Object s : a){
                sb.append(s.toString());
                sb.append("\n");
            }
        }
        return sb;
    }

    //store value read from json file in hashmap for accessing by key
    public String getTextFor(String key)  {
        HashMap<String,String> hm = new HashMap<>();
        try {
            hm.put("appBuilt",readJsonFile("appBuilt").toString());
            hm.put("techniques",readJsonFile("techniques").toString());
            hm.put("application",readJsonFile("application").toString());
        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }
        return hm.get(key);
    }

}
