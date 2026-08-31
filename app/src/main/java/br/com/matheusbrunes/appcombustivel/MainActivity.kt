package br.com.matheusbrunes.appcombustivel

import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<androidx.cardview.widget.CardView>(R.id.cardSobre).setOnClickListener {
            Toast.makeText(this, "Abrir tela Sobre", Toast.LENGTH_SHORT).show()
            // TODO: startActivity(Intent(this, SobreActivity::class.java))
            // TODO: Criar a nova Activity e toda a logica
        }

        findViewById<androidx.cardview.widget.CardView>(R.id.cardCalculadora).setOnClickListener {
            Toast.makeText(this, "Abrir Calculadora de Combustível", Toast.LENGTH_SHORT).show()
            // TODO: startActivity(Intent(this, CalculadoraActivity::class.java))
            // TODO: Criar a nova Activity e toda a logica
        }

        findViewById<androidx.cardview.widget.CardView>(R.id.cardCarros).setOnClickListener {
            Toast.makeText(this, "Abrir Carros Gasolina", Toast.LENGTH_SHORT).show()
            // TODO: startActivity(Intent(this, CarrosActivity::class.java))
            // TODO: Criar a nova Activity e toda a logica
        }

        findViewById<androidx.cardview.widget.CardView>(R.id.cardCadastro).setOnClickListener {
            Toast.makeText(this, "Abrir Cadastro de Carro", Toast.LENGTH_SHORT).show()
            // TODO: startActivity(Intent(this, CadastroActivity::class.java))
            // TODO: Criar a nova Activity e toda a logica
        }
    }
}