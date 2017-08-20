package iotapps.jsonparsingsample1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.json.JSONObject;

import static iotapps.jsonparsingsample1.R.id.textview;

public class MainActivity extends AppCompatActivity {

    TextView maintext;

    // Basic json String
    public static final String JSON_STRING="{\"Table\":{\"name\":\"round\",\"cost\":8000}}";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    maintext = (TextView) findViewById(textview);


        try{

            // Make a Json Object
            JSONObject emp=(new JSONObject(JSON_STRING)).getJSONObject("Table");

            String empname=emp.getString("name");
            int empsalary=emp.getInt("cost");

            String str="Table Name:"+empname+"\n"+"Table Cost:"+empsalary;
            maintext.setText(str);

        }
        catch (Exception e)
        {e.printStackTrace();}

    }
}

