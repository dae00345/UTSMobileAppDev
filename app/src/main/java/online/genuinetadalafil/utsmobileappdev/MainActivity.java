package online.genuinetadalafil.utsmobileappdev;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
//    deklarasi variables
    private MediaPlayer mediaPlayer;

    //method onclick untuk setiap imageButton
    @Override
    public void onClick(View v){
        if (v.getId() == R.id.imageButton1){
            playSound(R.raw.sound_1);
            showSnackBar("Anda Menekan Button Meow 1");
        }else if (v.getId() == R.id.imageButton2){
            showSnackBar("Anda Menekan Button Meow 2");
        }else if (v.getId() == R.id.imageButton3) {
            showSnackBar("Anda Menekan Button Meow 3");
        }else if (v.getId() == R.id.imageButton4){
            showSnackBar("Anda Menekan Button Meow 4");
        }else if (v.getId() == R.id.imageButton5){
            showSnackBar("Anda Menekan Button Meow 5");
        }else if (v.getId() == R.id.imageButton6){
            showSnackBar("Anda Menekan Button Meow 6");
        }else if (v.getId() == R.id.imageButton7){
            showSnackBar("Anda Menekan Button Meow 7");
        }else if (v.getId() == R.id.imageButton8){
            showSnackBar("Anda Menekan Button Meow 8");
        }else if (v.getId() == R.id.imageButton9){
            showSnackBar("Anda Menekan Button Meow 9");
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        deklarasi & inisisasi local variable
        ImageButton btn1 = findViewById(R.id.imageButton1);
        ImageButton btn2 = findViewById(R.id.imageButton2);
        ImageButton btn3 = findViewById(R.id.imageButton3);
        ImageButton btn4 = findViewById(R.id.imageButton4);
        ImageButton btn5 = findViewById(R.id.imageButton5);
        ImageButton btn6 = findViewById(R.id.imageButton6);
        ImageButton btn7 = findViewById(R.id.imageButton7);
        ImageButton btn8 = findViewById(R.id.imageButton8);
        ImageButton btn9 = findViewById(R.id.imageButton9);

//      menjalankan method onclick untuk setiap immageButton
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
        btn9.setOnClickListener(this);

    }

//    method untuk memutar file audio
    private void playSound(int soundId) {
        if (mediaPlayer != null){
            mediaPlayer.release();
        }
        mediaPlayer = MediaPlayer.create(this,soundId);
        mediaPlayer.start();
    }
//method untuk menampilkan snackbar
    private void showSnackBar(String message){
        View rootView = findViewById(android.R.id.content);
        Snackbar.make(rootView,message,Snackbar.LENGTH_SHORT).show();
    }

}