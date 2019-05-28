package ir.heydarii.teachdagger.constructor

import android.util.Log
import javax.inject.Inject

class CarClass {

    @Inject
    constructor(engine: Engine, wheel: Wheel)

    fun drive() {
        Log.d("TAG", "Wo0o0o0m")
    }

}