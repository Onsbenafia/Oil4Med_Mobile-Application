package eniso.ia2.myapplication_oil4med

import android.app.DatePickerDialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_my_harvests.*
import java.util.Calendar

class MyHarvestsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_harvests)
        button8.setOnClickListener {
            val intent= Intent(this,DetailHarvestActivity::class.java)
            startActivity(intent)
            val c=Calendar.getInstance()
            val year=c.get(Calendar.YEAR)
            val month=c.get(Calendar.MONTH)
            val day=c.get(Calendar.DAY_OF_MONTH)
            button10.setOnClickListener {
                val dpd =DatePickerDialog(this,DatePickerDialog.OnDateSetListener { view, myear, mmonth, mday ->
                    textView23.setText("" +mday+ "/" + mmonth + "/" +myear)
                },year,month,day)
                dpd.show()
            }
        }
    }
}