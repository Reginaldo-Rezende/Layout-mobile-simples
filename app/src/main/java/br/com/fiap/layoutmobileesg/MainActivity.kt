package br.com.fiap.layoutmobileesg

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login)

     val botao :Button = findViewById<Button>(R.id.botao_login)

        botao.setOnClickListener {
         val variavel = Intent(this,pagina_principal::class.java)
            startActivity(variavel)
        }

    }
}