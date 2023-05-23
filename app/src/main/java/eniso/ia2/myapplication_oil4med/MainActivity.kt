package eniso.ia2.myapplication_oil4med

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val user=edit1.text.toString()
        val pass=edit2.text.toString()
        button.setOnClickListener {
            if((edit1.text.isEmpty()) or (edit2.text.isEmpty())){
                Toast.makeText(this,"champs vide",Toast.LENGTH_LONG).show()
            }
            else{
            val intent=Intent(this,accueil::class.java)
            startActivity(intent)
        }}
    }
}