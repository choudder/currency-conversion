public class MainActivity extends AppCompatActivity {
Button btn ;
Button btn1;
EditText text;
RadioButton rad1;
RadioButton rad2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.btn);
        btn1 = findViewById(R.id.btn1);
        text = findViewById(R.id.tex);
        rad1 = findViewById(R.id.radio1);
        rad2 = findViewById(R.id.radio2);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                change(v);
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText("");
            }
        });
}
  void change (View v) {
      String t1 = text.getText().toString().trim();
      if (t1.isEmpty()) {
          Toast.makeText(this, "please enter your value", Toast.LENGTH_SHORT).show();
          return;
      }
      float number;
      try {
          number = Float.parseFloat(t1);
      } catch (NumberFormatException e) {
          Toast.makeText(this, "Please enter a valid number", Toast.LENGTH_SHORT).show();
          return;
      }
      if (rad1.isChecked()) {
          number *= 146.36;
      } else {
          number /= 146.36;
      }
      text.setText(String.valueOf(number));
      Toast.makeText(this, "Conversion done", Toast.LENGTH_SHORT).show();
  }
}
