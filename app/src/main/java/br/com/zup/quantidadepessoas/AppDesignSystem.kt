package br.com.zup.quantidadepessoas

import br.com.zup.beagle.android.annotation.BeagleComponent
import br.com.zup.beagle.android.setup.DesignSystem

@BeagleComponent
class AppDesignSystem : DesignSystem() {

    override fun image(id: String): Int? =
        when (id){
            "background" -> R.drawable.background

        else -> super.image(id)
    }
}