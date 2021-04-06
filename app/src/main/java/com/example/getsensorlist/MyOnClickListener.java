package com.example.getsensorlist;

import android.hardware.Sensor;
import android.view.View;

public class MyOnClickListener implements View.OnClickListener {
    MainActivity mainActivity;
    public MyOnClickListener(MainActivity mainActivity) {
        this.mainActivity = mainActivity;
    }

    @Override
    public void onClick(View v) {
        mainActivity.mTxtSensors.append("(# Sensors: "+ mainActivity.sensorList.size()+")\n\n");
        for(Sensor sensor : mainActivity.sensorList) {
            mainActivity.mTxtSensors.append("Sensor name :" + sensor.getName() + "\n");
           mainActivity.mTxtSensors.append("Sensor type :" + sensor.getType() + "\n\n");
        }

    }
}
