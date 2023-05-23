package eniso.ia2.myapplication_oil4med

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_accueil.*

class accueil : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_accueil)
        button3.setOnClickListener(){
        val i= Intent(this,MyHarvestsActivity::class.java)
            startActivity(i)
        }
        button4.setOnClickListener(){
            val i2=Intent(this,MyOliveOilsActivity::class.java)
            startActivity(i2)
        }

    }
}