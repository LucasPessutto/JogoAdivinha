package pessutto.lucas.jogoadivinha;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private Button botaoJogar;
    private TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botaoJogar = (Button) findViewById(R.id.btnClique);
        resultado = (TextView) findViewById(R.id.textoResultado);

        botaoJogar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random aleatorio = new Random();
                int numeroAleatorio = aleatorio.nextInt(25);
                resultado.setText("O número será: " + numeroAleatorio);
            }
        });

    }
}
