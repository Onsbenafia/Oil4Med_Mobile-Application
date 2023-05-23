package eniso.ia2.myapplication_oil4med

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_my_olive_oils.*

class MyOliveOilsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_olive_oils)
        button9.setOnClickListener {
            val intent= Intent(this,DetailOilActivity::class.java)
            startActivity(intent)
        }
    }
}