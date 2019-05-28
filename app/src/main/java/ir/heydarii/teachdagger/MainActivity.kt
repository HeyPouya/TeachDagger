package ir.heydarii.teachdagger

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import ir.heydarii.teachdagger.constructor.CarClass
import ir.heydarii.teachdagger.constructor.DaggerCarComponent

class MainActivity : AppCompatActivity() {

    lateinit var car: CarClass
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val component = DaggerCarComponent.create()
        car = component.getCar()

    }
}
