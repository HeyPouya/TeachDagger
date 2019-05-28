package ir.heydarii.teachdagger.constructor

import dagger.Component

@Component
interface CarComponent {

    fun getCar(): CarClass
}