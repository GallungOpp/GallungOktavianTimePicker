package com.gallung.timepicker;

import android.app.Dialog;
import android.app.TimePickerDialog;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.DialogFragment;

import android.widget.TimePicker;

import java.util.Calendar;


public class TimePickerFragment extends DialogFragment
    implements TimePickerDialog.OnTimeSetListener {
 @NonNull
 @Override
 public Dialog onCreateDialog(Bundle savedInstanceState){
     // Use the current time as the default time in the picker.
     final Calendar c = Calendar.getInstance();
     int hour = c.get(Calendar.HOUR_OF_DAY);
     int minute = c.get(Calendar.MINUTE);
     // create a new instance of TimePickerDialog and return it.
     return new TimePickerDialog(getActivity(), this,hour,minute, true);
 }

    @Override
    public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
    MainActivity activity = (MainActivity) getActivity();
    activity.processTimePickerResult(hourOfDay,minute);
    }
}