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
	private int random;
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

	@Override
	protected void onStart() {
		super.onStart();
		initRandomNumber();
	}

	// TODO: generate angka random di sini
	private void initRandomNumber() {
		Random random = new Random();
		int rand = random.nextInt(101);
		this.random = rand;


	}

	public void handleGuess(View view) {
		// TODO: Tambahkan logika untuk melakukan pengecekan angka
		button.setEnabled(false);
		//String a = initRandomNumber();
//		Random rand = new Random();
//		int value = rand.nextInt(6);
		String sIn = numberInput.getText().toString();
		int	in = Integer.parseInt(sIn);
			if (in > random){
				Toast.makeText(this, "tebakan anda terlalu besar", Toast.LENGTH_SHORT).show();
			}
			else if (in < random){
				Toast.makeText(this, "Tebakan anda terlalu kecil", Toast.LENGTH_SHORT).show();

			}
			else {
				Toast.makeText(this, "Tebakan anda benar", Toast.LENGTH_SHORT).show();
			}


	}

	public void handleReset(View view) {
		// TODO: Reset tampilan
		numberInput.setText("");
		button.setEnabled(true);
		initRandomNumber();
	}
}
