package View;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import com.example.myfirsttestingofandroid.R;
import model.Model;

public class MainActivity extends AppCompatActivity {
    EditText editText2;
    Button bigbutton2;
    TextView textView2;
    Model model = new Model();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText2 = findViewById(R.id.editText);
        bigbutton2 = findViewById(R.id.bigbutton);
        textView2 = findViewById(R.id.textView);

        model.addTextChangeObserver(new Model.TextChangeObserver() {
            @Override
            public void update() {
                textView2.setText(model.getText());
            }
        });

        editText2.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            model.setText(editText2.getText().toString());
        }
    });
}
}