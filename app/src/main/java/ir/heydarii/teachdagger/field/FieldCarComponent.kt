package ir.heydarii.teachdagger.field

import dagger.Component
import ir.heydarii.teachdagger.MainActivity

@Component
interface FieldCarComponent {


    fun init(mainActivity: MainActivity)
}