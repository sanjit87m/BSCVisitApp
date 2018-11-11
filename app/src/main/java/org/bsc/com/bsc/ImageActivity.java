package org.bsc.com.bsc;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import java.io.File;

public class ImageActivity extends AppCompatActivity {
    ImageView imageView;
    private String fileName="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image);
        fileName = getIntent().getStringExtra("fileName");

        File imgFile = new  File(Environment.getExternalStorageDirectory().getAbsolutePath() + File.separator + "Download"+File.separator+fileName);

        if(imgFile.exists()){

            Bitmap myBitmap = BitmapFactory.decodeFile(imgFile.getAbsolutePath());

            ImageView myImage = (ImageView) findViewById(R.id.image_view);

            myImage.setImageBitmap(myBitmap);

        }

    }
}
