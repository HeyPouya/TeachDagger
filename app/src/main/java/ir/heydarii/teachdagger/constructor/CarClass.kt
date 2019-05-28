package ir.heydarii.teachdagger.constructor

import javax.inject.Inject

class CarClass {

    @Inject
    constructor(engine: Engine, wheel: Wheel)
}