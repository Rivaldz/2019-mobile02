package id.ac.polinema.tebakangka;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

	//  TODO: deklarasikan variabel di sini
	int random,guess;
	private EditText numberInput;
	private Button button;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		// TODO: bind layout di sini
		numberInput = findViewById(R.id.number_input);
		button = findViewById(R.id.guess_button);

	}

	// TODO: generate angka random di sini
	private void initRandomNumber() {
		Random random = new Random();
		int rand = random.nextInt(3);


	}

	public void handleGuess(View view) {
		// TODO: Tambahkan logika untuk melakukan pengecekan angka
		Random rand = new Random();
		int value = rand.nextInt(4);
		String sIn = numberInput.getText().toString();
		int	in = Integer.parseInt(sIn);
			if (in > value){
				Toast.makeText(this, "tebakan anda terlalu besar", Toast.LENGTH_SHORT).show();
			}
			else if (in < value){
				Toast.makeText(this, "Tebakan anda terlalu kecil", Toast.LENGTH_SHORT).show();

			}
			else {
				Toast.makeText(this, "Tebakan anda benar", Toast.LENGTH_SHORT).show();
			}


	}

	public void handleReset(View view) {
		// TODO: Reset tampilan
		numberInput.setText("");
	}
}
