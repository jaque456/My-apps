package mx.edu.utng.completeapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_juego.*

class JuegoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_juego)

        btnverPrincesa.setOnClickListener{
            if(rdbVerano.isChecked && rdbPrincipe.isChecked && rdbLeer.isChecked){
                txvprincesa.text="       ARIEL"
            }else{
                if (rdbInvierno.isChecked && rdbPrincipe.isChecked && rdbAnimal.isChecked){
                    txvprincesa.text="       ELSA"
                }else{
                    if(rdbInvierno.isChecked && rdbTrabajo.isChecked && rdbLeer.isChecked){
                        txvprincesa.text="       BELLA"
                    }else{
                        if(rdbVerano.isChecked && rdbTrabajo.isChecked && rdbLeer.isChecked){
                            txvprincesa.text="       TIARA"
                        }else{
                            if(rdbVerano.isChecked && rdbPrincipe.isChecked && rdbAnimal.isChecked){
                                txvprincesa.text="       BLANCANIEVES"
                            }else{
                                if(rdbInvierno.isChecked && rdbPrincipe.isChecked && rdbLeer.isChecked){
                                    txvprincesa.text="       AURORA"
                                }else{
                                    if(rdbVerano.isChecked && rdbTrabajo.isChecked && rdbAnimal.isChecked){
                                        txvprincesa.text="       MERIDA"
                                    }else{
                                        txvprincesa.text="       Puedes ser cualquiera!"
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

    }
}
