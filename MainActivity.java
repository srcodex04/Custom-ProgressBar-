package com.srcodex.msa;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private Dialog dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AppCompatButton btnDialog = findViewById(R.id.btnDialog);

        dialog = new Dialog(MainActivity.this, R.style.MyAlertDialogTheme);
        dialog.setContentView(R.layout.pb_custom);
        dialog.setCanceledOnTouchOutside(false);

        btnDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(0));
                dialog.show();

            }
        });

    }
}