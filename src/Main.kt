fun main() {
    println("Hola Mundo")
}

open class Phone(private var isScreenLightOn: Boolean = false){
    fun switchOn() {
        isScreenLightOn = true
    }

    fun switchOff() {
        isScreenLightOn = false
    }

    fun checkPhoneScreenLight() {
        val phoneScreenLight = if (isScreenLightOn) "on" else "off"
        println("The phone screen's light is $phoneScreenLight.")
    }
}

class FoldablePhone : Phone() {

    private val folding: Boolean = false
    fun noFolding() {
        if(!folding) "pantalla encendida, teléfono no plegado" else "pantalla apagada, teléfono plegado"
    }
}