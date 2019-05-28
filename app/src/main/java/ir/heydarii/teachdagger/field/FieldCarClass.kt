package ir.heydarii.teachdagger.field

import android.util.Log
import javax.inject.Inject

class FieldCarClass {

    @Inject
    constructor()

    @Inject
    lateinit var engine: FieldEngine
    @Inject
    lateinit var wheel: FieldWheel

    fun drive(){
        Log.d("TAG","Wo0o0o0m")
    }
}