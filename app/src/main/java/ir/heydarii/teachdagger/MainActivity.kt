package ir.heydarii.teachdagger

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import ir.heydarii.teachdagger.constructor.CarClass
import ir.heydarii.teachdagger.constructor.DaggerCarComponent
import ir.heydarii.teachdagger.field.DaggerFieldCarComponent
import ir.heydarii.teachdagger.field.FieldCarClass
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    lateinit var car: CarClass
    @Inject
    lateinit var fieldCar: FieldCarClass


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val component = DaggerCarComponent.create()
        val fieldComponent = DaggerFieldCarComponent.create()



        car = component.getCar()
        fieldComponent.init(this)



        car.drive()
        fieldCar.drive()

    }
}
